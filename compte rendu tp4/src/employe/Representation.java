package employe;

public class Representation extends Employe{
	double chiffre_daffaire ;
	public Representation (String n , String p , int a , String d , double ca) 
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
	s = s+ 800 ; 
	return (s) ;
}
public String getNom()
{
	return ("l'employe "+ nom+ " " + prenom );
}
	

}
