
public class Participant {
	private String nom , specialite;
	private Formation form ; 
	public Participant (String nom ,String specialite )
	{
		this.nom = nom ;
		this.specialite = specialite ; 
	}
	public void affecterFormation (Formation f  )
	{
		 if ( this.specialite.equal(f.getEns().getSpecialite()) )
			 form = f ;
		 else 
			 form = null ;
	}
	public void afficher ()
	{
		if (form != null )
			{
			System.out.println(nom ) ;
		    form.afficher() ;
			}
		else 
			System.out.println("pas de form") ;

			
	}
}
