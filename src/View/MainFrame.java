package View;

import Controller.Controller;

import javax.swing.*;
import java.awt.*;

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
        Container pane = frame.getContentPane();
        pane.add(panel);

        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    public void increaseShotCounter(int nbrOfShots){
        panel.infoPanel.increaseShotCounter(nbrOfShots);
    }
    public void setHitMiss(String miss){
        panel.infoPanel.populateHit(miss);
    }
    public void disableButton(int i, int j){
        panel.disableButton(i, j);
    }
    public void setMissButton(int i, int j){
        panel.setMissButton(i, j);
    }
    public void setHitButton(int i, int j){
        panel.setHitButton(i, j);
    }
}
