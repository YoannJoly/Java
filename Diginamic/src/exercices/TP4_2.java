package exercices;

import java.util.HashMap;
import java.util.Scanner;

public class TP4_2 {

    public static void main(String[] args) {

        HashMap<String, Float> map = new HashMap<>();

        map.put("2€", (float) 2.0);
        map.put("1€", (float) 1.0);
        map.put("0.5€", (float) 0.50);
        map.put("0.2€", (float) 0.20);
        map.put("0.1€", (float) 0.10);
        map.put("0.05€", (float) 0.05);

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Pièces acceptées:");
            for (String s : map.keySet()) {
                System.out.println(s);
            }
            System.out.println("Entrez la valeur de la piece: ");
            Float entryValue = scanner.nextFloat();
            for (String s : map.keySet()) {
                if (entryValue.equals(map.get(s))) {
                    float restValue = (float) (entryValue - 0.6);
                    if ((restValue) > 0) {
                        System.out.println("Voici votre café et votre monnaie (" + (restValue) + "€)");
                    } else {
                        System.out.println("Il manque " + Math.abs(restValue) + "€");
                    }
                }
            }
        }
    }
}
