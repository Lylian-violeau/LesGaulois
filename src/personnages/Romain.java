package personnages;

public class Romain extends Personnage {
	
	public Romain(String nom, Integer force){
		super(nom,force);
	}

	@Override
	protected String donnerAuteur() {
		return("Le romain ");
	}
	
	
}
