package revision;

public abstract class Forme {
	abstract float perimetre();
	abstract float surface();
    public void contenantCarre(float surf){
    
    	if(this.surface() > surf*2)
        {System.out.println("Cette forme peut contenir un carré de surface " + surf);}
    	else  
        {System.out.println("Cette forme ne peut pas contenir un carré de surface "+surf);}
    }}



