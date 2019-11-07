package service;

import java.util.Date;
import java.util.List;

import metier.Adresse;
import metier.Client;
import metier.Fournisseur;
import metier.FournisseurProduit;
import metier.Login;
import metier.Personne;
import metier.Produit;
import metier.Voiture;

public class Gestion {

	public static void ajouterVoiturePersonne(Personne p, Voiture v) {
		p.getVoitures().add(v);
		v.getPersonnes().add(p);
	}

	public static void ajouterClientLogin(Client c, Login l) {
		c.setLogin(l);
		l.setClient(c);
	}

	public static void ajouterPersonneAdresse(Personne p, Adresse a) {
		p.setAdresse(a);
		a.getPersonnes().add(p);
	}

	public static void ajouterFournisseurProduit(Fournisseur f, Produit p, Date dateCommercialisation) {
		FournisseurProduit fp = new FournisseurProduit();
		fp.setFournisseur(f);
		fp.setProduit(p);
		fp.setDateCommercialisation(dateCommercialisation);
		
		f.getFournisseurProduits().add(fp);
		p.getFournisseurProduits().add(fp);
	}
}
