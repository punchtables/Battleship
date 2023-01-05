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

   /* public void createSpel(){

        spelplan = new Ship[10][10];
        Ship cruiser = new Cruiser(1);
        Ship hunter = new Hunter(1);
        Ship submarine = new Submarine(1);

        spelplan[2][3] = cruiser;
        spelplan[4][4] = hunter;
        spelplan[6][9] = submarine;

        for(int i=0;i< spelplan.length;i++){
            for(int j=0;j<spelplan[i].length;j++){
                if(spelplan[i][j] instanceof Ship  ){
                    System.out.print("*  ");
                } else{
                    System.out.print("-  ");
                }
            } System.out.println();
        }

    }*/

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
