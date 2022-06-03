package exercices;

import java.util.Scanner;

public class TP4 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Entrez un nombre binaire: ");
            String bin = scanner.nextLine();
            if (bin.matches("[01]+")) {
                int decimal = Integer.parseInt(bin, 2);
                System.out.println(decimal);
            } else {
                System.out.println("Ce n'est pas un nombre binaire");
            }
        }
    }
}
