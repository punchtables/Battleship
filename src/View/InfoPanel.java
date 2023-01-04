package View;

import Controller.Controller;

import javax.swing.*;
import java.awt.*;

public class InfoPanel extends JPanel {
    private Controller controller;

    public InfoPanel(Controller controller) {
        this.controller = controller;
        createComponents();
    }

    private void createComponents() {
        JButton button = new JButton("West?!");
        add(button);
    }
}
