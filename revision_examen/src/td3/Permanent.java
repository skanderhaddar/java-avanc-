package td3;

public class Permanent extends Contractuel {
	private float prime ;
	public Permanent (String ch , float s , float p)
	{
		super(ch , s) ;
		prime = p ; 
	}
	void SetPrime(float p) 
	{
		prime = p ; 
	}
	public void calculerSalaire()
	{
		salaire = salaireBase + prime; 
	}
	

}
