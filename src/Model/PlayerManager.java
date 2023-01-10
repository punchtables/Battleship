package Model;
import java.util.ArrayList;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Comparator;
import java.util.Collections;


public class PlayerManager {

    private ArrayList<Player> highscore;

    public PlayerManager(){
       highscore = new ArrayList<>();
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

    public void FileToArray(){

    }

    public String[] getInfoStrings() {

        String[] infoString = new String[highscore.size()];
        for (int i = 0; i < highscore.size(); i++){
            infoString[i] = highscore.get(i).toString();
        }
        return  infoString;
    }

    /*public void sortArray(){
        Collections.sort(highscore, Comparator.comparingInt(Player::getScore));

    }*/

}
