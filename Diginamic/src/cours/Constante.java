package cours;
public class Constante {

    private final static int nombre = 12;

    public static void main(String[] args) {

        // Déclaration de constante
        final int nombre2 = 13;
        System.out.println(nombre2);

        final String chaine = " hello world ";
        System.out.println(chaine);

        // Supprimer espace
        System.out.println(chaine.trim());

        test();

    }

    public static void test() {
        System.out.println(nombre);
    }
}
