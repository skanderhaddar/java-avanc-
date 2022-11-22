import java.util.Scanner;

public class testFormation {
    public static void main(String[] args) {
    	Scanner k = new Scanner (System.in) ;
    	System.out.println("enseignant e1 = ") ;
    	Enseignant e1 = new Enseignant(k.nextLine(), k.nextLine()) ;
    	System.out.println("enseignant e2 = ") ;

    	Enseignant e2 = new Enseignant(k.nextLine(), k.nextLine()) ;
    	System.out.println("formation = ") ;
    	Formation f = new Formation (k.nextLine(), e1 ) ;
    	System.out.println("Participant = ") ;
    	Participant p = new Participant (k.nextLine(), e2.getSpecialite() );
    	System.out.println(p)
    }


}
