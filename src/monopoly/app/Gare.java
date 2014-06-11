package monopoly.app;


public class Gare extends Propriete{

	private double loyer1=25;
	private double loyer2=50;
	private double loyer3=100;
	private double loyer4=200;
	
	public double getLoyer1() {
		return loyer1;
	}
	public double getLoyer2() {
		return loyer2;
	}
	public double getLoyer3() {
		return loyer3;
	}
	public double getLoyer4() {
		return loyer4;
	}
	
	public Gare(int numCase,String nomCase)
	{
		this.setNumCase(numCase);
		this.setNomCase(nomCase);
		this.setPrixAchat(200);
		this.setAchete(false);
		this.setPrixHypo(100);
		this.setHypoteque(false);
		
	}
	
	
  public String toString(){
        String str ="";

        str+="<html><center><div bgcolor='black'><font color='white'>"+this.getNomCase()+"</font></div><br>\n" +
                        "LOYER "+this.loyer1+"<br>\n" +
                        "Si vous avez 2 gares : "+this.loyer2+" M <br>\n" +
                        "Si vous avez 3 gares : "+this.loyer3+" M <br>\n" +
                        "Si vous avez 4 gares : "+this.loyer4+" M <br>\n" +
                        "Valeur Hypothecaire : "+this.getPrixHypo()+" M <br><br>\n\n\n"
                        + "<div bgcolor='red'><font color='white'>Prix achat : "+this.getPrixAchat()+" M</font></div></center></html>";


        return str;
    }


	
}
