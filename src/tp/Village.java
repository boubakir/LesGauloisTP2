
package tp;

import java.util.Iterator;

public class Village {
	
	private String nom;
	private Chef chef;
	
	// Q a
	private Gaulois[] villageois;
	private int nbVillageois = 0;
	

	// Q b
	public Village(String nom, int nbVillageoisMaximum) {
		this.nom = nom;
		villageois = new Gaulois[nbVillageoisMaximum];
		
	}

	public void setChef(Chef chef) {
		this.chef = chef;
	}

	public String getNom() {
		return nom;
	}
	
	// Q c
	public void ajouterHabitant(Gaulois gaulois) {
		
		if(nbVillageois < villageois.length) {
			villageois[nbVillageois] = gaulois;
			nbVillageois++;
			
		}
		
	}
	
	// Q d
	public Gaulois trouverHabitant(int indice) {
		Gaulois gaulois = null;
		if(indice < nbVillageois) {
			gaulois = villageois[indice];
		}
		return gaulois;
		
	}
	
	// Q e
	public static void main(String[] args) {
		
		Village village = new Village("Village des Irréductibles", 30);
		//Gaulois gaulois = village.trouverHabitant(30);
		Chef abraracourcix = new Chef("abraracourcix", 6, village);
		village.setChef(abraracourcix);
		
		Gaulois asterix = new Gaulois("Astérix", 8);
		village.ajouterHabitant(asterix);
		
		//Q g
		Gaulois obelix = new Gaulois("Obélix", 25);
		village.ajouterHabitant(obelix);
		
		village.afficherVillageois();
		
		//Gaulois gaulois = village.trouverHabitant(1);
		//System.out.println(gaulois);
		
	}
	
	// Q f
	public void afficherVillageois() {
		System.out.println("Dans le village du chef "+chef.getNom()+" vivent les legendaires gaulois : ");
		for (int i = 0; i < nbVillageois; i++) {
			System.out.println(villageois[i].getNom());
		}
	}
	
	
	
}