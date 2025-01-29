package personnages;

import java.security.SecureRandom;
import java.util.Random;

public class Druide extends Gaulois {
	private Random random;
	private int quantirest = 0;
	int forcePot = 0;
	

	public Druide(String nom, Integer force) {
		super(nom,force);
		try {
			random = SecureRandom.getInstanceStrong();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void fabricationPot(int quantite) {
		forcePot = random.nextInt(5)+2;
		quantirest = quantite;
		System.out.println("Le gaulois " + getNom() + ": « J'ai concocté" + quantite + " doses de potion magique. Elle a une force de" + forcePot + ". »");
	}
}
