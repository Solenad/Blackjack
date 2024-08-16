import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;

public class BlackjackController {

    public BlackjackController(BlackjackView blackjackView, GameModel gameModel) {
        MainMenuPanel mainMenuPanel = blackjackView.getMainMenuPanel();

        mainMenuPanel.setPlayBtnMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                mainMenuPanel.setPlayBtnColor(new Color(125,127,131));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                mainMenuPanel.setPlayBtnColor(new Color(223,225,229));
            }
        });

        mainMenuPanel.setPlayBtnListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                blackjackView.showPanel("GamePanel");
            }
        });

    }
}
