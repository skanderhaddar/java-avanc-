import java.util.Set;
import java.util.TreeMap ;
public class Commandes {
	TreeMap <String,Commande> Cmde = new TreeMap <String,Commande>() ; 
	public void AjouterCommande(String code , Commande C) {
		Cmde.put(code, C) ; 
	}
	public void RetirerCommande(String code) {
		Cmde.remove(code);
	}
	public void AjouterProduit(String code , Produit P ) {
		Cmde.get(code).ajouterProduit(P);
	}
	public void RetirerCommande(String code , Produit P) {
		if(Cmde.get(code).estPresent(P)) {
			Cmde.get(code).retirerProduit(P.getNumprod());
		}
	}
	public float CalculRecette() {
		Set<String> keys = Cmde.keySet();
		float s=0 ;
        for(String key: keys)
        	s= s+ Cmde.get(key).getPrixTotal() ; 
        return(s) ;
	}
	public void Affiche() {
		Set<String> keys = Cmde.keySet();
        for(String key: keys) {
		    System.out.println("La valeur de "+key+ "est "+ Cmde.get(key).toString() ); }
	}
	}
