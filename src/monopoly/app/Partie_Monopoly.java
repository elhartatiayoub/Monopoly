/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package monopoly.app;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JLabel;

/**
 *
 *
 */
public class Partie_Monopoly extends javax.swing.JFrame {

    public static int RoleCourant;

    public static int val_somme_de;

    public static ArrayList<JLabel> miniCartes = new ArrayList<JLabel>();

    /**
     * Creates new form Partie_Monopoly
     */
    public Partie_Monopoly() {
        initComponents();
        miniCartes.add(jLabel29);
        miniCartes.add(jLabel3);
        miniCartes.add(jLabel29);
        miniCartes.add(jLabel5);
        miniCartes.add(jLabel29);
        miniCartes.add(jLabel28);
        miniCartes.add(jLabel6);
        miniCartes.add(jLabel29);
        miniCartes.add(jLabel7);
        miniCartes.add(jLabel8);
        miniCartes.add(jLabel29);
        miniCartes.add(jLabel9);
        miniCartes.add(jLabel26);
        miniCartes.add(jLabel10);
        miniCartes.add(jLabel11);
        miniCartes.add(jLabel30);
        miniCartes.add(jLabel12);
        miniCartes.add(jLabel29);
        miniCartes.add(jLabel13);
        miniCartes.add(jLabel14);
        miniCartes.add(jLabel29);
        miniCartes.add(jLabel15);
        miniCartes.add(jLabel29);
        miniCartes.add(jLabel16);
        miniCartes.add(jLabel17);
        miniCartes.add(jLabel31);
        miniCartes.add(jLabel18);
        miniCartes.add(jLabel19);
        miniCartes.add(jLabel27);
        miniCartes.add(jLabel20);
        miniCartes.add(jLabel29);
        miniCartes.add(jLabel21);
        miniCartes.add(jLabel22);
        miniCartes.add(jLabel29);
        miniCartes.add(jLabel23);
        miniCartes.add(jLabel32);
        miniCartes.add(jLabel24);
        miniCartes.add(jLabel29);
        miniCartes.add(jLabel25);
        for (Joueur j : choix_joueurs.joueurs) {
            j.addObserver(new MiniCarteObserver(miniCartes));
        }
    }

    public static void updateMiniCartes(List<Case> list) {
        for (JLabel j : miniCartes) {
            j.setVisible(false);
        }
        for (Case c : list) {
            System.out.println( c.getNomCase() );
            miniCartes.get(c.getNumCase() - 1).setVisible(true);
            
        }
    }

    public int getNouvellePosition(int anc_pos, int sommeValDes) {

        int newPosition = anc_pos + sommeValDes;

        if (newPosition < 40) {
            return newPosition;
        } else {

            choix_joueurs.joueurs.get(RoleCourant).setSolde((int) (choix_joueurs.joueurs.get(RoleCourant).getSolde()) + 200);

            if (RoleCourant == 0) {
                solde_joueur_1.setText("" + choix_joueurs.joueurs.get(RoleCourant).getSolde());
            }

            if (RoleCourant == 1) {
                solde_joueur_2.setText("" + choix_joueurs.joueurs.get(RoleCourant).getSolde());
            }

            if (RoleCourant == 2) {
                solde_joueur_3.setText("" + choix_joueurs.joueurs.get(RoleCourant).getSolde());
            }

            if (RoleCourant == 3) {
                solde_joueur_4.setText("" + choix_joueurs.joueurs.get(RoleCourant).getSolde());
            }

            return newPosition - 40;
        }

    }

    public static void AfficherProprietaire(int position, int id) {

        position = position - 1;

        switch (position) {

            case 1:
                if (id == 0) {
                    propr1.setIcon(new javax.swing.ImageIcon("/monopoly/images/pion1.png"));
                }
                if (id == 1) {
                    propr1.setIcon(new javax.swing.ImageIcon("/monopoly/images/pion2.png"));

                }
                propr1.setVisible(true);
                propr1.setText(choix_joueurs.joueurs.get(id).getNom());
                break;

            case 2:

                if (id == 0) {
                    propr2.setIcon(new javax.swing.ImageIcon("/monopoly/images/pion1.png"));
                }
                if (id == 1) {
                    propr2.setIcon(new javax.swing.ImageIcon("/monopoly/images/pion2.png"));
                }
                propr2.setVisible(true);
                propr2.setText(choix_joueurs.joueurs.get(id).getNom());
                break;

            case 3:

                if (id == 0) {
                    propr3.setIcon(new javax.swing.ImageIcon("/monopoly/images/pion1.png"));
                }
                if (id == 1) {
                    propr3.setIcon(new javax.swing.ImageIcon("/monopoly/images/pion2.png"));
                }
                propr3.setText(choix_joueurs.joueurs.get(id).getNom());
                propr3.setVisible(true);
                break;

            case 4:

                if (id == 0) {
                    propr4.setIcon(new javax.swing.ImageIcon("/monopoly/images/pion1.png"));
                }
                if (id == 1) {
                    propr4.setIcon(new javax.swing.ImageIcon("/monopoly/images/pion2.png"));
                }
                propr4.setText(choix_joueurs.joueurs.get(id).getNom());
                propr4.setVisible(true);
                break;

            case 5:

                if (id == 0) {
                    propr5.setIcon(new javax.swing.ImageIcon("/monopoly/images/pion1.png"));
                }
                if (id == 1) {
                    propr5.setIcon(new javax.swing.ImageIcon("/monopoly/images/pion2.png"));
                }
                propr5.setText(choix_joueurs.joueurs.get(id).getNom());
                propr5.setVisible(true);
                break;

            case 6:

                if (id == 0) {
                    propr6.setIcon(new javax.swing.ImageIcon("/monopoly/images/pion1.png"));
                }
                if (id == 1) {
                    propr6.setIcon(new javax.swing.ImageIcon("/monopoly/images/pion2.png"));
                }
                propr6.setText(choix_joueurs.joueurs.get(id).getNom());
                propr6.setVisible(true);
                break;

            case 7:

                if (id == 0) {
                    propr7.setIcon(new javax.swing.ImageIcon("/monopoly/images/pion1.png"));
                }
                if (id == 1) {
                    propr7.setIcon(new javax.swing.ImageIcon("/monopoly/images/pion2.png"));
                }
                propr7.setText(choix_joueurs.joueurs.get(id).getNom());
                propr7.setVisible(true);
                break;

            case 8:

                if (id == 0) {
                    propr8.setIcon(new javax.swing.ImageIcon("/monopoly/images/pion1.png"));
                }
                if (id == 1) {
                    propr8.setIcon(new javax.swing.ImageIcon("/monopoly/images/pion2.png"));
                }
                propr8.setText(choix_joueurs.joueurs.get(id).getNom());
                propr8.setVisible(true);
                break;

            case 9:

                if (id == 0) {
                    propr9.setIcon(new javax.swing.ImageIcon("/monopoly/images/pion1.png"));
                }
                if (id == 1) {
                    propr9.setIcon(new javax.swing.ImageIcon("/monopoly/images/pion2.png"));
                }
                propr9.setText(choix_joueurs.joueurs.get(id).getNom());
                propr9.setVisible(true);
                break;

            case 11:

                if (id == 0) {
                    propr11.setIcon(new javax.swing.ImageIcon("/monopoly/images/pion1.png"));
                }
                if (id == 1) {
                    propr11.setIcon(new javax.swing.ImageIcon("/monopoly/images/pion2.png"));
                }
                propr11.setText(choix_joueurs.joueurs.get(id).getNom());
                propr11.setVisible(true);
                break;

            case 12:

                if (id == 0) {
                    propr12.setIcon(new javax.swing.ImageIcon("/monopoly/images/pion1.png"));
                }
                if (id == 1) {
                    propr12.setIcon(new javax.swing.ImageIcon("/monopoly/images/pion2.png"));
                }
                propr12.setText(choix_joueurs.joueurs.get(id).getNom());
                propr12.setVisible(true);
                break;

            case 13:

                if (id == 0) {
                    propr13.setIcon(new javax.swing.ImageIcon("/monopoly/images/pion1.png"));
                }
                if (id == 1) {
                    propr13.setIcon(new javax.swing.ImageIcon("/monopoly/images/pion2.png"));
                }
                propr13.setText(choix_joueurs.joueurs.get(id).getNom());
                propr13.setVisible(true);
                break;

            case 14:

                if (id == 0) {
                    propr14.setIcon(new javax.swing.ImageIcon("/monopoly/images/pion1.png"));
                }
                if (id == 1) {
                    propr14.setIcon(new javax.swing.ImageIcon("/monopoly/images/pion2.png"));
                }
                propr14.setText(choix_joueurs.joueurs.get(id).getNom());
                propr14.setVisible(true);
                break;

            case 15:

                if (id == 0) {
                    propr15.setIcon(new javax.swing.ImageIcon("/monopoly/images/pion1.png"));
                }
                if (id == 1) {
                    propr15.setIcon(new javax.swing.ImageIcon("/monopoly/images/pion2.png"));
                }
                propr15.setText(choix_joueurs.joueurs.get(id).getNom());
                propr15.setVisible(true);
                break;

            case 16:

                if (id == 0) {
                    propr16.setIcon(new javax.swing.ImageIcon("/monopoly/images/pion1.png"));
                }
                if (id == 1) {
                    propr16.setIcon(new javax.swing.ImageIcon("/monopoly/images/pion2.png"));
                }
                propr16.setText(choix_joueurs.joueurs.get(id).getNom());
                propr16.setVisible(true);

                break;

            case 17:

                if (id == 0) {
                    propr17.setIcon(new javax.swing.ImageIcon("/monopoly/images/pion1.png"));
                }
                if (id == 1) {
                    propr17.setIcon(new javax.swing.ImageIcon("/monopoly/images/pion2.png"));
                }
                propr17.setText(choix_joueurs.joueurs.get(id).getNom());
                propr17.setVisible(true);

                break;

            case 18:

                if (id == 0) {
                    propr18.setIcon(new javax.swing.ImageIcon("/monopoly/images/pion1.png"));
                }
                if (id == 1) {
                    propr18.setIcon(new javax.swing.ImageIcon("/monopoly/images/pion2.png"));
                }
                propr18.setText(choix_joueurs.joueurs.get(id).getNom());
                propr18.setVisible(true);
                break;

            case 19:

                if (id == 0) {
                    propr19.setIcon(new javax.swing.ImageIcon("/monopoly/images/pion1.png"));
                }
                if (id == 1) {
                    propr19.setIcon(new javax.swing.ImageIcon("/monopoly/images/pion2.png"));
                }
                propr19.setText(choix_joueurs.joueurs.get(id).getNom());
                propr19.setVisible(true);
                break;

            case 20:

                if (id == 0) {
                    propr20.setIcon(new javax.swing.ImageIcon("/monopoly/images/pion1.png"));
                }
                if (id == 1) {
                    propr20.setIcon(new javax.swing.ImageIcon("/monopoly/images/pion2.png"));
                }
                propr20.setText(choix_joueurs.joueurs.get(id).getNom());
                propr20.setVisible(true);
                break;

            case 21:

                if (id == 0) {
                    propr21.setIcon(new javax.swing.ImageIcon("/monopoly/images/pion1.png"));
                }
                if (id == 1) {
                    propr21.setIcon(new javax.swing.ImageIcon("/monopoly/images/pion2.png"));
                }
                propr21.setText(choix_joueurs.joueurs.get(id).getNom());
                propr21.setVisible(true);
                break;

            case 22:

                if (id == 0) {
                    propr22.setIcon(new javax.swing.ImageIcon("/monopoly/images/pion1.png"));
                }
                if (id == 1) {
                    propr22.setIcon(new javax.swing.ImageIcon("/monopoly/images/pion2.png"));
                }
                propr22.setText(choix_joueurs.joueurs.get(id).getNom());
                propr22.setVisible(true);
                break;

            case 23:

                if (id == 0) {
                    propr23.setIcon(new javax.swing.ImageIcon("/monopoly/images/pion1.png"));
                }
                if (id == 1) {
                    propr23.setIcon(new javax.swing.ImageIcon("/monopoly/images/pion2.png"));
                }
                propr23.setText(choix_joueurs.joueurs.get(id).getNom());
                propr23.setVisible(true);
                break;

            case 24:

                if (id == 0) {
                    propr24.setIcon(new javax.swing.ImageIcon("/monopoly/images/pion1.png"));
                }
                if (id == 1) {
                    propr24.setIcon(new javax.swing.ImageIcon("/monopoly/images/pion2.png"));
                }
                propr24.setText(choix_joueurs.joueurs.get(id).getNom());
                propr24.setVisible(true);
                break;

            case 25:

                if (id == 0) {
                    propr25.setIcon(new javax.swing.ImageIcon("/monopoly/images/pion1.png"));
                }
                if (id == 1) {
                    propr25.setIcon(new javax.swing.ImageIcon("/monopoly/images/pion2.png"));
                }
                propr25.setText(choix_joueurs.joueurs.get(id).getNom());
                propr25.setVisible(true);
                break;

            case 26:

                if (id == 0) {
                    propr26.setIcon(new javax.swing.ImageIcon("/monopoly/images/pion1.png"));
                }
                if (id == 1) {
                    propr26.setIcon(new javax.swing.ImageIcon("/monopoly/images/pion2.png"));
                }
                propr26.setText(choix_joueurs.joueurs.get(id).getNom());
                propr26.setVisible(true);
                break;

            case 27:

                if (id == 0) {
                    propr27.setIcon(new javax.swing.ImageIcon("/monopoly/images/pion1.png"));
                }
                if (id == 1) {
                    propr27.setIcon(new javax.swing.ImageIcon("/monopoly/images/pion2.png"));
                }
                propr27.setText(choix_joueurs.joueurs.get(id).getNom());
                propr27.setVisible(true);
                break;

            case 28:

                if (id == 0) {
                    propr28.setIcon(new javax.swing.ImageIcon("/monopoly/images/pion1.png"));
                }
                if (id == 1) {
                    propr28.setIcon(new javax.swing.ImageIcon("/monopoly/images/pion2.png"));
                }
                propr28.setText(choix_joueurs.joueurs.get(id).getNom());
                propr28.setVisible(true);
                break;

            case 29:

                if (id == 0) {
                    propr29.setIcon(new javax.swing.ImageIcon("/monopoly/images/pion1.png"));
                }
                if (id == 1) {
                    propr29.setIcon(new javax.swing.ImageIcon("/monopoly/images/pion2.png"));
                }
                propr29.setText(choix_joueurs.joueurs.get(id).getNom());
                propr29.setVisible(true);
                break;

            case 31:

                if (id == 0) {
                    propr31.setIcon(new javax.swing.ImageIcon("/monopoly/images/pion1.png"));
                }
                if (id == 1) {
                    propr31.setIcon(new javax.swing.ImageIcon("/monopoly/images/pion2.png"));
                }
                propr31.setText(choix_joueurs.joueurs.get(id).getNom());
                propr31.setVisible(true);
                break;

            case 32:

                if (id == 0) {
                    propr32.setIcon(new javax.swing.ImageIcon("/monopoly/images/pion1.png"));
                }
                if (id == 1) {
                    propr32.setIcon(new javax.swing.ImageIcon("/monopoly/images/pion2.png"));
                }
                propr32.setText(choix_joueurs.joueurs.get(id).getNom());
                propr32.setVisible(true);
                break;

            case 33:

                if (id == 0) {
                    propr33.setIcon(new javax.swing.ImageIcon("/monopoly/images/pion1.png"));
                }
                if (id == 1) {
                    propr33.setIcon(new javax.swing.ImageIcon("/monopoly/images/pion2.png"));
                }
                propr33.setText(choix_joueurs.joueurs.get(id).getNom());
                propr33.setVisible(true);
                break;

            case 34:

                if (id == 0) {
                    propr34.setIcon(new javax.swing.ImageIcon("/monopoly/images/pion1.png"));
                }
                if (id == 1) {
                    propr34.setIcon(new javax.swing.ImageIcon("/monopoly/images/pion2.png"));
                }
                propr34.setText(choix_joueurs.joueurs.get(id).getNom());
                propr34.setVisible(true);
                break;

            case 35:

                if (id == 0) {
                    propr35.setIcon(new javax.swing.ImageIcon("/monopoly/images/pion1.png"));
                }
                if (id == 1) {
                    propr35.setIcon(new javax.swing.ImageIcon("/monopoly/images/pion2.png"));
                }
                propr35.setText(choix_joueurs.joueurs.get(id).getNom());
                propr35.setVisible(true);
                break;

            case 36:

                if (id == 0) {
                    propr36.setIcon(new javax.swing.ImageIcon("/monopoly/images/pion1.png"));
                }
                if (id == 1) {
                    propr36.setIcon(new javax.swing.ImageIcon("/monopoly/images/pion2.png"));
                }
                propr37.setText(choix_joueurs.joueurs.get(id).getNom());
                propr36.setVisible(true);
                break;

            case 37:

                if (id == 0) {
                    propr37.setIcon(new javax.swing.ImageIcon("/monopoly/images/pion1.png"));
                }
                if (id == 1) {
                    propr37.setIcon(new javax.swing.ImageIcon("/monopoly/images/pion2.png"));
                }
                propr38.setText(choix_joueurs.joueurs.get(id).getNom());
                propr37.setVisible(true);
                break;

            case 38:

                if (id == 0) {
                    propr38.setIcon(new javax.swing.ImageIcon("/monopoly/images/pion1.png"));
                }
                if (id == 1) {
                    propr38.setIcon(new javax.swing.ImageIcon("/monopoly/images/pion2.png"));
                }
                propr39.setText(choix_joueurs.joueurs.get(id).getNom());
                propr38.setVisible(true);
                break;

            case 39:

                if (id == 0) {
                    propr39.setIcon(new javax.swing.ImageIcon("/monopoly/images/pion1.png"));
                }
                if (id == 1) {
                    propr39.setIcon(new javax.swing.ImageIcon("/monopoly/images/pion2.png"));
                }
                propr39.setText(choix_joueurs.joueurs.get(id).getNom());
                propr39.setVisible(true);
                break;

        }

    }

