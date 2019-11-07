package metier;

import java.util.Date;

public class FournisseurProduit {
	private Date dateCommercialisation;

	private Fournisseur fournisseur;
	private Produit produit;
	
	public Date getDateCommercialisation() {
		return dateCommercialisation;
	}

	public void setDateCommercialisation(Date dateCommercialisation) {
		this.dateCommercialisation = dateCommercialisation;
	}

	public Fournisseur getFournisseur() {
		return fournisseur;
	}

	public void setFournisseur(Fournisseur fournisseur) {
		this.fournisseur = fournisseur;
	}

	public Produit getProduit() {
		return produit;
	}

	public void setProduit(Produit produit) {
		this.produit = produit;
	}

	@Override
	public String toString() {
		return "FournisseurProduit [dateCommercialisation=" + dateCommercialisation + ", fournisseur=" + fournisseur
				+ ", produit=" + produit + "]";
	}
	
	
}
