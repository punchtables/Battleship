package Model;
import java.util.ArrayList;

public class PlayerManager {

    private ArrayList<Player> highscore;

    public PlayerManager(){
       highscore = new ArrayList<>();
    }

    public void addPlayer(Player currentPlayer) {
        highscore.add(currentPlayer);
    }

}
