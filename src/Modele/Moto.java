package Modele;

import java.util.ArrayList;


public class Moto extends Vehicule {

	
	private ArrayList<Moto> liste_Moto = new ArrayList();

	public Moto(String marque, String modele, String color) {
		super(marque, modele, color);
	}

	public ArrayList<Moto> getListe_Moto() {
		return this.liste_Moto;
	}
	
	public void setPrix(int prix) {
		this.Prix = prix;
	}
	
	public void Ajouter_Element(Moto moto) {	
		this.liste_Moto.add( moto);
	}
	
	public void Affiche_Auto() {
		System.out.println(liste_Moto);
	}
	
	public void Vendre_Auto() {
			
	}
	
	@Override
	public String toString() {
		return " { " + " Marque : " + this.Marque + " | Modèle : " + this.Modele + " | Couleur : " + this.Color  + " | Prix : " + this.Prix + "} ";
		}
	
}
