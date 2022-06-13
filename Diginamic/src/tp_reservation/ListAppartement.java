package tp_reservation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListAppartement extends Appartement {

    public ListAppartement(final int prix, final int nbPersonnes, final int etage, final Adresse adresse) {
        super(prix, nbPersonnes, etage, adresse);
    }

    public static String listerAppartement() {
        String result = "";
        for (int i = 0; i < listAppartement.size(); i++) {
            result += "\n" + listAppartement.get(i);
        }
        return result;
    }

    public static String listerPeniche() {
        String result = "";
        for (int i = 0; i < listPeniche.size(); i++) {
            if (listPeniche.get(i) instanceof Peniche) {
                result += "\n" + listPeniche.get(i);
            }
        }
        return result;
    }

    public static String listerMaison() {
        String result = "";
        for (int i = 0; i < listMaison.size(); i++) {
            if (listMaison.get(i) instanceof Maison) {
                result += "\n" + listMaison.get(i);
            }
        }
        return result;
    }

    static Adresse adresse1 = new Adresse("rue de la paix", "75000", "Paris", 1);
    static Adresse adresse2 = new Adresse("rue de la paix", "75000", "Paris", 2);
    static Adresse adresse3 = new Adresse("rue de la paix", "75000", "Paris", 3);
    static Adresse adresse4 = new Adresse("rue de la paix", "75000", "Paris", 4);
    static Adresse adresse5 = new Adresse("rue de la paix", "75000", "Paris", 5);
    static Adresse adresse6 = new Adresse("rue de la paix", "75000", "Paris", 6);
    static Adresse adresse7 = new Adresse("rue de la paix", "75000", "Paris", 7);
    static Adresse adresse8 = new Adresse("rue de la paix", "75000", "Paris", 8);
    static Adresse adresse9 = new Adresse("rue de la paix", "75000", "Paris", 9);
    static Adresse adresse10 = new Adresse("rue de la paix", "75000", "Paris", 10);
    static Adresse adresse11 = new Adresse("rue de la paix", "75000", "Paris", 11);
    static Adresse adresse12 = new Adresse("rue de la paix", "75000", "Paris", 12);
    static Adresse adresse13 = new Adresse("rue de la paix", "75000", "Paris", 13);
    static Adresse adresse14 = new Adresse("rue de la paix", "75000", "Paris", 14);

    static Appartement appartement1 = new Appartement(100, 2, 1, adresse1);
    static Appartement appartement2 = new Appartement(200, 2, 2, adresse2);
    static Appartement appartement3 = new Appartement(300, 2, 3, adresse3);
    static Appartement appartement4 = new Appartement(400, 2, 4, adresse4);
    static Appartement appartement5 = new Appartement(500, 2, 5, adresse5);
    static Appartement appartement6 = new Appartement(600, 2, 6, adresse6);
    static Appartement appartement7 = new Appartement(700, 2, 7, adresse7);
    static Appartement appartement8 = new Appartement(800, 2, 8, adresse8);
    static Appartement appartement9 = new Appartement(900, 2, 9, adresse9);
    static Appartement appartement10 = new Appartement(1000, 2, 10, adresse10);
    static Peniche peniche1 = new Peniche(100, 2, 1, adresse11, 10);
    static Peniche peniche2 = new Peniche(200, 2, 2, adresse12, 20);
    static Maison maison1 = new Maison(100, 2, adresse13, true);
    static Maison maison2 = new Maison(200, 2, adresse14, false);

    static List<Appartement> listAppartement = new ArrayList<Appartement>(
            Arrays.asList(appartement1, appartement2, appartement3, appartement4, appartement5, appartement6,
                    appartement7, appartement8, appartement9, appartement10));

    static List<Peniche> listPeniche = new ArrayList<Peniche>(
            Arrays.asList(peniche1, peniche2));

    static List<Maison> listMaison = new ArrayList<Maison>(
            Arrays.asList(maison1, maison2));

    public static List<Appartement> getListAppartement() {
        return listAppartement;
    }

    public static void setListAppartement(final List<Appartement> listAppartement) {
        ListAppartement.listAppartement = listAppartement;
    }

    @Override
    public String toString() {
        return "ListAppartement [listAppartement=" + listAppartement + "]";
    }

}
