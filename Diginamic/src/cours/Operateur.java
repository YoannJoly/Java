package cours;
public class Operateur {
    public static void main(String[] args) {

        // Déclarations
        int a1 = 0;
        int b1 = 0;
        int c1 = 0;
        int a2 = 5, b2 = 5, c2 = 5;
        a2 = b2 = c2 = 0;

        System.out.println(a1);
        System.out.println(b1);
        System.out.println(c1);
        System.out.println(a2);
        System.out.println(b2);
        System.out.println(c2);

        // Opérateur Algo
        int entierA = 5 + 2;
        int entierB = 5 - 2;
        int entierC = 5 * 2;
        // modulo
        int entierD = 5 / 2;
        // pas modulo
        float entierE = (float) (5.0 / 2);

        // Incrémentation / Décrémentation
        int a = 0;
        a++; // a = a + 1
        a--; // a = a - 1

        // Comparaison
        System.out.println(5 == 2);
        System.out.println(5 != 2);
        //System.out.println(5 == 2 || 3 == 6 / 2);

        // sout
        System.out.println(entierA);
        System.out.println(entierB);
        System.out.println(entierC);
        System.out.println(entierD);
        System.out.println(entierE);
        System.out.println(a);
    }
}
