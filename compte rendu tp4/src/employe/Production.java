package employe;

public class Production extends Employe {
	double nbr_dunit� ; 
	public Production (String n , String p , int a , String d , int nu) 
	{
		nom = n ; 
		prenom = p ; 
		age = a ; 
		date = d ; 
		nbr_dunit� = nu ;		
	}
	public double calculer_salaire()
	{
		double s =5*nbr_dunit� ;
		return (s) ;
	}
	public String getNom()
	{
		return ("l'employe "+ nom+ " " + prenom );
	}


}
