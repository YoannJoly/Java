package tp9_interfaces;

public class TestObjetGeometrique {

    public static void main(final String[] args) {
        final ObjetGeometrique[] objetGeometriques = { new Cercle(21), new Rectangle(12, 45) };

        for (final ObjetGeometrique objetGeometrique : objetGeometriques) {
            if (objetGeometrique instanceof Cercle) {
                System.out.println("Cercle --> " + "Surface : " + objetGeometrique.surface() + " Perimetre : "
                        + objetGeometrique.perimetre());
            } else if (objetGeometrique instanceof Rectangle) {
                System.out.println("Rectangle --> " + "Surface : " + objetGeometrique.surface() + " Perimetre : "
                        + objetGeometrique.perimetre());
            }
        }
    }

}
