package td4;

public class Velo extends Vehicule  {
	public Velo(String m) {
		marque = m ; 
	}
	public void seDeplacer() {
		System.out.println("je Pedale") ;
	}
	public String toString() {
		return super.toString() + "de type velo et de marque " + marque ;
	}
	
}
