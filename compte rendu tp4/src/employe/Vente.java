package employe;

public class Vente extends Employe { 
	double chiffre_daffaire ;
	public  Vente(String n , String p , int a , String d , int ca)
	{
		nom = n ; 
		prenom = p ; 
		age = a ; 
		date = d ; 
		chiffre_daffaire = ca ;
		
	}
	public double calculer_salaire()
	{
		double s = 0.2*chiffre_daffaire ;
		s = s+ 400 ; 
		return (s) ;
	}
	public String getNom()
	{
		return ("l'employe "+ nom+ " " + prenom );
	}

}
