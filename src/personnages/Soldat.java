package personnages;

public class Soldat extends Romain{
	private String grade;
	
	public Soldat(String nom, String grade, Integer force){
		super(nom,force);
		this.grade = grade;
	}
	
	public String getGrade() {
		return grade;
	}
}
