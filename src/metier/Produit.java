package metier;

import java.util.ArrayList;
import java.util.List;

public class Produit {
	private int idProduit;
	private String nomProduit;
	private double prix;
	private List<FournisseurProduit> fournisseurProduits = new ArrayList<FournisseurProduit>();
	
	public int getIdProduit() {
		return idProduit;
	}
	public void setIdProduit(int idProduit) {
		this.idProduit = idProduit;
	}
	public String getNomProduit() {
		return nomProduit;
	}
	public void setNomProduit(String nomProduit) {
		this.nomProduit = nomProduit;
	}
	public double getPrix() {
		return prix;
	}
	public void setPrix(double prix) {
		this.prix = prix;
	}
	
	public List<FournisseurProduit> getFournisseurProduits() {
		return fournisseurProduits;
	}
	public void setFournisseurProduits(List<FournisseurProduit> fournisseurProduits) {
		this.fournisseurProduits = fournisseurProduits;
	}
	@Override
	public String toString() {
		return "Produit [idProduit=" + idProduit + ", nomProduit=" + nomProduit + ", prix=" + prix + "]";
	}
}
