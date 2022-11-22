package tp3;

public class client {
	String nom ; 
	String prenom ; 
	int nb =0 ; 
	private compte[]c ; 
	
	public client (String nom, String prenom )
	{
          c = new compte[10] ;
          this.nom =  nom ; 
          this.prenom = prenom ;     
	}
	void ouvrir_compte()
	{
		if (nb<10) {
		compte a = new compte() ;
		c[nb++] = a ;}
		else System.out.println("le nombre des comptes est maximal") ;
	}
	void fermer_compte(String x) 
	{
		int l = nb ;
		for (int i=0 ; i<nb ; i++)
		{
			if (c[i].Verif(x) ) 
			{
				 
				for (int j= i ; j<nb-1 ; j++) 
				{
					c[j] = c[j+1] ;
					nb = nb-1 ;
				}
			}
		}
		if (l ==nb)
			{
				System.out.println("compte inexistant") ;
			}
	}
	void deposer (int mont , String n) 
	{
		for (int i=0 ; i<nb ; i++)
		{
			if (c[i].Verif(n) ) 
			{
				 c[i].crediter(mont) ;
			}
		}
	}
	
	
	void retirer (int mont , String n )
	{
		for (int i=0 ; i<nb ; i++)
		{
			if (c[i].Verif(n) ) 
			{
				 c[i].debiter(mont) ;
			}
		}
	}
	
	void affiche()
	{
	          	 float som=0 ; 
     	 System.out.println ("le nom= "+nom+" le prenom "+prenom);      	 for (int i=0 ; i<nb; i++) 
      {        som+= c[i].getSolde(); // on ajoute à chaque fois le solde de compte i        T[i].affiche();// on affiche le num et le solde de chaque compte       } 
     	 System.out.println("le total =" +som); 
     	       	 } 

	}
    
	boolean verif(String n) 
	{
		boolean test = false ;
		for (int i=0 ; i<nb ; i++)
		{
			if (c[i].Verif(n) ) 
				test = true ; 
		}
		return (test) ;
	}
}
	
			
