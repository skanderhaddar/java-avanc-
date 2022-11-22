package revision;


public class Rectangle extends Forme {
    private float longueur;
    private float largeur;
    public 	Rectangle (float largeur, float longueur) {
    	super();
    	this.largeur= largeur ; 
    	this.longueur= longueur ; 
    }
    public float perimetre() {
        return (2*longueur + 2*largeur);
    }

    @Override
    public float surface() {
        return longueur*largeur;
    }

    
    }


