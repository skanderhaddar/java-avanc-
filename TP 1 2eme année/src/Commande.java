import java.util.LinkedList;

public class Commande {
    LinkedList <Produit> liste= new LinkedList<Produit> ();
    float PrixTotal=0 ; 
    
    public void ajouterProduit(Produit p ) {
    	liste.add(p) ; 
    	PrixTotal= PrixTotal+p.getPrixProd();
    }
    public void retirerProduit(int num ) {
    	for (int i =0 ;i<liste.size(); i++ ) 
    	{
        	if (num== liste.get(i).getNumprod()) {
            	liste.remove(liste.get(i)) ; 
            	PrixTotal = PrixTotal-liste.get(i).getPrixProd();
    	}
    }}
    
    public int nombreProduit() {
    	return liste.size() ;
    }
	@Override
	public String toString() {
		return "Commande [liste=" + liste + ", PrixTotal=" + PrixTotal + "]";
	}
    public boolean estPresent(Produit P) {
    	return (liste.contains(P)) ;
    }
	public LinkedList<Produit> getListe() {
		return liste;
	}
	public void setListe(LinkedList<Produit> liste) {
		this.liste = liste;
	}
	public float getPrixTotal() {
		return PrixTotal;
	}
	public void setPrixTotal(float prixTotal) {
		PrixTotal = prixTotal;
	}


}
