package exercices;
import java.util.Scanner;

public class TP2 {

    class Tableau {
        int a;
        int b;

        public void setData(int c, int d) {
            a = c;
            b = d;
        }

        public void newCheques(int a, int b) {
            cheques[0].setData(a, b);
        }
    }

    static Tableau cheques[] = new Tableau[2];
    static int numberCheques = 0;
    static int ammountCheques = 0;

    public static void displayMenuPoids() {

        try (Scanner scanner = new Scanner(System.in)) {

            System.out.println("Numéro du cheques: ");
            numberCheques = scanner.nextInt();

            System.out.println("Montant du cheques: ");
            ammountCheques = scanner.nextInt();

            System.out.println(cheques[0]);
            System.out.println(cheques[1]);
            
            cheques[0].newCheques(numberCheques,ammountCheques);

            System.out.println(cheques[0]);

        }

    }

    public static void main(String[] args) {
        displayMenuPoids();
    }

}
