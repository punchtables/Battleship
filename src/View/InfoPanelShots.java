package View;

import Controller.Controller;

import javax.swing.*;
import java.awt.*;

public class InfoPanelShots extends JPanel {
    private Controller controller;
    private int nbrOfShots;
    private JLabel shots;

    public InfoPanelShots(Controller controller){
        this.controller = controller;
        nbrOfShots = 0;
        createComponents();
    }

    private void createComponents() {
        GridBagLayout layout = new GridBagLayout();
        GridBagConstraints c = new GridBagConstraints();
        setLayout(layout);

        c.gridx = 0;
        c.gridy = 0;
        c.insets = new Insets(0, 0, 10, 0);
        c.anchor = GridBagConstraints.CENTER;
        shots = new JLabel("Shots: 0");
        //shots.setPreferredSize(new Dimension(100, 50));
        add(shots, c);
    }

    public void increaseShotCounter(int nbrOfShots) {
        this.nbrOfShots = nbrOfShots;
        shots.setText("Shots: " + nbrOfShots);
    }

    public void resetShotCounter() {
        shots.setText("Shots: 0");
    }
}
