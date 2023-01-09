package View;

import Controller.Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import java.awt.*;
//TEST
public class GamePanel extends JPanel {
    private Controller controller;
    private JButton[][] button;

    public GamePanel(Controller controller) {

        this.controller = controller;
        createComponents();
    }

    private void createComponents() {
        setLayout(new GridLayout(11, 11));
        char c = 'A';
        button = new JButton[11][11];

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
                    button[i][j] = new JButton("");
                    button[i][j].setPreferredSize(new Dimension(40,40));
                    add(button[i][j]);
                    int finalJ = (j-1);
                    int finalI = (i-1);

                    button[i][j].addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                        controller.checkPosition(finalI, finalJ);
                        }
                    });

                }
            }
        }
    }

    public void setEnabled(int i, int j){
        button[i+1][j+1].setEnabled(false);
    }




}
