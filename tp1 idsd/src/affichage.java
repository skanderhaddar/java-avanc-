
public class affichage {

	public static void main(String[] args) {
		
		Compte c = new Compte () ;
		Compte c1 = new Compte() ;
		c1.affiche();
		c.affiche() ;
		c.Crediter (50) ;
		c.Debiter(30) ;
		c.affiche();
		
	}

}
