package tp3_methodes;

public class TestPersonne {

    public static void main(String[] args) {

        Personne firstPersonne = new Personne("Doe", "John");
        Personne secondPersonne = new Personne("Tard", "Guy", 69000);

        System.out.println(firstPersonne.returnName());
        System.out.println(secondPersonne.returnName());

        firstPersonne.newName("Robert");
        firstPersonne.showName();

        secondPersonne.newPostalCode(24000);
        System.out.println(secondPersonne.returnPostalCode());
    }
}
