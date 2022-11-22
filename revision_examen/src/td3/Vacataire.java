package td3;

	public class Vacataire extends  Employe{
		private int nbHeures ;
		private float prixHeures ; 
		public Vacataire(String ch , int n , float p )
		{
			super(ch);
			nbHeures = n ;
			prixHeures = p ;
		}
		public void setPrixheure(float a)
		{
			prixHeures = a ;
		}
		public float calculeSalaire()
		{
			return nbHeures*prixHeures ;
		}
		public String ToString()
		{
			return (super.toString() + calculeSalaire()) ; 
		}
		
	}
	

