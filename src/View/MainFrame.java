package View;

import Controller.Controller;

import javax.swing.*;
import javax.swing.border.LineBorder;
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
        String[] options = {"OK"};
        int choice = 0;
        JPanel panel = new JPanel();
        JLabel lbl = new JLabel("Choose board 1 or 2: ", SwingConstants.CENTER);
        JTextField txt = new JTextField(1);
        txt.setBorder(new LineBorder(Color.BLACK, 1));
        panel.add(lbl);
        panel.add(txt);
        int selectedOption = JOptionPane.showOptionDialog(null, panel, "Gameboard", JOptionPane.NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options , options[0]);
        if (selectedOption == 0) {
            try {
                choice = Integer.parseInt(txt.getText());
            }
            catch(NumberFormatException e) {}
        }
        return choice;

    }
    public void showBoardError() {
        JOptionPane.showMessageDialog(null, "Please enter a valid number",
                "Wrong board input", JOptionPane.ERROR_MESSAGE);
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
        if (name.length() == 2) {
            name = name + "!";
        }
        if (name.length() == 1) {
            name = name + "!!";
        }
        return name;
    }
    public void resetGame() {
        panel.gamePanel.disableAllButtons();
        panel.infoPanel.resetShotCounter();
        panel.infoPanel.resetHitMiss();
    }
    public void createHighScore(String[] infoString) {
        panel.infoPanel.createHighScore(infoString);
    }
    public void resetAllButtons(){
        panel.resetAllButtons();
    }

    public void resetShotCounter() {
        panel.infoPanel.resetShotCounter();
    }
    public void resetHitMiss() {
        panel.infoPanel.resetHitMiss();
    }
}


