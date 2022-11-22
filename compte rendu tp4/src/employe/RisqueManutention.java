package employe;

public class RisqueManutention extends Manutention implements Risque{

    public RisqueManutention (String n , String p , int a , String d , int nh)
    {
        super(n,p,a,d,nh) ;
    }
    public double calculsalaire() {
    	return(super.calculer_salaire()+ Risque.prime);
    }

}


