package Model;

/**
 * Player-klassen som ansvarar för information om spelarna.
 * @author Johannes Danielson och Anders Dahlheim
 */
public class Player {


    private String name;
    private int score;

    /**
     * Konstruktorn som har två inparametrar och initierar dem.
     * @param name
     * @param score
     */
    public Player(String name, int score){
        this.name=name;
        this.score=score;
    /**
     * getMetod för instansvariabeln name
     * @return name
     */
    }
    public String getName() {
        return name;
    }

    /**
     * setMetod för name som har en inparameter.
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * getMetod för instansvariabeln score.
     * @return score
     */
    public int getScore() {
        return score;
    }

    /**
     * setMetod för poängen som har en inparameter.
     * @param score
     */
    public void setScore(int score) {
        this.score = score;
    }

    /**
     * toString-metod för klassen som returnerar namn och poäng.
     * @return name, score
     */
    public String toString(){
        return name + " - " + score;
    }

}
