package personnages;

public abstract class Personnage {
	private String nom;
	private Integer force;
	
	public Personnage(String nom, Integer force) {
		this.nom = nom;
		this.force = force;
	}
	
	public String getNom() {
		return nom;
	}
	
	public String parler(String phrase) {
		return (donnerAuteur() + nom + ": «" + phrase + "».");
	}
	
	public void frapper(Personnage perso) {
		if(perso.force >= 0) {
			System.out.println(donnerAuteur() + nom +" envoie un grand coup dans la mâchoire de "+perso.getNom());
			perso.recevoirCoup(force/3);
		}
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
	
	protected abstract String donnerAuteur();
	
	
}
