public class Driver {
    public static void main(String[] args) {
        BlackjackView blackjackView = new BlackjackView();
        GameModel gameModel = new GameModel();
        BlackjackController blackjackController = new BlackjackController(blackjackView, gameModel);
    }
}
