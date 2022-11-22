package port;

public class port {		
	private String nom ;
	private int capacité ; 
	private float taxe ; 
	int nbr_barque  = 0;
	barque tab[] ;
	
	public port (String ch , int c , float t ) {
		nom = ch ; 
	    capacité=c ;
		taxe = t ; 
		tab = new barque [capacité] ;
		}
	public void ajouter_barque (barque b)
	{
		if (nbr_barque< capacité)
		{
			tab[nbr_barque] = b ; 
			nbr_barque ++ ;

		}
		else {
			System.out.println("le port est saturé") ;
		}
	}
	public void ajouter_barque_moteur(BarqueMoteur b) {
		if (nbr_barque< capacité)
		{
			tab[nbr_barque] = b ; 
			nbr_barque ++ ;

		}
		else {
			System.out.println("le port est saturé") ;
		}

	}
	public void sortie (barque b  ) {
		for(int i=0 ; i<nbr_barque ; i++)
		{
			if (tab[i].getNum() == (b.getNum())) 
			{
				tab[i]=tab[nbr_barque -1];
				tab[nbr_barque -1] =null ;
				nbr_barque -- ; 
				break ; 
			}
		}
	}
	
	public double calcule_taxe() 
	{
		double taxe_total =0 ;
		for (int i =0 ; i<nbr_barque ;  i++)
		{
			if(tab[i] instanceof BarqueMoteur) {
				if (((BarqueMoteur)tab[i]).getPuissance()<5) {
					taxe_total +=taxe + taxe*0.1 ;
				}
				else {
					taxe_total += taxe + taxe*0.2 ;
				}
			}
			else {
				taxe_total +=  taxe ; 
			}
			
		}
		return taxe_total;
	}

	public String toString() {
		
	   String x="le nom est "+nom+" capacite est "+capacité+" la taxe est "+ taxe ;
 
		for(int i=0;i<nbr_barque ;i++)
		{		
		x += tab[i].toString()+' ' ;
		}
		return x ; 
	}
}
