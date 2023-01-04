package View;

import Controller.Controller;

import javax.swing.*;
import java.awt.*;
//TEST
public class GamePanel extends JPanel {
    private Controller controller;

    public GamePanel(Controller controller) {

        this.controller = controller;
        createComponents();
    }

    private void createComponents() {
        setLayout(new GridLayout(11, 11));

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

/*
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

 */
    }
}
