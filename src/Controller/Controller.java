package Controller;

import Model.Ship.Ship;
import Model.Spelplan1;
import View.MainFrame;
//TEST
public class Controller {

    private Spelplan1 spelplan;
    private Ship ship;
    private MainFrame view;

    public Controller(){
        view = new MainFrame(this);
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
