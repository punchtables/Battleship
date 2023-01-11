package Controller;

import javax.swing.*;

/**
 * Main-klassen som ansvarar för att starta programmet.
 * @author Johannes Danielson och Anders Dahlheim
 */
public class Main {

    /**
     * Main-metoden som startar programmet samt säkerställer att programmet är använder
     * ett "Look and feel" som är oberoende av operativsystem.
     * @param args
     */
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }
        Controller controller = new Controller();
    }
}