package View;

import Controller.Controller;

import javax.swing.*;

public class InfoPanelNewGame extends JPanel {
    private Controller controller;
    private JButton btnNewGame;

    public InfoPanelNewGame(Controller controller){
        this.controller = controller;
        createComponents();
    }

    private void createComponents() {
        btnNewGame = new JButton("New Game");
        add(btnNewGame);
    }
}
