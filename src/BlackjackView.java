import javax.swing.*;
import java.awt.*;


public class BlackjackView extends JFrame{
    private final MainMenuPanel mainMenuPanel;
    private final JPanel gamePanel;


    public BlackjackView() {
        setTitle("Blackjack");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);
        setResizable(false);
        getContentPane().setLayout(new CardLayout());

        this.mainMenuPanel = new MainMenuPanel();
        add(this.mainMenuPanel.getMainMenuPanel(), "MainMenuPanel");

        this.gamePanel = new GamePanel();
        add(this.gamePanel, "GamePanel");

        setVisible(true);
    }

    public MainMenuPanel getMainMenuPanel() {
        return this.mainMenuPanel;
    }

    public JPanel getGamePanel() {
        return this.gamePanel;
    }

    public void showPanel(String panelName) {
        CardLayout layout = (CardLayout) getContentPane().getLayout();
        layout.show(getContentPane(), panelName);
    }
}
