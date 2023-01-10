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
        GridBagLayout layout = new GridBagLayout();
        GridBagConstraints c = new GridBagConstraints();
        setLayout(layout);

        c.gridx = 0;
        c.gridy = 0;
        c.insets = new Insets(10, 0, 10, 0);
        c.anchor = GridBagConstraints.CENTER;
        hit = new JLabel("Hit/Miss: ");
        //hit.setPreferredSize(new Dimension(100, 50));
        add(hit, c);
    }

    public void setText(String miss) {
        this.miss = miss;
        hit.setText(miss);
    }

    public void resetHitMiss() {
        hit.setText("Hit/Miss: ");
    }
}
