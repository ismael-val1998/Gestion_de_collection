package Controleur;

import java.awt.EventQueue;

import Modele.Auto;
import Modele.Camion;
import Modele.Moto;
import Modele.Vehicule;
import Vue.Interface;

public class Main {

	public static void main(String[] args) {
	
		System.out.println("*********************************************************");
		
		/* Création des véhicules (Auto, Moto, Camion)
		 */
		
		Vehicule v = new Vehicule(null, null, null); // Pour insérer les véhicules dans la liste
		
		Auto a1 = new Auto("BMW", "C10W", "Orange");
		a1.setPrix(5000);
		a1.Ajouter_Element(a1);
		
		Moto m1 = new Moto("KDM", "K20M", "Noir");
		m1.setPrix(2000);
		m1.Ajouter_Element(m1);
		
		Camion c1 = new Camion("Remork", "P30Q", "Gris");
		c1.setPrix(7000);
		c1.Ajouter_Element(c1);
		
		Auto a2 = new Auto("Merceders", "M42C", "Vert");
		a2.setPrix(50000);
		a2.Ajouter_Element(a2);
		
		Moto m2 = new Moto("Apache", "A12P", "Orange");
		m2.setPrix(90000);
		m2.Ajouter_Element(m2);
		
		Camion c2 = new Camion("Dixtones", "D13Q", "Bleu");
		c2.setPrix(55000);
		c2.Ajouter_Element(c2);
		
		/*
		 - inserère les type de véhicule dans la liste véhicule	
		 - Affiche les véhicules selon Marque-Modèle-Couleur
		 */
		System.out.println("Liste des vehicules :  ");
		v.Fusionne_Liste_Vehicule(a1, m1, c1);	// 
		v.Fusionne_Liste_Vehicule(a2, m2, c2);
		for(Vehicule vehicule : v.getListe_Vehicule()) {	
			System.out.println(vehicule);
		}
		
		// Afficher les véhicule de meme couleur( Prenant en paramètre la liste de véhicule et la couleur)
		System.out.println("*********************************************************");
		v.Affiche_Vehicules_Meme_Couleur(v, "Orange");
		System.out.println("*********************************************************");
		
		/* Informe si un véhicule spécifique est dans notre collection
		 * ( Prenant en paramètre la liste de véhicule et une marque et un modèle)
		*/
		System.out.println(" Présence d'une certaine marque et modèle : ");
		v.Presence_Vehicules(v, "Dixtones", "D13Q");
		System.out.println("*********************************************************");
		
		/* Vends un véhicule présent dans la liste véhicule
		 * ( Prenant en paramètre la liste de véhicule et le véhcule en question)
		 * Puis Affiche :
		 * - Le véhicule vendu
		 * - La liste des véhicules restants
		*/
		v.Vendre(v, m2);
		System.out.println("véhicule vendu : " + v.getListe_Vehicule_Vendu());	
		System.out.println("*********************************************************");
		for(Vehicule vehicule : v.getListe_Vehicule()) {
			System.out.println(vehicule);
		}
		System.out.println("*********************************************************");
		
		EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Interface frame = new Interface(v.getListe_Vehicule());
                    frame.setSize(800, 600);
                    frame.setLocationRelativeTo(null);
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
		
		
	}
	
	

}
