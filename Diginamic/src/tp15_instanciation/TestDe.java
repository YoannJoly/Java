package tp15_instanciation;

public class TestDe {
    public static void main(final String[] args) {
        final De d = new De(6);
        int six = 0;
        int jet = 0;
        while (six <= 10) {
            //System.out.println(d.getResultat());
            jet++;
            if (d.getResultat() == 6) {
                six++;
            }
        }
        System.out.println("Nombre de jet : " + jet);

    }
}
