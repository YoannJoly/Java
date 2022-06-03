package tp2_constructor;

public class Personne {

    public Personne(String name, String firstName) {
        this.name = name;
        this.firstName = firstName;       
    }

    public Personne(String name, String firstName, int postalCode) {
        this(name, firstName);  
        this.postalCode = postalCode;     
    }

    public String name;
    public String firstName;
    public int postalCode;

}
