package monopoly.app;


public class Taxe extends Case {

	private double valeurTaxe;

	public double getValeurTaxe() {
		return valeurTaxe;
	}

	public void setValeurTaxe(double valeurTaxe) {
		this.valeurTaxe = valeurTaxe;
	}

	

	protected Taxe(int numCase, String nomCase,double v) {
		super(numCase, nomCase);
		
		this.valeurTaxe=v;
		
	}

        public String toString(){
        String str="";

        str+="<html><center><div bgcolor='black'><font color='white'>"+this.getNomCase()+"</font></div>" +
                        "Valeur à payer : <div bgcolor='red'><font color='white'>"+this.valeurTaxe+"</font></div>" +
                        "</center></html>";

        return str;
        }

	
	
}
