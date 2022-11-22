package revision;

public class Cercle extends Forme {
    private float rayon;
    public 	Cercle (float rayon) throws FormeException{
    	super();
    	this.rayon= rayon ; 
    	if (rayon<0)  	       
    		throw new FormeException("rayon negative");

}

    	public float perimetre() {
        return (2*3.14f*rayon);
    }

    public float surface() {
        return rayon*rayon*3.14f;
    }

}
    
