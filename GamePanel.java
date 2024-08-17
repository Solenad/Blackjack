import javax.swing.*;
import javax.swing.Timer;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.*;


public class GamePanel extends JPanel {
    private JLabel cardImageLbl, playerTitleLbl, dealerTitleLbl;
    private final JPanel playerSectionPanel, playerHandPanel, playerControlPanel;
    private final JPanel dealerSectionPanel;
    private JButton startBtn;
    private ArrayList<JLabel> cardImageList = new ArrayList<>();

    public GamePanel() {
        setLayout(new BorderLayout(0, 5 ));
        setAlignmentX(Component.CENTER_ALIGNMENT);
        setPreferredSize(new Dimension(600, 427));
        setBackground(new Color(12,12,14));

        // panel initializations
        playerSectionPanel = new JPanel(new BorderLayout());
        playerSectionPanel.setOpaque(false);
        playerSectionPanel.setLayout(new BorderLayout(5, 5 ));
        playerSectionPanel.setAlignmentX(Component.CENTER_ALIGNMENT);
        playerSectionPanel.setBorder(BorderFactory.createEmptyBorder(0, 30, 30, 20));
        add(playerSectionPanel, BorderLayout.SOUTH);

        playerHandPanel = new JPanel();
        playerHandPanel.setLayout(new BoxLayout(playerHandPanel, BoxLayout.X_AXIS));
        playerHandPanel.setAlignmentY(Component.CENTER_ALIGNMENT);
        playerHandPanel.setOpaque(false);
        playerHandPanel.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));
        playerSectionPanel.add(playerHandPanel, BorderLayout.CENTER);

        playerControlPanel = new JPanel();
        playerControlPanel.setLayout(new BoxLayout(playerControlPanel, BoxLayout.Y_AXIS));
        playerControlPanel.setOpaque(false);
        playerControlPanel.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 40));
        playerControlPanel.add(Box.createVerticalGlue());
        add(playerControlPanel, BorderLayout.EAST);

        dealerSectionPanel = new JPanel(new BorderLayout());
        dealerSectionPanel.setOpaque(false);
        dealerSectionPanel.setLayout(new BorderLayout(5, 5 ));
        dealerSectionPanel.setAlignmentX(Component.CENTER_ALIGNMENT);
        dealerSectionPanel.setBorder(BorderFactory.createEmptyBorder(30, 20, 0, 40));
        add(dealerSectionPanel, BorderLayout.NORTH);

        JPanel dealerHandPanel = new JPanel();
        dealerHandPanel.setLayout(new BoxLayout(dealerHandPanel, BoxLayout.X_AXIS));
        dealerHandPanel.setAlignmentY(Component.CENTER_ALIGNMENT);


        playerTitleLbl = new JLabel("Player");
        playerTitleLbl.setFont(new Font("Monospaced", Font.BOLD, 25));
        playerTitleLbl.setForeground(new Color(223,225,229));
        playerTitleLbl.setAlignmentX(Component.LEFT_ALIGNMENT);
        playerTitleLbl.setAlignmentY(Component.BOTTOM_ALIGNMENT);
        playerSectionPanel.add(playerTitleLbl, BorderLayout.WEST);


        dealerTitleLbl = new JLabel("Dealer");
        dealerTitleLbl.setFont(new Font("Monospaced", Font.BOLD, 25));
        dealerTitleLbl.setForeground(new Color(223,225,229));
        dealerTitleLbl.setAlignmentX(Component.RIGHT_ALIGNMENT);
        dealerTitleLbl.setAlignmentY(Component.TOP_ALIGNMENT);
        dealerSectionPanel.add(dealerTitleLbl, BorderLayout.EAST);

        // buttons
        startBtn = new JButton("Start");
        startBtn.setBackground(getBackground());
        startBtn.setContentAreaFilled(false);
        startBtn.setBorderPainted(false);
        startBtn.setFocusPainted(false);
        startBtn.setFont(new Font("Monospaced", Font.BOLD, 25));
        startBtn.setForeground(new Color(223,225,229));
        startBtn.setMaximumSize(new Dimension(110, 40));
        startBtn.setAlignmentX(Component.RIGHT_ALIGNMENT);
        playerControlPanel.add(startBtn);
        playerControlPanel.add(Box.createVerticalStrut(40));



        startBtn.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                startBtn.setForeground(new Color(125,127,131));
            }

            public void mouseExited(MouseEvent e) {
                startBtn.setForeground(new Color(223,225,229));
            }
        });
    }

    public void addImage(int cardNum) {
        ImageIcon cardImage;
        JLabel cardImageLbl;

        cardImage = new ImageIcon(Objects.requireNonNull(getClass().getResource("card" + cardNum + ".png")));
        cardImageLbl = new JLabel(cardImage);

        playerHandPanel.add(cardImageLbl);
        playerHandPanel.add(Box.createHorizontalStrut(20));
        cardImageList.add(cardImageLbl);
    }

    public void removeAllImage() {
        int i;

        for (i = 0; i < cardImageList.size(); i++) {
            playerHandPanel.remove(cardImageList.get(i));
            cardImageList.remove(i);
        }
    }

    public void slowDisplayLabel(JLabel label, int msDelay) {
        final String labelText = label.getText();
        label.setText("");

        Timer timer = new Timer(msDelay, new ActionListener() {
            int index = 0;

            @Override
            public void actionPerformed(ActionEvent e) {
                if (index < labelText.length()) {
                    label.setText(label.getText() + labelText.charAt(index));
                    this.index++;
                }
                else
                    ((Timer) e.getSource()).stop();
            }
        });
        timer.start();
    }

    public JLabel getPlayerTitleLbl() {
        return playerTitleLbl;
    }

    public JLabel getDealerTitleLbl() {
        return dealerTitleLbl;
    }

    public void setStartBtnActionListener(ActionListener E) {
        startBtn.addActionListener(E);
    }
}
