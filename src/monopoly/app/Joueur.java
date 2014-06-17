package monopoly.app;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;


public class Joueur extends Observable{

        private int id;

    public List<Case> getProprietes() {
        return proprietes;
    }

    public void setProprietes(List<Case> proprietes) {
        this.proprietes = proprietes;
        setChanged();
        notifyObservers(proprietes);
    }
    public void addProprietes(Case propriete) {
        this.proprietes.add(propriete);
        System.out.println(propriete.getNomCase()+" -------- "+propriete.getNumCase());
        setChanged();
        notifyObservers(proprietes);
    }
    
	private String nom;
        private int icone;
	private int pos ;
        private int solde;
        private int enPrison;
        private int nombreCartePrison;
        List<Case> proprietes=new ArrayList<Case>();

    public int getEnPrison() {
        return enPrison;
    }

    public void setEnPrison(int enPrison) {
        this.enPrison = enPrison;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getNombreCartePrison() {
        return nombreCartePrison;
    }

    public void setNombreCartePrison(int nombreCartePrison) {
        this.nombreCartePrison = nombreCartePrison;
    }

    public int getPos() {
        return pos;
    }

    public void setPos(int pos) {
        this.pos = pos;
    }

    

    public double getSolde() {
        return solde;
    }

    public void setSolde(int solde) {
        this.solde = solde;
    }

    public Joueur(int id, String nom, int pos, int solde, int enPrison, int nombreCartePrison) {
        this.id = id;
        this.nom = nom;
        this.pos = pos;
        this.solde = solde;
        this.enPrison = enPrison;
        this.nombreCartePrison = nombreCartePrison;
    }

    public Joueur() {
    }

    public int modifierSolde(int s)
	{
		int v=(this.solde+s);
		if(v<=0) return 1;
		else this.solde=v;
		return 0;
	}

    /**
     * @return the icone
     */
    public int getIcone() {
        return icone;
    }

    /**
     * @param icone the icone to set
     */
    public void setIcone(int icone) {
        this.icone = icone;
    }

}
