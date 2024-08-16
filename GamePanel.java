import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
import java.awt.image.ColorModel;



public class GamePanel extends JPanel {

    public GamePanel() {
        setAlignmentX(Component.CENTER_ALIGNMENT);
        setPreferredSize(new Dimension(600, 427));
        setBackground(new Color(12,12,14));

        JPanel playerPanel = new JPanel();
        playerPanel.setLayout(new BoxLayout(playerPanel, BoxLayout.X_AXIS));
        JLabel dealerTitleLbl = new JLabel("Dealer");
        dealerTitleLbl.setForeground(new Color(174,177,182));
        add(playerPanel, BorderLayout.NORTH);


    }
}
