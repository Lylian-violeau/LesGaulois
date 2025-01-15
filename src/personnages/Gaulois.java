package personnages;

public class Gaulois extends Personnage{
	
	public Gaulois(String nom, Integer force){
		super(nom,force);
	}

	@Override
	protected String donnerAuteur() {
		return("Le gaulois ");
	}
}
