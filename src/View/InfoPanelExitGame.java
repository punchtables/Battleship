package View;

import Controller.Controller;

import javax.swing.*;

public class InfoPanelExitGame extends JPanel {
    private Controller controller;
    private JButton btnExitGame;

    public InfoPanelExitGame(Controller controller){
        this.controller = controller;
        createComponents();
    }

    private void createComponents() {
        btnExitGame = new JButton("Exit Game");
        add(btnExitGame);
    }
}
