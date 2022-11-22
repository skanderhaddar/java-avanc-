
public class Compte {
	     static int x = 0 ;
         private String numero ;
         private float solde ;
         public Compte ()
         {
        	 x = x+1 ;
        	 solde = 0 ;
        	 numero = String.valueOf(x) ;
         }
         
         void Crediter(float x)
         {
        	 solde = solde + x ;
         }
         void Debiter (float x) 
         {
        	 if (solde> x) 
        		 {solde = solde - x ; } 
         }
         float getSolde() 
         {
        	 return (solde) ;
         }
         void affiche () 
         {
        	 System.out.println ("le numero =" +numero + "le solde =" + solde) ;
         }
         
         
}
