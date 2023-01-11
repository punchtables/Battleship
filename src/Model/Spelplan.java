package Model;
import Model.Ship.Ship;

/**
 * Spelplan klassen som ansvarar lagra spelplanen.
 * @author Johannes Danielson och Anders Dahlheim
 */
public class Spelplan {

    private Ship[][] spelplan;

    /**
     * Konstruktor för spelplanen som har en inparameter.
     * @param spelplan
     */
    public Spelplan(Ship[][] spelplan){
        this.spelplan=spelplan;
    }

    /**
     * Metod som kollar vad det finns för skepp på den tryckta positionen.
     * Har två inparametrar som är indexen.
     * Returnerar namn på klassen ifall positionen innehåller ett skepp.
     * Returnerar tom sträng ifall inget skepp finns på spelplanen.
     * @param i
     * @param j
     * @return
     */
    public String getShipAt(int i, int j){

        if (spelplan[i][j]!=null){
            return spelplan[i][j].getClass().getTypeName();
        }else{
          return "";}

    }

    /**
     * Metod som ansvarar för att returna det aktuella skeppets storlek.
     * Har två inparametrar som är indexen.
     * Returnerar aktuellt skepp.
     * @param i
     * @param j
     * @return
     */
    public Ship getShipSizeAt(int i, int j){
        return spelplan[i][j];
    }

}
