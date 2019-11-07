package metier;

import java.util.ArrayList;
import java.util.List;

public class Fournisseur extends Personne{

	private String specialite;

	private List<FournisseurProduit> fournisseurProduits 
		= new ArrayList<FournisseurProduit>();
	public String getSpecialite() {
		return specialite;
	}

	public void setSpecialite(String specialite) {
		this.specialite = specialite;
	}

	
	public List<FournisseurProduit> getFournisseurProduits() {
		return fournisseurProduits;
	}

	public void setFournisseurProduits(List<FournisseurProduit> fournisseurProduits) {
		this.fournisseurProduits = fournisseurProduits;
	}

	@Override
	public String toString() {
		return "Fournisseur [specialite=" + specialite + ", toString()=" + super.toString() + "]";
	}

}
