
public class Formation {
	private String nom ;
	private Enseignant ens ;
	public Formation (String nom , Enseignant ens )
	{
		this.nom = nom ;
		this.ens= ens ;
	}
	public String getNom()
	{
		return nom ;
	}
	public Enseignant getEns()
	{
		return ens ;
	}
	
	public void afficher()
	{
		System.out.println("le nom de la formation = " + nom );
		ens.afficher();
	}
	
}
