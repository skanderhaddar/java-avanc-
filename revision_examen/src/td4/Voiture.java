package td4;

public class Voiture extends Vehicule implements Motorise {
	public Voiture(String m) {
		marque = m ; 
	}
	public void seDeplacer() {
		System.out.println ("je roule") ;
	}
	public String toString() {
		return(super.toString() + "de type voiture et de marque " + marque);
	}
	public double calculer () {
		return prop*2 ; 
	}
}
