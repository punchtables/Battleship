package View;

import Controller.Controller;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;

public class InfoPanelHighScore extends JPanel {
    private Controller controller;
    private JList<String> list;
    private JLabel label;

    public InfoPanelHighScore(Controller controller){
        this.controller = controller;
        //createComponents();

        GridBagLayout layout = new GridBagLayout();
        GridBagConstraints c = new GridBagConstraints();
        setLayout(layout);

        c.gridx = 0;
        c.gridy = 0;
        label = new JLabel("Highscore: ");
        label.setVisible(true);
        add(label, c);

        c.gridx = 0;
        c.gridy = 1;
        list = new JList<>();
        list.setVisible(true);
        list.setBorder(new LineBorder(Color.BLACK));
        add(list, c);

    }

    private void createComponents(){
        label = new JLabel("Highscore: ");
        label.setVisible(true);
        add(label);
        list = new JList<>();
        list.setVisible(true);
        list.setBorder(new LineBorder(Color.BLACK));
        add(list);
    }

    public void createHighScore(String[] infoString) {
        list.setListData(infoString);
    }
}
