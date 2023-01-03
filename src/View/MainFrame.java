package View;

import Controller.Controller;

import javax.swing.*;

public class MainFrame {
    private JFrame frame;
    private MainPanel panel;

    private int width = 1200;
    private int height = 1000;

    public MainFrame(Controller controller) {
        frame = new JFrame("Battleship");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(width, height);
        panel = new MainPanel(controller, width, height);
        frame.add(panel);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
