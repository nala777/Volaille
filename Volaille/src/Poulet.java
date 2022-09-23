import java.util.ArrayList;
/**
 * Class définissant un poulet avec son abat
 */
public class Poulet extends Volaille{

    double prixPoulet;
    double poidAbbatagePoulet;

    /**
     *
     * @param double prixPoulet
     * @param double poidAbbatagePoulet
     */
    public Poulet(double prixPoulet,double poidAbbatagePoulet){
        this.prixPoulet = prixPoulet;
        this.poidAbbatagePoulet = poidAbbatagePoulet;
    }

    /**
     * This function returns the price of a chicken
     * 
     * @return The price of the chicken.
     */
    public double getPrixPoulet() {
        return prixPoulet;
    }

    /**
     * This function sets the price of a chicken
     * 
     * @param prixPoulet the price of the chicken
     */
    public void setPrixPoulet(double prixPoulet) {
        this.prixPoulet = prixPoulet;
    }

    /**
     * La fonction return le poids minimal du poulet
     * 
     * @return The value of the variable poidAbbatagePoulet.
     */
    public double getPoidAbbatagePoulet() {
        return poidAbbatagePoulet;
    }

    /**
     * This function sets the weight of the chicken at the time of slaughter
     * 
     * @param poidAbbatagePoulet the weight of the chicken after slaughter
     */
    public void setPoidAbbatagePoulet(double poidAbbatagePoulet) {
        this.poidAbbatagePoulet = poidAbbatagePoulet;
    }

    /**
     * This function calculates the price of a chicken based on its weight and the price per kilogram
     * 
     * @param v the object of the class Volaille
     * @param prixPoulet the price of a chicken
     * @return The price of the chicken.
     */
    public double calculPrixPoulet(Volaille v, double prixPoulet){
        double prix = prixPoulet* v.getPoids();
        return prix;
    }




}
