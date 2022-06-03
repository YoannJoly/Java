package exercices;

import java.util.Scanner;

public class triangle {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Entrez un nombre: ");
            int n = scanner.nextInt();
            int nInt = 0;
            String finalResult = "";

            for (int i = 0; i <= n - 1; i++) {
                nInt = i + 1;
                String result = String.valueOf(nInt);
                finalResult = finalResult + " " + result;
                System.out.println(finalResult);
            }
        }
    }
}
