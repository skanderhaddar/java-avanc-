package port_oussema;

public class Barque {
    private String nom; 
	private	int numero; 

		public Barque (String ch , int n )
		{
			nom = ch ;
			numero = n ; 
		}
		
		public String toString()
		{
			return("le nom de cette barque est: " +nom+ "et son numero est: " + numero);
		}
		int getNum() 
		{
			return numero;
		}
}