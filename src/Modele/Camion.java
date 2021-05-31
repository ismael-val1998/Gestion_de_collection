package Modele;

import java.util.ArrayList;


public class Camion extends Vehicule {

	
	private ArrayList<Camion> liste_Camion = new ArrayList();

	public Camion(String marque, String modele, String color) {
		super(marque, modele, color);
	}

	public ArrayList<Camion> getListe_Camion() {
		return this.liste_Camion;
	}
	
	public void setPrix(int prix) {
		this.Prix = prix;
	}
	
	public void Ajouter_Element(Camion camion) {	
		this.liste_Camion.add( camion);
	}
	
	public void Affiche_Auto() {
		System.out.println(liste_Camion);
	}
	
	public void Vendre_Auto() {
			
	}
	
	@Override
	public String toString() {
		return " { " + " Marque : " + this.Marque + " | Modèle : " + this.Modele + " | Couleur : " + this.Color  + " | Prix : " + this.Prix + "} ";
	}
		
}
