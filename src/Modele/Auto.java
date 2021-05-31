package Modele;

import java.util.ArrayList;


public class Auto extends Vehicule {
	
	
	private ArrayList<Auto> liste_Auto = new ArrayList();
	
	public Auto(String marque, String modele, String color) {
		super(marque, modele, color);
		
	}
	
	public void setPrix(int prix) {
		Prix = prix;
	}
	
	public ArrayList<Auto> getListe_Auto() {
		return this.liste_Auto;
	}
	
	public void Ajouter_Element(Auto auto) {	
		this.liste_Auto.add(auto);
	}
	
	public void Affiche_Auto() {
		System.out.println(liste_Auto);
	}
	
	public String toString() {
		return " { " + " Marque : " + this.Marque + " | Modèle : " + this.Modele + " | Couleur : " + this.Color  + " | Prix : " + this.Prix + "} ";
	}
	
}

