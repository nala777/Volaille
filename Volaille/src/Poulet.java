import java.util.ArrayList;

public class Poulet extends Volaille{

    double prixPoulet;
    double poidAbbatagePoulet;

    public Poulet(double prixPoulet,double poidAbbatagePoulet){
        this.prixPoulet = prixPoulet;
        this.poidAbbatagePoulet = poidAbbatagePoulet;
    }

    public double getPrixPoulet() {
        return prixPoulet;
    }

    public void setPrixPoulet(double prixPoulet) {
        this.prixPoulet = prixPoulet;
    }

    public double getPoidAbbatagePoulet() {
        return poidAbbatagePoulet;
    }

    public void setPoidAbbatagePoulet(double poidAbbatagePoulet) {
        this.poidAbbatagePoulet = poidAbbatagePoulet;
    }

    public double calculPrixPoulet(Volaille v, double prixPoulet){
        double prix = prixPoulet* v.getPoids();
        return prix;
    }




}
