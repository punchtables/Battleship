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
        char c = 'A';

        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 11; j++) {
                if(i==0 && j==0){
                    add(new JLabel(""));
                }
                else if (i == 0 && j > 0) {
                    // Add the column labels
                    JLabel label = new JLabel("" + Character.toString(c), SwingConstants.CENTER);
                    label.setSize(20,20);
                    add(label);
                    Font font = new Font("Arial", Font.BOLD, 12);
                    label.setFont(font);
                    c++;
                    //add(new JLabel("" + Character.toString(c), SwingConstants.CENTER));
                   // c++;
                } else if (j == 0 && i > 0) {
                    // Add the row labels
                    JLabel labell = new JLabel(String.valueOf(i), SwingConstants.CENTER);
                    labell.setSize(20,20);
                    Font font = new Font("Arial", Font.BOLD, 18);
                    labell.setFont(font);
                    add(labell);
                    //add(new JLabel(String.valueOf(i), SwingConstants.CENTER));

                } else {
                    JButton button = new JButton("");
                    button.setSize(20,20);
                    add(button);
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
