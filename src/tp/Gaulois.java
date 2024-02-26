package tp;

public class Gaulois {
	private String nom;
	private int force;
	private int effetPotion = 1;

	public Gaulois(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}

	public

	String getNom() {
		return nom;
	}

	public

	void parler(String texte) {
		System.out.println(prendreParole() + "« " + texte + "»");
	}

	private

	String prendreParole() {
		return "Le gaulois " + nom + " : ";
	}

	/*public void frapper(Romain romain) {
		System.out.println(nom + " envoie un grand coup dans la mâchoire de " + romain.getNom());
		romain.recevoirCoup(force / 3);
	}*/
	
	public void frapper(Romain romain) {
		System.out.println(nom + " envoie un grand coup dans la mâchoire de " + romain.getNom());
		romain.recevoirCoup( (force / 3) * effetPotion);
	}

	
//	 Modifier la méthode frapper pour prendre en compte l’eƋet de la
//	 potion : la force du coup sera la force du gaulois divisée par 3 et
//	 multipliée par l’eƋet de la potion
	
	
	
	@Override
	public String toString() {
		return "Gaulois [nom=" + nom + ", force=" + force + ", effetPotion=" + effetPotion + "]";
	}
	
	public void boirePotion(int forcePotion) {
		// TODO Auto-generated method stub
		effetPotion = forcePotion;
		this.parler("Merci Druide, je sens que ma force est "+forcePotion+" fois décuplée.");

	}
	
	
	

	public

	static void main(String[] args) {

		Gaulois asterix = new Gaulois("Astérix", 8);
		System.out.println(asterix);
		
		
		//2. Vérification du bon fonctionnement des méthodes
		
		// prendreParole
		
		//System.out.println( asterix.prendreParole() );
		
		// parler
		
		asterix.parler("Bonjour à tous");
		
		// frapper
		
		Romain minus = new Romain("Minus", 6);
		asterix.frapper(minus);
		
		
		asterix.boirePotion(3);
		
	
		
		
		asterix.frapper(minus);
		
		
		
		
		
		
	}
}