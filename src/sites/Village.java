package sites;

import personnages.Gaulois;
import personnages.Personnage;
import personnages.Soldat;

public class Village {
	private Gaulois chef;
	private Gaulois[] villagois;
	public static final int NB_MAX_G = 50;
	
	public Village(Gaulois chef) {
		this.chef = chef;
		this.villagois = new Gaulois[NB_MAX_G];
	}
	
	public Gaulois getChef(Personnage perso) {
		return chef;
	}
	
	public Gaulois[] getVillagois() {
		return villagois;
	}
	
	public void creaVillage(Gaulois chef) {
		System.out.println("Le gaulois " + chef.getNom() + ": « Je suis un grand guerrier et je vais créer mon village");
	}
	
	public void ajouterVillageois(Gaulois gaulois) {
			boolean GauloisAjoute = false;
			for(int i=0; i<NB_MAX_G; i++) {
				if(villagois[i] == null && !GauloisAjoute) {
					villagois[i]= gaulois;
					GauloisAjoute = true;
					System.out.println("Le gaulois " + chef.getNom() + ": « Bienvenue " + gaulois.getNom() +" ! ». ");
				}
				else if (villagois[NB_MAX_G - 1] != null) {
					System.out.println("Le gaulois " + chef.getNom() + ": « Désolé " + gaulois.getNom() + " mon village est déjà bien rempli. ».");
				}
			}
	}
	
	public void afficheVillageois(Gaulois[] villagois) {
		boolean GauloisVu = false;
		System.out.println("Le village de " + chef.getNom() + " est habité par :");
		for(int i = 0; i< NB_MAX_G; i++) {
			if(villagois[i] != null && !GauloisVu) {
				System.out.println("- " + villagois[i].getNom());
			}
			else {
				GauloisVu=true;
			}
		}
	}
	
	public void changerChef(Gaulois newChef) {
		System.out.println("Le gaulois "+chef.getNom()+": « Je laisse mon grand bouclier au grand "+newChef.getNom() +"».");
		chef = newChef;
		System.out.println("Le gaulois "+chef.getNom()+ ": « Merci ! ».");
	}
}
