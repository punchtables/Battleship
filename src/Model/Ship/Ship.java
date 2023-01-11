package Model.Ship;

/**
 * Abstrakt-klass för alla sorts skepp.
 * @author Johannes Danielson och Anders Dahlheim
 */
public abstract class Ship {

    private int size;

    /**
     * Konstruktor som har en inparameter
     * @param size
     */
    public Ship(int size){
        this.size=size;
    }

    /**
     * getMetod som returner skeppet storlek.
     * @return
     */
    public int getSize() {
        return size;
    }

    /**
     * setMetod som har storleken som inparameter.
     * @param size
     */
    public void setSize(int size) {
        this.size = size;
    }

}
