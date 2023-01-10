package View;

import Controller.Controller;

import javax.swing.*;
import javax.swing.text.*;
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
    public String showEndGameDialog() {
        int maxLength = 3;
        JTextField nameField = new JTextField(maxLength);
        PlainDocument doc = new PlainDocument();
        doc.setDocumentFilter(new DocumentFilter() {
            @Override
            public void insertString(FilterBypass bypass, int offset, String text, AttributeSet attr) throws BadLocationException {
                int newLength = bypass.getDocument().getLength() + text.length();
                if (newLength <= maxLength) {
                    super.insertString(bypass, offset, text, attr);
                }
            }
            @Override
            public void replace(FilterBypass bypass, int offset, int length, String text, AttributeSet attr) throws BadLocationException {
                int newLength = bypass.getDocument().getLength() - length + text.length();
                if (newLength <= maxLength) {
                    super.replace(bypass, offset, length, text, attr);
                }
            }
        });
        nameField.setDocument(doc);
        Object[] options = {"OK"};
        int response = JOptionPane.showOptionDialog(frame, new Object[] {"Game over! Enter your name: ", nameField},
                "High Scorer", JOptionPane.NO_OPTION, JOptionPane.PLAIN_MESSAGE, null, options, options[0]);

        String name = (response == JOptionPane.OK_OPTION ? nameField.getText() : null).toUpperCase();
        return name;
    }
    public void resetGame() {
        panel.gamePanel.resetAllButtons();
        panel.infoPanel.resetShotCounter();
        panel.infoPanel.resetHitMiss();
    }
    public void createHighScore(String[] infoString) {
        panel.infoPanel.createHighScore(infoString);
    }
}


