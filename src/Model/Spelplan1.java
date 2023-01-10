package Model;
import Model.Ship.Cruiser;
import Model.Ship.Hunter;
import Model.Ship.Ship;
import Model.Ship.Submarine;

public class Spelplan1 {

    private Ship[][] spelplan;

    public Spelplan1(Ship[][] spelplan){
        this.spelplan=spelplan;
    }

    public String getShipAt(int i, int j){

        if (spelplan[i][j]!=null){
            return spelplan[i][j].getClass().getTypeName();
        }else{
          return "";}

    }
    public Ship getShipSizeAt(int i, int j){
        return spelplan[i][j];
    }

}
