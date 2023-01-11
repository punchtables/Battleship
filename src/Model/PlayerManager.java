package Model;
import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * PlayerManager-klassen som ansvarar för hanteringen av alla spelare.
 * @author Johannes Danielson och Anders Dahlheim
 */
public class PlayerManager {

    private ArrayList<Player> highscore;

    /**
     * Konstruktorn för klassen som skapar en ny highscore lista
     * samt ser till att metoden "fileToArray" körs som exporterar informationen från textfilen
     * till ArrayList.
     * Ser också till att getInfoStrings startas och fylls med information så vi kan använda den.
     */
    public PlayerManager(){
       highscore = new ArrayList<>();
       fileToArray();
       getInfoStrings();
    }

    /**
     * Metoden anropas från controllern och lägger till en ny spelare i listan när spelet är klart.
     * Har en inparameter.
     * Metoden sorterar även spelare utifrån deras poäng varje gång en spelare läggs till.
     * Sist så ser den till att föra över den informationen till textfilen varje gång.
     * @param currentPlayer
     */
    public void addPlayer(Player currentPlayer) {
        highscore.add(currentPlayer);
        Collections.sort(highscore, Comparator.comparingInt(Player::getScore));
        ArrayToFile();
    }

    /**
     * Denna metod ansvarar för att exportera information från Arrayen till textfilen.
     */
    public void ArrayToFile(){

        try (PrintWriter writer = new PrintWriter(new File("highscore.txt"))) {
            for (String player : getInfoStrings()) {
                writer.println(player);
            }
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }
    }

    /**
     * Denna metod ansvarar för att exportera informationen från textfilen till Arrayen varje gång programmet
     * startas
     */
    public void fileToArray(){

        try(
                Scanner scanner = new Scanner(new FileReader("highscore.txt"))){
                while(scanner.hasNextLine()) {
                    String[] parts = scanner.nextLine().split(" - ");
                    Player player = new Player(parts[0], Integer.valueOf(parts[1]));
                    highscore.add(player);
                }
        }catch(Exception e){}
    }

    /**
     * getInfoStrings-metoden som ansvarar för att omvandla ArrayListen till en String-array.
     * Används även när vi exporterar informationen till textfilen.
     * @return
     */
    public String[] getInfoStrings() {
        int size = Math.min(highscore.size(), 10);
        String[] infoString = new String[size];
        for (int i = 0; i < infoString.length; i++){
            infoString[i] = highscore.get(i).toString();
        }
        return infoString;

    }

}
