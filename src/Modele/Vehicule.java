package Modele;

import java.util.ArrayList;

public class Vehicule {
	protected String Marque;
	protected String Modele;
	protected String Color;
	protected int Prix;

	private ArrayList<Vehicule> liste_Vehicule = new ArrayList();
	private ArrayList<Vehicule> liste_Vehicule_Meme_Couleur = new ArrayList();
	private ArrayList<Vehicule> liste_Vehicule_Vendu = new ArrayList();
	
	// constructeur par defaut
	public Vehicule(String marque, String modele, String color) {
		this.Marque = marque;
		this.Modele = modele;
		this.Color  = color;
	}
	
	public String getMarque() {
		return Marque;
	}
	
	public String getModele() {
		return Modele;
	}
	
	public String getColor() {
		return Color;
	}
	
	
	public String toString() {
		return " Marque : " + Marque + "| Modele : " + Modele + "| Couleur : " + Color ;
	}
	
	public int getPrix() {
		return Prix;
	}
	
	// Permet d'ajouter le types de vehicules dans la liste véhicule
	public void Fusionne_Liste_Vehicule(Auto a, Moto m, Camion c) {
		this.liste_Vehicule.addAll(a.getListe_Auto());
		this.liste_Vehicule.addAll(m.getListe_Moto());	
		this.liste_Vehicule.addAll(c.getListe_Camion());
	}
	
	public ArrayList<Vehicule> getListe_Vehicule() {
		return liste_Vehicule;
	}
	
	public void Affiche_Liste_Vehicules() {
		System.out.println(liste_Vehicule);
	}
		
	// Afficher les véhicule de meme couleur( Prenant en paramètre la liste de véhicule et la couleur)
	public void Affiche_Vehicules_Meme_Couleur(Vehicule v, String color) {
		for(Vehicule vehicule : v.getListe_Vehicule()) {
			if(vehicule.Color == color) {
				liste_Vehicule_Meme_Couleur.add(vehicule);
			}
		}
		System.out.println("Liste Véhicules meme couleurs :  ");
		System.out.println(liste_Vehicule_Meme_Couleur);
	}
	
	public ArrayList<Vehicule> getListe_Vehicule_Meme_Couleur() {
		return liste_Vehicule_Meme_Couleur;
	}
	
	/* Informe si un véhicule spécifique est dans notre collection
	 * ( Prenant en paramètre la liste de véhicule et une marque et un modèle)
	*/
	public void Presence_Vehicules(Vehicule v, String marque, String modele) {
		for(Vehicule vehicule : v.getListe_Vehicule()) {
			if( vehicule.Marque == marque && vehicule.Modele == modele) {
				System.out.println("*******************");
				System.out.println(" Correspond");
			}
			else {
				System.out.println("*******************");
				System.out.println(" Ne Correspond pas");
			}
		}
	}
	
	/* Vends un véhicule présent dans la liste véhicule
	 * ( Prenant en paramètre la liste de véhicule et le véhcule en question)
	 * Puis Affiche :
	 * - Le véhicule vendu
	 * - La liste des véhicules restants
	*/
	public void Vendre(Vehicule v, Vehicule v_a_vendre) {
		for(Vehicule vehicule : v.getListe_Vehicule()) {
			if(vehicule == v_a_vendre) {
				this.liste_Vehicule_Vendu.add(v_a_vendre);
				this.liste_Vehicule.remove(v_a_vendre);
			}
		}
		
	}
	
	public ArrayList<Vehicule> getListe_Vehicule_Vendu() {
		System.out.println("*******************");
		return liste_Vehicule_Vendu;
	}

	
}