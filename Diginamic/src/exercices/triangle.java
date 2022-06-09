package exercices;

import java.util.Scanner;

public class triangle {
    public static void main(final String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Entrez un nombre: ");
            final int n = scanner.nextInt();
            int nInt = 0;
            String finalResult = "";

            for (int i = 0; i <= n - 1; i++) {
                nInt = i + 1;
                final String result = String.valueOf(nInt);
                finalResult = finalResult + " " + result;
                System.out.println(finalResult);
            }
        }
    }
}
