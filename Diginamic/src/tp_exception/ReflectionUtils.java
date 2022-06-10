package tp_exception;

import java.lang.reflect.Field;

public class ReflectionUtils {

    public static void afficherAttributs(final Object obj) throws Exception {

        final Class<?> classe = obj.getClass();
        if (obj.equals(null)) {
            throw new ReflectionException(null);
        } else {
            final Field[] fields = classe.getDeclaredFields();
            for (final Field field : fields) {
                field.setAccessible(true);
                System.out.println("La valeur de l'attribut " + field.getName() + " est " + field.get(obj).toString());
            }
        }

    }
}
