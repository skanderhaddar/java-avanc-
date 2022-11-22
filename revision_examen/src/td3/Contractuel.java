package td3;

public class Contractuel extends Employe {
	protected float salaireBase ;
	public Contractuel (String ch , float s )
	{
		super (ch) ;
		salaireBase = s ; 
	}
	public void SetsalaireBase(float s)
	{
		salaireBase = s ;
	}
	public void calculerSalaire() {
		 salaire = salaireBase ;
	}
	
}
