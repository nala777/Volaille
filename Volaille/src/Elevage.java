import java.util.ArrayList;

public class Elevage extends Volaille {
    ArrayList<Volaille> listeVolailles;
    ArrayList<Double> listePrix;

    public Elevage(ArrayList<Volaille> listeVolailles, ArrayList<Double> listePrix) {
        this.listeVolailles = listeVolailles;
        this.listePrix = listePrix;
    }

    public void ajoutElevage(Volaille v) {
        listeVolailles.add(v);
    }

    public void afficherElevage() {
        for (int i = 0; i < listeVolailles.size(); i++) {
            System.out.println(listeVolailles.get(i).toString());
        }
    }

    public void maj() {
        for (int i = 0; i < listeVolailles.size(); i++) {
            System.out.print("Matricule : " + listeVolailles.get(i).getNumeroMat());
            System.out.println("Entrez un nouvel age : ");
            listeVolailles.get(i).age = Terminal.lireInt();
            System.out.println("Entrez un nouveau poids : ");
            listeVolailles.get(i).poids = Terminal.lireDouble();
        }
    }

    public void calculPrixAbbatage(Canard c, Poulet p) {
        for (int i = 0; i < listeVolailles.size(); i++) {
            if (listeVolailles.get(i).getType() == 'P') {
                listePrix.add((p.getPrixPoulet() * listeVolailles.get(i).getPoids()));
            } else {
                listePrix.add((c.getPrixCanard() * listeVolailles.get(i).getPoids()));
            }
        }
    }

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
