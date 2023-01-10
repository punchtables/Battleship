package View;

import Controller.Controller;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InfoPanelExitGame extends JPanel {
    private Controller controller;
    private JButton btnExitGame;

    public InfoPanelExitGame(Controller controller){
        this.controller = controller;
        createComponents();
    }

    private void createComponents() {
        btnExitGame = new JButton("Exit Game");
        add(btnExitGame);

        btnExitGame.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controller.extiGame();
            }
        });

    }
}
