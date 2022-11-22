package employe;

	public class RisqueProduction extends Production implements Risque{
		public RisqueProduction(String nom, String prenom, int age, String date,  int nu) {
		super(nom, prenom, age, date, nu);
		}
		public double calculer_salaire()
		{
		return(super.calculer_salaire()+Risque.prime);
		}
	}