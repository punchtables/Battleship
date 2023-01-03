package Model.Ship;

public abstract class Ship {

    private int size;

    public Ship(int size){
        this.size=size;
    }
    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

}
