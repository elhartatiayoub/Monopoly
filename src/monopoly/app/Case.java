package monopoly.app;


public class Case {
    
		private int numCase,occupe;
		private String nomCase;
                private Joueur j;
		
		public int getNumCase() {
			return numCase;
		}
		public void setNumCase(int numCase) {
			this.numCase = numCase;
		}

    public Joueur getJ() {
        return j;
    }

    public void setJ(Joueur j) {
        this.j = j;
    }
		public String getNomCase() {
			return nomCase;
		}
		public void setNomCase(String nomCase) {
			this.nomCase = nomCase;
		}
		protected Case(int numCase, String nomCase) {
			
			this.numCase = numCase;
			this.nomCase = nomCase;
                        this.occupe=0;
		}
		
		public Case(){}

                public int getOccupe() {
                    return occupe;
                }

                public void setOccupe(int occupe) {
                    this.occupe = occupe;
                }

               /* public String toString()
    {

                    String str="";

                    str+="<html><center><div bgcolor='red'><font color='white'>"+this.getNomCase()+"</font></div>"
                            +"</center></html>";

                    return str;

    }*/

}
