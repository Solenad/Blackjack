import javax.swing.*;
import javax.swing.Timer;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;


public class GamePanel extends JPanel {
    private JLabel cardImageLbl;
    private final JLabel playerTitleLbl, playerTotalLbl;
    private final JLabel dealerTitleLbl, dealerTotalLbl;
    private final JLabel gameStatusLbl;
    private final JPanel playerHandPanel, playerSectionPanel, playerControlPanel;
    private final JPanel dealerHandPanel, dealerSectionPanel;
    private final JButton startBtn, hitBtn, standBtn, exitBtn;

    public GamePanel() {

        setLayout(new BorderLayout(0, 5 ));
        setAlignmentX(Component.CENTER_ALIGNMENT);
        setPreferredSize(new Dimension(600, 427));
        setBackground(new Color(12,12,14));

        // panel initializations

        playerSectionPanel = new JPanel(new BorderLayout(5, 5 ));
        playerSectionPanel.setOpaque(false);
        playerSectionPanel.setAlignmentX(Component.CENTER_ALIGNMENT);
        playerSectionPanel.setBorder(BorderFactory.createEmptyBorder(0, 30, 30, 20));
        add(playerSectionPanel, BorderLayout.SOUTH);

        JPanel playerTitlePanel = new JPanel(new BorderLayout());
        playerTitlePanel.setAlignmentX(Component.LEFT_ALIGNMENT);
        playerTitlePanel.setAlignmentY(Component.BOTTOM_ALIGNMENT);
        playerTitlePanel.setOpaque(false);
        playerSectionPanel.add(playerTitlePanel, BorderLayout.WEST);

        playerHandPanel = new JPanel();
        playerHandPanel.setLayout(new BoxLayout(playerHandPanel, BoxLayout.X_AXIS));
        playerHandPanel.setAlignmentY(Component.CENTER_ALIGNMENT);
        playerHandPanel.setOpaque(false);
        playerHandPanel.add(Box.createHorizontalStrut(40));
        playerHandPanel.setBorder(BorderFactory.createEmptyBorder(10, 50, 10, 0));
        playerSectionPanel.add(playerHandPanel, BorderLayout.CENTER);

        playerControlPanel = new JPanel();
        playerControlPanel.setLayout(new BoxLayout(playerControlPanel, BoxLayout.Y_AXIS));
        playerControlPanel.setOpaque(false);
        playerControlPanel.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 40));
        playerControlPanel.add(Box.createVerticalGlue());

        dealerSectionPanel = new JPanel(new BorderLayout());
        dealerSectionPanel.setOpaque(false);
        dealerSectionPanel.setLayout(new BorderLayout(5, 5 ));
        dealerSectionPanel.setBorder(BorderFactory.createEmptyBorder(30, 30, 0, 40));
        add(dealerSectionPanel, BorderLayout.NORTH);

        JPanel dealerTitlePanel = new JPanel(new BorderLayout());
        dealerTitlePanel.setAlignmentX(Component.LEFT_ALIGNMENT);
        dealerTitlePanel.setAlignmentY(Component.BOTTOM_ALIGNMENT);
        dealerTitlePanel.setOpaque(false);
        dealerSectionPanel.add(dealerTitlePanel, BorderLayout.WEST);

        dealerHandPanel = new JPanel();
        dealerHandPanel.setLayout(new BoxLayout(dealerHandPanel, BoxLayout.X_AXIS));
        dealerHandPanel.setAlignmentY(Component.CENTER_ALIGNMENT);
        dealerHandPanel.setOpaque(false);
        dealerHandPanel.setBorder(BorderFactory.createEmptyBorder(10, 50, 10, 20));
        dealerHandPanel.add(Box.createHorizontalStrut(40));
        dealerSectionPanel.add(dealerHandPanel, BorderLayout.CENTER);

        JPanel dealerHandPanel = new JPanel();
        dealerHandPanel.setLayout(new BoxLayout(dealerHandPanel, BoxLayout.X_AXIS));
        dealerHandPanel.setAlignmentY(Component.CENTER_ALIGNMENT);


        playerSectionPanel.add(playerControlPanel, BorderLayout.EAST);


        playerTitleLbl = new JLabel("Player");
        playerTitleLbl.setFont(new Font("Monospaced", Font.BOLD, 25));
        playerTitleLbl.setForeground(new Color(223,225,229));
        playerTitleLbl.setAlignmentY(Component.BOTTOM_ALIGNMENT);
        playerTitlePanel.add(playerTitleLbl, BorderLayout.SOUTH);

        playerTotalLbl = new JLabel("Total: ");
        playerTotalLbl.setFont(new Font("Monospaced", Font.BOLD, 20));
        playerTotalLbl.setForeground(new Color(223,225,229));
        playerTotalLbl.setAlignmentX(Component.CENTER_ALIGNMENT);
        playerTotalLbl.setAlignmentY(Component.TOP_ALIGNMENT);

        dealerTitleLbl = new JLabel("Dealer");
        dealerTitleLbl.setFont(new Font("Monospaced", Font.BOLD, 25));
        dealerTitleLbl.setForeground(new Color(223,225,229));
        dealerTitleLbl.setAlignmentY(Component.BOTTOM_ALIGNMENT);
        dealerTitlePanel.add(dealerTitleLbl, BorderLayout.NORTH);

        dealerTotalLbl = new JLabel("Total: ");
        dealerTotalLbl.setFont(new Font("Monospaced", Font.BOLD, 20));
        dealerTotalLbl.setForeground(new Color(223,225,229));
        dealerTotalLbl.setAlignmentX(Component.RIGHT_ALIGNMENT);
        dealerTotalLbl.setAlignmentY(Component.TOP_ALIGNMENT);

        gameStatusLbl = new JLabel();
        gameStatusLbl.setFont(new Font("Monospaced", Font.BOLD, 18));
        gameStatusLbl.setForeground(new Color(223,225,229));
        gameStatusLbl.setAlignmentX(Component.CENTER_ALIGNMENT);


        // buttons
        startBtn = new PlayerControlButton("Start");
        hitBtn = new PlayerControlButton("Hit");
        standBtn = new PlayerControlButton("Stand");
        exitBtn = new PlayerControlButton("Exit");
        exitBtn.setMaximumSize(new Dimension(Integer.MAX_VALUE, exitBtn.getPreferredSize().height));

        playerControlPanel.add(startBtn);
    }

    public void addImage(String imageName, JPanel panel) {

        ImageIcon cardImage;
        JLabel cardImageLbl;

        cardImage = new ImageIcon(Objects.requireNonNull(getClass().getResource(imageName)));
        cardImageLbl = new JLabel(cardImage);

        panel.add(cardImageLbl);
        panel.add(Box.createHorizontalStrut(20));
    }

    public void removeAllImage() {

        playerHandPanel.removeAll();
        dealerHandPanel.removeAll();
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

    public JLabel getGameStatusLbl() {
        return gameStatusLbl;
    }

    public JLabel getPlayerTitleLbl() {
        return playerTitleLbl;
    }

    public JLabel getDealerTitleLbl() {
        return dealerTitleLbl;
    }

    public JLabel getPlayerTotalLbl() {
        return playerTotalLbl;
    }

    public JLabel getDealerTotalLbl() {
        return dealerTotalLbl;
    }

    public JPanel getPlayerHandPanel() {
        return playerHandPanel;
    }

    public JPanel getDealerHandPanel() {
        return dealerHandPanel;
    }


    public void setStartBtnActionListener(ActionListener E) {
        startBtn.addActionListener(E);
    }

    public void setHitBtnActionListener(ActionListener E) {
        hitBtn.addActionListener(E);
    }

    public void setStandBtnActionListener(ActionListener E) {
        standBtn.addActionListener(E);
    }

    public void setExitBtnActionListener(ActionListener E) {
        exitBtn.addActionListener(E);
    }

    public void setUpControl() {
        playerControlPanel.removeAll();
        playerControlPanel.add(hitBtn);
        playerControlPanel.add(standBtn);
        playerControlPanel.add(Box.createVerticalStrut(50));
        playerControlPanel.add(exitBtn);
        playerSectionPanel.add(playerTotalLbl, BorderLayout.NORTH);
        dealerSectionPanel.add(dealerTotalLbl, BorderLayout.SOUTH);
        dealerSectionPanel.add(gameStatusLbl, BorderLayout.EAST);
        repaint();
        revalidate();
    }

    public void removeControl() {
        playerControlPanel.removeAll();
        playerSectionPanel.remove(playerTotalLbl);
        dealerSectionPanel.remove(dealerTotalLbl);
        playerControlPanel.add(startBtn);
    }
}
