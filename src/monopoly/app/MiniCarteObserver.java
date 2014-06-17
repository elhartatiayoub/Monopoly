/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package monopoly.app;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;
import javax.swing.JLabel;

/**
 *
 * @author Iob
 */
public class MiniCarteObserver implements Observer{
    
    ArrayList<JLabel> mini;
    
    public MiniCarteObserver(){
        super();
    }
 

    MiniCarteObserver(ArrayList miniCartes) {
        super();
        this.mini  = mini;
    }
    
    public void update(Observable o, Object arg) {
        if(o instanceof Joueur){
             Partie_Monopoly.updateMiniCartes(((Joueur)o).getProprietes());
        }
    }
    
}
