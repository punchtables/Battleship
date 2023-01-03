package Controller;

import Model.Player;
import View.MainFrame;

public class Controller {
    private MainFrame view;
    private Player currentPlayer;

    public Controller() {
        view = new MainFrame(this);
        currentPlayer = new Player("Test", 0);
    }
}

