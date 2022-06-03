package cours;
public class Boucle {

    public static void main(String[] args) {

        // While
        int i = 0;
        while (i < 10) {
            System.out.println(i++);
        }

        // Do - While
        int j = 0;
        do {
            System.out.println(j++);
        } while (j < 10);

        // For
        for (int k = 0; k < 10; k = k + 2) {
            System.out.println(k);
        }
    }
}
