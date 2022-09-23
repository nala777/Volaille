import java.util.ArrayList;

public class Volaille {

    int numeroMat;
    int age;
    double poids;
    char type;

    public Volaille(int numeroMat, int age, double poids ,char type) {
        this.numeroMat = numeroMat;
        this.age = age;
        this.poids = poids;
        this.type = type;
    }

    public Volaille(){}


    @Override
    public String toString() {
        return "Volaille{" +
                "numeroMat=" + numeroMat +
                ", age=" + age + "jours" +
                ", poids=" + poids +
                ", type=" + type +
                '}';
    }

    public int getNumeroMat() {
        return numeroMat;
    }

    public void setNumeroMat(int numeroMat) {
        this.numeroMat = numeroMat;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getPoids() {
        return poids;
    }

    public void setPoids(double poids) {
        this.poids = poids;
    }

    public char getType() {
        return type;
    }

    public void setType(char type) {
        this.type = type;
    }
}
