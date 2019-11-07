package metier;

import java.util.ArrayList;
import java.util.List;

public class Adresse {
	private int idAdresse;
	private String numeroAdresse;
	private String numRue;
	private String cp;
	private String ville;
	private List<Personne> personnes = new ArrayList<Personne>();
	
	public int getIdAdresse() {
		return idAdresse;
	}
	public void setIdAdresse(int idAdresse) {
		this.idAdresse = idAdresse;
	}
	public String getNumeroAdresse() {
		return numeroAdresse;
	}
	public void setNumeroAdresse(String numeroAdresse) {
		this.numeroAdresse = numeroAdresse;
	}
	public String getNumRue() {
		return numRue;
	}
	public void setNumRue(String numRue) {
		this.numRue = numRue;
	}
	public String getCp() {
		return cp;
	}
	public void setCp(String cp) {
		this.cp = cp;
	}
	public String getVille() {
		return ville;
	}
	public void setVille(String ville) {
		this.ville = ville;
	}
	
	public List<Personne> getPersonnes() {
		return personnes;
	}
	public void setPersonnes(List<Personne> personnes) {
		this.personnes = personnes;
	}
	@Override
	public String toString() {
		return "Adresse [idAdresse=" + idAdresse + ", numeroAdresse=" + numeroAdresse + ", numRue=" + numRue + ", cp="
				+ cp + ", ville=" + ville + "]";
	}

}
