/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * choix_joueurs.java
 *
 * Created on 3 juin 2011, 16:57:45
 */

package monopoly.app;

import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListSelectionModel;
import javax.swing.JOptionPane;

/**
 *
 * 
 */
public class choix_joueurs extends javax.swing.JFrame {

    public static List<Joueur> joueurs=new ArrayList<Joueur>();

    /**
     *pour éviter les mm selections du pion du jeu
     */
    public static  ArrayList disabled= new ArrayList();

    /** Creates new form choix_joueurs */
    public choix_joueurs() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jComboBox2 = new javax.swing.JComboBox();
        jComboBox2.setVisible(false);
        jComboBox3 = new javax.swing.JComboBox();
        jComboBox3.setVisible(false);
        jComboBox4 = new javax.swing.JComboBox();
        jComboBox4.setVisible(false);
        jComboBox5 = new javax.swing.JComboBox();
        jComboBox2.setVisible(false);
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(532, 306));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        jButton1.setText("Annuler");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(137, 230, 110, 23);

        jButton2.setText("Commencer");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(270, 230, 110, 23);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Aucun", "2 joueurs", "3 joueurs", "4 joueurs" }));
        jComboBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox1ItemStateChanged(evt);
            }
        });
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox1);
        jComboBox1.setBounds(242, 21, 203, 20);

        jLabel1.setText("Choisir le nombre de joueurs : ");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(50, 21, 182, 20);

        jLabel2.setText("Joueur N° 1 :");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(80, 90, 82, 14);

        jLabel3.setText("Joueur N° 2 :");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(80, 120, 82, 14);

        jLabel4.setText("Joueur N° 3 :");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(80, 150, 82, 14);

        jLabel5.setText("Joueur N° 4 :");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(80, 180, 82, 14);
        getContentPane().add(jTextField1);
        jTextField1.setBounds(160, 90, 168, 20);
        getContentPane().add(jTextField2);
        jTextField2.setBounds(160, 120, 168, 20);
        getContentPane().add(jTextField3);
        jTextField3.setBounds(160, 150, 168, 20);
        getContentPane().add(jTextField4);
        jTextField4.setBounds(160, 180, 168, 20);

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "", "pion 1", "pion 2", "pion 3", "pion 4" }));
        jComboBox2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox2ItemStateChanged(evt);
            }
        });
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox2);
        jComboBox2.setBounds(350, 90, 90, 20);

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "", "pion 1", "pion 2", "pion 3", "pion 4" }));
        getContentPane().add(jComboBox3);
        jComboBox3.setBounds(350, 120, 90, 20);

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "", "pion 1", "pion 2", "pion 3", "pion 4" }));
        getContentPane().add(jComboBox4);
        jComboBox4.setBounds(350, 150, 90, 20);

        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "", "pion 1", "pion 2", "pion 3", "pion 4" }));
        jComboBox5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox5ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox5);
        jComboBox5.setBounds(350, 180, 90, 20);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/images/im2.png"))); // NOI18N
        getContentPane().add(jLabel6);
        jLabel6.setBounds(-10, 0, 530, 300);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setTitle("Choix des joueurs");
        jButton2.setEnabled(false);

        jLabel2.setVisible(false);
        jTextField1.setVisible(false);

        jLabel3.setVisible(false);
        jTextField2.setVisible(false);

        jLabel4.setVisible(false);
        jTextField3.setVisible(false);

        jLabel5.setVisible(false);
        jTextField4.setVisible(false);
    }//GEN-LAST:event_formWindowOpened

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.setVisible(false);
        new ChoixUtilisateurs().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jComboBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox1ItemStateChanged
        if(!(jComboBox1.getSelectedItem()).equals("Aucun")){
            jButton2.setEnabled(true);
        }
         else{
            jButton2.setEnabled(false);
            jLabel2.setVisible(false);
            jTextField1.setVisible(false);

            jLabel3.setVisible(false);
            jTextField2.setVisible(false);

            jLabel4.setVisible(false);
            jTextField3.setVisible(false);

            jLabel5.setVisible(false);
            jTextField4.setVisible(false);
         }
        
        if((jComboBox1.getSelectedItem()).equals("2 joueurs")){
            jLabel2.setVisible(true);
            jTextField1.setVisible(true);

            jLabel3.setVisible(true);
            jTextField2.setVisible(true);

            jLabel4.setVisible(false);
            jTextField3.setVisible(false);

            jLabel5.setVisible(false);
            jTextField4.setVisible(false);
        }

        if((jComboBox1.getSelectedItem()).equals("3 joueurs")){
                jLabel2.setVisible(true);
                jTextField1.setVisible(true);

                jLabel3.setVisible(true);
                jTextField2.setVisible(true);

                jLabel4.setVisible(true);
                jTextField3.setVisible(true);

                jLabel5.setVisible(false);
                jTextField4.setVisible(false);
        }

        if((jComboBox1.getSelectedItem()).equals("4 joueurs")){
                jLabel2.setVisible(true);
                jTextField1.setVisible(true);

                jLabel3.setVisible(true);
                jTextField2.setVisible(true);

                jLabel4.setVisible(true);
                jTextField3.setVisible(true);

                jLabel5.setVisible(true);
                jTextField4.setVisible(true);
        }

    }//GEN-LAST:event_jComboBox1ItemStateChanged

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        if((jComboBox1.getSelectedItem()).equals("2 joueurs")){
            if( jTextField1.getText().equals("") || jTextField2.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Vous devez indiquer les noms des deux joueurs ! ", "Attention", JOptionPane.ERROR_MESSAGE);
            }
             else{
                Joueur j1 =new Joueur();
                Joueur j2 =new Joueur();

                j1.setNom(jTextField1.getText());
                j1.setId(1);
                j1.setEnPrison(0);
                j1.setIcone(jComboBox2.getSelectedIndex());
                j1.setNombreCartePrison(0);
                j1.setSolde(1500);

                j2.setNom(jTextField2.getText());
                j2.setId(2);
                j2.setEnPrison(0);
                j2.setIcone(jComboBox3.getSelectedIndex());
                j2.setNombreCartePrison(0);
                j2.setSolde(1500);
                
                joueurs.add(j1);
                joueurs.add(j2);
                this.setVisible(false);
                //new Plateau().setVisible(true);
                new Partie_Monopoly().setVisible(true);
             }
        }

        if((jComboBox1.getSelectedItem()).equals("3 joueurs")){
            if( jTextField1.getText().equals("") || jTextField2.getText().equals("") || jTextField3.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Vous devez indiquer les noms des trois joueurs ! ", "Attention", JOptionPane.ERROR_MESSAGE);
            }
             else{
                Joueur j1 =new Joueur();
                Joueur j2 =new Joueur();
                Joueur j3 =new Joueur();
                
                j1.setNom(jTextField1.getText());
                j1.setId(1);
                j1.setEnPrison(0);
                j1.setIcone(jComboBox2.getSelectedIndex());
                j1.setNombreCartePrison(0);
                j1.setSolde(1500);

                j2.setNom(jTextField2.getText());
                j2.setId(2);
                j2.setEnPrison(0);
                j2.setIcone(jComboBox3.getSelectedIndex());
                j2.setNombreCartePrison(0);
                j2.setSolde(1500);

                j3.setNom(jTextField3.getText());
                j3.setId(3);
                j3.setEnPrison(0);
                j3.setIcone(jComboBox4.getSelectedIndex());
                j3.setNombreCartePrison(0);
                j3.setSolde(1500);
                
                joueurs.add(j1);
                joueurs.add(j2);
                joueurs.add(j3);
                
                this.setVisible(false);
                new Partie_Monopoly().setVisible(true);
             }
        }

        
        if((jComboBox1.getSelectedItem()).equals("4 joueurs")){
            if( jTextField1.getText().equals("") || jTextField2.getText().equals("") || jTextField3.getText().equals("") || jTextField4.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Vous devez indiquer les noms des quatres joueurs ! ", "Attention", JOptionPane.ERROR_MESSAGE);
            }
             else{
                Joueur j1 =new Joueur();
                Joueur j2 =new Joueur();
                Joueur j3 =new Joueur();
                Joueur j4 =new Joueur();


                j1.setNom(jTextField1.getText());
                j1.setId(1);
                j1.setEnPrison(0);
                j1.setIcone(jComboBox2.getSelectedIndex());
                j1.setNombreCartePrison(0);
                j1.setSolde(1500);
                

                j2.setNom(jTextField2.getText());
                j2.setId(2);
                j2.setEnPrison(0);
                j2.setIcone(jComboBox3.getSelectedIndex());
                j2.setNombreCartePrison(0);
                j2.setSolde(1500);

                j3.setNom(jTextField3.getText());
                j3.setId(3);
                j3.setEnPrison(0);
                j3.setIcone(jComboBox4.getSelectedIndex());
                j3.setNombreCartePrison(0);
                j3.setSolde(1500);

                j4.setNom(jTextField4.getText());
                j4.setId(4);
                j4.setEnPrison(0);
                j4.setIcone(jComboBox5.getSelectedIndex());
                j4.setNombreCartePrison(0);
                j4.setSolde(1500);

                joueurs.add(j1);
                joueurs.add(j2);
                joueurs.add(j3);
                joueurs.add(j4);

                this.setVisible(false);
                new Partie_Monopoly().setVisible(true);
             }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jComboBox5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox5ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jComboBox2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox2ItemStateChanged
        DefaultListSelectionModel model = new DefaultListSelectionModel();

		model.addSelectionInterval(0, 3);

                
		JComboBoxRend2 enableRenderer = new JComboBoxRend2(model);

		jComboBox2.setRenderer(enableRenderer);
        
        System.out.println(evt.getItemSelectable());
        System.out.println(jComboBox2.getSelectedIndex());
        disabled.clear();
        if(jComboBox3.getSelectedIndex()!=0)
            disabled.add(jComboBox3.getSelectedIndex());
        if(jComboBox4.getSelectedIndex()!=0)
            disabled.add(jComboBox4.getSelectedIndex());
        if(jComboBox5.getSelectedIndex()!=0)
            disabled.add(jComboBox5.getSelectedIndex());
        
     
        if(jComboBox2.getSelectedIndex()==1){
           
        }
    }//GEN-LAST:event_jComboBox2ItemStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JComboBox jComboBox3;
    private javax.swing.JComboBox jComboBox4;
    private javax.swing.JComboBox jComboBox5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables

}

