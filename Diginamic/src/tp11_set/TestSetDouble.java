package tp11_set;

import java.util.Arrays;
import java.util.HashSet;

public class TestSetDouble {
    static HashSet<Double> hashset = new HashSet<Double>(Arrays.asList(1.5, 8.25, -7.32, 13.3, -12.45, 48.5, 0.01));

    public static void main(String[] args) {
        System.out.println("Collection complete: " + hashset);
        System.out.println("Plus grand élément: " + greatestElement());

        deleteSmallestElement();

        System.out.println("Suppression du plus petit element: " + hashset);
    }

    static Double greatestElement() {
        Double max = 0.0;
        for (Double i : hashset) {
            if (i > max) {
                max = i;
            }
        }
        return max;
    }

    static void deleteSmallestElement() {
        Double min = 0.0;
        for (Double i : hashset) {
            if (i < min) {
                min = i;
            }
        }
        hashset.remove(min);
    }

}
