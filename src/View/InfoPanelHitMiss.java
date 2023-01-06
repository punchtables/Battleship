package View;

import Controller.Controller;

import javax.swing.*;
import java.awt.*;

public class InfoPanelHitMiss extends JPanel {
    private Controller controller;
    private JLabel hit;
    private String miss;
    public InfoPanelHitMiss(Controller controller){
        this.controller = controller;
        createComponents();
    }

    private void createComponents() {
        hit = new JLabel("Hit/Miss: ");
        hit.setPreferredSize(new Dimension(100, 50));
        add(hit);
    }

    public void setText(String miss) {
        this.miss = miss;
        hit.setText(miss);
    }
}
