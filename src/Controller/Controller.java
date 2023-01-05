package Controller;

import Model.Ship.Cruiser;
import Model.Ship.Hunter;
import Model.Ship.Ship;
import Model.Ship.Submarine;
import Model.Spelplan1;
import View.MainFrame;
//TEST
public class Controller {

    private Spelplan1 spelplan;
    private Ship ship;
    private Ship[][] ships;
    private MainFrame view;

    public Controller(){
        view = new MainFrame(this);
        createSpelPlan();
    }

   public void createSpelPlan(){
        ships = new Ship[10][10];

        Ship cruiser = new Cruiser(1);
        Ship hunter = new Hunter(1);
        Ship submarine = new Submarine(1);

        ships[2][3] = cruiser;
        ships[4][4] = hunter;
        ships[6][9] = submarine;
        spelplan = new Spelplan1(ships);

    }
public void checkPosition(int i, int i2){
    System.out.println(i+" "+i2);

    String choice = spelplan.getShipAt(i,i2);

switch(choice){

    case "Cruiser":
        System.out.println("Cruiser hit!");
        break;
    case "Hunter":
        System.out.println("Hunter hit!");
        break;
    case "Submarine":
        System.out.println("Submarine hit!");
        break;
    case "Torpedo":
        System.out.println("Torpedo hit!");
        break;
    case "Warrior":
        System.out.println("Warrior hit!");
        break;
    default:
        System.out.println("You missed!");
        break;

}

}





}
