
public class Test {

	public static void main(String[] args) {
		Produit P1 = new Produit( " skon " , "aaaa" , 4000 , 10) ;
		Produit P2 = new Produit( " skander " , "bbbb" , 8000 , 20) ;
		Produit P3 = new Produit( " alex " , "cccc" , 1000 , 30) ;

		Commande C1= new Commande() ;
		Commande C2= new Commande() ;

		Commandes des_comm1 = new Commandes() ;
		Commandes des_comm2 = new Commandes() ;

		P1.toString() ; 
		P2.toString();
		P3.toString();
		C1.ajouterProduit(P3);
		C1.ajouterProduit(P1);
		C1.ajouterProduit(P2);
		System.out.println(C1.toString()) ;
		
		C2.ajouterProduit(P2);
		C2.ajouterProduit(P3);
		System.out.println(C2.toString()) ;
		des_comm1.AjouterCommande("11",C1) ;
		des_comm1.AjouterCommande("12",C2) ;
		des_comm1.Affiche();

		
		
	}

}
