package port;

public class barque{
		private String nom ; 
		int numero; 
		public barque (String ch , int n )
		{
			nom = ch ;
			numero = n ; 
		}
		
		public String toString()
		{
			return("le nom de cette barque est: " +nom+ " et son numero est: " + numero);
		}
		int getNum() 
		{
			return numero;
		}
}
		
		class BarqueMoteur extends barque{
			private int puissance ; 
			public BarqueMoteur(int p, String nom , int numero)
			{
				super(nom , numero);
				puissance = p ; 		
			}
			public int getPuissance() 
			{
				return puissance ;
			}
			public String toString() 
			{
				return(super.toString() + " et la puissance = " +puissance) ;
			}
		}
		

