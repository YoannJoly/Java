package tp_exception;

import tp10_list.Ville;

public class TestReflectionUtils {

    static Ville montpellier = new Ville("Montpellier", 400000);

    public static void main(final String[] args) throws Exception {
        ReflectionUtils.afficherAttributs(null);

    }

}
