package View;

import Controller.Controller;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;
import java.awt.*;

public class MainPanel extends JPanel {
    private int width;
    private int height;
    Controller controller;
    GamePanel gamePanel;
    InfoPanel infoPanel;

    public MainPanel(Controller controller, int width, int height) {
        this.controller = controller;
        this.width = width;
        this.height = height;

        setupPanel();
    }

    private void setupPanel() {
        GridBagLayout layout = new GridBagLayout();
        GridBagConstraints c = new GridBagConstraints();
        setLayout(layout);

        Border border = this.getBorder();
        Border margin = BorderFactory.createEmptyBorder(10, 10 ,10, 10);
        setBorder(new CompoundBorder(border, margin));

        c.gridx = 0;
        c.gridy = 0;
        c.weightx = 0.3;
        infoPanel = new InfoPanel(controller);
        add(infoPanel, c);

        c.gridx = 1;
        c.gridy = 0;
        c.weightx = 0.7;
        gamePanel = new GamePanel(controller);
        add(gamePanel, c);
    }
    public void disableButton(int i, int j){
        gamePanel.disableButton(i, j);
    }
    public void setMissButton(int i, int j){
        gamePanel.setMissButton(i, j);
    }
}
