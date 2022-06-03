package cours;
import java.util.Scanner;

public class Bug {

    public static void main(String[] args) {

        // BUG 1
        String s = new String("test");
        String s2 = new String("test");

        Constante constante = new Constante();
        Constante constante2 = new Constante();
        System.out.println(constante);
        System.out.println(constante2);

        System.out.println(s == s2); // Comparaison sur le pointeur <=> Objet Identique
        System.out.println(s.equals(s2)); // Comparaison sur la valeur <=> Valeur Identique

        try (// BUG 2
        Scanner scanner = new Scanner(System.in)) {
            System.out.print("1 - ");
            scanner.nextInt();
            scanner.nextLine(); // Force la suppression du buffer

            System.out.print("2 - ");
            String resultat = scanner.nextLine();
            System.out.println(resultat);
        }
    }
}