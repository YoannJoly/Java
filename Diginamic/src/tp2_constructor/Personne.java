package tp2_constructor;

public class Personne {

    public Personne(final String name, final String firstName) {
        this.name = name;
        this.firstName = firstName;       
    }

    public Personne(final String name, final String firstName, final int postalCode) {
        this(name, firstName);  
        this.postalCode = postalCode;     
    }

    public String name;
    public String firstName;
    public int postalCode;

}
