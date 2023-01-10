package Model;
import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


public class PlayerManager {

    private ArrayList<Player> highscore;

    public PlayerManager(){
       highscore = new ArrayList<>();
       fileToArray();
       getInfoStrings();
    }

    public void addPlayer(Player currentPlayer) {
        highscore.add(currentPlayer);
        Collections.sort(highscore, Comparator.comparingInt(Player::getScore));
        ArrayToFile();
    }

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

    public void fileToArray(){
        //highscore = new ArrayList<>();

        try(
                Scanner scanner = new Scanner(new FileReader("highscore.txt"))){
                while(scanner.hasNextLine()) {
                    String[] parts = scanner.nextLine().split(" - ");
                    Player player = new Player(parts[0], Integer.valueOf(parts[1]));
                    highscore.add(player);
                }
        }catch(Exception e){}
    }

    public String[] getInfoStrings() {
        int size = Math.min(highscore.size(), 10);
        String[] infoString = new String[size];
        for (int i = 0; i < infoString.length; i++){
            infoString[i] = highscore.get(i).toString();
        }
        return infoString;

    }

    /*public void sortArray(){
        Collections.sort(highscore, Comparator.comparingInt(Player::getScore));

    }*/

}
