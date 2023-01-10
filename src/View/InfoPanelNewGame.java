package View;

import Controller.Controller;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InfoPanelNewGame extends JPanel {
    private Controller controller;
    private JButton btnNewGame;

    public InfoPanelNewGame(Controller controller){
        this.controller = controller;
        createComponents();
    }

    private void createComponents() {
        btnNewGame = new JButton("New Game");
        add(btnNewGame);
        btnNewGame.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controller.selectBoard();
                controller.btnNewGamePressed();
            }
        });
    }

    public JButton getBtnNewGame() {
        return btnNewGame;
    }
}
