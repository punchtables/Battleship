package Model.Ship;
/**
 * Torpedo-klass som ärver av Ship-klassen.
 * @author Johannes Danielson och Anders Dahlheim
 */
public class Torpedo extends Ship{
    /**
     * Konstruktor som storleken som inparameter och
     * pekar på superklassen Ship.
     * @param size
     */
    public Torpedo(int size){
        super(size);
    }

}
