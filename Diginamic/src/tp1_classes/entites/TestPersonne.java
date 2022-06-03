package tp1_classes.entites;

import tp1_classes.entites2.Personne;

public class TestPersonne {
    
    public static void main(String[] args) {
        
        Personne firstPersonne = new Personne("Doe", "John", 34000);
        Personne secondPersonne = new Personne("Tard", "Guy", 69000);

        System.out.println(firstPersonne.name);
        System.out.println(secondPersonne.firstName);
    }
}