    public static void rendreProprietairesInvisible() {

        propr1.setVisible(false);
        propr2.setVisible(false);
        propr3.setVisible(false);
        propr4.setVisible(false);
        propr5.setVisible(false);
        propr6.setVisible(false);
        propr7.setVisible(false);
        propr8.setVisible(false);
        propr9.setVisible(false);
        propr11.setVisible(false);
        propr12.setVisible(false);
        propr13.setVisible(false);
        propr14.setVisible(false);
        propr15.setVisible(false);
        propr16.setVisible(false);
        propr17.setVisible(false);
        propr18.setVisible(false);
        propr19.setVisible(false);
        propr20.setVisible(false);
        propr21.setVisible(false);
        propr22.setVisible(false);
        propr23.setVisible(false);
        propr24.setVisible(false);
        propr25.setVisible(false);
        propr26.setVisible(false);
        propr27.setVisible(false);
        propr28.setVisible(false);
        propr29.setVisible(false);
        propr31.setVisible(false);
        propr32.setVisible(false);
        propr33.setVisible(false);
        propr34.setVisible(false);
        propr35.setVisible(false);
        propr36.setVisible(false);
        propr37.setVisible(false);
        propr38.setVisible(false);
        propr39.setVisible(false);

    }

    public void getRoleJoueurSuivant() {
        int id;
        id = RoleCourant + 1;
        if (id > choix_joueurs.joueurs.size() - 1) {
            RoleCourant = 0;
            joueur_courant.setText(choix_joueurs.joueurs.get(RoleCourant).getNom());
            updateMiniCartes(choix_joueurs.joueurs.get(RoleCourant).getProprietes());
        } else {
            RoleCourant++;
            joueur_courant.setText(choix_joueurs.joueurs.get(RoleCourant).getNom());
            updateMiniCartes(choix_joueurs.joueurs.get(RoleCourant).getProprietes());

        }
    }
    //fin préciser le role

    /*public static void Sedeplacer2(Joueur joueur,int NouvellePosition){
     Sedeplacer(joueur,NouvellePosition);
     }*/
    public static void Sedeplacer(Joueur joueur) {

        switch (joueur.getId()) {
            case 1:
                DeplacerJoueur(1);
                break;
            case 2:
                DeplacerJoueur(2);
                break;
            case 3:
                DeplacerJoueur(3);
                break;
            case 4:
                DeplacerJoueur(4);
                break;
            default:
                break;
        }

        AfficherCase.position = choix_joueurs.joueurs.get(RoleCourant).getPos();

        if (choix_joueurs.joueurs.get(RoleCourant).getPos() != 1) {
            new AfficherCase().setVisible(true);
        }

    }

    public static void DeplacerJoueur(int i) {

        if (choix_joueurs.joueurs.get(i - 1).getIcone() == 1) {
            switch (choix_joueurs.joueurs.get(i - 1).getPos()) {

                case 1:
                    rendreAllInvisible(1);
                    jLabelPion_1_1.setVisible(true);
                    break;

                case 2:
                    rendreAllInvisible(1);
                    jLabelPion_2_1.setVisible(true);
                    break;

                case 3:
                    rendreAllInvisible(1);
                    jLabelPion_3_1.setVisible(true);
                    break;

                case 4:
                    rendreAllInvisible(1);
                    jLabelPion_4_1.setVisible(true);
                    break;

                case 5:
                    rendreAllInvisible(1);
                    jLabelPion_5_1.setVisible(true);
                    break;

                case 6:
                    rendreAllInvisible(1);
                    jLabelPion_6_1.setVisible(true);
                    break;

                case 7:
                    rendreAllInvisible(1);
                    jLabelPion_7_1.setVisible(true);
                    break;

                case 8:
                    rendreAllInvisible(1);
                    jLabelPion_8_1.setVisible(true);
                    break;

                case 9:
                    rendreAllInvisible(1);
                    jLabelPion_9_1.setVisible(true);
                    break;

                case 10:
                    rendreAllInvisible(1);
                    jLabelPion_10_1.setVisible(true);
                    break;

                case 11:
                    rendreAllInvisible(1);
                    jLabelPion_11_1.setVisible(true);
                    break;

                case 12:
                    rendreAllInvisible(1);
                    jLabelPion_12_1.setVisible(true);
                    break;

                case 13:
                    rendreAllInvisible(1);
                    jLabelPion_13_1.setVisible(true);
                    break;

                case 14:
                    rendreAllInvisible(1);
                    jLabelPion_14_1.setVisible(true);
                    break;

                case 15:
                    rendreAllInvisible(1);
                    jLabelPion_15_1.setVisible(true);
                    break;

                case 16:
                    rendreAllInvisible(1);
                    jLabelPion_16_1.setVisible(true);
                    break;

                case 17:
                    rendreAllInvisible(1);
                    jLabelPion_17_1.setVisible(true);
                    break;

                case 18:
                    rendreAllInvisible(1);
                    jLabelPion_18_1.setVisible(true);
                    break;

                case 19:
                    rendreAllInvisible(1);
                    jLabelPion_19_1.setVisible(true);
                    break;

                case 20:
                    rendreAllInvisible(1);
                    jLabelPion_20_1.setVisible(true);
                    break;

                case 21:
                    rendreAllInvisible(1);
                    jLabelPion_21_1.setVisible(true);
                    break;

                case 22:
                    rendreAllInvisible(1);
                    jLabelPion_22_1.setVisible(true);
                    break;

                case 23:
                    rendreAllInvisible(1);
                    jLabelPion_23_1.setVisible(true);
                    break;

                case 24:
                    rendreAllInvisible(1);
                    jLabelPion_24_1.setVisible(true);
                    break;

                case 25:
                    rendreAllInvisible(1);
                    jLabelPion_25_1.setVisible(true);
                    break;

                case 26:
                    rendreAllInvisible(1);
                    jLabelPion_26_1.setVisible(true);
                    break;

                case 27:
                    rendreAllInvisible(1);
                    jLabelPion_27_1.setVisible(true);
                    break;

                case 28:
                    rendreAllInvisible(1);
                    jLabelPion_28_1.setVisible(true);
                    break;

                case 29:
                    rendreAllInvisible(1);
                    jLabelPion_29_1.setVisible(true);
                    break;

                case 30:
                    rendreAllInvisible(1);
                    jLabelPion_30_1.setVisible(true);
                    break;

                case 31:
                    rendreAllInvisible(1);
                    jLabelPion_31_1.setVisible(true);
                    break;

                case 32:
                    rendreAllInvisible(1);
                    jLabelPion_32_1.setVisible(true);
                    break;

                case 33:
                    rendreAllInvisible(1);
                    jLabelPion_33_1.setVisible(true);
                    break;

                case 34:
                    rendreAllInvisible(1);
                    jLabelPion_34_1.setVisible(true);
                    break;

                case 35:
                    rendreAllInvisible(1);
                    jLabelPion_35_1.setVisible(true);
                    break;

                case 36:
                    rendreAllInvisible(1);
                    jLabelPion_36_1.setVisible(true);
                    break;

                case 37:
                    rendreAllInvisible(1);
                    jLabelPion_37_1.setVisible(true);
                    break;

                case 38:
                    rendreAllInvisible(1);
                    jLabelPion_38_1.setVisible(true);
                    break;

                case 39:
                    rendreAllInvisible(1);
                    jLabelPion_39_1.setVisible(true);
                    break;

                case 40:
                    rendreAllInvisible(1);
                    jLabelPion_40_1.setVisible(true);
                    break;

            }
        }
        if (choix_joueurs.joueurs.get(i - 1).getIcone() == 2) {
            switch (choix_joueurs.joueurs.get(i - 1).getPos()) {

                case 1:
                    rendreAllInvisible(2);
                    jLabelPion_1_2.setVisible(true);
                    break;

                case 2:
                    rendreAllInvisible(2);
                    jLabelPion_2_2.setVisible(true);
                    break;

                case 3:
                    rendreAllInvisible(2);
                    jLabelPion_3_2.setVisible(true);
                    break;

                case 4:
                    rendreAllInvisible(2);
                    jLabelPion_4_2.setVisible(true);
                    break;

                case 5:
                    rendreAllInvisible(2);
                    jLabelPion_5_2.setVisible(true);
                    break;

                case 6:
                    rendreAllInvisible(2);
                    jLabelPion_6_2.setVisible(true);
                    break;

                case 7:
                    rendreAllInvisible(2);
                    jLabelPion_7_2.setVisible(true);
                    break;

                case 8:
                    rendreAllInvisible(2);
                    jLabelPion_8_2.setVisible(true);
                    break;

                case 9:
                    rendreAllInvisible(2);
                    jLabelPion_9_2.setVisible(true);
                    break;

                case 10:
                    rendreAllInvisible(2);
                    jLabelPion_10_2.setVisible(true);
                    break;

                case 11:
                    rendreAllInvisible(2);
                    jLabelPion_11_2.setVisible(true);
                    break;

                case 12:
                    rendreAllInvisible(2);
                    jLabelPion_12_2.setVisible(true);
                    break;

                case 13:
                    rendreAllInvisible(2);
                    jLabelPion_13_2.setVisible(true);
                    break;

                case 14:
                    rendreAllInvisible(2);
                    jLabelPion_14_2.setVisible(true);
                    break;

                case 15:
                    rendreAllInvisible(2);
                    jLabelPion_15_2.setVisible(true);
                    break;

                case 16:
                    rendreAllInvisible(2);
                    jLabelPion_16_2.setVisible(true);
                    break;

                case 17:
                    rendreAllInvisible(2);
                    jLabelPion_17_2.setVisible(true);
                    break;

                case 18:
                    rendreAllInvisible(2);
                    jLabelPion_18_2.setVisible(true);
                    break;

                case 19:
                    rendreAllInvisible(2);
                    jLabelPion_19_2.setVisible(true);
                    break;

                case 20:
                    rendreAllInvisible(2);
                    jLabelPion_20_2.setVisible(true);
                    break;

                case 21:
                    rendreAllInvisible(2);
                    jLabelPion_21_2.setVisible(true);
                    break;

                case 22:
                    rendreAllInvisible(2);
                    jLabelPion_22_2.setVisible(true);
                    break;

                case 23:
                    rendreAllInvisible(2);
                    jLabelPion_23_2.setVisible(true);
                    break;

                case 24:
                    rendreAllInvisible(2);
                    jLabelPion_24_2.setVisible(true);
                    break;

                case 25:
                    rendreAllInvisible(2);
                    jLabelPion_25_2.setVisible(true);
                    break;

                case 26:
                    rendreAllInvisible(2);
                    jLabelPion_26_2.setVisible(true);
                    break;

                case 27:
                    rendreAllInvisible(2);
                    jLabelPion_27_2.setVisible(true);
                    break;

                case 28:
                    rendreAllInvisible(2);
                    jLabelPion_28_2.setVisible(true);
                    break;

                case 29:
                    rendreAllInvisible(2);
                    jLabelPion_29_2.setVisible(true);
                    break;

                case 30:
                    rendreAllInvisible(2);
                    jLabelPion_30_2.setVisible(true);
                    break;

                case 31:
                    rendreAllInvisible(2);
                    jLabelPion_31_2.setVisible(true);
                    break;

                case 32:
                    rendreAllInvisible(2);
                    jLabelPion_32_2.setVisible(true);
                    break;

                case 33:
                    rendreAllInvisible(2);
                    jLabelPion_33_2.setVisible(true);
                    break;

                case 34:
                    rendreAllInvisible(2);
                    jLabelPion_34_2.setVisible(true);
                    break;

                case 35:
                    rendreAllInvisible(2);
                    jLabelPion_35_2.setVisible(true);
                    break;

                case 36:
                    rendreAllInvisible(2);
                    jLabelPion_36_2.setVisible(true);
                    break;

                case 37:
                    rendreAllInvisible(2);
                    jLabelPion_37_2.setVisible(true);
                    break;

                case 38:
                    rendreAllInvisible(2);
                    jLabelPion_38_2.setVisible(true);
                    break;

                case 39:
                    rendreAllInvisible(2);
                    jLabelPion_39_2.setVisible(true);
                    break;

                case 40:
                    rendreAllInvisible(2);
                    jLabelPion_40_2.setVisible(true);
                    break;

            }
        }
        if (choix_joueurs.joueurs.get(i - 1).getIcone() == 3) {

            switch (choix_joueurs.joueurs.get(i - 1).getPos()) {

                case 1:
                    rendreAllInvisible(3);
                    jLabelPion_1_3.setVisible(true);
                    break;

                case 2:
                    rendreAllInvisible(3);
                    jLabelPion_2_3.setVisible(true);
                    break;

                case 3:
                    rendreAllInvisible(3);
                    jLabelPion_3_3.setVisible(true);
                    break;

                case 4:
                    rendreAllInvisible(3);
                    jLabelPion_4_3.setVisible(true);
                    break;

                case 5:
                    rendreAllInvisible(3);
                    jLabelPion_5_3.setVisible(true);
                    break;

                case 6:
                    rendreAllInvisible(3);
                    jLabelPion_6_3.setVisible(true);
                    break;

                case 7:
                    rendreAllInvisible(3);
                    jLabelPion_7_3.setVisible(true);
                    break;

                case 8:
                    rendreAllInvisible(3);
                    jLabelPion_8_3.setVisible(true);
                    break;

                case 9:
                    rendreAllInvisible(3);
                    jLabelPion_9_3.setVisible(true);
                    break;

                case 10:
                    rendreAllInvisible(3);
                    jLabelPion_10_3.setVisible(true);
                    break;

                case 11:
                    rendreAllInvisible(3);
                    jLabelPion_11_3.setVisible(true);
                    break;

                case 12:
                    rendreAllInvisible(3);
                    jLabelPion_12_3.setVisible(true);
                    break;

                case 13:
                    rendreAllInvisible(3);
                    jLabelPion_13_3.setVisible(true);
                    break;

                case 14:
                    rendreAllInvisible(3);
                    jLabelPion_14_3.setVisible(true);
                    break;

                case 15:
                    rendreAllInvisible(3);
                    jLabelPion_15_3.setVisible(true);
                    break;

                case 16:
                    rendreAllInvisible(3);
                    jLabelPion_16_3.setVisible(true);
                    break;

                case 17:
                    rendreAllInvisible(3);
                    jLabelPion_17_3.setVisible(true);
                    break;

                case 18:
                    rendreAllInvisible(3);
                    jLabelPion_18_3.setVisible(true);
                    break;

                case 19:
                    rendreAllInvisible(3);
                    jLabelPion_19_3.setVisible(true);
                    break;

                case 20:
                    rendreAllInvisible(3);
                    jLabelPion_20_3.setVisible(true);
                    break;

                case 21:
                    rendreAllInvisible(3);
                    jLabelPion_21_3.setVisible(true);
                    break;

                case 22:
                    rendreAllInvisible(3);
                    jLabelPion_22_3.setVisible(true);
                    break;

                case 23:
                    rendreAllInvisible(3);
                    jLabelPion_23_3.setVisible(true);
                    break;

                case 24:
                    rendreAllInvisible(3);
                    jLabelPion_24_3.setVisible(true);
                    break;

                case 25:
                    rendreAllInvisible(3);
                    jLabelPion_25_3.setVisible(true);
                    break;

                case 26:
                    rendreAllInvisible(3);
                    jLabelPion_26_3.setVisible(true);
                    break;

                case 27:
                    rendreAllInvisible(3);
                    jLabelPion_27_3.setVisible(true);
                    break;

                case 28:
                    rendreAllInvisible(3);
                    jLabelPion_28_3.setVisible(true);
                    break;

                case 29:
                    rendreAllInvisible(3);
                    jLabelPion_29_3.setVisible(true);
                    break;

                case 30:
                    rendreAllInvisible(3);
                    jLabelPion_30_3.setVisible(true);
                    break;

                case 31:
                    rendreAllInvisible(3);
                    jLabelPion_31_3.setVisible(true);
                    break;

                case 32:
                    rendreAllInvisible(3);
                    jLabelPion_32_3.setVisible(true);
                    break;

                case 33:
                    rendreAllInvisible(3);
                    jLabelPion_33_3.setVisible(true);
                    break;

                case 34:
                    rendreAllInvisible(3);
                    jLabelPion_34_3.setVisible(true);
                    break;

                case 35:
                    rendreAllInvisible(3);
                    jLabelPion_35_3.setVisible(true);
                    break;

                case 36:
                    rendreAllInvisible(3);
                    jLabelPion_36_3.setVisible(true);
                    break;

                case 37:
                    rendreAllInvisible(3);
                    jLabelPion_37_3.setVisible(true);
                    break;

                case 38:
                    rendreAllInvisible(3);
                    jLabelPion_38_3.setVisible(true);
                    break;

                case 39:
                    rendreAllInvisible(3);
                    jLabelPion_39_3.setVisible(true);
                    break;

                case 40:
                    rendreAllInvisible(3);
                    jLabelPion_40_3.setVisible(true);
                    break;

            }
        }
        if (choix_joueurs.joueurs.get(i - 1).getIcone() == 4) {
            switch (choix_joueurs.joueurs.get(i - 1).getPos()) {

                case 1:
                    rendreAllInvisible(4);
                    jLabelPion_1_4.setVisible(true);
                    break;

                case 2:
                    rendreAllInvisible(4);
                    jLabelPion_2_4.setVisible(true);
                    break;

                case 3:
                    rendreAllInvisible(4);
                    jLabelPion_3_4.setVisible(true);
                    break;

                case 4:
                    rendreAllInvisible(4);
                    jLabelPion_4_4.setVisible(true);
                    break;

                case 5:
                    rendreAllInvisible(4);
                    jLabelPion_5_4.setVisible(true);
                    break;

                case 6:
                    rendreAllInvisible(4);
                    jLabelPion_6_4.setVisible(true);
                    break;

                case 7:
                    rendreAllInvisible(4);
                    jLabelPion_7_4.setVisible(true);
                    break;

                case 8:
                    rendreAllInvisible(4);
                    jLabelPion_8_4.setVisible(true);
                    break;

                case 9:
                    rendreAllInvisible(4);
                    jLabelPion_9_4.setVisible(true);
                    break;

                case 10:
                    rendreAllInvisible(4);
                    jLabelPion_10_4.setVisible(true);
                    break;

                case 11:
                    rendreAllInvisible(4);
                    jLabelPion_11_4.setVisible(true);
                    break;

                case 12:
                    rendreAllInvisible(4);
                    jLabelPion_12_4.setVisible(true);
                    break;

                case 13:
                    rendreAllInvisible(4);
                    jLabelPion_13_4.setVisible(true);
                    break;

                case 14:
                    rendreAllInvisible(4);
                    jLabelPion_14_4.setVisible(true);
                    break;

                case 15:
                    rendreAllInvisible(4);
                    jLabelPion_15_4.setVisible(true);
                    break;

                case 16:
                    rendreAllInvisible(4);
                    jLabelPion_16_4.setVisible(true);
                    break;

                case 17:
                    rendreAllInvisible(4);
                    jLabelPion_17_4.setVisible(true);
                    break;

                case 18:
                    rendreAllInvisible(4);
                    jLabelPion_18_4.setVisible(true);
                    break;

                case 19:
                    rendreAllInvisible(4);
                    jLabelPion_19_4.setVisible(true);
                    break;

                case 20:
                    rendreAllInvisible(4);
                    jLabelPion_20_4.setVisible(true);
                    break;

                case 21:
                    rendreAllInvisible(4);
                    jLabelPion_21_4.setVisible(true);
                    break;

                case 22:
                    rendreAllInvisible(4);
                    jLabelPion_22_4.setVisible(true);
                    break;

                case 23:
                    rendreAllInvisible(4);
                    jLabelPion_23_4.setVisible(true);
                    break;

                case 24:
                    rendreAllInvisible(4);
                    jLabelPion_24_4.setVisible(true);
                    break;

                case 25:
                    rendreAllInvisible(4);
                    jLabelPion_25_4.setVisible(true);
                    break;

                case 26:
                    rendreAllInvisible(4);
                    jLabelPion_26_4.setVisible(true);
                    break;

                case 27:
                    rendreAllInvisible(4);
                    jLabelPion_27_4.setVisible(true);
                    break;

                case 28:
                    rendreAllInvisible(4);
                    jLabelPion_28_4.setVisible(true);
                    break;

                case 29:
                    rendreAllInvisible(4);
                    jLabelPion_29_4.setVisible(true);
                    break;

                case 30:
                    rendreAllInvisible(4);
                    jLabelPion_30_4.setVisible(true);
                    break;

                case 31:
                    rendreAllInvisible(4);
                    jLabelPion_31_4.setVisible(true);
                    break;

                case 32:
                    rendreAllInvisible(4);
                    jLabelPion_32_4.setVisible(true);
                    break;

                case 33:
                    rendreAllInvisible(4);
                    jLabelPion_33_4.setVisible(true);
                    break;

                case 34:
                    rendreAllInvisible(4);
                    jLabelPion_34_4.setVisible(true);
                    break;

                case 35:
                    rendreAllInvisible(4);
                    jLabelPion_35_4.setVisible(true);
                    break;

                case 36:
                    rendreAllInvisible(4);
                    jLabelPion_36_4.setVisible(true);
                    break;

                case 37:
                    rendreAllInvisible(4);
                    jLabelPion_37_4.setVisible(true);
                    break;

                case 38:
                    rendreAllInvisible(4);
                    jLabelPion_38_4.setVisible(true);
                    break;

                case 39:
                    rendreAllInvisible(4);
                    jLabelPion_39_4.setVisible(true);
                    break;

                case 40:
                    rendreAllInvisible(4);
                    jLabelPion_40_4.setVisible(true);
                    break;

            }
        }
    }

