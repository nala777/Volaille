import java.util.ArrayList;
/**
 * Class defenissant une volaille
 */
public class Volaille {

    
    int numeroMat;
    int age;
    double poids;
    char type;

    /**
     *
     * @param int numeroMat
     * @param int age
     * @param double poids
     * @param char type
     */
    public Volaille(int numeroMat, int age, double poids ,char type) {
        this.numeroMat = numeroMat;
        this.age = age;
        this.poids = poids;
        this.type = type;
    }

    public Volaille(){}


    @Override
    // A method that returns a string representation of the object.
    public String toString() {
        return "Volaille{" +
                "numeroMat=" + numeroMat +
                ", age=" + age + "jours" +
                ", poids=" + poids +
                ", type=" + type +
                '}';
    }

    /**
     * This function returns the number of the student
     * 
     * @return The value of the variable numeroMatricule.
     */
    public int getNumeroMat() {
        return numeroMat;
    }

    /**
     * This function sets the value of the variable numeroMat to the value of the parameter numeroMat
     * 
     * @param numeroMat the number of the volaille
     */
    public void setNumeroMat(int numeroMat) {
        this.numeroMat = numeroMat;
    }

    /**
     * This function returns the age of the volaille
     * 
     * @return The age of the person.
     */
    public int getAge() {
        return age;
    }

    /**
     * This function sets the age of the volaille to the value of the parameter age
     * 
     * @param age The age of the person.
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * This function returns the weight of the object
     * 
     * @return The weight of the object.
     */
    public double getPoids() {
        return poids;
    }

    /**
     * This function sets the weight of the object
     * 
     * @param poids the weight of the edge
     */
    public void setPoids(double poids) {
        this.poids = poids;
    }

    /**
     * This function returns the type of the volaille
     * 
     * @return The type of the object.
     */
    public char getType() {
        return type;
    }

    /**
     * This function sets the type of the object to the type passed in as a parameter
     * 
     * @param type The type of the volaille.
     */
    public void setType(char type) {
        this.type = type;
    }
}
