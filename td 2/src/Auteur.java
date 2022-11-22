
public class Auteur {
	private String nom ; 
	private Livre[] tabLivres ;
	private int nbLivres ;
	public Auteur (String ch)
	{
		this.nom = ch ;
		this.tabLivres = new Livre[100] ;
		nbLivres = 0 ; 
    }
	
	public String getNom()
	{
		return(nom) ;
	}
	public  void ajouterLivre(Livre l)
	{
		tabLivres[nbLivres] = l ;
		nbLivres ++ ;
	}
	public void afficher ()
	{
		System.out.println("le nom = " +nom  ) ;
		for (int i =0 ; i<nbLivres ; i++)
		{
			System.out.println(tabLivres[i].getTitre() ) ;
		}
	}   
	
	public void supprimer(Livre l)
	{
		for (int i=0 ; i<nbLivres ; i++)
		{
			if (l == tabLivres[i] ) 
			{
				tabLivres[i] = tabLivres[nbLivres -1] ;
				tabLivres[nbLivres -1] = null ; 
				nbLivres -- ;
				break ;
			}
		}
		
	}
}
