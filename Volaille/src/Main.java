import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        
        
       // Creating an array list of Volaille and an array list of Double.
        ArrayList<Volaille> listeVolailles = new ArrayList<>();
        ArrayList<Double> listePrix = new ArrayList<>();

       // Creating 4 new objects of the class Volaille.
        Volaille v1 = new Volaille(125,21,1.7,'P');
        Volaille v2 = new Volaille(1276,21,2.7,'C');
        Volaille v3 = new Volaille(4,21,1.7,'P');
        Volaille v4 = new Volaille(6,21,0.8,'C');
//        Volaille v5 = new Volaille(457,21,1.4,'C');

        Elevage e1 = new Elevage(listeVolailles,listePrix);
        e1.ajoutElevage(v1);
        e1.ajoutElevage(v2);
        e1.ajoutElevage(v3);
        e1.ajoutElevage(v4);
//        e1.ajoutElevage(v5);

        e1.afficherElevage();

        e1.maj();

        e1.afficherElevage();

        Terminal.sautDeLigne();



        Terminal.ecrireString(s"Prix du jour du poulet : ");
        double prixPoulet = Terminal.lireDouble();

        
        Terminal.ecrireString(s"Prix du jour du canard : ");
        double prixCanard = Terminal.lireDouble();


        Poulet p1 = new Poulet(prixPoulet,8);
        Canard c1 = new Canard(prixCanard,9);

        Terminal.sautDeLigne();
        e1.calculPrixAbbatage(c1,p1);

        e1.afficherVolailleAbbatage(c1,p1);










    }
}
