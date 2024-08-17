import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;

public class BlackjackController {

    public BlackjackController(BlackjackView blackjackView, GameModel gameModel) {
        MainMenuPanel mainMenuPanel = blackjackView.getMainMenuPanel();
        GamePanel gamePanel = (GamePanel) blackjackView.getGamePanel();

        mainMenuPanel.setPlayBtnListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                gamePanel.slowDisplayLabel(gamePanel.getPlayerTitleLbl(), 100);
                gamePanel.slowDisplayLabel(gamePanel.getDealerTitleLbl(), 100);
                blackjackView.showPanel("GamePanel");
            }
        });

        gamePanel.setStartBtnActionListener(e -> {

        });
    }
}
