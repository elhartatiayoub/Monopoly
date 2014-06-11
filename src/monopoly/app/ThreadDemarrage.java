/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package monopoly.app;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 *
 */
public class ThreadDemarrage extends Thread{
    public boolean indicateur;
    
    public static ChoixUtilisateurs choixUtilisateurs;

    public void ThreadDemarrage(){
        indicateur=false;
    }

    @Override
    public void run(){
        if(indicateur==true){
            try {
                Thread.sleep(4000);
            } catch (InterruptedException ex) {
                Logger.getLogger(ThreadDemarrage.class.getName()).log(Level.SEVERE, null, ex);
            }
            Accueil.PasserFenetreSuivante2();
            choixUtilisateurs=new ChoixUtilisateurs();
            choixUtilisateurs.setVisible(true);
        }
    }
}
