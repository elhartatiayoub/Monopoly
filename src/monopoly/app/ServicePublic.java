package monopoly.app;


public class ServicePublic extends Propriete {

	private double l1;
	private double l2;

	public ServicePublic(int num,String nom,int p)
    {
        this.setNomCase(nom);
        this.setNumCase(num);
        this.setPrixAchat(p);
    }
	
	
        public String toString()
	{
		String str="";

		   str+="<html><center><div bgcolor='black'><font color='white'>"+this.getNomCase()+"</font></div>\n\n" +
				"Si l'on possede UNE carte de compagnie de service public, le loyer est 4 fois le Montant indiqué par les dés.\n " +
				"Si l'on possede les deux cartes de compagnie de Service public, le loyer est 10 fois le montant indiqué par les dés.\n" +
				"Valeur Hypothecaire : "+this.getPrixHypo()+" M" +
				"<div bgcolor='red'><font color='white'>Prix achat : "+this.getPrixAchat()+"</font></div></center></html>";


		return str;
	}

	

}
