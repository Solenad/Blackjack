import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;


public class GamePanel extends JPanel {

    public GamePanel() {
        setLayout(new BorderLayout(0, 5 ));
        setAlignmentX(Component.CENTER_ALIGNMENT);
        setPreferredSize(new Dimension(600, 427));
        setBackground(new Color(12,12,14));

        JLabel roe = new JLabel();

        JPanel playerHandPanel = new JPanel(new BorderLayout());
        playerHandPanel.setOpaque(false);
        playerHandPanel.setLayout(new BorderLayout(5, 5 ));
        playerHandPanel.setAlignmentX(Component.CENTER_ALIGNMENT);
        playerHandPanel.setBorder(BorderFactory.createEmptyBorder(0, 30, 30, 0));

        JPanel dealerHandPanel = new JPanel(new BorderLayout());
        dealerHandPanel.setOpaque(false);
        dealerHandPanel.setLayout(new BorderLayout(5, 5 ));
        dealerHandPanel.setAlignmentX(Component.CENTER_ALIGNMENT);
        dealerHandPanel.setBorder(BorderFactory.createEmptyBorder(0, 30, 30, 0));

        JLabel playerTitleLbl = new JLabel("Player");
        playerTitleLbl.setFont(new Font("Monospaced", Font.BOLD, 25));
        playerTitleLbl.setForeground(new Color(223,225,229));
        playerTitleLbl.setAlignmentX(Component.LEFT_ALIGNMENT);
        playerTitleLbl.setAlignmentY(Component.BOTTOM_ALIGNMENT);
        playerHandPanel.add(playerTitleLbl, BorderLayout.WEST);



        JLabel dealerTitleLbl = new JLabel("Dealer");
        dealerTitleLbl.setFont(new Font("Monospaced", Font.BOLD, 25));
        dealerTitleLbl.setForeground(new Color(223,225,229));
        dealerTitleLbl.setAlignmentX(Component.RIGHT_ALIGNMENT);
        dealerTitleLbl.setAlignmentY(Component.TOP_ALIGNMENT);
        dealerHandPanel.add(dealerTitleLbl, BorderLayout.WEST);

        add(playerHandPanel, BorderLayout.SOUTH);
        add(dealerHandPanel, BorderLayout.NORTH);

    }
}
