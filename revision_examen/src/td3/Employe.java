package td3;

public class Employe {	
	private int matricule ;
private String nom ; 
protected float salaire ;
public static  int dernierMat = 1000  ;
public Employe (String ch ) {
	dernierMat ++;
	nom = ch ; 
	this.matricule = dernierMat ; 
}
public String toString() 
{
	return "le nom est "+ nom + "la matricule est "+ matricule ;
}
}
