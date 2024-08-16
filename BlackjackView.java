import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;


public class BlackjackView {
    private final JFrame mainFrame;




    public BlackjackView() {
        this.mainFrame = new JFrame("Blackjack");
        this.mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.mainFrame.setSize(800, 600);

        mainGridLayout mainMenu = new mainGridLayout();
        this.mainFrame.setContentPane(mainMenu.getMainMenuPanel());



        this.mainFrame.setVisible(true);
    }
}
