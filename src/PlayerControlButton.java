import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class PlayerControlButton extends JButton {
    public PlayerControlButton(String buttonText) {
        super(buttonText);

        setBackground(getBackground());
        setContentAreaFilled(false);
        setBorderPainted(false);
        setFocusPainted(false);
        setFont(new Font("Monospaced", Font.BOLD, 25));
        setForeground(new Color(223,225,229));
        setMaximumSize(new Dimension(110, 40));
        setAlignmentX(Component.RIGHT_ALIGNMENT);

        addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                setForeground(new Color(125, 127, 131));
            }

            public void mouseExited(MouseEvent e) {
                setForeground(new Color(223, 225, 229));
            }
        });
    }
}
