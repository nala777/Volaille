import java.util.ArrayList;
/**
 * Class défénissant un elevage represente par ces volailles
 */
public class Elevage extends Volaille {
    ArrayList<Volaille> listeVolailles;
    ArrayList<Double> listePrix;

    /**
     *
     * @param ArrayList<Volaille> listeVolailles
     * @param ArrayList<Double> listePrix
     */
    public Elevage(ArrayList<Volaille> listeVolailles, ArrayList<Double> listePrix) {
        this.listeVolailles = listeVolailles;
        this.listePrix = listePrix;
    }

    /**
     * This function adds a new animal to the list of animals
     * 
     * @param v the chicken
     */
    public void ajoutElevage(Volaille v) {
        listeVolailles.add(v);
    }

    /**
     * It displays the list of poultry
     */
    public void afficherElevage() {
        for (int i = 0; i < listeVolailles.size(); i++) {
            System.out.println(listeVolailles.get(i).toString());
        }
    }

    /**
     * It asks the user to enter a new age and weight for each chicken in the list
     */
    public void maj() {
        for (int i = 0; i < listeVolailles.size(); i++) {
            System.out.print("Matricule : " + listeVolailles.get(i).getNumeroMat());
            Terminal.sautDeLigne();
            System.out.println("Entrez un nouvel age : ");
            listeVolailles.get(i).age = Terminal.lireInt();
            System.out.println("Entrez un nouveau poids : ");
            listeVolailles.get(i).poids = Terminal.lireDouble();
        }
    }

    /**
     * It takes a Canard and a Poulet as parameters, and then loops through the list of Volailles, and
     * if the type of the Volaille is a Poulet, it adds the price of the Poulet multiplied by the
     * weight of the Volaille to the list of prices. Otherwise, it adds the price of the Canard
     * multiplied by the weight of the Volaille to the list of prices
     * 
     * @param c Canard
     * @param p Poulet
     */
    public void calculPrixAbbatage(Canard c, Poulet p) {
        for (int i = 0; i < listeVolailles.size(); i++) {
            if (listeVolailles.get(i).getType() == 'P') {
                listePrix.add((p.getPrixPoulet() * listeVolailles.get(i).getPoids()));
            } else {
                listePrix.add((c.getPrixCanard() * listeVolailles.get(i).getPoids()));
            }
        }
    }

    /**
     * It displays the poultry that can be slaughtered
     * 
     * @param c Canard
     * @param p Poulet
     */
    public void afficherVolailleAbbatage(Canard c, Poulet p) {
        for (int i = 0; i < listeVolailles.size(); i++) {
            if (listeVolailles.get(i).getType() == 'P') {
                if (listeVolailles.get(i).getPoids() >= c.getPoidAbbatageCanard()) {
                    System.out.println(listeVolailles.get(i).toString());
                    System.out.println("Prix : "+listePrix.get(i));
                }
            } else {
                if (listeVolailles.get(i).getPoids() >= p.getPoidAbbatagePoulet()) {
                    System.out.println(listeVolailles.get(i).toString());
                    System.out.println("Prix : "+listePrix.get(i));
                }

            }
        }
    }
}
