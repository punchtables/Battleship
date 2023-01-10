package View;

import Controller.Controller;

import javax.swing.*;
import javax.swing.text.MaskFormatter;
import java.awt.*;
import java.text.ParseException;

public class MainFrame {
    private JFrame frame;
    private MainPanel panel;

    private int width = 1200;
    private int height = 1000;

    public MainFrame(Controller controller) {
        frame = new JFrame("Battleship");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(width, height);
        frame.setResizable(false);

        panel = new MainPanel(controller, width, height);
        Container pane = frame.getContentPane();
        pane.add(panel);

        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    public void increaseShotCounter(int nbrOfShots){
        panel.infoPanel.increaseShotCounter(nbrOfShots);
    }
    public void setHitMiss(String miss){
        panel.infoPanel.populateHit(miss);
    }
    public void disableButton(int i, int j){
        panel.disableButton(i, j);
    }
    public void setMissButton(int i, int j){
        panel.setMissButton(i, j);
    }
    public void setHitButton(int i, int j){
        panel.setHitButton(i, j);
    }

    public int selectBoardI(){
        String parseThis = JOptionPane.showInputDialog("Välj bana 1 eller 2: ");
        return Integer.parseInt(parseThis);
    }
    public void showBoardError() {
        JOptionPane.showMessageDialog(null, "Det finns bara spelplan 1 och spelplan 2.",
                "Felaktig spelplan", JOptionPane.ERROR_MESSAGE);
    }
    public String showEndGameDialog() throws ParseException {
        JFormattedTextField ftf = new JFormattedTextField(new MaskFormatter("***"));
        ftf.setFocusLostBehavior(JFormattedTextField.COMMIT);
        //ftf.setFont(new Font("Arial", Font.PLAIN, 12));
        String name = JOptionPane.showInputDialog("All ships sunk! Enter your highscore name: ").toUpperCase();
        return name;
    }
}
