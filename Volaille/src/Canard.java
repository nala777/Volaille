import java.util.ArrayList;

public class Canard extends Volaille{
    double prixCanard;
    double poidAbbatageCanard;

    public Canard(double prixCanard,double poidAbbatageCanard){
        this.prixCanard = prixCanard;
        this.poidAbbatageCanard = poidAbbatageCanard;
    }

    public double getPrixCanard() {
        return prixCanard;
    }

    public void setPrixCanard(double prixCanard) {
        this.prixCanard = prixCanard;
    }

    public double getPoidAbbatageCanard() {
        return poidAbbatageCanard;
    }

    public void setPoidAbbatageCanard(double poidAbbatageCanard) {
        this.poidAbbatageCanard = poidAbbatageCanard;
    }

    public double calculPrixCanard(Volaille v, double prixCanard){
       double prix = prixCanard*v.getPoids();
       return prix;
    }


}
