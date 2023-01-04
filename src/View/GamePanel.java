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
                    label.setPreferredSize(new Dimension(40, 40));
                    Font font = new Font("Arial", Font.BOLD, 12);
                    label.setFont(font);
                    add(label);
                    c++;

                } else if (j == 0 && i > 0) {
                    // Add the row labels
                    JLabel labell = new JLabel(String.valueOf(i), SwingConstants.CENTER);
                    labell.setPreferredSize(new Dimension(40, 40));
                    Font font = new Font("Arial", Font.BOLD, 12);
                    labell.setFont(font);
                    add(labell);

                } else {
                    JButton button = new JButton("");
                    button.setPreferredSize(new Dimension(40,40));
                    add(button);
                }
            }
        }
    }
}
