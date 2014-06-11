package monopoly.app;


public class Propriete extends Case {

	
	private double prixAchat;
	private double prixHypo;
	private boolean hypoteque;
	private boolean achete;
        
	
	public double getPrixAchat() {
		return prixAchat;
	}
	public void setPrixAchat(double prixAchat) {
		this.prixAchat = prixAchat;
	}
	
	public double getPrixHypo() {
		return prixHypo;
	}
	public void setPrixHypo(double prixHypo) {
		this.prixHypo = prixHypo;
	}
	public boolean isHypoteque() {
		return hypoteque;
	}
	public void setHypoteque(boolean hypoteque) {
		this.hypoteque = hypoteque;
	}
	public boolean isAchete() {
		return achete;
	}
	public void setAchete(boolean achete) {
		this.achete = achete;
	}
	
	public Propriete(int numCase, String nomCase) {
		super(numCase, nomCase);
		
	}
	
	
	public Propriete()
	{}

    


        
	
	
	
	
	
	
}