    @SuppressWarnings("empty-statement")
    public static void rendreAllInvisible(int i) {
        if (i == 1) {
            jLabelPion_1_1.setVisible(false);
            jLabelPion_10_1.setVisible(false);
            jLabelPion_11_1.setVisible(false);
            jLabelPion_12_1.setVisible(false);
            jLabelPion_13_1.setVisible(false);
            jLabelPion_14_1.setVisible(false);
            jLabelPion_15_1.setVisible(false);
            jLabelPion_16_1.setVisible(false);
            jLabelPion_17_1.setVisible(false);
            jLabelPion_18_1.setVisible(false);
            jLabelPion_19_1.setVisible(false);
            jLabelPion_20_1.setVisible(false);
            jLabelPion_21_1.setVisible(false);
            jLabelPion_22_1.setVisible(false);
            jLabelPion_23_1.setVisible(false);
            jLabelPion_24_1.setVisible(false);
            jLabelPion_25_1.setVisible(false);
            jLabelPion_26_1.setVisible(false);
            jLabelPion_27_1.setVisible(false);
            jLabelPion_28_1.setVisible(false);
            jLabelPion_29_1.setVisible(false);
            jLabelPion_2_1.setVisible(false);
            jLabelPion_30_1.setVisible(false);;
            jLabelPion_31_1.setVisible(false);
            jLabelPion_32_1.setVisible(false);
            jLabelPion_33_1.setVisible(false);
            jLabelPion_34_1.setVisible(false);
            jLabelPion_35_1.setVisible(false);
            jLabelPion_36_1.setVisible(false);
            jLabelPion_37_1.setVisible(false);
            jLabelPion_38_1.setVisible(false);
            jLabelPion_39_1.setVisible(false);
            jLabelPion_3_1.setVisible(false);
            jLabelPion_40_1.setVisible(false);
            jLabelPion_4_1.setVisible(false);
            jLabelPion_5_1.setVisible(false);
            jLabelPion_6_1.setVisible(false);
            jLabelPion_7_1.setVisible(false);
            jLabelPion_8_1.setVisible(false);
            jLabelPion_9_1.setVisible(false);
        }
        if (i == 2) {
            jLabelPion_1_2.setVisible(false);
            jLabelPion_10_2.setVisible(false);
            jLabelPion_11_2.setVisible(false);
            jLabelPion_12_2.setVisible(false);
            jLabelPion_13_2.setVisible(false);
            jLabelPion_14_2.setVisible(false);
            jLabelPion_15_2.setVisible(false);
            jLabelPion_16_2.setVisible(false);
            jLabelPion_17_2.setVisible(false);
            jLabelPion_18_2.setVisible(false);
            jLabelPion_19_2.setVisible(false);
            jLabelPion_20_2.setVisible(false);
            jLabelPion_21_2.setVisible(false);
            jLabelPion_22_2.setVisible(false);
            jLabelPion_23_2.setVisible(false);
            jLabelPion_24_2.setVisible(false);
            jLabelPion_25_2.setVisible(false);
            jLabelPion_26_2.setVisible(false);
            jLabelPion_27_2.setVisible(false);
            jLabelPion_28_2.setVisible(false);
            jLabelPion_29_2.setVisible(false);
            jLabelPion_2_2.setVisible(false);
            jLabelPion_30_2.setVisible(false);;
            jLabelPion_31_2.setVisible(false);
            jLabelPion_32_2.setVisible(false);
            jLabelPion_33_2.setVisible(false);
            jLabelPion_34_2.setVisible(false);
            jLabelPion_35_2.setVisible(false);
            jLabelPion_36_2.setVisible(false);
            jLabelPion_37_2.setVisible(false);
            jLabelPion_38_2.setVisible(false);
            jLabelPion_39_2.setVisible(false);
            jLabelPion_3_2.setVisible(false);
            jLabelPion_40_2.setVisible(false);
            jLabelPion_4_2.setVisible(false);
            jLabelPion_5_2.setVisible(false);
            jLabelPion_6_2.setVisible(false);
            jLabelPion_7_2.setVisible(false);
            jLabelPion_8_2.setVisible(false);
            jLabelPion_9_2.setVisible(false);
        }
        if (i == 3) {
            jLabelPion_1_3.setVisible(false);
            jLabelPion_10_3.setVisible(false);
            jLabelPion_11_3.setVisible(false);
            jLabelPion_12_3.setVisible(false);
            jLabelPion_13_3.setVisible(false);
            jLabelPion_14_3.setVisible(false);
            jLabelPion_15_3.setVisible(false);
            jLabelPion_16_3.setVisible(false);
            jLabelPion_17_3.setVisible(false);
            jLabelPion_18_3.setVisible(false);
            jLabelPion_19_3.setVisible(false);
            jLabelPion_20_3.setVisible(false);
            jLabelPion_21_3.setVisible(false);
            jLabelPion_22_3.setVisible(false);
            jLabelPion_23_3.setVisible(false);
            jLabelPion_24_3.setVisible(false);
            jLabelPion_25_3.setVisible(false);
            jLabelPion_26_3.setVisible(false);
            jLabelPion_27_3.setVisible(false);
            jLabelPion_28_3.setVisible(false);
            jLabelPion_29_3.setVisible(false);
            jLabelPion_2_3.setVisible(false);
            jLabelPion_30_3.setVisible(false);;
            jLabelPion_31_3.setVisible(false);
            jLabelPion_32_3.setVisible(false);
            jLabelPion_33_3.setVisible(false);
            jLabelPion_34_3.setVisible(false);
            jLabelPion_35_3.setVisible(false);
            jLabelPion_36_3.setVisible(false);
            jLabelPion_37_3.setVisible(false);
            jLabelPion_38_3.setVisible(false);
            jLabelPion_39_3.setVisible(false);
            jLabelPion_3_3.setVisible(false);
            jLabelPion_40_3.setVisible(false);
            jLabelPion_4_3.setVisible(false);
            jLabelPion_5_3.setVisible(false);
            jLabelPion_6_3.setVisible(false);
            jLabelPion_7_3.setVisible(false);
            jLabelPion_8_3.setVisible(false);
            jLabelPion_9_3.setVisible(false);
        }
        if (i == 4) {
            jLabelPion_1_4.setVisible(false);
            jLabelPion_10_4.setVisible(false);
            jLabelPion_11_4.setVisible(false);
            jLabelPion_12_4.setVisible(false);
            jLabelPion_13_4.setVisible(false);
            jLabelPion_14_4.setVisible(false);
            jLabelPion_15_4.setVisible(false);
            jLabelPion_16_4.setVisible(false);
            jLabelPion_17_4.setVisible(false);
            jLabelPion_18_4.setVisible(false);
            jLabelPion_19_4.setVisible(false);
            jLabelPion_20_4.setVisible(false);
            jLabelPion_21_4.setVisible(false);
            jLabelPion_22_4.setVisible(false);
            jLabelPion_23_4.setVisible(false);
            jLabelPion_24_4.setVisible(false);
            jLabelPion_25_4.setVisible(false);
            jLabelPion_26_4.setVisible(false);
            jLabelPion_27_4.setVisible(false);
            jLabelPion_28_4.setVisible(false);
            jLabelPion_29_4.setVisible(false);
            jLabelPion_2_4.setVisible(false);
            jLabelPion_30_4.setVisible(false);;
            jLabelPion_31_4.setVisible(false);
            jLabelPion_32_4.setVisible(false);
            jLabelPion_33_4.setVisible(false);
            jLabelPion_34_4.setVisible(false);
            jLabelPion_35_4.setVisible(false);
            jLabelPion_36_4.setVisible(false);
            jLabelPion_37_4.setVisible(false);
            jLabelPion_38_4.setVisible(false);
            jLabelPion_39_4.setVisible(false);
            jLabelPion_3_4.setVisible(false);
            jLabelPion_40_4.setVisible(false);
            jLabelPion_4_4.setVisible(false);
            jLabelPion_5_4.setVisible(false);
            jLabelPion_6_4.setVisible(false);
            jLabelPion_7_4.setVisible(false);
            jLabelPion_8_4.setVisible(false);
            jLabelPion_9_4.setVisible(false);
        }

    }

