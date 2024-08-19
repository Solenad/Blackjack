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
            int i;
            Dealer dealer = gameModel.getDealer();
            Player player = gameModel.getPlayer();

            gameModel.setGame();
            gamePanel.getDealerTotalLbl().setText("Total: ? + " + dealer.getCard(1).getCardValue());
            gamePanel.getPlayerTotalLbl().setText("Total: " + player.getHandTotal());
            gamePanel.setUpControl();

            for (i = 0; i < 2; i++) {
                gamePanel.addImage("/cardImages/card" + player.getCard(i).getCardValue() + ".png", gamePanel.getPlayerHandPanel());
            }

            gamePanel.addImage("/cardImages/hideImage.png", gamePanel.getDealerHandPanel());
            gamePanel.addImage("/cardImages/card" + dealer.getCard(1).getCardValue() + ".png", gamePanel.getDealerHandPanel());

            gamePanel.validate();
            blackjackView.repaint();

            gamePanel.slowDisplayLabel(gamePanel.getDealerTotalLbl(), 50);
            gamePanel.slowDisplayLabel(gamePanel.getPlayerTotalLbl(), 50);
        });
    }
}
