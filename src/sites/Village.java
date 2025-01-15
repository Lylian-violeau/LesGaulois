package sites;

import personnages.Gaulois;
import personnages.Personnage;
import personnages.Soldat;

public class Village {
	private Gaulois chef;
	private Gaulois[] village;
	
	public Village(Gaulois chef) {
		this.chef = chef;
		this.village = new Gaulois[50];
	}
	
	public Gaulois getChef(Personnage perso) {
		return chef;
	}
	
	public void creaVillage(Gaulois chef) {
		System.out.println("Le gaulois" + chef.getNom() + ": « Je suis un grand guerrier et je vais créer mon village");
	}
	
	public void ajouterVillageois(String nom, Integer force) {
			Gaulois gaulois = new Gaulois(nom,force);
			boolean GauloisAjoute = false;
			for(int i=0; i<80; i++) {
				if(village[i] == null && !GauloisAjoute) {
					village[i]= gaulois;
					GauloisAjoute = true;
					System.out.println("Le gaulois" + chef.getNom() + ": « Bienvenue " + gaulois.getNom() +" ! ». ");
				}
			}
	}
	
	public void afficheVillageois(Gaulois[] village) {
		boolean GauloisVu = false;
		System.out.println("Le village de" + chef.getNom() + " est habité par :");
		for(int i = 0; i< 50; i++) {
			if(village[i] != null && !GauloisVu) {
				System.out.println("- " + village[i].getNom());
			}
			GauloisVu=true;
		}
	}
}
