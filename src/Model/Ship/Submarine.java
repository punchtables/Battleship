package Model.Ship;
/**
 * Submarine-klass som ärver av Ship-klassen.
 * @author Johannes Danielson och Anders Dahlheim
 */
public class Submarine extends Ship{
    /**
     * Konstruktor som storleken som inparameter och
     * pekar på superklassen Ship.
     * @param size
     */
    public Submarine(int size){
        super(size);
    }

}
