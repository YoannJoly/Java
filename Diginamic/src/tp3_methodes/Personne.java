package tp3_methodes;

public class Personne {

    public Personne(String name, String firstName) {
        this.name = name;
        this.firstName = firstName;
    }

    public Personne(String name, String firstName, int postalCode) {
        this(name, firstName);
        this.postalCode = postalCode;
    }

    private String name;
    private String firstName;
    private int postalCode;

    void showName() {
       System.out.println(name.toUpperCase() + " " + firstName);
    }

    void newName(String newName) {
        name = newName;
    }

    void newFirstName(String newFirstName) {
        firstName = newFirstName;
    }

    void newPostalCode(int newPostalCode) {
        postalCode = newPostalCode;
    }

    String returnName() {
        return name;
    }

    String returnFirstName() {
        return firstName;
    }

    int returnPostalCode() {
        return postalCode;
    }
    
}
