package Controller;

import Model.Ship.Ship;
import Model.Spelplan1;

public class Controller {

    private Spelplan1 spelplan;
    private Ship ship;

    public Controller(){

    }

public void checkPosition(int i, int i2){

    String choice = spelplan.getShipAt(i,i2);

switch(choice){

    case "Cruiser":
        break;
    case "Hunter":
        break;
    case "Submarine":
        break;
    case "Torpedo":
        break;
    case "Warrior":
        break;
    default:
        break;

}

}

}
