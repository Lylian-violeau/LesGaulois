package sites;

import personnages.Gaulois;
import personnages.Personnage;
import personnages.Soldat;

public class Camp {
	private Soldat commandant;
	private Soldat[] camp;
	
	public Camp(Soldat commandant) {
		this.commandant = commandant;
		this.camp = new Soldat[80];
	}
	
	public Soldat getCommandant(Personnage perso) {
		return commandant;
	}
	
	public void creaClan(Soldat commandant) {
		System.out.println("Le romain "+ commandant.getNom() +" : « Je suis en charge de créer un nouveau camp romain");
	}
	
	
	public void ajouterSoldat(String nom,String grade, Integer force) {
		Soldat soldat = new Soldat(nom,grade,force);
		boolean SoldatAjoute = false;
		for(int i=0; i<80; i++) {
			if(camp[i] == null && !SoldatAjoute) {
				camp[i]= soldat;
				SoldatAjoute = true;
				System.out.println("Le gaulois" + commandant.getNom() + ": « Je mets mon épée au service de Rome dans le camp dirigé par" + soldat.getNom() +" ». ");
			}
		}
	}
	
	public void afficheCamp(Soldat[] camp) {
		boolean SoldatVu = false;
		System.out.println("Le camp dirigé par" + commandant.getNom() + " contient les soldats :");
		for(int i = 0; i< 80; i++) {
			if(camp[i] != null && !SoldatVu) {
				System.out.println("- " + camp[i].getNom());
			}
			SoldatVu=true;
		}
	}
}
