package employe;

public class Manutention extends Employe {

	double nbr_dheure ; 
	public Manutention (String n , String p , int a , String d , int nh) 
	{
		super(); 
		this.nom = n ; 
		this.prenom = p ; 
		this.age = a ; 
		this.date = d ; 
		this.nbr_dheure = nh ;		
	}
	public double getNbh() {
		return nbr_dheure ;}
	
	public void setNbh(float nbr_dheure) {
		this.nbr_dheure = nbr_dheure ;}
	
	public double calculer_salaire()
	{
		double s =65*nbr_dheure ;
		return (s) ;
	}
	public String getNom()
	{
		return ("l'employe "+ nom + " " + prenom );
	}

}
