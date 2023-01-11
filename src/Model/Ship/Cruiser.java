package Model.Ship;

/**
 * Cruiser-klass som ärver av Ship-klassen.
 * @author Johannes Danielson och Anders Dahlheim
 */
public class Cruiser extends Ship {

    /**
     * Konstruktor som storleken som inparameter och
     * pekar på superklassen Ship.
     * @param size
     */
    public Cruiser(int size) {
        super(size);
    }

}
