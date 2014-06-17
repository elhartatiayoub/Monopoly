package monopoly.app;


public class Terrain extends Propriete {
	
	private double loyer0;
	private double loyer1;
	private double loyer2;
	private double loyer3;
	private double loyer4;
	private double loyerHotel=0;
	private double prixMaison=0;
	private double valeurAjouteeHotel;
	private double nbrMaison;
	private double nbrHotel;
	
	public Terrain(int numCase,String nomCase,double prixAchat,double prixHypo,double loyer0, double loyer1, double loyer2, double loyer3,
			double loyer4, double loyerHotel, double prixMaison,
			double valeurAjouteeHotel) {
		
		this.setNumCase(numCase);
		this.setNomCase(nomCase);
		this.setPrixAchat(prixAchat);
		this.setAchete(false);
		this.setPrixHypo(prixHypo);
		this.setHypoteque(false);
		
		this.loyer0 = loyer0;
		this.loyer1 = loyer1;
		this.loyer2 = loyer2;
		this.loyer3 = loyer3;
		this.loyer4 = loyer4;
		this.loyerHotel = loyerHotel;
		this.prixMaison = prixMaison;
		this.valeurAjouteeHotel = valeurAjouteeHotel;
		this.nbrMaison = nbrMaison;
		this.nbrHotel = nbrHotel;
	}

    Terrain() {
    }
	
public String toString()
	{
		String str ="";

		str+="<html><center><div bgcolor='black'><font color='white'>"+this.getNomCase()+"</font></div><br> \n" +
				"LOYER "+this.loyer0+"<br>\n" +
				"Avec 1 Maison : "+this.loyer1+" M <br>\n" +
				"Avec 2 Maison : "+this.loyer2+" M <br>\n" +
				"Avec 3 Maison : "+this.loyer3+" M <br>\n" +
				"Avec 4 Maison : "+this.loyer4+" M <br>\n" +
				"Avec Hotel : "+this.loyerHotel+" M <br>\n" +
				"Valeur Hypothecaire : "+this.getPrixHypo()+" M <br>\n" +
				"Prix des Maisons "+this.prixMaison+" M chacune <br>\n" +
				"Prix d'un hotel "+this.valeurAjouteeHotel+" plus 4 Maisons <br><br>\n\n\n"
                                + "<div bgcolor='red'><font color='white'>Prix achat : "+this.getPrixAchat()+" M</font></div></center></html>";




		return str;

	}

    public double getLoyer0() {
        return loyer0;
    }

    public void setLoyer0(double loyer0) {
        this.loyer0 = loyer0;
    }

    public double getLoyer1() {
        return loyer1;
    }

    public void setLoyer1(double loyer1) {
        this.loyer1 = loyer1;
    }

    public double getLoyer2() {
        return loyer2;
    }

    public void setLoyer2(double loyer2) {
        this.loyer2 = loyer2;
    }

    public double getLoyer3() {
        return loyer3;
    }

    public void setLoyer3(double loyer3) {
        this.loyer3 = loyer3;
    }

    public double getLoyer4() {
        return loyer4;
    }

    public void setLoyer4(double loyer4) {
        this.loyer4 = loyer4;
    }

    public double getLoyerHotel() {
        return loyerHotel;
    }

    public void setLoyerHotel(double loyerHotel) {
        this.loyerHotel = loyerHotel;
    }

    public double getNbrHotel() {
        return nbrHotel;
    }

    public void setNbrHotel(double nbrHotel) {
        this.nbrHotel = nbrHotel;
    }

    public double getNbrMaison() {
        return nbrMaison;
    }

    public void setNbrMaison(double nbrMaison) {
        this.nbrMaison = nbrMaison;
    }

    public double getPrixMaison() {
        return prixMaison;
    }

    public void setPrixMaison(double prixMaison) {
        this.prixMaison = prixMaison;
    }

    public double getValeurAjouteeHotel() {
        return valeurAjouteeHotel;
    }

    public void setValeurAjouteeHotel(double valeurAjouteeHotel) {
        this.valeurAjouteeHotel = valeurAjouteeHotel;
    }
	
	
	
	
	
	
	
	
	

}
