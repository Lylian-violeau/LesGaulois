package personnages;

public class Gaulois {
	String nom;
	Integer force;
	
	public Gaulois(String nom, Integer force){
		this.nom = nom;
		this.force = force;
	}
	
	public String getNom() {
		return nom;
	}
	
	public String parler(String phrase) {
		return ("Le gaulois "+ nom + ": «" + phrase + "».");
	}
	
	public void frapper(Romain romain) {
		System.out.println(nom +" envoie un grand coup dans la mâchoire de "+romain.getNom());
		romain.recevoirCoup(force/3);
	}
	
	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Astérix", 8);
		System.out.println(asterix.getNom());
	}
}
