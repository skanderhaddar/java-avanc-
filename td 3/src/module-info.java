class Employe {
	private int matricule ;
	private String nom ; 
	protected float salaire ; 
	public static int dernierMat = 1000 ;
	public Employe (String n  )
	{
		
		dernierMat ++ ;
		nom = n ;
		matricule = dernierMat ;
	}
	public String toString () 
	{
		return(matricule +"   "+ nom) ;
	}
	
}
	class Vacataire extends Employe {
		private int nbHeures ;
		private float prixHeure ; 
		public Vacataire (int n , float p , String ch)
		{
			super(ch) ;
			nbHeures = n ;
			prixHeure = p ;
		}
		public void setPrixHeure (float newp)
		{
			prixHeure = newp ;
		}
		public float calculerSalaire ()
		{
			return(nbHeures*prixHeure) ;
		}
		public String toString()
		{
			calculerSalaire() ;
			return super.toString() + "   " + salaire ;
		}
	class Contractuel extends Employe{
		protected  float salaireBase ;
		public Contractuel ()
		
		
	}
	}