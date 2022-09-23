import java.util.ArrayList;

/**
 * Class defenissant un canard
 */
public class Canard extends Volaille{
    /**
     * Attribut correspondant au prix du canard
     */
    double prixCanard;
    /**
     * Attribut correspondant au poids d'abbatage du canard
     */
    double poidAbbatageCanard;

    /**
     *
     * @param double prixCanard
     * @param double poidAbbatageCanard
     */
    public Canard(double prixCanard,double poidAbbatageCanard){
        this.prixCanard = prixCanard;
        this.poidAbbatageCanard = poidAbbatageCanard;
    }

    /**
     * This function returns the price of a duck
     * 
     * @return The price of the duck.
     */
    public double getPrixCanard() {
        return prixCanard;
    }

    /**
     * This function sets the price of a duck
     * 
     * @param prixCanard the price of the duck
     */
    public void setPrixCanard(double prixCanard) {
        this.prixCanard = prixCanard;
    }

    /**
     * This function returns the weight of the duck at the time of slaughter
     * 
     * @return The value of the variable poidAbbatageCanard.
     */
    public double getPoidAbbatageCanard() {
        return poidAbbatageCanard;
    }

    /**
     * This function sets the weight of the duck at the time of slaughter
     * 
     * @param poidAbbatageCanard the weight of the duck after slaughter
     */
    public void setPoidAbbatageCanard(double poidAbbatageCanard) {
        this.poidAbbatageCanard = poidAbbatageCanard;
    }

    /**
     * This function calculates the price of a duck
     * 
     * @param v Volaille
     * @param prixCanard the price of a duck
     * @return The price of the duck.
     */
    public double calculPrixCanard(Volaille v, double prixCanard){
       double prix = prixCanard*v.getPoids();
       return prix;
    }


}
