package View;

import Controller.Controller;

import javax.swing.*;

public class GamePanel extends JPanel {
    private Controller controller;

    public GamePanel(Controller controller) {
        this.controller = controller;
    }
}
