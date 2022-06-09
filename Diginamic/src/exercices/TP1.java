package exercices;
import java.util.Scanner;

public class TP1 {

    static String viande = "";
    static String cuisson = "";
    int poids = 0;

    public static void display_menu() {
        System.out.println("1) Boeuf\n2) Porc");
        System.out.print("Viande choisie: ");
    }

    public static void menuCookStyle() {
        System.out.println("1) Bleu\n2) A point\n3) Bien cuit");
        System.out.print("Style choisi: ");
    }

    public static void Main() {
        try (Scanner in = new Scanner(System.in)) {
            display_menu();
            switch (in.nextInt()) {
                case 1:
                    viande = "boeuf";
                    System.out.println("Boeuf");
                    break;
                case 2:
                    viande = "porc";
                    System.out.println("Porc");
                    break;
                default:
                    System.err.println("Option non reconnue");
                    break;
            }
            displayMenuCookStyle();
        }

    }

    public static void displayMenuCookStyle() {
        try (Scanner in = new Scanner(System.in)) {
            menuCookStyle();
            switch (in.nextInt()) {
                case 1:
                    cuisson = "bleu";
                    System.out.println("Bleu");
                    break;
                case 2:
                    cuisson = "point";
                    System.out.println("A point");
                    break;
                case 3:
                    cuisson = "cuit";
                    System.out.println("Bien cuit");
                    break;
                default:
                    System.err.println("Option non reconnue");
                    break;
            }
            displayMenuPoids();
        }
    }

    public static void displayMenuPoids() {

        try (Scanner scanner = new Scanner(System.in)) {

            System.out.println("Poids en grammes:");
            final Integer a = scanner.nextInt();

            if (viande == "boeuf") {
                if (cuisson == "bleu") {
                    System.out.println("Temps de cuisson en minutes: " + (float) (a / 500.0 * 10.0));
                } else if (cuisson == "point") {
                    System.out.println("Temps de cuisson en minutes: " + (float) (a / 500.0 * 17.0));
                } else if (cuisson == "cuit") {
                    System.out.println("Temps de cuisson en minutes: " + (float) (a / 500.0 * 25.0));
                }
            } else if (viande == "porc") {
                if (cuisson == "bleu") {
                    System.out.println("Temps de cuisson en minutes: " + (float) (a / 400.0 * 15.0));
                } else if (cuisson == "point") {
                    System.out.println("Temps de cuisson en minutes: " + (float) (a / 400.0 * 25.0));
                } else if (cuisson == "cuit") {
                    System.out.println("Temps de cuisson en minutes: " + (float) (a / 400.0 * 40.0));
                }
            }
        }
    }

    public static void main(final String[] args) {
        Main();
    }
}
