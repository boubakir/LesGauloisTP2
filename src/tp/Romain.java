package tp;

public class Romain {
	
	private String nom;
	private int force;

	public Romain(String nom, int force) {
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
		return "Le romain " + nom + " : ";
	}

	public

	void recevoirCoup(int forceCoup) {
		force -= forceCoup;
		if (force > 0) {
			parler("Aïe");
		} else {
			parler("J'abandonne...");
		}
	}
	
	public static void main(String[] args) {
		 // prendreParole
		
		Romain minus = new Romain("Minus", 6);
		System.out.println(minus.prendreParole()  );
		minus.parler("UN GAU... UN GAUGAU...");
		minus.recevoirCoup(5);
		
		 // parler
		 //recevoirCoup
		
	}





}