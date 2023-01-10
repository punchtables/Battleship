package View;

import Controller.Controller;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.util.Arrays;

public class InfoPanelHighScore extends JPanel {
    private Controller controller;
    private JList<String> list;
    private JLabel label;
    private DefaultListModel<String> model;

    public InfoPanelHighScore(Controller controller){
        this.controller = controller;

        GridBagLayout layout = new GridBagLayout();
        GridBagConstraints c = new GridBagConstraints();
        setLayout(layout);

        c.gridx = 0;
        c.gridy = 0;

        c.insets = new Insets(10, 10, 5, 10);
        c.fill = GridBagConstraints.NONE;

        label = new JLabel("Highscore: ");
        label.setVisible(true);
        this.add(label, c);

        c.gridx = 0;
        c.gridy = 1;

        c.weighty = 1;
        c.insets = new Insets(5, 10, 10, 10);

        list = new JList<>();
        list.setVisible(true);
        list.setBorder(new LineBorder(Color.BLACK));
        list.setVisibleRowCount(10);
        this.add(list, c);
    }

    /*private void createComponents(){
        label = new JLabel("Highscore: ");
        label.setVisible(true);
        add(label);

        DefaultListModel<String> model = new DefaultListModel<>();
        for (int i = 0; i < 10; i++) {
            model.addElement("");
        }
        list = new JList<>(model);
        list.setVisible(true);
        list.setBorder(new LineBorder(Color.BLACK));
        list.setVisibleRowCount(10);
        add(list);
    }*/

    public void createHighScore(String[] infoString) {
        list.setListData(infoString);
    }
}
