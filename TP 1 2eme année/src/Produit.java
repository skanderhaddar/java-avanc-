
public class Produit {
	String Libelle, designation ; 
	int Numprod ; 
	float PrixProd ; 
	public Produit (String Libelle , String designation , int Numprod , float PrixProd) {
		this.Libelle = Libelle ; 
		this.designation=designation ; 
		this.Numprod=Numprod ;
		this.PrixProd=PrixProd ;
		}
	public String getLibelle() {
		return Libelle;
	}
	public void setLibelle(String libelle) {
		Libelle = libelle;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public int getNumprod() {
		return Numprod;
	}
	public void setNumprod(int numprod) {
		Numprod = numprod;
	}
	public float getPrixProd() {
		return PrixProd;
	}
	@Override
	public String toString() {
		return "Produit [Libelle=" + Libelle + ", designation=" + designation + ", Numprod=" + Numprod + ", PrixProd="
				+ PrixProd + "]";
	}
	public void setPrixProd(float prixProd) {
		PrixProd = prixProd;
	}

}
