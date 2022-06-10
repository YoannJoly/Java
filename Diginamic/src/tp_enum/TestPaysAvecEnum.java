package tp_enum;

public class TestPaysAvecEnum {

    public static void main(final String[] args) {
        int nbreEurpe = 0;
        for (final Pays i : Pays.countries) {
            System.out.println(i);

            if (i.getContinent().equals(Continent.EUROPE)) {
                nbreEurpe += 1;
            }
        }

        System.out.println("Pays en Europe --> " + nbreEurpe);

    }

}
