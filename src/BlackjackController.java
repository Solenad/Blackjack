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

            gameModel.setDeck();
            gameModel.setGame();
            gamePanel.getDealerTotalLbl().setText("Total: ? + " + dealer.getCard(1).getCardValue());
            gamePanel.getPlayerTotalLbl().setText("Total: " + player.getHandTotal());
            gamePanel.setUpControl();

            for (i = 0; i < 2; i++) {
                gamePanel.addImage("/cardImages/card" + player.getCard(i).getCardValue() + ".png", gamePanel.getPlayerHandPanel());
            }

            gamePanel.addImage("/cardImages/hideImage.png", gamePanel.getDealerHandPanel());
            gamePanel.addImage("/cardImages/card" + dealer.getCard(1).getCardValue() + ".png", gamePanel.getDealerHandPanel());

            gamePanel.slowDisplayLabel(gamePanel.getDealerTotalLbl(), 25);
            gamePanel.slowDisplayLabel(gamePanel.getPlayerTotalLbl(), 25);

            gamePanel.validate();
            gamePanel.repaint();
        });

        gamePanel.setExitBtnActionListener(e -> {
            gameModel.clearAllList();
            gamePanel.removeAllImage();
            gamePanel.removeControl();
            gamePanel.getGameStatusLbl().setText("");
            blackjackView.showPanel("MainMenuPanel");
            gamePanel.repaint();
            gamePanel.revalidate();
        });

        gamePanel.setHitBtnActionListener(e -> {
            Player player = gameModel.getPlayer();
            Deck deck = gameModel.getDeck();

            if (!deck.getCardList().isEmpty() && player.getHandTotal() <= 21) {
                player.addCard(deck.drawCard());
                gamePanel.getPlayerTotalLbl().setText("Total: " + player.getHandTotal());
                gamePanel.addImage("/cardImages/card" + player.getCard(player.getCardList().size() - 1).getCardValue() + ".png", gamePanel.getPlayerHandPanel());

                gamePanel.revalidate();
                gamePanel.repaint();

                gamePanel.getGameStatusLbl().setText("You drew a card.");
                gamePanel.slowDisplayLabel(gamePanel.getGameStatusLbl(), 25);
            }
            else {
                gamePanel.getGameStatusLbl().setText("Overkill.");
                gamePanel.slowDisplayLabel(gamePanel.getGameStatusLbl(), 25);
            } 
        });

        gamePanel.setStandBtnActionListener(e -> {
            Dealer dealer = gameModel.getDealer();
            Deck deck = gameModel.getDeck();

            while (!dealer.getCardList().isEmpty() && dealer.getHandTotal() < 17) {
                dealer.addCard(deck.drawCard());
                gamePanel.getDealerTotalLbl().setText("Total: ? + " + (dealer.getHandTotal() - dealer.getCard(0).getCardValue()));
                gamePanel.addImage("cardImages/card" + dealer.getCard(dealer.getCardList().size() - 1).getCardValue() + ".png", gamePanel.getDealerHandPanel());

                gamePanel.revalidate();
                gamePanel.repaint();
            }


        });
    }
}
