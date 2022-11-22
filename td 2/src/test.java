import java.util.Scanner;

public class test {

	public static void main (String args[]) 
	{
		Scanner k = new Scanner(System.in) ;
		Auteur A1 = new Auteur (k.nextLine()) ;
		Auteur A2 = new Auteur (k.nextLine()) ;
		Auteur A3 = new Auteur (k.nextLine()) ;
		Livre l1 = new Livre(k.nextLine() ,  new Auteur[] {A1 }) ;
		Livre l2 = new Livre(k.nextLine() ,  new Auteur[] {A1 , A2 }) ;
		Livre l3 = new Livre(k.nextLine() ,  new Auteur[] {A3 , A2 }) ;
		
		l1.getPremierAuteur().afficher();
		
		for (int i =0 ; i<l3.getAuteurs().length ; i++) 
		{
			System.out.println(l3.getAuteurs()[i]) ;
			
		}
		System.out.println(l1.getPremierAuteur().getNom()) ;
		

	}
	
}