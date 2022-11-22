package td4;

public class Avion extends Vehicule implements Motorise{
	public Avion(String m) {
		marque = m ; 
	}
	public void seDeplacer() {
		System.out.println("je vole") ; 
	}
	public String toString() {
		return(super.toString() + " de type avion et de marque" + marque );
	}
	public double calculer()
	{
		return(prop*15);
	}
}
