package tp9_interfaces;

public class Cercle implements ObjetGeometrique {

    int rayon;

    @Override
    public double perimetre() {
        return 2 * Math.PI * rayon;
    }

    @Override
    public double surface() {
        return rayon * rayon * Math.PI;
    }

    public Cercle(int rayon) {
        this.rayon = rayon;
    }

}
