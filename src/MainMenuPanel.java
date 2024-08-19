import javax.swing.*;
import javax.swing.plaf.FontUIResource;
import javax.swing.text.StyleContext;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.ColorModel;
import java.util.Locale;

public class MainMenuPanel extends MouseAdapter {
    private JPanel mainMenuPanel;
    private JPanel mainMenuHeader;
    private JLabel mainMenuTitleLbl;
    private JLabel mainMenuAuthorLbl;
    private JPanel mainMenuButtonPanel;
    private JButton playBtn;


    public JPanel getMainMenuPanel() {
        return this.mainMenuPanel;
    }

    public void setPlayBtnListener(ActionListener actionListener) {
        this.playBtn.addActionListener(actionListener);
        this.playBtn.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                playBtn.setForeground(new Color(125, 127, 131));
            }

            public void mouseExited(MouseEvent e) {
                playBtn.setForeground(new Color(223, 225, 229));
            }
        });
    }


}
