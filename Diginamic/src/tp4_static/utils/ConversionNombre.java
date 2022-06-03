package tp4_static.utils;

public class ConversionNombre {

    static String chaine = "12";

    static int converted = Integer.parseInt(chaine);

    static int a = 15;
    static int b = 25;

    public static int max(int a, int b) {
        int c = Math.max(a, b);
        return c;
    }

    public static void main(String[] args) {
        System.out.println("Chaine convertie : " + converted);
        System.out.println("Plus grand chiffre: " + max(a, b));
    }
}
