
public class Livre {
	private String titre ;
	private Auteur[] tabAuteurs ;
	public Livre (String a , Auteur[] tabAuteurs) 
	{
		this.titre = a ;
		this.tabAuteurs = tabAuteurs ;
		for (Auteur auteur : tabAuteurs) {
	            auteur.ajouterLivre(this);}
    }
	public String getTitre () 
	{
		return (titre) ;
	}
	public Auteur getPremierAuteur() 
	{
		return (tabAuteurs[0]) ;
	}
	public Auteur[] getAuteurs() 
	{
		return tabAuteurs ;
	}
	
}