    public void rendreAllInvisible() {

        jLabelPion_1_1.setVisible(false);
        jLabelPion_1_2.setVisible(false);
        jLabelPion_1_3.setVisible(false);
        jLabelPion_1_4.setVisible(false);
        jLabelPion_10_1.setVisible(false);
        jLabelPion_10_2.setVisible(false);
        jLabelPion_10_3.setVisible(false);
        jLabelPion_10_4.setVisible(false);
        jLabelPion_11_1.setVisible(false);
        jLabelPion_11_2.setVisible(false);
        jLabelPion_11_3.setVisible(false);
        jLabelPion_11_4.setVisible(false);
        jLabelPion_12_1.setVisible(false);
        jLabelPion_12_2.setVisible(false);
        jLabelPion_12_3.setVisible(false);
        jLabelPion_12_4.setVisible(false);
        jLabelPion_13_1.setVisible(false);
        jLabelPion_13_2.setVisible(false);
        jLabelPion_13_3.setVisible(false);
        jLabelPion_13_4.setVisible(false);
        jLabelPion_14_1.setVisible(false);
        jLabelPion_14_2.setVisible(false);
        jLabelPion_14_3.setVisible(false);
        jLabelPion_14_4.setVisible(false);
        jLabelPion_15_1.setVisible(false);
        jLabelPion_15_2.setVisible(false);
        jLabelPion_15_3.setVisible(false);
        jLabelPion_15_4.setVisible(false);
        jLabelPion_16_1.setVisible(false);
        jLabelPion_16_2.setVisible(false);
        jLabelPion_16_3.setVisible(false);
        jLabelPion_16_4.setVisible(false);
        jLabelPion_17_1.setVisible(false);
        jLabelPion_17_2.setVisible(false);
        jLabelPion_17_3.setVisible(false);
        jLabelPion_17_4.setVisible(false);
        jLabelPion_18_1.setVisible(false);
        jLabelPion_18_2.setVisible(false);
        jLabelPion_18_3.setVisible(false);
        jLabelPion_18_4.setVisible(false);
        jLabelPion_19_1.setVisible(false);
        jLabelPion_19_2.setVisible(false);
        jLabelPion_19_3.setVisible(false);
        jLabelPion_19_4.setVisible(false);
        jLabelPion_20_1.setVisible(false);
        jLabelPion_20_2.setVisible(false);
        jLabelPion_20_3.setVisible(false);
        jLabelPion_20_4.setVisible(false);
        jLabelPion_21_1.setVisible(false);
        jLabelPion_21_2.setVisible(false);
        jLabelPion_21_3.setVisible(false);
        jLabelPion_21_4.setVisible(false);
        jLabelPion_22_1.setVisible(false);
        jLabelPion_22_2.setVisible(false);
        jLabelPion_22_3.setVisible(false);
        jLabelPion_22_4.setVisible(false);
        jLabelPion_23_1.setVisible(false);
        jLabelPion_23_2.setVisible(false);
        jLabelPion_23_3.setVisible(false);
        jLabelPion_23_4.setVisible(false);
        jLabelPion_24_1.setVisible(false);
        jLabelPion_24_2.setVisible(false);
        jLabelPion_24_3.setVisible(false);
        jLabelPion_24_4.setVisible(false);
        jLabelPion_25_1.setVisible(false);
        jLabelPion_25_2.setVisible(false);
        jLabelPion_25_3.setVisible(false);
        jLabelPion_25_4.setVisible(false);
        jLabelPion_26_1.setVisible(false);
        jLabelPion_26_2.setVisible(false);
        jLabelPion_26_3.setVisible(false);
        jLabelPion_26_4.setVisible(false);
        jLabelPion_27_1.setVisible(false);
        jLabelPion_27_2.setVisible(false);
        jLabelPion_27_3.setVisible(false);
        jLabelPion_27_4.setVisible(false);
        jLabelPion_28_1.setVisible(false);
        jLabelPion_28_2.setVisible(false);
        jLabelPion_28_3.setVisible(false);
        jLabelPion_28_4.setVisible(false);
        jLabelPion_29_1.setVisible(false);
        jLabelPion_29_2.setVisible(false);
        jLabelPion_29_3.setVisible(false);
        jLabelPion_29_4.setVisible(false);
        jLabelPion_2_1.setVisible(false);
        jLabelPion_2_2.setVisible(false);
        jLabelPion_2_3.setVisible(false);
        jLabelPion_2_4.setVisible(false);
        jLabelPion_30_1.setVisible(false);
        jLabelPion_30_2.setVisible(false);
        jLabelPion_30_3.setVisible(false);
        jLabelPion_30_4.setVisible(false);
        jLabelPion_31_1.setVisible(false);
        jLabelPion_31_2.setVisible(false);
        jLabelPion_31_3.setVisible(false);
        jLabelPion_31_4.setVisible(false);
        jLabelPion_32_1.setVisible(false);
        jLabelPion_32_2.setVisible(false);
        jLabelPion_32_3.setVisible(false);
        jLabelPion_32_4.setVisible(false);
        jLabelPion_33_1.setVisible(false);
        jLabelPion_33_2.setVisible(false);
        jLabelPion_33_3.setVisible(false);
        jLabelPion_33_4.setVisible(false);
        jLabelPion_34_1.setVisible(false);
        jLabelPion_34_2.setVisible(false);
        jLabelPion_34_3.setVisible(false);
        jLabelPion_34_4.setVisible(false);
        jLabelPion_35_1.setVisible(false);
        jLabelPion_35_2.setVisible(false);
        jLabelPion_35_3.setVisible(false);
        jLabelPion_35_4.setVisible(false);
        jLabelPion_36_1.setVisible(false);
        jLabelPion_36_2.setVisible(false);
        jLabelPion_36_3.setVisible(false);
        jLabelPion_36_4.setVisible(false);
        jLabelPion_37_1.setVisible(false);
        jLabelPion_37_2.setVisible(false);
        jLabelPion_37_3.setVisible(false);
        jLabelPion_37_4.setVisible(false);
        jLabelPion_37_5.setVisible(false);
        jLabelPion_37_6.setVisible(false);
        jLabelPion_37_7.setVisible(false);
        jLabelPion_37_8.setVisible(false);
        jLabelPion_38_1.setVisible(false);
        jLabelPion_38_2.setVisible(false);
        jLabelPion_38_3.setVisible(false);
        jLabelPion_38_4.setVisible(false);
        jLabelPion_38_5.setVisible(false);
        jLabelPion_38_6.setVisible(false);
        jLabelPion_38_7.setVisible(false);
        jLabelPion_38_8.setVisible(false);
        jLabelPion_39_1.setVisible(false);
        jLabelPion_39_2.setVisible(false);
        jLabelPion_39_3.setVisible(false);
        jLabelPion_39_4.setVisible(false);
        jLabelPion_39_5.setVisible(false);
        jLabelPion_39_6.setVisible(false);
        jLabelPion_39_7.setVisible(false);
        jLabelPion_39_8.setVisible(false);
        jLabelPion_3_1.setVisible(false);
        jLabelPion_3_2.setVisible(false);
        jLabelPion_3_3.setVisible(false);
        jLabelPion_3_4.setVisible(false);
        jLabelPion_40_1.setVisible(false);
        jLabelPion_40_2.setVisible(false);
        jLabelPion_40_3.setVisible(false);
        jLabelPion_40_4.setVisible(false);
        jLabelPion_40_5.setVisible(false);
        jLabelPion_40_6.setVisible(false);
        jLabelPion_40_7.setVisible(false);
        jLabelPion_40_8.setVisible(false);
        jLabelPion_4_1.setVisible(false);
        jLabelPion_4_2.setVisible(false);
        jLabelPion_4_3.setVisible(false);
        jLabelPion_4_4.setVisible(false);
        jLabelPion_5_1.setVisible(false);
        jLabelPion_5_2.setVisible(false);
        jLabelPion_5_3.setVisible(false);
        jLabelPion_5_4.setVisible(false);
        jLabelPion_6_1.setVisible(false);
        jLabelPion_6_2.setVisible(false);
        jLabelPion_6_3.setVisible(false);
        jLabelPion_6_4.setVisible(false);
        jLabelPion_7_1.setVisible(false);
        jLabelPion_7_2.setVisible(false);
        jLabelPion_7_3.setVisible(false);
        jLabelPion_7_4.setVisible(false);
        jLabelPion_8_1.setVisible(false);
        jLabelPion_8_2.setVisible(false);
        jLabelPion_8_3.setVisible(false);
        jLabelPion_8_4.setVisible(false);
        jLabelPion_9_1.setVisible(false);
        jLabelPion_9_2.setVisible(false);
        jLabelPion_9_3.setVisible(false);
        jLabelPion_9_4.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel29 = new javax.swing.JLabel();
        propr32 = new javax.swing.JLabel();
        propr33 = new javax.swing.JLabel();
        propr34 = new javax.swing.JLabel();
        propr35 = new javax.swing.JLabel();
        propr36 = new javax.swing.JLabel();
        propr37 = new javax.swing.JLabel();
        propr38 = new javax.swing.JLabel();
        propr39 = new javax.swing.JLabel();
        propr31 = new javax.swing.JLabel();
        propr29 = new javax.swing.JLabel();
        propr28 = new javax.swing.JLabel();
        propr27 = new javax.swing.JLabel();
        propr26 = new javax.swing.JLabel();
        propr25 = new javax.swing.JLabel();
        propr24 = new javax.swing.JLabel();
        propr23 = new javax.swing.JLabel();
        propr22 = new javax.swing.JLabel();
        propr21 = new javax.swing.JLabel();
        propr18 = new javax.swing.JLabel();
        propr17 = new javax.swing.JLabel();
        propr16 = new javax.swing.JLabel();
        propr15 = new javax.swing.JLabel();
        propr19 = new javax.swing.JLabel();
        propr20 = new javax.swing.JLabel();
        propr14 = new javax.swing.JLabel();
        propr13 = new javax.swing.JLabel();
        propr12 = new javax.swing.JLabel();
        propr11 = new javax.swing.JLabel();
        propr9 = new javax.swing.JLabel();
        propr8 = new javax.swing.JLabel();
        propr7 = new javax.swing.JLabel();
        propr6 = new javax.swing.JLabel();
        propr5 = new javax.swing.JLabel();
        propr4 = new javax.swing.JLabel();
        propr3 = new javax.swing.JLabel();
        propr1 = new javax.swing.JLabel();
        propr2 = new javax.swing.JLabel();
        jLabelPion_20_3 = new javax.swing.JLabel();
        jLabelPion_1_3 = new javax.swing.JLabel();
        jLabelPion_1_1 = new javax.swing.JLabel();
        jLabelPion_1_2 = new javax.swing.JLabel();
        jLabelPion_1_4 = new javax.swing.JLabel();
        jLabelPion_2_3 = new javax.swing.JLabel();
        jLabelPion_2_1 = new javax.swing.JLabel();
        jLabelPion_2_2 = new javax.swing.JLabel();
        jLabelPion_2_4 = new javax.swing.JLabel();
        jLabelPion_3_3 = new javax.swing.JLabel();
        jLabelPion_3_1 = new javax.swing.JLabel();
        jLabelPion_3_2 = new javax.swing.JLabel();
        jLabelPion_3_4 = new javax.swing.JLabel();
        jLabelPion_4_1 = new javax.swing.JLabel();
        jLabelPion_4_3 = new javax.swing.JLabel();
        jLabelPion_4_4 = new javax.swing.JLabel();
        jLabelPion_4_2 = new javax.swing.JLabel();
        jLabelPion_5_1 = new javax.swing.JLabel();
        jLabelPion_5_3 = new javax.swing.JLabel();
        jLabelPion_5_4 = new javax.swing.JLabel();
        jLabelPion_5_2 = new javax.swing.JLabel();
        jLabelPion_6_1 = new javax.swing.JLabel();
        jLabelPion_6_3 = new javax.swing.JLabel();
        jLabelPion_6_4 = new javax.swing.JLabel();
        jLabelPion_6_2 = new javax.swing.JLabel();
        jLabelPion_7_1 = new javax.swing.JLabel();
        jLabelPion_7_3 = new javax.swing.JLabel();
        jLabelPion_7_4 = new javax.swing.JLabel();
        jLabelPion_7_2 = new javax.swing.JLabel();
        jLabelPion_8_3 = new javax.swing.JLabel();
        jLabelPion_8_1 = new javax.swing.JLabel();
        jLabelPion_8_2 = new javax.swing.JLabel();
        jLabelPion_8_4 = new javax.swing.JLabel();
        jLabelPion_9_3 = new javax.swing.JLabel();
        jLabelPion_9_4 = new javax.swing.JLabel();
        jLabelPion_9_2 = new javax.swing.JLabel();
        jLabelPion_9_1 = new javax.swing.JLabel();
        jLabelPion_10_3 = new javax.swing.JLabel();
        jLabelPion_10_4 = new javax.swing.JLabel();
        jLabelPion_10_2 = new javax.swing.JLabel();
        jLabelPion_10_1 = new javax.swing.JLabel();
        jLabelPion_11_3 = new javax.swing.JLabel();
        jLabelPion_11_1 = new javax.swing.JLabel();
        jLabelPion_11_2 = new javax.swing.JLabel();
        jLabelPion_11_4 = new javax.swing.JLabel();
        jLabelPion_12_3 = new javax.swing.JLabel();
        jLabelPion_12_4 = new javax.swing.JLabel();
        jLabelPion_12_2 = new javax.swing.JLabel();
        jLabelPion_12_1 = new javax.swing.JLabel();
        jLabelPion_13_2 = new javax.swing.JLabel();
        jLabelPion_13_4 = new javax.swing.JLabel();
        jLabelPion_13_3 = new javax.swing.JLabel();
        jLabelPion_13_1 = new javax.swing.JLabel();
        jLabelPion_14_2 = new javax.swing.JLabel();
        jLabelPion_14_4 = new javax.swing.JLabel();
        jLabelPion_14_3 = new javax.swing.JLabel();
        jLabelPion_14_1 = new javax.swing.JLabel();
        jLabelPion_15_2 = new javax.swing.JLabel();
        jLabelPion_15_4 = new javax.swing.JLabel();
        jLabelPion_15_3 = new javax.swing.JLabel();
        jLabelPion_15_1 = new javax.swing.JLabel();
        jLabelPion_16_4 = new javax.swing.JLabel();
        jLabelPion_16_2 = new javax.swing.JLabel();
        jLabelPion_16_1 = new javax.swing.JLabel();
        jLabelPion_16_3 = new javax.swing.JLabel();
        jLabelPion_17_4 = new javax.swing.JLabel();
        jLabelPion_17_3 = new javax.swing.JLabel();
        jLabelPion_17_1 = new javax.swing.JLabel();
        jLabelPion_17_2 = new javax.swing.JLabel();
        jLabelPion_18_1 = new javax.swing.JLabel();
        jLabelPion_18_3 = new javax.swing.JLabel();
        jLabelPion_18_4 = new javax.swing.JLabel();
        jLabelPion_18_2 = new javax.swing.JLabel();
        jLabelPion_19_2 = new javax.swing.JLabel();
        jLabelPion_19_4 = new javax.swing.JLabel();
        jLabelPion_19_3 = new javax.swing.JLabel();
        jLabelPion_19_1 = new javax.swing.JLabel();
        jLabelPion_20_2 = new javax.swing.JLabel();
        jLabelPion_20_4 = new javax.swing.JLabel();
        jLabelPion_20_1 = new javax.swing.JLabel();
        jLabelPion_21_2 = new javax.swing.JLabel();
        jLabelPion_21_4 = new javax.swing.JLabel();
        jLabelPion_21_3 = new javax.swing.JLabel();
        jLabelPion_21_1 = new javax.swing.JLabel();
        jLabelPion_22_1 = new javax.swing.JLabel();
        jLabelPion_22_3 = new javax.swing.JLabel();
        jLabelPion_22_2 = new javax.swing.JLabel();
        jLabelPion_22_4 = new javax.swing.JLabel();
        jLabelPion_23_1 = new javax.swing.JLabel();
        jLabelPion_23_3 = new javax.swing.JLabel();
        jLabelPion_23_4 = new javax.swing.JLabel();
        jLabelPion_23_2 = new javax.swing.JLabel();
        jLabelPion_24_1 = new javax.swing.JLabel();
        jLabelPion_24_3 = new javax.swing.JLabel();
        jLabelPion_24_4 = new javax.swing.JLabel();
        jLabelPion_24_2 = new javax.swing.JLabel();
        jLabelPion_25_1 = new javax.swing.JLabel();
        jLabelPion_25_3 = new javax.swing.JLabel();
        jLabelPion_25_4 = new javax.swing.JLabel();
        jLabelPion_25_2 = new javax.swing.JLabel();
        jLabelPion_26_1 = new javax.swing.JLabel();
        jLabelPion_26_3 = new javax.swing.JLabel();
        jLabelPion_26_4 = new javax.swing.JLabel();
        jLabelPion_26_2 = new javax.swing.JLabel();
        jLabelPion_27_1 = new javax.swing.JLabel();
        jLabelPion_27_3 = new javax.swing.JLabel();
        jLabelPion_27_4 = new javax.swing.JLabel();
        jLabelPion_27_2 = new javax.swing.JLabel();
        jLabelPion_28_1 = new javax.swing.JLabel();
        jLabelPion_28_3 = new javax.swing.JLabel();
        jLabelPion_28_4 = new javax.swing.JLabel();
        jLabelPion_28_2 = new javax.swing.JLabel();
        jLabelPion_29_1 = new javax.swing.JLabel();
        jLabelPion_29_3 = new javax.swing.JLabel();
        jLabelPion_29_4 = new javax.swing.JLabel();
        jLabelPion_29_2 = new javax.swing.JLabel();
        jLabelPion_30_1 = new javax.swing.JLabel();
        jLabelPion_30_3 = new javax.swing.JLabel();
        jLabelPion_30_4 = new javax.swing.JLabel();
        jLabelPion_30_2 = new javax.swing.JLabel();
        jLabelPion_31_3 = new javax.swing.JLabel();
        jLabelPion_31_1 = new javax.swing.JLabel();
        jLabelPion_31_2 = new javax.swing.JLabel();
        jLabelPion_31_4 = new javax.swing.JLabel();
        jLabelPion_32_3 = new javax.swing.JLabel();
        jLabelPion_32_1 = new javax.swing.JLabel();
        jLabelPion_32_2 = new javax.swing.JLabel();
        jLabelPion_32_4 = new javax.swing.JLabel();
        jLabelPion_33_3 = new javax.swing.JLabel();
        jLabelPion_33_1 = new javax.swing.JLabel();
        jLabelPion_33_2 = new javax.swing.JLabel();
        jLabelPion_33_4 = new javax.swing.JLabel();
        jLabelPion_34_1 = new javax.swing.JLabel();
        jLabelPion_34_3 = new javax.swing.JLabel();
        jLabelPion_34_4 = new javax.swing.JLabel();
        jLabelPion_34_2 = new javax.swing.JLabel();
        jLabelPion_35_1 = new javax.swing.JLabel();
        jLabelPion_35_3 = new javax.swing.JLabel();
        jLabelPion_35_4 = new javax.swing.JLabel();
        jLabelPion_35_2 = new javax.swing.JLabel();
        jLabelPion_36_1 = new javax.swing.JLabel();
        jLabelPion_36_3 = new javax.swing.JLabel();
        jLabelPion_36_4 = new javax.swing.JLabel();
        jLabelPion_36_2 = new javax.swing.JLabel();
        jLabelPion_37_1 = new javax.swing.JLabel();
        jLabelPion_37_3 = new javax.swing.JLabel();
        jLabelPion_37_4 = new javax.swing.JLabel();
        jLabelPion_37_2 = new javax.swing.JLabel();
        jLabelPion_38_1 = new javax.swing.JLabel();
        jLabelPion_38_3 = new javax.swing.JLabel();
        jLabelPion_38_4 = new javax.swing.JLabel();
        jLabelPion_38_2 = new javax.swing.JLabel();
        jLabelPion_39_1 = new javax.swing.JLabel();
        jLabelPion_39_3 = new javax.swing.JLabel();
        jLabelPion_39_4 = new javax.swing.JLabel();
        jLabelPion_39_2 = new javax.swing.JLabel();
        jLabelPion_40_1 = new javax.swing.JLabel();
        jLabelPion_40_3 = new javax.swing.JLabel();
        jLabelPion_40_4 = new javax.swing.JLabel();
        jLabelPion_40_2 = new javax.swing.JLabel();
        jLabelPion_37_5 = new javax.swing.JLabel();
        jLabelPion_37_6 = new javax.swing.JLabel();
        jLabelPion_37_7 = new javax.swing.JLabel();
        jLabelPion_37_8 = new javax.swing.JLabel();
        jLabelPion_38_5 = new javax.swing.JLabel();
        jLabelPion_38_6 = new javax.swing.JLabel();
        jLabelPion_38_7 = new javax.swing.JLabel();
        jLabelPion_38_8 = new javax.swing.JLabel();
        jLabelPion_39_5 = new javax.swing.JLabel();
        jLabelPion_39_6 = new javax.swing.JLabel();
        jLabelPion_39_7 = new javax.swing.JLabel();
        jLabelPion_39_8 = new javax.swing.JLabel();
        jLabelPion_40_5 = new javax.swing.JLabel();
        jLabelPion_40_6 = new javax.swing.JLabel();
        jLabelPion_40_7 = new javax.swing.JLabel();
        jLabelPion_40_8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        joueur_courant = new javax.swing.JLabel();
        jLabelDe1 = new javax.swing.JLabel();
        jLabelDe2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        nom_joueur1 = new javax.swing.JLabel();
        nom_joueur2 = new javax.swing.JLabel();
        nom_joueur3 = new javax.swing.JLabel();
        nom_joueur4 = new javax.swing.JLabel();
        solde_joueur_1 = new javax.swing.JLabel();
        solde_joueur_2 = new javax.swing.JLabel();
        solde_joueur_3 = new javax.swing.JLabel();
        solde_joueur_4 = new javax.swing.JLabel();
        plateau_3 = new javax.swing.JLabel();
        plateau_1 = new javax.swing.JLabel();
        plateau_2 = new javax.swing.JLabel();

        jLabel29.setText("jLabel3");
        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("monopoly/app/Bundle"); // NOI18N
        jLabel29.getAccessibleContext().setAccessibleName(bundle.getString("i")); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        setMinimumSize(new java.awt.Dimension(1357, 705));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        propr32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/images/pion1.png"))); // NOI18N
        propr32.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(propr32);
        propr32.setBounds(566, 170, 50, 16);

        propr33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/images/pion1.png"))); // NOI18N
        propr33.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(propr33);
        propr33.setBounds(566, 230, 50, 16);

        propr34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/images/pion1.png"))); // NOI18N
        propr34.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(propr34);
        propr34.setBounds(566, 290, 50, 16);

        propr35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/images/pion1.png"))); // NOI18N
        propr35.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(propr35);
        propr35.setBounds(566, 350, 50, 16);

        propr36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/images/pion1.png"))); // NOI18N
        propr36.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(propr36);
        propr36.setBounds(566, 400, 50, 16);

        propr37.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/images/pion1.png"))); // NOI18N
        propr37.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(propr37);
        propr37.setBounds(566, 460, 50, 16);

        propr38.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/images/pion1.png"))); // NOI18N
        propr38.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(propr38);
        propr38.setBounds(566, 510, 50, 16);

        propr39.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/images/pion1.png"))); // NOI18N
        propr39.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(propr39);
        propr39.setBounds(566, 570, 50, 16);

        propr31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/images/pion1.png"))); // NOI18N
        propr31.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(propr31);
        propr31.setBounds(566, 120, 50, 16);

        propr29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/images/pion1.png"))); // NOI18N
        propr29.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(propr29);
        propr29.setBounds(556, 100, 60, 16);

        propr28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/images/pion1.png"))); // NOI18N
        propr28.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(propr28);
        propr28.setBounds(506, 100, 50, 16);

        propr27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/images/pion1.png"))); // NOI18N
        propr27.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(propr27);
        propr27.setBounds(446, 100, 50, 16);

        propr26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/images/pion1.png"))); // NOI18N
        propr26.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(propr26);
        propr26.setBounds(390, 100, 50, 16);

        propr25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/images/pion1.png"))); // NOI18N
        propr25.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(propr25);
        propr25.setBounds(336, 100, 50, 16);

        propr24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/images/pion1.png"))); // NOI18N
        propr24.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(propr24);
        propr24.setBounds(276, 100, 50, 16);

        propr23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/images/pion1.png"))); // NOI18N
        propr23.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(propr23);
        propr23.setBounds(230, 100, 40, 16);

        propr22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/images/pion1.png"))); // NOI18N
        propr22.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(propr22);
        propr22.setBounds(166, 100, 50, 16);

        propr21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/images/pion1.png"))); // NOI18N
        propr21.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(propr21);
        propr21.setBounds(116, 100, 40, 16);

        propr18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/images/pion1.png"))); // NOI18N
        propr18.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(propr18);
        propr18.setBounds(110, 180, 50, 20);

        propr17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/images/pion1.png"))); // NOI18N
        propr17.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(propr17);
        propr17.setBounds(110, 230, 50, 20);

        propr16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/images/pion1.png"))); // NOI18N
        propr16.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(propr16);
        propr16.setBounds(110, 290, 50, 20);

        propr15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/images/pion1.png"))); // NOI18N
        propr15.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(propr15);
        propr15.setBounds(110, 350, 50, 20);

        propr19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/images/pion1.png"))); // NOI18N
        propr19.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(propr19);
        propr19.setBounds(110, 120, 50, 20);

        propr20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/images/pion1.png"))); // NOI18N
        propr20.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(propr20);
        propr20.setBounds(570, 660, 16, 16);

        propr14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/images/pion1.png"))); // NOI18N
        propr14.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(propr14);
        propr14.setBounds(110, 400, 50, 20);

        propr13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/images/pion1.png"))); // NOI18N
        propr13.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(propr13);
        propr13.setBounds(110, 460, 50, 20);

        propr12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/images/pion1.png"))); // NOI18N
        propr12.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(propr12);
        propr12.setBounds(110, 510, 50, 20);

        propr11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/images/pion1.png"))); // NOI18N
        propr11.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(propr11);
        propr11.setBounds(110, 566, 50, 20);

        propr9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/images/pion1.png"))); // NOI18N
        propr9.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(propr9);
        propr9.setBounds(120, 590, 40, 16);

        propr8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/images/pion1.png"))); // NOI18N
        propr8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(propr8);
        propr8.setBounds(170, 590, 40, 16);

        propr7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/images/pion1.png"))); // NOI18N
        propr7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(propr7);
        propr7.setBounds(220, 590, 50, 16);

        propr6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/images/pion1.png"))); // NOI18N
        propr6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(propr6);
        propr6.setBounds(280, 590, 40, 16);

        propr5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/images/pion1.png"))); // NOI18N
        propr5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(propr5);
        propr5.setBounds(326, 590, 50, 16);

        propr4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/images/pion1.png"))); // NOI18N
        propr4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(propr4);
        propr4.setBounds(386, 590, 50, 16);

        propr3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/images/pion1.png"))); // NOI18N
        propr3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(propr3);
        propr3.setBounds(446, 590, 50, 16);

        propr1.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        propr1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/images/pion1.png"))); // NOI18N
        propr1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(propr1);
        propr1.setBounds(560, 590, 40, 16);

        propr2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/images/pion1.png"))); // NOI18N
        propr2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(propr2);
        propr2.setBounds(506, 590, 40, 16);

        jLabelPion_20_3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/images/pion3.png"))); // NOI18N
        jLabelPion_20_3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabelPion_20_3);
        jLabelPion_20_3.setBounds(40, 120, 16, 16);

