package test_fonctionnel;

import personnages.Gaulois;
import personnages.Romain;
import personnages.Soldat;
import sites.Camp;
import sites.Village;

public class TestSites {
	public static void main(String[] args) {
		Gaulois vercingetorix = new Gaulois("Vercingétorix", 5);
		Village village = new Village(vercingetorix);
		Soldat minus = new Soldat("Minus","soldat", 2);
		Camp camp = new Camp(minus);
		village.creaVillage(vercingetorix);
		camp.creaClan(minus);
		Soldat brutus = new Soldat("Brutus", "centurion", 5);
		Soldat milexcus = new Soldat("Milexcus", "soldat", 2);
		Soldat tullius = new Soldat("Tullius Octopus", "tesseratius", 2);
		Soldat ballondebaudrus = new Soldat("Ballondebaudus", "optio", 3);
		Gaulois agecanonix = new Gaulois ("Agecanonix", 1);
		Gaulois assurancetourix = new Gaulois ("Assurancetourix", 2);
		Gaulois asterix = new Gaulois ("Asterix", 5);
		Gaulois obelix = new Gaulois ("Obelix", 15);
		Gaulois prolix = new Gaulois ("Prolix", 2);
		village.ajouterVillageois(agecanonix);
		village.ajouterVillageois(assurancetourix);
		village.ajouterVillageois(asterix);
		village.ajouterVillageois(obelix);
		village.ajouterVillageois(prolix);
		camp.ajouterSoldat(brutus);
		camp.ajouterSoldat(milexcus);
		camp.ajouterSoldat(tullius);
		camp.ajouterSoldat(ballondebaudrus);
		village.afficheVillageois(village.getVillagois());
		camp.afficheCamp(camp.getSoldat());
		Soldat briseradius = new Soldat("Briseradius", "soldat", 4);
		Soldat chorus = new Soldat("Chorus", "centurion", 4);
		Gaulois abraracourcix = new Gaulois("Abraracourcix", 5);
		village.changerChef(abraracourcix);
		camp.changerCommandant(briseradius);
		camp.changerCommandant(chorus);
	}
}
