package cours;
public class Variable {
    public static void main(String[] args) throws Exception {

        // Types
        int nombre = 5;
        Integer nombreObj = 6;
        float nombre2 = (float) 5.2;
        boolean bool = false;
        char caractere = 't';
        String chaine = "Hello world";

        // Conversion
        String variableA = "52";
        int variableA2 = Integer.parseInt(variableA) + 30;

        // Concaténation
        String variableA3 = variableA + 12;
        String chaineA = "Hello ";
        String chaineB = chaineA + "World";

        System.out.println("nombre: " + nombre);
        System.out.println("nombreObj: " + nombreObj);
        System.out.println("nombre2: " + nombre2);
        System.out.println("bool: " + bool);
        System.out.println("caractere: " + caractere);
        System.out.println("chaine: " + chaine);
        System.out.println("variableA2: " + variableA2);
        System.out.println("varaibleA3: " + variableA3);
        System.out.println("chaineB: " + chaineB);
    }
}
