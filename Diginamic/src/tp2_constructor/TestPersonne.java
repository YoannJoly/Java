package tp2_constructor;

public class TestPersonne {

    public static void main(final String[] args) {

        final Personne firstPersonne = new Personne("Doe", "John");
        final Personne secondPersonne = new Personne("Tard", "Guy", 69000);

        System.out.println(firstPersonne.name);
        System.out.println(secondPersonne.firstName);
    }
}
