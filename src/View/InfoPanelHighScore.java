package View;

import Controller.Controller;

import javax.swing.*;
import java.awt.*;

public class InfoPanelHighScore extends JPanel {
    private Controller controller;
    private JList<String> list;

    public InfoPanelHighScore(Controller controller){
        this.controller = controller;
        //setPreferredSize(new Dimension(100, 200));
        createComponents();

    }

    private void createComponents(){
        list = new JList<>();
        list.setVisible(true);
        add(list);
    }

    public void createHighScore(String[] infoString) {
        list = new JList<>(infoString);
    }
}
