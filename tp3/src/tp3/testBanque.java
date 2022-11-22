package tp3;

public class testBanque {
	public static void main (String[] args) {
		client c1= new client("skander" , "haddar") ;
		client c2= new client("kamel" , "ayadi") ;
		c1.ouvrir_compte();
		c1.ouvrir_compte() ;
		c1.deposer(800, "1");
		c1.deposer(200, "1");
		c1.affiche() ;
		c2.ouvrir_compte();
		c2.ouvrir_compte();
		c2.ouvrir_compte();
		c1.deposer(300, "1");
		c1.deposer(700, "1");
		c2.affiche() ; 


		
		

		

		
	}
}
