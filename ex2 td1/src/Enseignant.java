
public class Enseignant {
	private String nom , specialite ; 
	public Enseignant (String nom , String specialite)
	{
		this.nom = nom ;
		this.specialite = specialite ;
	}
    public String getSpecialite() 
	{
	       return specialite;
    }

	public String getNom() 
	{
	        return nom;
	}
	public void afficher() 
	{
		System.out.println("Eenseignant : " + E.nom + "\n Specialite :" +E.specialite) ;
	}
}
