import javax.swing.*;
import javax.swing.plaf.FontUIResource;
import javax.swing.text.StyleContext;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
import java.awt.image.ColorModel;
import java.util.Locale;

public class MainMenuPanel {
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
    }

    public void setPlayBtnMouseListener(MouseListener mouseListener) {
        this.playBtn.addMouseListener(mouseListener);
    }

    public void setPlayBtnColor(Color color) {
        this.playBtn.setForeground(color);
    }

}
