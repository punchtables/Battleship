package Controller;

import Model.Ship.*;
import Model.Spelplan1;
import View.GamePanel;
import View.MainFrame;
//TEST
public class Controller {

    private Spelplan1 spelplan;
    private Ship ship;
    private Ship[][] ships;
    private MainFrame view;

    int cruiserC = 0;
    int warriorC = 0;
    int torpedoC = 0;
    int subC = 0;
    int hunterC = 0;
    int shots;
    int gameover;

    public Controller(){
        view = new MainFrame(this);
        createSpelPlan();
    }

   public void createSpelPlan(){
        ships = new Ship[10][10];

        Ship cruiser = new Cruiser(4);
        Ship hunter = new Hunter(3);
        Ship submarine = new Submarine(1);
        Ship warrior = new Warrior(5);
        Ship torpedo = new Torpedo(2);

        ships[2][3] = cruiser;
        ships[3][3] = cruiser;
        ships[1][3] = cruiser;
        ships[0][3] = cruiser;
        ships[4][4] = hunter;
        ships[4][5] = hunter;
        ships[4][6] = hunter;
        ships[6][9] = submarine;
        ships[0][8] = torpedo;
        ships[0][9] = torpedo;
        ships[4][8] = warrior;
        ships[5][8] = warrior;
        ships[6][8] = warrior;
        ships[7][8] = warrior;
        ships[8][8] = warrior;
        spelplan = new Spelplan1(ships);

    }
public void checkPosition(int i, int j){
    System.out.println(i+" "+j);
    shots++;

    view.increaseShotCounter(shots);

    String choice = spelplan.getShipAt(i,j);
switch(choice){

    case "Model.Ship.Cruiser":
        cruiserC++;
        gameover++;
        view.disableButton(i, j);
        view.setHitButton(i,j);
        if(cruiserC!=spelplan.getShipSizeAt(i,j).getSize()){
            view.setHitMiss("Cruiser hit");
        }else if(cruiserC==spelplan.getShipSizeAt(i,j).getSize()){
            view.setHitMiss("Cruiser sunk!");
        }if(gameover==15){
            view.setHitMiss("All ships sunk!");
        }
        break;
    case "Model.Ship.Hunter":
        hunterC++;
        gameover++;
        view.disableButton(i, j);
        view.setHitButton(i,j);
        if(hunterC!=spelplan.getShipSizeAt(i,j).getSize()){
            view.setHitMiss("Hunter hit");
        }else if(hunterC==spelplan.getShipSizeAt(i,j).getSize()){
            view.setHitMiss("Hunter sunk!");
        }if(gameover==15){
            view.setHitMiss("All ships sunk!");
        }
        break;
    case "Model.Ship.Submarine":
        subC++;
        gameover++;
        view.disableButton(i, j);
        view.setHitButton(i,j);
        if(subC!=spelplan.getShipSizeAt(i,j).getSize()){
            view.setHitMiss("Submarine hit!");
        }else if(subC==spelplan.getShipSizeAt(i,j).getSize()){
            view.setHitMiss("Submarine sunk!");
        }if(gameover==15){
            view.setHitMiss("All ships sunk!");
        }
        break;
    case "Model.Ship.Torpedo":
        torpedoC++;
        gameover++;
        view.disableButton(i, j);
        view.setHitButton(i,j);
        if(torpedoC!=spelplan.getShipSizeAt(i,j).getSize()){
            view.setHitMiss("Torpedo hit!");
        }else if(torpedoC==spelplan.getShipSizeAt(i,j).getSize()){
            view.setHitMiss("Torpedo sunk!");
        }if(gameover==15){
            view.setHitMiss("All ships sunk!");
        }
        break;
    case "Model.Ship.Warrior":
        warriorC++;
        gameover++;
        view.disableButton(i, j);
        view.setHitButton(i,j);
        if(warriorC!=spelplan.getShipSizeAt(i,j).getSize()){
            view.setHitMiss("Warrior hit!");
        }else if(warriorC==spelplan.getShipSizeAt(i,j).getSize()){
            view.setHitMiss("Warrior sunk!");
        }if(gameover==15){
            view.setHitMiss("All ships sunk!");
        }
        break;
    default:
        view.setHitMiss("You missed!");
        view.disableButton(i, j);
        view.setMissButton(i, j);
        break;

}

}





}
