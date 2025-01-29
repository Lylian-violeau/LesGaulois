package sites;

import personnages.Soldat;

public class Camp {
	private Soldat commandant;
	private Soldat[] camp;
	public static final int NB_MAX_S = 80;
	
	public Camp(Soldat commandant) {
		this.commandant = commandant;
		this.camp = new Soldat[NB_MAX_S];
	}
	
	public Soldat getCommandant() {
		return commandant;
	}
	
	public Soldat[] getSoldat() {
		return camp; 
	}
	
	public void creaClan(Soldat commandant) {
		System.out.println("Le romain "+ commandant.getNom() +" : « Je suis en charge de créer un nouveau camp romain");
	}
	
	
	public void ajouterSoldat(Soldat soldat) {
		boolean soldatAjoute = false;
		for(int i=0; i<NB_MAX_S; i++) {
			if(camp[i] == null && !soldatAjoute) {
				camp[i]= soldat;
				soldatAjoute = true;
				System.out.println("Le romain " + soldat.getNom() + ": « Je mets mon épée au service de Rome dans le camp dirigé par " + commandant.getNom() +" ». ");
			}
			else if (camp[NB_MAX_S - 1] != null){
				System.out.println("Le romain " + commandant.getNom() + ": « Désolé " + soldat.getNom() + " notre camp est complet ! ».");
			}
		}
	}
	
	public void afficheCamp(Soldat[] camp) {
		boolean SoldatVu = false;
		System.out.println("Le camp dirigé par " + commandant.getNom() + " contient les soldats :");
		for(int i = 0; i< NB_MAX_S; i++) {
			if(camp[i] != null && !SoldatVu) {
				System.out.println("- " + camp[i].getNom());
			}
			else {
				SoldatVu=true;
			}
		}
	}
	
	public void changerCommandant(Soldat newCommandant){
		if("centurion".equals(newCommandant.getGrade())) {
			commandant = newCommandant;
			System.out.println("Le romain "+ commandant.getNom()+": « Moi "+commandant.getNom()+" je prends la direction du camp romain. ».");
		}
		else {
			System.out.println("Le romain "+ newCommandant.getNom()+" : « Je ne suis pas suffisamment gradé pour prendre la direction du camp romain. ». ");
		}
	}
}
