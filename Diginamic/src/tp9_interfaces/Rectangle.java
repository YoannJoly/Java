package tp9_interfaces;

public class Rectangle implements ObjetGeometrique {

    int longueur;
    int largeur;

    @Override
    public double perimetre() {
        return (longueur + largeur) * 2;
    }

    @Override
    public double surface() {
        return longueur * largeur;
    }

    public Rectangle(final int longueur, final int largeur) {
        this.longueur = longueur;
        this.largeur = largeur;
    }

}