        jLabelPion_1_3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/images/pion3.png"))); // NOI18N
        jLabelPion_1_3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabelPion_1_3);
        jLabelPion_1_3.setBounds(670, 650, 16, 16);

        jLabelPion_1_1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/images/pion1.png"))); // NOI18N
        jLabelPion_1_1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabelPion_1_1);
        jLabelPion_1_1.setBounds(650, 650, 16, 16);

        jLabelPion_1_2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/images/pion2.png"))); // NOI18N
        jLabelPion_1_2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabelPion_1_2);
        jLabelPion_1_2.setBounds(650, 670, 16, 16);

        jLabelPion_1_4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/images/pion4.png"))); // NOI18N
        jLabelPion_1_4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabelPion_1_4);
        jLabelPion_1_4.setBounds(670, 670, 16, 16);

        jLabelPion_2_3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/images/pion3.png"))); // NOI18N
        jLabelPion_2_3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabelPion_2_3);
        jLabelPion_2_3.setBounds(590, 660, 16, 16);

        jLabelPion_2_1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/images/pion1.png"))); // NOI18N
        jLabelPion_2_1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabelPion_2_1);
        jLabelPion_2_1.setBounds(570, 660, 16, 16);

        jLabelPion_2_2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/images/pion2.png"))); // NOI18N
        jLabelPion_2_2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabelPion_2_2);
        jLabelPion_2_2.setBounds(570, 680, 16, 16);

        jLabelPion_2_4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/images/pion4.png"))); // NOI18N
        jLabelPion_2_4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabelPion_2_4);
        jLabelPion_2_4.setBounds(590, 680, 16, 16);

        jLabelPion_3_3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/images/pion3.png"))); // NOI18N
        jLabelPion_3_3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabelPion_3_3);
        jLabelPion_3_3.setBounds(530, 660, 16, 16);

        jLabelPion_3_1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/images/pion1.png"))); // NOI18N
        jLabelPion_3_1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabelPion_3_1);
        jLabelPion_3_1.setBounds(510, 660, 16, 16);

        jLabelPion_3_2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/images/pion2.png"))); // NOI18N
        jLabelPion_3_2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabelPion_3_2);
        jLabelPion_3_2.setBounds(510, 680, 16, 16);

        jLabelPion_3_4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/images/pion4.png"))); // NOI18N
        jLabelPion_3_4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabelPion_3_4);
        jLabelPion_3_4.setBounds(530, 680, 16, 16);

        jLabelPion_4_1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/images/pion1.png"))); // NOI18N
        jLabelPion_4_1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabelPion_4_1);
        jLabelPion_4_1.setBounds(460, 660, 16, 16);

        jLabelPion_4_3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/images/pion3.png"))); // NOI18N
        jLabelPion_4_3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabelPion_4_3);
        jLabelPion_4_3.setBounds(480, 660, 16, 16);

        jLabelPion_4_4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/images/pion4.png"))); // NOI18N
        jLabelPion_4_4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabelPion_4_4);
        jLabelPion_4_4.setBounds(480, 680, 16, 16);

        jLabelPion_4_2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/images/pion2.png"))); // NOI18N
        jLabelPion_4_2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabelPion_4_2);
        jLabelPion_4_2.setBounds(460, 680, 16, 16);

        jLabelPion_5_1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/images/pion1.png"))); // NOI18N
        jLabelPion_5_1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabelPion_5_1);
        jLabelPion_5_1.setBounds(400, 660, 16, 16);

        jLabelPion_5_3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/images/pion3.png"))); // NOI18N
        jLabelPion_5_3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabelPion_5_3);
        jLabelPion_5_3.setBounds(420, 660, 16, 16);

        jLabelPion_5_4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/images/pion4.png"))); // NOI18N
        jLabelPion_5_4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabelPion_5_4);
        jLabelPion_5_4.setBounds(420, 680, 16, 16);

        jLabelPion_5_2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/images/pion2.png"))); // NOI18N
        jLabelPion_5_2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabelPion_5_2);
        jLabelPion_5_2.setBounds(400, 680, 16, 16);

        jLabelPion_6_1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/images/pion1.png"))); // NOI18N
        jLabelPion_6_1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabelPion_6_1);
        jLabelPion_6_1.setBounds(340, 660, 16, 16);

        jLabelPion_6_3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/images/pion3.png"))); // NOI18N
        jLabelPion_6_3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabelPion_6_3);
        jLabelPion_6_3.setBounds(360, 660, 16, 16);

        jLabelPion_6_4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/images/pion4.png"))); // NOI18N
        jLabelPion_6_4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabelPion_6_4);
        jLabelPion_6_4.setBounds(360, 680, 16, 16);

        jLabelPion_6_2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/images/pion2.png"))); // NOI18N
        jLabelPion_6_2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabelPion_6_2);
        jLabelPion_6_2.setBounds(340, 680, 16, 16);

        jLabelPion_7_1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/images/pion1.png"))); // NOI18N
        jLabelPion_7_1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabelPion_7_1);
        jLabelPion_7_1.setBounds(290, 660, 16, 16);

        jLabelPion_7_3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/images/pion3.png"))); // NOI18N
        jLabelPion_7_3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabelPion_7_3);
        jLabelPion_7_3.setBounds(310, 660, 16, 16);

        jLabelPion_7_4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/images/pion4.png"))); // NOI18N
        jLabelPion_7_4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabelPion_7_4);
        jLabelPion_7_4.setBounds(310, 680, 16, 16);

        jLabelPion_7_2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/images/pion2.png"))); // NOI18N
        jLabelPion_7_2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabelPion_7_2);
        jLabelPion_7_2.setBounds(290, 680, 16, 16);

        jLabelPion_8_3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/images/pion3.png"))); // NOI18N
        jLabelPion_8_3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabelPion_8_3);
        jLabelPion_8_3.setBounds(250, 660, 16, 16);

        jLabelPion_8_1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/images/pion1.png"))); // NOI18N
        jLabelPion_8_1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabelPion_8_1);
        jLabelPion_8_1.setBounds(230, 660, 16, 16);

        jLabelPion_8_2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/images/pion2.png"))); // NOI18N
        jLabelPion_8_2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabelPion_8_2);
        jLabelPion_8_2.setBounds(230, 680, 16, 16);

        jLabelPion_8_4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/images/pion4.png"))); // NOI18N
        jLabelPion_8_4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabelPion_8_4);
        jLabelPion_8_4.setBounds(250, 680, 16, 16);

        jLabelPion_9_3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/images/pion3.png"))); // NOI18N
        jLabelPion_9_3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabelPion_9_3);
        jLabelPion_9_3.setBounds(190, 660, 16, 16);

        jLabelPion_9_4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/images/pion4.png"))); // NOI18N
        jLabelPion_9_4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabelPion_9_4);
        jLabelPion_9_4.setBounds(190, 680, 16, 16);

        jLabelPion_9_2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/images/pion2.png"))); // NOI18N
        jLabelPion_9_2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabelPion_9_2);
        jLabelPion_9_2.setBounds(170, 680, 16, 16);

        jLabelPion_9_1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/images/pion1.png"))); // NOI18N
        jLabelPion_9_1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabelPion_9_1);
        jLabelPion_9_1.setBounds(170, 660, 16, 16);

        jLabelPion_10_3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/images/pion3.png"))); // NOI18N
        jLabelPion_10_3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabelPion_10_3);
        jLabelPion_10_3.setBounds(130, 660, 16, 16);

        jLabelPion_10_4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/images/pion4.png"))); // NOI18N
        jLabelPion_10_4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabelPion_10_4);
        jLabelPion_10_4.setBounds(130, 680, 16, 16);

        jLabelPion_10_2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/images/pion2.png"))); // NOI18N
        jLabelPion_10_2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabelPion_10_2);
        jLabelPion_10_2.setBounds(110, 680, 16, 16);

        jLabelPion_10_1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/images/pion1.png"))); // NOI18N
        jLabelPion_10_1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabelPion_10_1);
        jLabelPion_10_1.setBounds(110, 660, 16, 16);

        jLabelPion_11_3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/images/pion3.png"))); // NOI18N
        jLabelPion_11_3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabelPion_11_3);
        jLabelPion_11_3.setBounds(60, 660, 16, 16);

        jLabelPion_11_1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/images/pion1.png"))); // NOI18N
        jLabelPion_11_1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabelPion_11_1);
        jLabelPion_11_1.setBounds(40, 660, 16, 16);

        jLabelPion_11_2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/images/pion2.png"))); // NOI18N
        jLabelPion_11_2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabelPion_11_2);
        jLabelPion_11_2.setBounds(40, 680, 16, 16);

        jLabelPion_11_4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/images/pion4.png"))); // NOI18N
        jLabelPion_11_4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabelPion_11_4);
        jLabelPion_11_4.setBounds(60, 680, 16, 16);

        jLabelPion_12_3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/images/pion3.png"))); // NOI18N
        jLabelPion_12_3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabelPion_12_3);
        jLabelPion_12_3.setBounds(40, 560, 16, 16);

        jLabelPion_12_4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/images/pion4.png"))); // NOI18N
        jLabelPion_12_4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabelPion_12_4);
        jLabelPion_12_4.setBounds(40, 580, 16, 16);

        jLabelPion_12_2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/images/pion2.png"))); // NOI18N
        jLabelPion_12_2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabelPion_12_2);
        jLabelPion_12_2.setBounds(20, 580, 16, 16);

        jLabelPion_12_1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/images/pion1.png"))); // NOI18N
        jLabelPion_12_1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabelPion_12_1);
        jLabelPion_12_1.setBounds(20, 560, 16, 16);

        jLabelPion_13_2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/images/pion2.png"))); // NOI18N
        jLabelPion_13_2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabelPion_13_2);
        jLabelPion_13_2.setBounds(20, 520, 16, 16);

        jLabelPion_13_4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/images/pion4.png"))); // NOI18N
        jLabelPion_13_4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabelPion_13_4);
        jLabelPion_13_4.setBounds(40, 520, 16, 16);

        jLabelPion_13_3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/images/pion3.png"))); // NOI18N
        jLabelPion_13_3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabelPion_13_3);
        jLabelPion_13_3.setBounds(40, 500, 16, 16);

        jLabelPion_13_1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/images/pion1.png"))); // NOI18N
        jLabelPion_13_1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabelPion_13_1);
        jLabelPion_13_1.setBounds(20, 500, 16, 16);

        jLabelPion_14_2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/images/pion2.png"))); // NOI18N
        jLabelPion_14_2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabelPion_14_2);
        jLabelPion_14_2.setBounds(20, 470, 16, 16);

        jLabelPion_14_4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/images/pion4.png"))); // NOI18N
        jLabelPion_14_4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabelPion_14_4);
        jLabelPion_14_4.setBounds(40, 470, 16, 16);

        jLabelPion_14_3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/images/pion3.png"))); // NOI18N
        jLabelPion_14_3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabelPion_14_3);
        jLabelPion_14_3.setBounds(40, 450, 16, 16);

        jLabelPion_14_1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/images/pion1.png"))); // NOI18N
        jLabelPion_14_1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabelPion_14_1);
        jLabelPion_14_1.setBounds(20, 450, 16, 16);

        jLabelPion_15_2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/images/pion2.png"))); // NOI18N
        jLabelPion_15_2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabelPion_15_2);
        jLabelPion_15_2.setBounds(20, 410, 16, 16);

        jLabelPion_15_4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/images/pion4.png"))); // NOI18N
        jLabelPion_15_4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabelPion_15_4);
        jLabelPion_15_4.setBounds(40, 410, 16, 16);

        jLabelPion_15_3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/images/pion3.png"))); // NOI18N
        jLabelPion_15_3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabelPion_15_3);
        jLabelPion_15_3.setBounds(40, 390, 16, 16);

        jLabelPion_15_1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/images/pion1.png"))); // NOI18N
        jLabelPion_15_1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabelPion_15_1);
        jLabelPion_15_1.setBounds(20, 390, 16, 16);

        jLabelPion_16_4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/images/pion4.png"))); // NOI18N
        jLabelPion_16_4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabelPion_16_4);
        jLabelPion_16_4.setBounds(40, 360, 16, 16);

        jLabelPion_16_2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/images/pion2.png"))); // NOI18N
        jLabelPion_16_2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabelPion_16_2);
        jLabelPion_16_2.setBounds(20, 360, 16, 16);

        jLabelPion_16_1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/images/pion1.png"))); // NOI18N
        jLabelPion_16_1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabelPion_16_1);
        jLabelPion_16_1.setBounds(20, 340, 16, 16);

        jLabelPion_16_3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/images/pion3.png"))); // NOI18N
        jLabelPion_16_3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabelPion_16_3);
        jLabelPion_16_3.setBounds(40, 340, 16, 16);

        jLabelPion_17_4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/images/pion4.png"))); // NOI18N
        jLabelPion_17_4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabelPion_17_4);
        jLabelPion_17_4.setBounds(40, 300, 16, 16);

        jLabelPion_17_3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/images/pion3.png"))); // NOI18N
        jLabelPion_17_3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabelPion_17_3);
        jLabelPion_17_3.setBounds(40, 280, 16, 16);

        jLabelPion_17_1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/images/pion1.png"))); // NOI18N
        jLabelPion_17_1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabelPion_17_1);
        jLabelPion_17_1.setBounds(20, 280, 16, 16);

        jLabelPion_17_2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/images/pion2.png"))); // NOI18N
        jLabelPion_17_2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabelPion_17_2);
        jLabelPion_17_2.setBounds(20, 300, 16, 16);

        jLabelPion_18_1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/images/pion1.png"))); // NOI18N
        jLabelPion_18_1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabelPion_18_1);
        jLabelPion_18_1.setBounds(20, 230, 16, 16);

        jLabelPion_18_3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/images/pion3.png"))); // NOI18N
        jLabelPion_18_3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabelPion_18_3);
        jLabelPion_18_3.setBounds(40, 230, 16, 16);

        jLabelPion_18_4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/images/pion4.png"))); // NOI18N
        jLabelPion_18_4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabelPion_18_4);
        jLabelPion_18_4.setBounds(40, 250, 16, 16);

        jLabelPion_18_2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/images/pion2.png"))); // NOI18N
        jLabelPion_18_2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabelPion_18_2);
        jLabelPion_18_2.setBounds(20, 250, 16, 16);

        jLabelPion_19_2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/images/pion2.png"))); // NOI18N
        jLabelPion_19_2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabelPion_19_2);
        jLabelPion_19_2.setBounds(20, 190, 16, 16);

        jLabelPion_19_4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/images/pion4.png"))); // NOI18N
        jLabelPion_19_4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabelPion_19_4);
        jLabelPion_19_4.setBounds(40, 190, 16, 16);

        jLabelPion_19_3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/images/pion3.png"))); // NOI18N
        jLabelPion_19_3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabelPion_19_3);
        jLabelPion_19_3.setBounds(40, 170, 16, 16);

        jLabelPion_19_1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/images/pion1.png"))); // NOI18N
        jLabelPion_19_1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabelPion_19_1);
        jLabelPion_19_1.setBounds(20, 170, 16, 16);

        jLabelPion_20_2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/images/pion2.png"))); // NOI18N
        jLabelPion_20_2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabelPion_20_2);
        jLabelPion_20_2.setBounds(20, 140, 16, 16);

        jLabelPion_20_4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/images/pion4.png"))); // NOI18N
        jLabelPion_20_4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabelPion_20_4);
        jLabelPion_20_4.setBounds(40, 140, 16, 16);

        jLabelPion_20_1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/images/pion1.png"))); // NOI18N
        jLabelPion_20_1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabelPion_20_1);
        jLabelPion_20_1.setBounds(20, 120, 16, 16);

        jLabelPion_21_2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/images/pion2.png"))); // NOI18N
        jLabelPion_21_2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabelPion_21_2);
        jLabelPion_21_2.setBounds(30, 60, 16, 16);

        jLabelPion_21_4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/images/pion4.png"))); // NOI18N
        jLabelPion_21_4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabelPion_21_4);
        jLabelPion_21_4.setBounds(50, 60, 16, 16);

        jLabelPion_21_3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/images/pion3.png"))); // NOI18N
        jLabelPion_21_3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabelPion_21_3);
        jLabelPion_21_3.setBounds(50, 40, 16, 16);

        jLabelPion_21_1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/images/pion1.png"))); // NOI18N
        jLabelPion_21_1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabelPion_21_1);
        jLabelPion_21_1.setBounds(30, 40, 16, 16);

        jLabelPion_22_1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/images/pion1.png"))); // NOI18N
        jLabelPion_22_1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabelPion_22_1);
        jLabelPion_22_1.setBounds(120, 20, 16, 16);

        jLabelPion_22_3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/images/pion3.png"))); // NOI18N
        jLabelPion_22_3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabelPion_22_3);
        jLabelPion_22_3.setBounds(140, 20, 16, 16);

        jLabelPion_22_2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/images/pion2.png"))); // NOI18N
        jLabelPion_22_2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabelPion_22_2);
        jLabelPion_22_2.setBounds(120, 40, 16, 16);

        jLabelPion_22_4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/images/pion4.png"))); // NOI18N
        jLabelPion_22_4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabelPion_22_4);
        jLabelPion_22_4.setBounds(140, 40, 16, 16);

        jLabelPion_23_1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/images/pion1.png"))); // NOI18N
        jLabelPion_23_1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabelPion_23_1);
        jLabelPion_23_1.setBounds(170, 20, 16, 16);

        jLabelPion_23_3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/images/pion3.png"))); // NOI18N
        jLabelPion_23_3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabelPion_23_3);
        jLabelPion_23_3.setBounds(190, 20, 16, 16);

        jLabelPion_23_4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/images/pion4.png"))); // NOI18N
        jLabelPion_23_4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabelPion_23_4);
        jLabelPion_23_4.setBounds(190, 40, 16, 16);

        jLabelPion_23_2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/images/pion2.png"))); // NOI18N
        jLabelPion_23_2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabelPion_23_2);
        jLabelPion_23_2.setBounds(170, 40, 16, 16);

        jLabelPion_24_1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/images/pion1.png"))); // NOI18N
        jLabelPion_24_1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabelPion_24_1);
        jLabelPion_24_1.setBounds(230, 20, 16, 16);

        jLabelPion_24_3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/images/pion3.png"))); // NOI18N
        jLabelPion_24_3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabelPion_24_3);
        jLabelPion_24_3.setBounds(250, 20, 16, 16);

        jLabelPion_24_4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/images/pion4.png"))); // NOI18N
        jLabelPion_24_4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabelPion_24_4);
        jLabelPion_24_4.setBounds(250, 40, 16, 16);

        jLabelPion_24_2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/images/pion2.png"))); // NOI18N
        jLabelPion_24_2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabelPion_24_2);
        jLabelPion_24_2.setBounds(230, 40, 16, 16);

        jLabelPion_25_1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/images/pion1.png"))); // NOI18N
        jLabelPion_25_1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabelPion_25_1);
        jLabelPion_25_1.setBounds(280, 20, 16, 16);

        jLabelPion_25_3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/images/pion3.png"))); // NOI18N
        jLabelPion_25_3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabelPion_25_3);
        jLabelPion_25_3.setBounds(300, 20, 16, 16);

        jLabelPion_25_4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/images/pion4.png"))); // NOI18N
        jLabelPion_25_4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabelPion_25_4);
        jLabelPion_25_4.setBounds(300, 40, 16, 16);

        jLabelPion_25_2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/images/pion2.png"))); // NOI18N
        jLabelPion_25_2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabelPion_25_2);
        jLabelPion_25_2.setBounds(280, 40, 16, 16);

        jLabelPion_26_1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/images/pion1.png"))); // NOI18N
        jLabelPion_26_1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabelPion_26_1);
        jLabelPion_26_1.setBounds(340, 20, 16, 16);

        jLabelPion_26_3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/images/pion3.png"))); // NOI18N
        jLabelPion_26_3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabelPion_26_3);
        jLabelPion_26_3.setBounds(360, 20, 16, 16);

        jLabelPion_26_4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/images/pion4.png"))); // NOI18N
        jLabelPion_26_4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabelPion_26_4);
        jLabelPion_26_4.setBounds(360, 40, 16, 16);

        jLabelPion_26_2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/images/pion2.png"))); // NOI18N
        jLabelPion_26_2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabelPion_26_2);
        jLabelPion_26_2.setBounds(340, 40, 16, 16);

        jLabelPion_27_1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/images/pion1.png"))); // NOI18N
        jLabelPion_27_1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabelPion_27_1);
        jLabelPion_27_1.setBounds(400, 20, 16, 16);

        jLabelPion_27_3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/images/pion3.png"))); // NOI18N
        jLabelPion_27_3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabelPion_27_3);
        jLabelPion_27_3.setBounds(420, 20, 16, 16);

        jLabelPion_27_4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/images/pion4.png"))); // NOI18N
        jLabelPion_27_4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabelPion_27_4);
        jLabelPion_27_4.setBounds(420, 40, 16, 16);

        jLabelPion_27_2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/images/pion2.png"))); // NOI18N
        jLabelPion_27_2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabelPion_27_2);
        jLabelPion_27_2.setBounds(400, 40, 16, 16);

        jLabelPion_28_1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/images/pion1.png"))); // NOI18N
        jLabelPion_28_1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabelPion_28_1);
        jLabelPion_28_1.setBounds(450, 20, 16, 16);

        jLabelPion_28_3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/images/pion3.png"))); // NOI18N
        jLabelPion_28_3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabelPion_28_3);
        jLabelPion_28_3.setBounds(470, 20, 16, 16);

        jLabelPion_28_4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/images/pion4.png"))); // NOI18N
        jLabelPion_28_4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabelPion_28_4);
        jLabelPion_28_4.setBounds(470, 40, 16, 16);

        jLabelPion_28_2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/images/pion2.png"))); // NOI18N
        jLabelPion_28_2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabelPion_28_2);
        jLabelPion_28_2.setBounds(450, 40, 16, 16);

        jLabelPion_29_1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/images/pion1.png"))); // NOI18N
        jLabelPion_29_1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabelPion_29_1);
        jLabelPion_29_1.setBounds(510, 20, 16, 16);

        jLabelPion_29_3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/images/pion3.png"))); // NOI18N
        jLabelPion_29_3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabelPion_29_3);
        jLabelPion_29_3.setBounds(530, 20, 16, 16);

        jLabelPion_29_4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/images/pion4.png"))); // NOI18N
        getContentPane().add(jLabelPion_29_4);
        jLabelPion_29_4.setBounds(530, 40, 16, 16);

        jLabelPion_29_2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/images/pion2.png"))); // NOI18N
        jLabelPion_29_2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabelPion_29_2);
        jLabelPion_29_2.setBounds(510, 40, 16, 16);

        jLabelPion_30_1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/images/pion1.png"))); // NOI18N
        jLabelPion_30_1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabelPion_30_1);
        jLabelPion_30_1.setBounds(570, 20, 16, 16);

        jLabelPion_30_3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/images/pion3.png"))); // NOI18N
        jLabelPion_30_3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabelPion_30_3);
        jLabelPion_30_3.setBounds(590, 20, 16, 16);

        jLabelPion_30_4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/images/pion4.png"))); // NOI18N
        jLabelPion_30_4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabelPion_30_4);
        jLabelPion_30_4.setBounds(590, 40, 16, 16);

        jLabelPion_30_2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/images/pion2.png"))); // NOI18N
        jLabelPion_30_2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabelPion_30_2);
        jLabelPion_30_2.setBounds(570, 40, 16, 16);

        jLabelPion_31_3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/images/pion3.png"))); // NOI18N
        jLabelPion_31_3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabelPion_31_3);
        jLabelPion_31_3.setBounds(670, 30, 16, 16);

        jLabelPion_31_1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/images/pion1.png"))); // NOI18N
        jLabelPion_31_1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabelPion_31_1);
        jLabelPion_31_1.setBounds(650, 30, 16, 16);

        jLabelPion_31_2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/images/pion2.png"))); // NOI18N
        jLabelPion_31_2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabelPion_31_2);
        jLabelPion_31_2.setBounds(650, 50, 16, 16);

        jLabelPion_31_4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/images/pion4.png"))); // NOI18N
        jLabelPion_31_4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabelPion_31_4);
        jLabelPion_31_4.setBounds(670, 50, 16, 16);

        jLabelPion_32_3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/images/pion3.png"))); // NOI18N
        jLabelPion_32_3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabelPion_32_3);
        jLabelPion_32_3.setBounds(680, 110, 16, 16);

        jLabelPion_32_1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/images/pion1.png"))); // NOI18N
        jLabelPion_32_1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabelPion_32_1);
        jLabelPion_32_1.setBounds(660, 110, 16, 16);

        jLabelPion_32_2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/images/pion2.png"))); // NOI18N
        jLabelPion_32_2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabelPion_32_2);
        jLabelPion_32_2.setBounds(660, 130, 16, 16);

        jLabelPion_32_4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/images/pion4.png"))); // NOI18N
        jLabelPion_32_4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabelPion_32_4);
        jLabelPion_32_4.setBounds(680, 130, 16, 16);

        jLabelPion_33_3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/images/pion3.png"))); // NOI18N
        jLabelPion_33_3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabelPion_33_3);
        jLabelPion_33_3.setBounds(680, 160, 16, 16);

        jLabelPion_33_1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/images/pion1.png"))); // NOI18N
        jLabelPion_33_1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabelPion_33_1);
        jLabelPion_33_1.setBounds(660, 160, 16, 16);

        jLabelPion_33_2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/images/pion2.png"))); // NOI18N
        jLabelPion_33_2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabelPion_33_2);
        jLabelPion_33_2.setBounds(660, 180, 16, 16);

        jLabelPion_33_4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/images/pion4.png"))); // NOI18N
        jLabelPion_33_4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabelPion_33_4);
        jLabelPion_33_4.setBounds(680, 180, 16, 16);

        jLabelPion_34_1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/images/pion1.png"))); // NOI18N
        jLabelPion_34_1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabelPion_34_1);
        jLabelPion_34_1.setBounds(660, 220, 16, 16);

        jLabelPion_34_3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/images/pion3.png"))); // NOI18N
        jLabelPion_34_3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabelPion_34_3);
        jLabelPion_34_3.setBounds(680, 220, 16, 16);

        jLabelPion_34_4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/images/pion4.png"))); // NOI18N
        jLabelPion_34_4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabelPion_34_4);
        jLabelPion_34_4.setBounds(680, 240, 16, 16);

        jLabelPion_34_2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/images/pion2.png"))); // NOI18N
        jLabelPion_34_2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabelPion_34_2);
        jLabelPion_34_2.setBounds(660, 240, 16, 16);

        jLabelPion_35_1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/images/pion1.png"))); // NOI18N
        jLabelPion_35_1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabelPion_35_1);
        jLabelPion_35_1.setBounds(660, 280, 16, 16);

        jLabelPion_35_3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/images/pion3.png"))); // NOI18N
        jLabelPion_35_3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabelPion_35_3);
        jLabelPion_35_3.setBounds(680, 280, 16, 16);

        jLabelPion_35_4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/images/pion4.png"))); // NOI18N
        jLabelPion_35_4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabelPion_35_4);
        jLabelPion_35_4.setBounds(680, 300, 16, 16);

        jLabelPion_35_2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/images/pion2.png"))); // NOI18N
        jLabelPion_35_2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabelPion_35_2);
        jLabelPion_35_2.setBounds(660, 300, 16, 16);

        jLabelPion_36_1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/images/pion1.png"))); // NOI18N
        jLabelPion_36_1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabelPion_36_1);
        jLabelPion_36_1.setBounds(660, 330, 16, 16);

        jLabelPion_36_3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/images/pion3.png"))); // NOI18N
        jLabelPion_36_3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabelPion_36_3);
        jLabelPion_36_3.setBounds(680, 330, 16, 16);

        jLabelPion_36_4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/images/pion4.png"))); // NOI18N
        jLabelPion_36_4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabelPion_36_4);
        jLabelPion_36_4.setBounds(680, 350, 16, 16);

        jLabelPion_36_2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/images/pion2.png"))); // NOI18N
        jLabelPion_36_2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabelPion_36_2);
        jLabelPion_36_2.setBounds(660, 350, 16, 16);

        jLabelPion_37_1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/images/pion1.png"))); // NOI18N
        jLabelPion_37_1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabelPion_37_1);
        jLabelPion_37_1.setBounds(660, 390, 16, 16);

        jLabelPion_37_3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/images/pion3.png"))); // NOI18N
        jLabelPion_37_3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabelPion_37_3);
        jLabelPion_37_3.setBounds(680, 390, 16, 16);

        jLabelPion_37_4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/images/pion4.png"))); // NOI18N
        jLabelPion_37_4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabelPion_37_4);
        jLabelPion_37_4.setBounds(680, 410, 16, 16);

        jLabelPion_37_2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/images/pion2.png"))); // NOI18N
        jLabelPion_37_2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabelPion_37_2);
        jLabelPion_37_2.setBounds(660, 410, 16, 16);

        jLabelPion_38_1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/images/pion1.png"))); // NOI18N
        jLabelPion_38_1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabelPion_38_1);
        jLabelPion_38_1.setBounds(660, 440, 16, 16);

        jLabelPion_38_3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/images/pion3.png"))); // NOI18N
        jLabelPion_38_3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabelPion_38_3);
        jLabelPion_38_3.setBounds(680, 440, 16, 16);

        jLabelPion_38_4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/images/pion4.png"))); // NOI18N
        jLabelPion_38_4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabelPion_38_4);
        jLabelPion_38_4.setBounds(680, 460, 16, 16);

        jLabelPion_38_2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/images/pion2.png"))); // NOI18N
        jLabelPion_38_2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabelPion_38_2);
        jLabelPion_38_2.setBounds(660, 460, 16, 16);

        jLabelPion_39_1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/images/pion1.png"))); // NOI18N
        jLabelPion_39_1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabelPion_39_1);
        jLabelPion_39_1.setBounds(660, 500, 16, 16);

        jLabelPion_39_3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/images/pion3.png"))); // NOI18N
        jLabelPion_39_3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabelPion_39_3);
        jLabelPion_39_3.setBounds(680, 500, 16, 16);

        jLabelPion_39_4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/images/pion4.png"))); // NOI18N
        jLabelPion_39_4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabelPion_39_4);
        jLabelPion_39_4.setBounds(680, 520, 16, 16);

        jLabelPion_39_2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/images/pion2.png"))); // NOI18N
        jLabelPion_39_2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabelPion_39_2);
        jLabelPion_39_2.setBounds(660, 520, 16, 16);

        jLabelPion_40_1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/images/pion1.png"))); // NOI18N
        jLabelPion_40_1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabelPion_40_1);
        jLabelPion_40_1.setBounds(660, 560, 16, 16);

        jLabelPion_40_3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/images/pion3.png"))); // NOI18N
        jLabelPion_40_3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabelPion_40_3);
        jLabelPion_40_3.setBounds(680, 560, 16, 16);

        jLabelPion_40_4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/images/pion4.png"))); // NOI18N
        jLabelPion_40_4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabelPion_40_4);
        jLabelPion_40_4.setBounds(680, 580, 16, 16);

        jLabelPion_40_2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/images/pion2.png"))); // NOI18N
        jLabelPion_40_2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabelPion_40_2);
        jLabelPion_40_2.setBounds(660, 580, 16, 16);

        jLabelPion_37_5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/images/pion1.png"))); // NOI18N
        jLabelPion_37_5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabelPion_37_5);
        jLabelPion_37_5.setBounds(660, 390, 16, 16);

        jLabelPion_37_6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/images/pion3.png"))); // NOI18N
        jLabelPion_37_6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabelPion_37_6);
        jLabelPion_37_6.setBounds(680, 390, 16, 16);

        jLabelPion_37_7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/images/pion4.png"))); // NOI18N
        jLabelPion_37_7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabelPion_37_7);
        jLabelPion_37_7.setBounds(680, 410, 16, 16);

        jLabelPion_37_8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/images/pion2.png"))); // NOI18N
        jLabelPion_37_8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabelPion_37_8);
        jLabelPion_37_8.setBounds(660, 410, 16, 16);

        jLabelPion_38_5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/images/pion1.png"))); // NOI18N
        jLabelPion_38_5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabelPion_38_5);
        jLabelPion_38_5.setBounds(660, 440, 16, 16);

        jLabelPion_38_6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/images/pion3.png"))); // NOI18N
        jLabelPion_38_6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabelPion_38_6);
        jLabelPion_38_6.setBounds(680, 440, 16, 16);

        jLabelPion_38_7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/images/pion4.png"))); // NOI18N
        jLabelPion_38_7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabelPion_38_7);
        jLabelPion_38_7.setBounds(680, 460, 16, 16);

        jLabelPion_38_8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/images/pion2.png"))); // NOI18N
        jLabelPion_38_8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabelPion_38_8);
        jLabelPion_38_8.setBounds(660, 460, 16, 16);

        jLabelPion_39_5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/images/pion1.png"))); // NOI18N
        jLabelPion_39_5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabelPion_39_5);
        jLabelPion_39_5.setBounds(660, 500, 16, 16);

        jLabelPion_39_6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/images/pion3.png"))); // NOI18N
        jLabelPion_39_6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabelPion_39_6);
        jLabelPion_39_6.setBounds(680, 500, 16, 16);

        jLabelPion_39_7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/images/pion4.png"))); // NOI18N
        jLabelPion_39_7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabelPion_39_7);
        jLabelPion_39_7.setBounds(680, 520, 16, 16);

        jLabelPion_39_8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/images/pion2.png"))); // NOI18N
        jLabelPion_39_8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabelPion_39_8);
        jLabelPion_39_8.setBounds(660, 520, 16, 16);

        jLabelPion_40_5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/images/pion1.png"))); // NOI18N
        jLabelPion_40_5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabelPion_40_5);
        jLabelPion_40_5.setBounds(660, 560, 16, 16);

        jLabelPion_40_6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/images/pion3.png"))); // NOI18N
        jLabelPion_40_6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabelPion_40_6);
        jLabelPion_40_6.setBounds(680, 560, 16, 16);

        jLabelPion_40_7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/images/pion4.png"))); // NOI18N
        jLabelPion_40_7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabelPion_40_7);
        jLabelPion_40_7.setBounds(680, 580, 16, 16);

        jLabelPion_40_8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/images/pion2.png"))); // NOI18N
        jLabelPion_40_8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabelPion_40_8);
        jLabelPion_40_8.setBounds(660, 580, 16, 16);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/images/plateau_monopoly_1.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 0, 710, 710);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/images/1.jpg"))); // NOI18N
        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(751, 306, 20, 20);
        jLabel3.getAccessibleContext().setAccessibleName(bundle.getString("i")); // NOI18N

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/images/1.jpg"))); // NOI18N
        jLabel5.setText("jLabel3");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(778, 306, 20, 20);
        jLabel5.getAccessibleContext().setAccessibleName(bundle.getString("i")); // NOI18N

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/images/2.jpg"))); // NOI18N
        jLabel6.setText("jLabel3");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(750, 334, 20, 20);
        jLabel6.getAccessibleContext().setAccessibleName(bundle.getString("i")); // NOI18N

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/images/2.jpg"))); // NOI18N
        jLabel7.setText("jLabel3");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(778, 334, 20, 20);
        jLabel7.getAccessibleContext().setAccessibleName(bundle.getString("i")); // NOI18N

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/images/2.jpg"))); // NOI18N
        jLabel8.setText("jLabel3");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(807, 335, 20, 20);
        jLabel8.getAccessibleContext().setAccessibleName(bundle.getString("i")); // NOI18N

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/images/3.jpg"))); // NOI18N
        jLabel9.setText("jLabel3");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(750, 364, 20, 20);
        jLabel9.getAccessibleContext().setAccessibleName(bundle.getString("i")); // NOI18N

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/images/3.jpg"))); // NOI18N
        jLabel10.setText("jLabel3");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(778, 364, 20, 20);
        jLabel10.getAccessibleContext().setAccessibleName(bundle.getString("i")); // NOI18N

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/images/3.jpg"))); // NOI18N
        jLabel11.setText("jLabel3");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(806, 365, 20, 20);
        jLabel11.getAccessibleContext().setAccessibleName(bundle.getString("i")); // NOI18N

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/images/4.jpg"))); // NOI18N
        jLabel12.setText("jLabel3");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(750, 396, 20, 20);
        jLabel12.getAccessibleContext().setAccessibleName(bundle.getString("i")); // NOI18N

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/images/4.jpg"))); // NOI18N
        jLabel13.setText("jLabel3");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(778, 396, 20, 20);
        jLabel13.getAccessibleContext().setAccessibleName(bundle.getString("i")); // NOI18N

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/images/4.jpg"))); // NOI18N
        jLabel14.setText("jLabel3");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(806, 396, 20, 20);
        jLabel14.getAccessibleContext().setAccessibleName(bundle.getString("i")); // NOI18N

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/images/5.jpg"))); // NOI18N
        jLabel15.setText("jLabel3");
        getContentPane().add(jLabel15);
        jLabel15.setBounds(750, 426, 20, 20);
        jLabel15.getAccessibleContext().setAccessibleName(bundle.getString("i")); // NOI18N

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/images/5.jpg"))); // NOI18N
        jLabel16.setText("jLabel3");
        getContentPane().add(jLabel16);
        jLabel16.setBounds(778, 426, 20, 20);
        jLabel16.getAccessibleContext().setAccessibleName(bundle.getString("i")); // NOI18N

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/images/5.jpg"))); // NOI18N
        jLabel17.setText("jLabel3");
        getContentPane().add(jLabel17);
        jLabel17.setBounds(806, 426, 20, 20);
        jLabel17.getAccessibleContext().setAccessibleName(bundle.getString("i")); // NOI18N

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/images/6.jpg"))); // NOI18N
        jLabel18.setText("jLabel3");
        getContentPane().add(jLabel18);
        jLabel18.setBounds(834, 306, 20, 20);
        jLabel18.getAccessibleContext().setAccessibleName(bundle.getString("i")); // NOI18N

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/images/6.jpg"))); // NOI18N
        jLabel19.setText("jLabel3");
        getContentPane().add(jLabel19);
        jLabel19.setBounds(860, 306, 20, 20);
        jLabel19.getAccessibleContext().setAccessibleName(bundle.getString("i")); // NOI18N

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/images/6.jpg"))); // NOI18N
        jLabel20.setText("jLabel3");
        getContentPane().add(jLabel20);
        jLabel20.setBounds(887, 306, 20, 20);
        jLabel20.getAccessibleContext().setAccessibleName(bundle.getString("i")); // NOI18N

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/images/7.jpg"))); // NOI18N
        jLabel21.setText("jLabel3");
        getContentPane().add(jLabel21);
        jLabel21.setBounds(834, 335, 20, 20);
        jLabel21.getAccessibleContext().setAccessibleName(bundle.getString("i")); // NOI18N

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/images/7.jpg"))); // NOI18N
        jLabel22.setText("jLabel3");
        getContentPane().add(jLabel22);
        jLabel22.setBounds(860, 334, 20, 20);
        jLabel22.getAccessibleContext().setAccessibleName(bundle.getString("i")); // NOI18N

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/images/7.jpg"))); // NOI18N
        jLabel23.setText("jLabel3");
        getContentPane().add(jLabel23);
        jLabel23.setBounds(887, 334, 20, 20);
        jLabel23.getAccessibleContext().setAccessibleName(bundle.getString("i")); // NOI18N

        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/images/8.jpg"))); // NOI18N
        jLabel24.setText("jLabel3");
        getContentPane().add(jLabel24);
        jLabel24.setBounds(834, 366, 20, 20);
        jLabel24.getAccessibleContext().setAccessibleName(bundle.getString("i")); // NOI18N

        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/images/8.jpg"))); // NOI18N
        jLabel25.setText("jLabel3");
        getContentPane().add(jLabel25);
        jLabel25.setBounds(860, 366, 20, 20);
        jLabel25.getAccessibleContext().setAccessibleName(bundle.getString("i")); // NOI18N

        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/images/9.jpg"))); // NOI18N
        jLabel26.setText("jLabel3");
        getContentPane().add(jLabel26);
        jLabel26.setBounds(834, 395, 20, 20);
        jLabel26.getAccessibleContext().setAccessibleName(bundle.getString("i")); // NOI18N

        jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/images/9.jpg"))); // NOI18N
        jLabel27.setText("jLabel3");
        getContentPane().add(jLabel27);
        jLabel27.setBounds(860, 394, 20, 20);
        jLabel27.getAccessibleContext().setAccessibleName(bundle.getString("i")); // NOI18N

        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/images/10.jpg"))); // NOI18N
        jLabel28.setText("jLabel3");
        getContentPane().add(jLabel28);
        jLabel28.setBounds(834, 426, 20, 20);
        jLabel28.getAccessibleContext().setAccessibleName(bundle.getString("i")); // NOI18N

        jLabel30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/images/10.jpg"))); // NOI18N
        jLabel30.setText("jLabel3");
        getContentPane().add(jLabel30);
        jLabel30.setBounds(860, 426, 20, 20);
        jLabel30.getAccessibleContext().setAccessibleName(bundle.getString("i")); // NOI18N

        jLabel31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/images/10.jpg"))); // NOI18N
        jLabel31.setText("jLabel3");
        getContentPane().add(jLabel31);
        jLabel31.setBounds(887, 426, 20, 20);
        jLabel31.getAccessibleContext().setAccessibleName(bundle.getString("i")); // NOI18N

        jLabel32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/images/10.jpg"))); // NOI18N
        jLabel32.setText("jLabel3");
        getContentPane().add(jLabel32);
        jLabel32.setBounds(914, 426, 20, 20);
        jLabel32.getAccessibleContext().setAccessibleName(bundle.getString("i")); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/images/cartes.png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(740, 290, 200, 170);

        joueur_courant.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        joueur_courant.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(joueur_courant);
        joueur_courant.setBounds(770, 40, 160, 20);

        jLabelDe1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/images/de_1.png"))); // NOI18N
        getContentPane().add(jLabelDe1);
        jLabelDe1.setBounds(770, 80, 70, 60);

        jLabelDe2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/images/de_6.png"))); // NOI18N
        getContentPane().add(jLabelDe2);
        jLabelDe2.setBounds(860, 80, 70, 60);
        getContentPane().add(jLabel4);
        jLabel4.setBounds(800, 80, 50, 60);

        jButton2.setText("Proposer echange");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(780, 240, 119, 23);

        jButton1.setText("Lancer");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(800, 160, 90, 23);
        getContentPane().add(jSeparator2);
        jSeparator2.setBounds(760, 210, 0, 2);

        nom_joueur1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        nom_joueur1.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(nom_joueur1);
        nom_joueur1.setBounds(1150, 30, 100, 30);

        nom_joueur2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        nom_joueur2.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(nom_joueur2);
        nom_joueur2.setBounds(1150, 160, 100, 30);

        nom_joueur3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        nom_joueur3.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(nom_joueur3);
        nom_joueur3.setBounds(1150, 280, 100, 30);

        nom_joueur4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        nom_joueur4.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(nom_joueur4);
        nom_joueur4.setBounds(1140, 400, 100, 30);

        solde_joueur_1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        solde_joueur_1.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(solde_joueur_1);
        solde_joueur_1.setBounds(1260, 80, 80, 30);

        solde_joueur_2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        solde_joueur_2.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(solde_joueur_2);
        solde_joueur_2.setBounds(1250, 204, 80, 30);

        solde_joueur_3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        solde_joueur_3.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(solde_joueur_3);
        solde_joueur_3.setBounds(1254, 324, 80, 30);

        solde_joueur_4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        solde_joueur_4.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(solde_joueur_4);
        solde_joueur_4.setBounds(1250, 450, 80, 30);

        plateau_3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/images/plateau_4.jpg"))); // NOI18N
        getContentPane().add(plateau_3);
        plateau_3.setBounds(0, 0, 1380, 720);

        plateau_1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/images/plateau_2.jpg"))); // NOI18N
        getContentPane().add(plateau_1);
        plateau_1.setBounds(10, 0, 1380, 720);

        plateau_2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/images/plateau_3.jpg"))); // NOI18N
        getContentPane().add(plateau_2);
        plateau_2.setBounds(0, 0, 1380, 720);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        this.setExtendedState(Partie_Monopoly.MAXIMIZED_BOTH);
        this.setLocationRelativeTo(null);
        this.setTitle("Monopoly-Partie");

        RoleCourant = 0;
        joueur_courant.setText(choix_joueurs.joueurs.get(RoleCourant).getNom());

        this.rendreAllInvisible();
        Partie_Monopoly.rendreProprietairesInvisible();

        if ((choix_joueurs.joueurs).size() == 2) {
            plateau_1.setVisible(true);
            plateau_2.setVisible(false);
            plateau_3.setVisible(false);

            nom_joueur1.setText(choix_joueurs.joueurs.get(0).getNom());
            solde_joueur_1.setText("" + choix_joueurs.joueurs.get(0).getSolde());
            nom_joueur1.setVisible(true);
            solde_joueur_1.setVisible(true);

            nom_joueur2.setText(choix_joueurs.joueurs.get(1).getNom());
            solde_joueur_2.setText("" + choix_joueurs.joueurs.get(1).getSolde());
            nom_joueur2.setVisible(true);
            solde_joueur_2.setVisible(true);

            jLabelPion_1_1.setVisible(false);
            jLabelPion_1_2.setVisible(false);
            jLabelPion_1_3.setVisible(false);
            jLabelPion_1_4.setVisible(false);

            if (choix_joueurs.joueurs.get(0).getIcone() == 1) {
                jLabelPion_1_1.setVisible(true);
            }
            if (choix_joueurs.joueurs.get(0).getIcone() == 2) {
                jLabelPion_1_2.setVisible(true);
            }
            if (choix_joueurs.joueurs.get(0).getIcone() == 3) {
                jLabelPion_1_3.setVisible(true);
            }
            if (choix_joueurs.joueurs.get(0).getIcone() == 4) {
                jLabelPion_1_4.setVisible(true);
            }

            if (choix_joueurs.joueurs.get(1).getIcone() == 1) {
                jLabelPion_1_1.setVisible(true);
            }
            if (choix_joueurs.joueurs.get(1).getIcone() == 2) {
                jLabelPion_1_2.setVisible(true);
            }
            if (choix_joueurs.joueurs.get(1).getIcone() == 3) {
                jLabelPion_1_3.setVisible(true);
            }
            if (choix_joueurs.joueurs.get(1).getIcone() == 4) {
                jLabelPion_1_4.setVisible(true);
            }

        }

        if ((choix_joueurs.joueurs).size() == 3) {
            plateau_1.setVisible(false);
            plateau_2.setVisible(true);
            plateau_3.setVisible(false);

            nom_joueur1.setText(choix_joueurs.joueurs.get(0).getNom());
            solde_joueur_1.setText("" + choix_joueurs.joueurs.get(0).getSolde());
            nom_joueur1.setVisible(true);
            solde_joueur_1.setVisible(true);

            nom_joueur2.setText(choix_joueurs.joueurs.get(1).getNom());
            solde_joueur_2.setText("" + choix_joueurs.joueurs.get(1).getSolde());
            nom_joueur2.setVisible(true);
            solde_joueur_2.setVisible(true);

            nom_joueur3.setText(choix_joueurs.joueurs.get(2).getNom());
            solde_joueur_3.setText("" + choix_joueurs.joueurs.get(2).getSolde());
            nom_joueur3.setVisible(true);
            solde_joueur_3.setVisible(true);

            jLabelPion_1_1.setVisible(false);
            jLabelPion_1_2.setVisible(false);
            jLabelPion_1_3.setVisible(false);
            jLabelPion_1_4.setVisible(false);

            if (choix_joueurs.joueurs.get(0).getIcone() == 1) {
                jLabelPion_1_1.setVisible(true);
            }
            if (choix_joueurs.joueurs.get(0).getIcone() == 2) {
                jLabelPion_1_2.setVisible(true);
            }
            if (choix_joueurs.joueurs.get(0).getIcone() == 3) {
                jLabelPion_1_3.setVisible(true);
            }
            if (choix_joueurs.joueurs.get(0).getIcone() == 4) {
                jLabelPion_1_4.setVisible(true);
            }

            if (choix_joueurs.joueurs.get(1).getIcone() == 1) {
                jLabelPion_1_1.setVisible(true);
            }
            if (choix_joueurs.joueurs.get(1).getIcone() == 2) {
                jLabelPion_1_2.setVisible(true);
            }
            if (choix_joueurs.joueurs.get(1).getIcone() == 3) {
                jLabelPion_1_3.setVisible(true);
            }
            if (choix_joueurs.joueurs.get(1).getIcone() == 4) {
                jLabelPion_1_4.setVisible(true);
            }

            if (choix_joueurs.joueurs.get(2).getIcone() == 1) {
                jLabelPion_1_1.setVisible(true);
            }
            if (choix_joueurs.joueurs.get(2).getIcone() == 2) {
                jLabelPion_1_2.setVisible(true);
            }
            if (choix_joueurs.joueurs.get(2).getIcone() == 3) {
                jLabelPion_1_3.setVisible(true);
            }
            if (choix_joueurs.joueurs.get(2).getIcone() == 4) {
                jLabelPion_1_4.setVisible(true);
            }

        }

        if ((choix_joueurs.joueurs).size() == 4) {
            plateau_1.setVisible(false);
            plateau_2.setVisible(false);
            plateau_3.setVisible(true);

            nom_joueur1.setText(choix_joueurs.joueurs.get(0).getNom());
            solde_joueur_1.setText("" + choix_joueurs.joueurs.get(0).getSolde());
            nom_joueur1.setVisible(true);
            solde_joueur_1.setVisible(true);

            nom_joueur2.setText(choix_joueurs.joueurs.get(1).getNom());
            solde_joueur_2.setText("" + choix_joueurs.joueurs.get(1).getSolde());
            nom_joueur2.setVisible(true);
            solde_joueur_2.setVisible(true);

            nom_joueur3.setText(choix_joueurs.joueurs.get(2).getNom());
            solde_joueur_3.setText("" + choix_joueurs.joueurs.get(2).getSolde());
            nom_joueur3.setVisible(true);
            solde_joueur_3.setVisible(true);

            nom_joueur4.setText(choix_joueurs.joueurs.get(3).getNom());
            solde_joueur_4.setText("" + choix_joueurs.joueurs.get(3).getSolde());
            nom_joueur4.setVisible(true);
            solde_joueur_4.setVisible(true);

            jLabelPion_1_1.setVisible(false);
            jLabelPion_1_2.setVisible(false);
            jLabelPion_1_3.setVisible(false);
            jLabelPion_1_4.setVisible(false);

            if (choix_joueurs.joueurs.get(0).getIcone() == 1) {
                jLabelPion_1_1.setVisible(true);
            }
            if (choix_joueurs.joueurs.get(0).getIcone() == 2) {
                jLabelPion_1_2.setVisible(true);
            }
            if (choix_joueurs.joueurs.get(0).getIcone() == 3) {
                jLabelPion_1_3.setVisible(true);
            }
            if (choix_joueurs.joueurs.get(0).getIcone() == 4) {
                jLabelPion_1_4.setVisible(true);
            }

            if (choix_joueurs.joueurs.get(1).getIcone() == 1) {
                jLabelPion_1_1.setVisible(true);
            }
            if (choix_joueurs.joueurs.get(1).getIcone() == 2) {
                jLabelPion_1_2.setVisible(true);
            }
            if (choix_joueurs.joueurs.get(1).getIcone() == 3) {
                jLabelPion_1_3.setVisible(true);
            }
            if (choix_joueurs.joueurs.get(1).getIcone() == 4) {
                jLabelPion_1_4.setVisible(true);
            }

            if (choix_joueurs.joueurs.get(2).getIcone() == 1) {
                jLabelPion_1_1.setVisible(true);
            }
            if (choix_joueurs.joueurs.get(2).getIcone() == 2) {
                jLabelPion_1_2.setVisible(true);
            }
            if (choix_joueurs.joueurs.get(2).getIcone() == 3) {
                jLabelPion_1_3.setVisible(true);
            }
            if (choix_joueurs.joueurs.get(2).getIcone() == 4) {
                jLabelPion_1_4.setVisible(true);
            }

            if (choix_joueurs.joueurs.get(3).getIcone() == 1) {
                jLabelPion_1_1.setVisible(true);
            }
            if (choix_joueurs.joueurs.get(3).getIcone() == 2) {
                jLabelPion_1_2.setVisible(true);
            }
            if (choix_joueurs.joueurs.get(3).getIcone() == 3) {
                jLabelPion_1_3.setVisible(true);
            }
            if (choix_joueurs.joueurs.get(3).getIcone() == 4) {
                jLabelPion_1_4.setVisible(true);
            }
        }

        for (int i = 0; i < choix_joueurs.joueurs.size(); i++) {
            choix_joueurs.joueurs.get(i).setPos(1);
        }


    }//GEN-LAST:event_formWindowOpened
    public void updateDice(final int a, final int b) {

        try {

            // Thread used for animation of dice
            new Thread() {
                @Override
                public void run() {
                    int lower = 1;
                    int higher = 7;
                    int nombreGere1 = 0;
                    int nombreGere2 = 0;

                    for (int i = 0; i < 20; i++) {

                        nombreGere1 = (int) (Math.random() * (higher - lower)) + lower;
                        nombreGere2 = (int) (Math.random() * (higher - lower)) + lower;
                        jLabelDe1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/images/de_" + nombreGere1 + ".png")));
                        jLabelDe2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/images/de_" + nombreGere2 + ".png")));
                        try {
                            Thread.sleep(100);
                        } catch (InterruptedException e) {
                        }
                    }
                    jLabelDe1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/images/de_" + a + ".png")));
                    jLabelDe2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/images/de_" + b + ".png")));
                    int sommeDes = a + b;

                    val_somme_de = sommeDes;

                    choix_joueurs.joueurs.get(RoleCourant).setPos(getNouvellePosition(choix_joueurs.joueurs.get(RoleCourant).getPos(), sommeDes));
                    Sedeplacer(choix_joueurs.joueurs.get(RoleCourant));

                    if (nombreGere1 != nombreGere2) {
                        getRoleJoueurSuivant();
                    }

                }

            }.start();
        } catch (ClassCastException e) {
            System.err.println("Des expected object to method updateDice");
        }
    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int lower = 1;
        int higher = 7;
        int nombreGere1;
        int nombreGere2;
        nombreGere1 = (int) (Math.random() * (higher - lower)) + lower;
        nombreGere2 = (int) (Math.random() * (higher - lower)) + lower;
        updateDice(nombreGere1, nombreGere2);


    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Partie_Monopoly().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    public static javax.swing.JLabel jLabel1;
    protected static javax.swing.JLabel jLabel10;
    protected static javax.swing.JLabel jLabel11;
    protected static javax.swing.JLabel jLabel12;
    protected static javax.swing.JLabel jLabel13;
    protected static javax.swing.JLabel jLabel14;
    protected static javax.swing.JLabel jLabel15;
    protected static javax.swing.JLabel jLabel16;
    protected static javax.swing.JLabel jLabel17;
    protected static javax.swing.JLabel jLabel18;
    protected static javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    protected static javax.swing.JLabel jLabel20;
    protected static javax.swing.JLabel jLabel21;
    protected static javax.swing.JLabel jLabel22;
    protected static javax.swing.JLabel jLabel23;
    protected static javax.swing.JLabel jLabel24;
    protected static javax.swing.JLabel jLabel25;
    protected static javax.swing.JLabel jLabel26;
    protected static javax.swing.JLabel jLabel27;
    protected static javax.swing.JLabel jLabel28;
    protected static javax.swing.JLabel jLabel29;
    protected static javax.swing.JLabel jLabel3;
    protected static javax.swing.JLabel jLabel30;
    protected static javax.swing.JLabel jLabel31;
    protected static javax.swing.JLabel jLabel32;
    public static javax.swing.JLabel jLabel4;
    protected static javax.swing.JLabel jLabel5;
    protected static javax.swing.JLabel jLabel6;
    protected static javax.swing.JLabel jLabel7;
    protected static javax.swing.JLabel jLabel8;
    protected static javax.swing.JLabel jLabel9;
    public static javax.swing.JLabel jLabelDe1;
    public static javax.swing.JLabel jLabelDe2;
    public static javax.swing.JLabel jLabelPion_10_1;
    public static javax.swing.JLabel jLabelPion_10_2;
    public static javax.swing.JLabel jLabelPion_10_3;
    public static javax.swing.JLabel jLabelPion_10_4;
    public static javax.swing.JLabel jLabelPion_11_1;
    public static javax.swing.JLabel jLabelPion_11_2;
    public static javax.swing.JLabel jLabelPion_11_3;
    public static javax.swing.JLabel jLabelPion_11_4;
    public static javax.swing.JLabel jLabelPion_12_1;
    public static javax.swing.JLabel jLabelPion_12_2;
    public static javax.swing.JLabel jLabelPion_12_3;
    public static javax.swing.JLabel jLabelPion_12_4;
    public static javax.swing.JLabel jLabelPion_13_1;
    public static javax.swing.JLabel jLabelPion_13_2;
    public static javax.swing.JLabel jLabelPion_13_3;
    public static javax.swing.JLabel jLabelPion_13_4;
    public static javax.swing.JLabel jLabelPion_14_1;
    public static javax.swing.JLabel jLabelPion_14_2;
    public static javax.swing.JLabel jLabelPion_14_3;
    public static javax.swing.JLabel jLabelPion_14_4;
    public static javax.swing.JLabel jLabelPion_15_1;
    public static javax.swing.JLabel jLabelPion_15_2;
    public static javax.swing.JLabel jLabelPion_15_3;
    public static javax.swing.JLabel jLabelPion_15_4;
    public static javax.swing.JLabel jLabelPion_16_1;
    public static javax.swing.JLabel jLabelPion_16_2;
    public static javax.swing.JLabel jLabelPion_16_3;
    public static javax.swing.JLabel jLabelPion_16_4;
    public static javax.swing.JLabel jLabelPion_17_1;
    public static javax.swing.JLabel jLabelPion_17_2;
    public static javax.swing.JLabel jLabelPion_17_3;
    public static javax.swing.JLabel jLabelPion_17_4;
    public static javax.swing.JLabel jLabelPion_18_1;
    public static javax.swing.JLabel jLabelPion_18_2;
    public static javax.swing.JLabel jLabelPion_18_3;
    public static javax.swing.JLabel jLabelPion_18_4;
    public static javax.swing.JLabel jLabelPion_19_1;
    public static javax.swing.JLabel jLabelPion_19_2;
    public static javax.swing.JLabel jLabelPion_19_3;
    public static javax.swing.JLabel jLabelPion_19_4;
    public static javax.swing.JLabel jLabelPion_1_1;
    public static javax.swing.JLabel jLabelPion_1_2;
    public static javax.swing.JLabel jLabelPion_1_3;
    public static javax.swing.JLabel jLabelPion_1_4;
    public static javax.swing.JLabel jLabelPion_20_1;
    public static javax.swing.JLabel jLabelPion_20_2;
    public static javax.swing.JLabel jLabelPion_20_3;
    public static javax.swing.JLabel jLabelPion_20_4;
    public static javax.swing.JLabel jLabelPion_21_1;
    public static javax.swing.JLabel jLabelPion_21_2;
    public static javax.swing.JLabel jLabelPion_21_3;
    public static javax.swing.JLabel jLabelPion_21_4;
    public static javax.swing.JLabel jLabelPion_22_1;
    public static javax.swing.JLabel jLabelPion_22_2;
    public static javax.swing.JLabel jLabelPion_22_3;
    public static javax.swing.JLabel jLabelPion_22_4;
    public static javax.swing.JLabel jLabelPion_23_1;
    public static javax.swing.JLabel jLabelPion_23_2;
    public static javax.swing.JLabel jLabelPion_23_3;
    public static javax.swing.JLabel jLabelPion_23_4;
    public static javax.swing.JLabel jLabelPion_24_1;
    public static javax.swing.JLabel jLabelPion_24_2;
    public static javax.swing.JLabel jLabelPion_24_3;
    public static javax.swing.JLabel jLabelPion_24_4;
    public static javax.swing.JLabel jLabelPion_25_1;
    public static javax.swing.JLabel jLabelPion_25_2;
    public static javax.swing.JLabel jLabelPion_25_3;
    public static javax.swing.JLabel jLabelPion_25_4;
    public static javax.swing.JLabel jLabelPion_26_1;
    public static javax.swing.JLabel jLabelPion_26_2;
    public static javax.swing.JLabel jLabelPion_26_3;
    public static javax.swing.JLabel jLabelPion_26_4;
    public static javax.swing.JLabel jLabelPion_27_1;
    public static javax.swing.JLabel jLabelPion_27_2;
    public static javax.swing.JLabel jLabelPion_27_3;
    public static javax.swing.JLabel jLabelPion_27_4;
    public static javax.swing.JLabel jLabelPion_28_1;
    public static javax.swing.JLabel jLabelPion_28_2;
    public static javax.swing.JLabel jLabelPion_28_3;
    public static javax.swing.JLabel jLabelPion_28_4;
    public static javax.swing.JLabel jLabelPion_29_1;
    public static javax.swing.JLabel jLabelPion_29_2;
    public static javax.swing.JLabel jLabelPion_29_3;
    public static javax.swing.JLabel jLabelPion_29_4;
    public static javax.swing.JLabel jLabelPion_2_1;
    public static javax.swing.JLabel jLabelPion_2_2;
    public static javax.swing.JLabel jLabelPion_2_3;
    public static javax.swing.JLabel jLabelPion_2_4;
    public static javax.swing.JLabel jLabelPion_30_1;
    public static javax.swing.JLabel jLabelPion_30_2;
    public static javax.swing.JLabel jLabelPion_30_3;
    public static javax.swing.JLabel jLabelPion_30_4;
    public static javax.swing.JLabel jLabelPion_31_1;
    public static javax.swing.JLabel jLabelPion_31_2;
    public static javax.swing.JLabel jLabelPion_31_3;
    public static javax.swing.JLabel jLabelPion_31_4;
    public static javax.swing.JLabel jLabelPion_32_1;
    public static javax.swing.JLabel jLabelPion_32_2;
    public static javax.swing.JLabel jLabelPion_32_3;
    public static javax.swing.JLabel jLabelPion_32_4;
    public static javax.swing.JLabel jLabelPion_33_1;
    public static javax.swing.JLabel jLabelPion_33_2;
    public static javax.swing.JLabel jLabelPion_33_3;
    public static javax.swing.JLabel jLabelPion_33_4;
    public static javax.swing.JLabel jLabelPion_34_1;
    public static javax.swing.JLabel jLabelPion_34_2;
    public static javax.swing.JLabel jLabelPion_34_3;
    public static javax.swing.JLabel jLabelPion_34_4;
    public static javax.swing.JLabel jLabelPion_35_1;
    public static javax.swing.JLabel jLabelPion_35_2;
    public static javax.swing.JLabel jLabelPion_35_3;
    public static javax.swing.JLabel jLabelPion_35_4;
    public static javax.swing.JLabel jLabelPion_36_1;
    public static javax.swing.JLabel jLabelPion_36_2;
    public static javax.swing.JLabel jLabelPion_36_3;
    public static javax.swing.JLabel jLabelPion_36_4;
    public static javax.swing.JLabel jLabelPion_37_1;
    public static javax.swing.JLabel jLabelPion_37_2;
    public static javax.swing.JLabel jLabelPion_37_3;
    public static javax.swing.JLabel jLabelPion_37_4;
    public static javax.swing.JLabel jLabelPion_37_5;
    public static javax.swing.JLabel jLabelPion_37_6;
    public static javax.swing.JLabel jLabelPion_37_7;
    public static javax.swing.JLabel jLabelPion_37_8;
    public static javax.swing.JLabel jLabelPion_38_1;
    public static javax.swing.JLabel jLabelPion_38_2;
    public static javax.swing.JLabel jLabelPion_38_3;
    public static javax.swing.JLabel jLabelPion_38_4;
    public static javax.swing.JLabel jLabelPion_38_5;
    public static javax.swing.JLabel jLabelPion_38_6;
    public static javax.swing.JLabel jLabelPion_38_7;
    public static javax.swing.JLabel jLabelPion_38_8;
    public static javax.swing.JLabel jLabelPion_39_1;
    public static javax.swing.JLabel jLabelPion_39_2;
    public static javax.swing.JLabel jLabelPion_39_3;
    public static javax.swing.JLabel jLabelPion_39_4;
    public static javax.swing.JLabel jLabelPion_39_5;
    public static javax.swing.JLabel jLabelPion_39_6;
    public static javax.swing.JLabel jLabelPion_39_7;
    public static javax.swing.JLabel jLabelPion_39_8;
    public static javax.swing.JLabel jLabelPion_3_1;
    public static javax.swing.JLabel jLabelPion_3_2;
    public static javax.swing.JLabel jLabelPion_3_3;
    public static javax.swing.JLabel jLabelPion_3_4;
    public static javax.swing.JLabel jLabelPion_40_1;
    public static javax.swing.JLabel jLabelPion_40_2;
    public static javax.swing.JLabel jLabelPion_40_3;
    public static javax.swing.JLabel jLabelPion_40_4;
    public static javax.swing.JLabel jLabelPion_40_5;
    public static javax.swing.JLabel jLabelPion_40_6;
    public static javax.swing.JLabel jLabelPion_40_7;
    public static javax.swing.JLabel jLabelPion_40_8;
    public static javax.swing.JLabel jLabelPion_4_1;
    public static javax.swing.JLabel jLabelPion_4_2;
    public static javax.swing.JLabel jLabelPion_4_3;
    public static javax.swing.JLabel jLabelPion_4_4;
    public static javax.swing.JLabel jLabelPion_5_1;
    public static javax.swing.JLabel jLabelPion_5_2;
    public static javax.swing.JLabel jLabelPion_5_3;
    public static javax.swing.JLabel jLabelPion_5_4;
    public static javax.swing.JLabel jLabelPion_6_1;
    public static javax.swing.JLabel jLabelPion_6_2;
    public static javax.swing.JLabel jLabelPion_6_3;
    public static javax.swing.JLabel jLabelPion_6_4;
    public static javax.swing.JLabel jLabelPion_7_1;
    public static javax.swing.JLabel jLabelPion_7_2;
    public static javax.swing.JLabel jLabelPion_7_3;
    public static javax.swing.JLabel jLabelPion_7_4;
    public static javax.swing.JLabel jLabelPion_8_1;
    public static javax.swing.JLabel jLabelPion_8_2;
    public static javax.swing.JLabel jLabelPion_8_3;
    public static javax.swing.JLabel jLabelPion_8_4;
    public static javax.swing.JLabel jLabelPion_9_1;
    public static javax.swing.JLabel jLabelPion_9_2;
    public static javax.swing.JLabel jLabelPion_9_3;
    public static javax.swing.JLabel jLabelPion_9_4;
    public static javax.swing.JSeparator jSeparator2;
    public static javax.swing.JLabel joueur_courant;
    public static javax.swing.JLabel nom_joueur1;
    public static javax.swing.JLabel nom_joueur2;
    public static javax.swing.JLabel nom_joueur3;
    public static javax.swing.JLabel nom_joueur4;
    public static javax.swing.JLabel plateau_1;
    public static javax.swing.JLabel plateau_2;
    public static javax.swing.JLabel plateau_3;
    public static javax.swing.JLabel propr1;
    public static javax.swing.JLabel propr11;
    public static javax.swing.JLabel propr12;
    public static javax.swing.JLabel propr13;
    public static javax.swing.JLabel propr14;
    public static javax.swing.JLabel propr15;
    public static javax.swing.JLabel propr16;
    public static javax.swing.JLabel propr17;
    public static javax.swing.JLabel propr18;
    public static javax.swing.JLabel propr19;
    public static javax.swing.JLabel propr2;
    public static javax.swing.JLabel propr20;
    public static javax.swing.JLabel propr21;
    public static javax.swing.JLabel propr22;
    public static javax.swing.JLabel propr23;
    public static javax.swing.JLabel propr24;
    public static javax.swing.JLabel propr25;
    public static javax.swing.JLabel propr26;
    public static javax.swing.JLabel propr27;
    public static javax.swing.JLabel propr28;
    public static javax.swing.JLabel propr29;
    public static javax.swing.JLabel propr3;
    public static javax.swing.JLabel propr31;
    public static javax.swing.JLabel propr32;
    public static javax.swing.JLabel propr33;
    public static javax.swing.JLabel propr34;
    public static javax.swing.JLabel propr35;
    public static javax.swing.JLabel propr36;
    public static javax.swing.JLabel propr37;
    public static javax.swing.JLabel propr38;
    public static javax.swing.JLabel propr39;
    public static javax.swing.JLabel propr4;
    public static javax.swing.JLabel propr5;
    public static javax.swing.JLabel propr6;
    public static javax.swing.JLabel propr7;
    public static javax.swing.JLabel propr8;
    public static javax.swing.JLabel propr9;
    public static javax.swing.JLabel solde_joueur_1;
    public static javax.swing.JLabel solde_joueur_2;
    public static javax.swing.JLabel solde_joueur_3;
    public static javax.swing.JLabel solde_joueur_4;
    // End of variables declaration//GEN-END:variables
}
