package tp3_methodes;

public class Personne {

    public Personne(final String name, final String firstName) {
        this.name = name;
        this.firstName = firstName;
    }

    public Personne(final String name, final String firstName, final int postalCode) {
        this(name, firstName);
        this.postalCode = postalCode;
    }

    private String name;
    private String firstName;
    private int postalCode;

    void showName() {
       System.out.println(name.toUpperCase() + " " + firstName);
    }

    void newName(final String newName) {
        name = newName;
    }

    void newFirstName(final String newFirstName) {
        firstName = newFirstName;
    }

    void newPostalCode(final int newPostalCode) {
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
