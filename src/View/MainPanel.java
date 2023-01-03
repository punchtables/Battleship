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
        BorderLayout layout = new BorderLayout();
        setLayout(layout);

        Border border = this.getBorder();
        Border margin = BorderFactory.createEmptyBorder(10, 10 ,10, 10);
        setBorder(new CompoundBorder(border, margin));

        gamePanel = new GamePanel(controller);
        add(gamePanel, BorderLayout.CENTER);

        infoPanel = new InfoPanel(controller);
        add(infoPanel, BorderLayout.WEST);

    }
}
