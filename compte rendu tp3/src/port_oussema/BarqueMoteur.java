package port_oussema;

public class BarqueMoteur extends Barque {
    private int puissance;

    public BarqueMoteur(int p, String nom, int numero) {
        super(nom, numero);
        puissance = p;
    }

    public int getPuissance() {
        return puissance;
    }

    public String toString() {
        return (super.toString() + " et la puissance = " + puissance);
    }
}
