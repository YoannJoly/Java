package exercices;
import java.util.Scanner;

public class Exercice_2 {

    public static void main(final String[] args) {

        // Variables
        int nb=0, nbInf=0, nbSup=0, numero, numeroPetit=0, numeroGrand=0;
        float montant, total=0f, montantPetit=0f, montantGrand=0f, totInf=0f, totSup=0f;

        // Déclaration du Scanner
        final Scanner scanner = new Scanner(System.in);

        do {

            // Demande du numéro du chéque
            System.out.println("Numéro du chéque (0 pour sortir): ");
            numero = scanner.nextInt();

            // Vérification de la saisie
            if (numero == 0) {

                // Aucun chéque
                if (nb == 0) {
                    System.out.println("Aucun chèque saisi !");

                // Traitement
                } else {
                    System.out.println("Somme des chèques : " + total);
                    System.out.println("Nombre de chèques : " + nb);
                    System.out.println("Moyenne : " + total / nb);
                    System.out.println("Somme des chèques < 200€ : " + totInf);
                    System.out.println("Nombre de chèques < 200€ : " + nbInf);
                    System.out.println("Somme des chèques >= 200€ : " + totSup);
                    System.out.println("Nombre de chèques >= 200€ : " + nbSup);
                    System.out.println("Numero du plus petit cheque : " + numeroPetit);
                    System.out.println("Montant du plus petit cheque : " + montantPetit);
                    System.out.println("Numero du plus grand cheque : " + numeroGrand);
                    System.out.println("Montant du plus grand cheque : " + montantGrand);
                }

                // Fin de la boucle
                break;
            }

            // Montant du chéque
            System.out.println("Quel est le montant du chèque");
            montant = scanner.nextFloat();

            // Statistiques
            nb++;
            total += montant;

            // Chèques < 200 €
            if (montant < 200){
                nbInf++;
                totInf += montant;

            // Chèques >= 200 €
            } else{
                nbSup++;
                totSup += montant;
            }

            // Le 1er chèque est le plus petit et le plus grand
            if (nb == 1) {
                montantPetit = montantGrand = montant;
                numeroPetit = numeroGrand = numero;

                // Ignorer le reste du programme
                continue;
            }

            // Plus petit chéque
            if (montant < montantPetit){
                montantPetit = montant;
                numeroPetit = numero;
            }

            // Plus grand chéque
            if (montant > montantGrand){
                montantGrand = montant;
                numeroGrand = numero;
            }

        } while(true);

        // Fermeture du scanner
        scanner.close();
    }
}
