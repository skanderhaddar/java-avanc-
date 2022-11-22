package port_oussema;

public class Port {		
	private String nom ;
	private int capacite; 
	private float taxe ; 
	int nbr_barque;
	Barque tab[] ;
	
	public Port (String ch , int c , float t ) {
		nom = ch ; 
	    capacite=c ;
		taxe = t ; 
        nbr_barque=0;
		tab = new Barque [capacite] ;
		}
	public void ajouter_barque (Barque b)
	{
		if (nbr_barque< capacite)
		{
			tab[nbr_barque] = b ; 
			nbr_barque ++ ;
		}
		else {
			System.out.println("le port est sature") ;
		}
	}
	// public void ajouter_barque_moteur(BarqueMoteur b) {
	// 	if (nbr_barque< capacite)
	// 	{
	// 		nbr_barque ++ ;
	// 		tab[nbr_barque] = b ; 
	// 	}
	// 	else {
	// 		System.out.println("le port est satur�") ;
	// 	}

	// }
	public void sortie (Barque b  ) {
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
		
	   String x="le nom est"+nom+"capacite est"+capacite+"la taxe est"+ taxe ;
 
		for(int i=0;i<nbr_barque ;i++)
		{		
		x += tab[i].toString()+' ' ;
		}
		return x ; 
	}



}
