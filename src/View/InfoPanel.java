package View;

import Controller.Controller;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;
import java.awt.*;

public class InfoPanel extends JPanel {
    private Controller controller;
    private InfoPanelShots infoPanelShots;
    private InfoPanelHitMiss infoPanelHitMiss;
    private InfoPanelHighScore infoPanelHighScore;
    private InfoPanelNewGame infoPanelNewGame;
    private InfoPanelExitGame infoPanelExitGame;

    public InfoPanel(Controller controller) {
        this.controller = controller;
        setupPanel();
    }
    private void setupPanel() {
        GridBagLayout layout = new GridBagLayout();
        GridBagConstraints c = new GridBagConstraints();
        setLayout(layout);

        c.gridx = 0;
        c.gridy = 0;
        infoPanelShots = new InfoPanelShots(controller);
        add(infoPanelShots, c);

        c.gridx = 0;
        c.gridy = 1;
        infoPanelHitMiss = new InfoPanelHitMiss(controller);
        add(infoPanelHitMiss, c);

        c.gridx = 0;
        c.gridy = 2;
        infoPanelHighScore = new InfoPanelHighScore(controller);
        add(infoPanelHighScore, c);

        c.gridx = 0;
        c.gridy = 3;
        infoPanelNewGame = new InfoPanelNewGame(controller);
        add(infoPanelNewGame, c);

        c.gridx = 0;
        c.gridy = 4;
        infoPanelExitGame = new InfoPanelExitGame(controller);
        add(infoPanelExitGame, c);
    }

    public void increaseShotCounter(int nbrOfShots){
        infoPanelShots.increaseShotCounter(nbrOfShots);
    }
    public void populateHit(String miss){
        infoPanelHitMiss.setText(miss);
    }
    public void resetShotCounter() {
        infoPanelShots.resetShotCounter();
    }
    public void resetHitMiss() {
        infoPanelHitMiss.resetHitMiss();
    }
}
