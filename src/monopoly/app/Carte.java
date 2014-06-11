package monopoly.app;


public class Carte extends Case{

	private int numCarte;
	private String description;
	private double montant;
	private int destination;
	public int getNumCarte() {
		return numCarte;
	}
	public String getDescription() {
		return description;
	}
	public double getMontant() {
		return montant;
	}
	public int getDestination() {
		return destination;
	}
	public void setNumCarte(int numCarte) {
		this.numCarte = numCarte;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public void setMontant(double montant) {
		this.montant = montant;
	}
	public void setDestination(int destination) {
		this.destination = destination;
	}
	protected Carte(int numCarte, String description, double montant,
			int destination) {
		super();
		this.numCarte = numCarte;
		this.description = description;
		this.montant = montant;
		this.destination = destination;
	}
	protected Carte() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
}
