package cours;
import java.util.Scanner;

public class Keyboard {
    public static void main(String[] args) {

        // Déclaration du scanner
        try (Scanner scanner = new Scanner(System.in)) {

            System.out.println("Nombre A:");
            int a = scanner.nextInt();

            System.out.println("Nombre B:");
            int b = scanner.nextInt();

            System.out.println("Le résultat est " + (a + b));
        }
    }
}
