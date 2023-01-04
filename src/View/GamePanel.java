package View;

import Controller.Controller;

import javax.swing.*;
import java.awt.*;

public class GamePanel extends JPanel {
    private Controller controller;

    public GamePanel(Controller controller) {

        this.controller = controller;
        createComponents();
    }

    private void createComponents() {
        setLayout(new GridLayout(11, 11));

        // Add labels for the rows
        for (int i = 1; i <= 10; i++) {
            add(new JLabel(String.valueOf(i), JLabel.CENTER));
        }

        // Add labels for the columns
        for (int i = 0; i < 10; i++) {
            add(new JLabel(String.valueOf((char) ('A' + i)), JLabel.CENTER));
        }

        // Add buttons
        for (int i = 1; i <= 100; i++) {
            add(new JButton(String.valueOf(i)));
        }
    }
}
