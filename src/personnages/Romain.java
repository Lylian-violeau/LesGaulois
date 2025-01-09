package personnages;

public class Romain {
	String nom;
	Integer force;
	
	public Romain(String nom, Integer force){
		this.nom = nom;
		this.force = force;
	}
	
	public String getNom() {
		return nom;
	}
	
	public String parler(String phrase) {
		return ("Le romain "+ nom + ": «" + phrase + "».");
	}
	
	public void recevoirCoup(Integer force_coup) {
		if(force <= force_coup) {
			force = 0;
			System.out.println(parler("J'abandonne"));
		}
		else {
			force = force - force_coup;
			System.out.println(parler("Aïe !"));
		}
	}
}
