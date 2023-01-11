package Model.Ship;
/**
 * Warrior-klass som ärver av Ship-klassen.
 * @author Johannes Danielson och Anders Dahlheim
 */
public class Warrior extends Ship{
    /**
     * Konstruktor som storleken som inparameter och
     * pekar på superklassen Ship.
     * @param size
     */
    public Warrior(int size){
        super(size);
    }

}
