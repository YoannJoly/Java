package tp4_static.utils;

public class ConversionNombre {

    static String chaine = "12";

    static int converted = Integer.parseInt(chaine);

    static int a = 15;
    static int b = 25;

    public static int max(final int a, final int b) {
        final int c = Math.max(a, b);
        return c;
    }

    public static void main(final String[] args) {
        System.out.println("Chaine convertie : " + converted);
        System.out.println("Plus grand chiffre: " + max(a, b));
    }
}
