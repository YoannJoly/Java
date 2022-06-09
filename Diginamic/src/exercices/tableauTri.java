package exercices;

import java.util.Arrays;

public class tableauTri {
    public static void main(final String[] args) {
        final int firstArray[] = new int[] { 1, 2, 4, 5, 7, 28, 10, 12, 26, 35 };
        final int secondArray[] = new int[] { 21, 24, 57, 37, 45, 52, 56, 61, 78 };

        Arrays.sort(firstArray);
        Arrays.sort(secondArray);

        System.out.println("\n" + "Premier tableau: " + Arrays.toString(firstArray));
        System.out.println("\n" + "Second tableau: " + Arrays.toString(secondArray));

        final int fLen = firstArray.length;
        final int sLen = secondArray.length;
        final int[] mergeArray = new int[fLen + sLen];

        System.arraycopy(firstArray, 0, mergeArray, 0, fLen);
        System.arraycopy(secondArray, 0, mergeArray, fLen, sLen);

        Arrays.sort(mergeArray);

        System.out.println("\n" + "Tableaux fusionnées: " + Arrays.toString(mergeArray) + "\n");
    }
}
