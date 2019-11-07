package presentation;

import java.util.Date;

import metier.Adresse;
import metier.Fournisseur;
import metier.Login;
import metier.Personne;
import metier.Produit;
import metier.Voiture;
import service.Gestion;

public class Lanceur {

	public static void main(String[] args) {
		//1- créer une personne
		Personne p = new Personne();
		p.setId(1);
		p.setNom("PIERRE");
		p.setPrenom("Jean");
		//2- créer un fournisseur
		Fournisseur f = new Fournisseur();
		f.setId(157);
		f.setNom("TOTO");
		f.setPrenom("FOURNI");
		f.setSpecialite("RESEAU INFORMATIQUE");
		//3- créer un produit
		Produit pr = new Produit();
		pr.setNomProduit("clavier");
		pr.setPrix(12);
		pr.setIdProduit(789412);
		//4- créer une voiture
		Voiture v = new Voiture();
		v.setIdVoiture(2);
		v.setMarque("TOYOTA");
		Voiture v2 = new Voiture();
		v2.setIdVoiture(4);
		v2.setMarque("PORSCHE");
		//5- créer une adresse
		Adresse a = new Adresse();
		a.setCp("75000");
		a.setIdAdresse(10);
		a.setNumRue("15");
		a.setVille("Paris");
		
		Gestion.ajouterPersonneAdresse(p, a);
		Gestion.ajouterVoiturePersonne(p, v);
		Gestion.ajouterVoiturePersonne(p, v2);
		
		Gestion.ajouterFournisseurProduit(f, pr, new Date());
		System.out.println("-------AFFICHAGE PERSONNE ------------");
		System.out.println(p);
		System.out.println(p.getAdresse());
		System.out.println(p.getVoitures());
		System.out.println("-------AFFICHAGE FOURNISSEUR ------------");
		System.out.println(f);
		System.out.println(f.getFournisseurProduits());

	}

}
