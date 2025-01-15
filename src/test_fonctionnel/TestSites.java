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
	}
}
