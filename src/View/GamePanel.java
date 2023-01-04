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
        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 11; j++) {
                if (i == 0 && j > 0) {
                    // Add the column labels
                    add(new JLabel("Column " + j, SwingConstants.CENTER));
                } else if (j == 0 && i > 0) {
                    // Add the row labels
                    add(new JLabel("Row " + i, SwingConstants.CENTER));
                } else {
                    add(new JButton("Button (" + i + ", " + j + ")"));
                }
            }
        }
    }
}
