package tp_enum;

public class TestEnumeration {

    public static void main(final String[] args) {

        for (final Saison i : Saison.values()) {
            System.out.println(i);
        }

        System.out.println("Libelle de ETE --> " + Saison.ETE.getSaison());

        System.out.println("Saison lié au libellé 'Hiver' --> " + Saison.getByName("Hiver"));

    }

}
