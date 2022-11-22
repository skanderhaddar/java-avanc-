
public class Produit {
public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	public double getPrix() {
		return prix;
	}
	public void setPrix(double prix) {
		this.prix = prix;
	}
private int id ; 
private String libelle ; 
private double prix ; 
public Produit() {}
public Produit(int id , String Libelle , double prix) {
	this.id=id; 
	this.libelle=Libelle;
	this.prix=prix;
}
@Override
public String toString() {
	return "Produit [id=" + id + ", libelle=" + libelle + ", prix=" + prix + "]";
}
public Produit( String Libelle , double prix) {
	this.libelle=Libelle;
	this.prix=prix;}}

