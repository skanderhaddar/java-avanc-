package revision_examen;

public class auteur {
	private String nom ;
	livre tablivres[] ;
	private int nbLivres=0 ;
	public auteur (String ch)
	{
		nom = ch ;
		tablivres = new livre[nbLivres] ; 
	}
	String getNom() 
	{
		return (nom);
	}
	void ajouterLivre(livre l)
	{
		tablivres[nbLivres] =  l ; 
		nbLivres ++ ;

	}
	void afficher ()
	{
		System.out.println(nom ) ;
		for (int i = 0 ; i<nbLivres ; i++)
		{
			System.out.println(tablivres[i].getTitre()) ;
		}
	}
}
