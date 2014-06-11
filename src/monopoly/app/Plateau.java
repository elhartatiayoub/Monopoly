package monopoly.app;

import java.util.ArrayList;


public class Plateau {
	
	public static  ArrayList<Case> plateau=new ArrayList<Case>();
	public static  ArrayList<Carte> carteChance=new ArrayList<Carte>();
	public static  ArrayList<Carte> carteCaisee=new ArrayList<Carte>();
	
	
	
	public ArrayList<Case> getPlateau() {
		return plateau;
	}



	public void setPlateau(ArrayList<Case> plateau) {
		this.plateau = plateau;
	}



	public void instancierPlateau()
	{
                Object object=null;
                plateau.add((Case) object);
                
		plateau.add(new Case(1,"DEPART"));
		plateau.add(new Terrain(2,"BOULEVARD MANSOUR EDDAHBI", 60, 30, 2, 10, 30, 90, 160, 250, 50, 50));
		plateau.add(new Case(3,"CAISSE DE COMMUNITE"));
		plateau.add(new Terrain(4,"AVENUE DES MERINIDES", 60, 30, 4, 20, 60, 180, 320, 450, 50, 50));
		plateau.add(new Taxe(5, "IMPOT SUR LE REVENU", 200));
		plateau.add(new Gare(6, "GARE DE MARRAKECH"));
		plateau.add(new Terrain(7, "BOULEVARD MOULAY YOUSSEF", 100, 50, 6, 30, 90, 270, 400, 550, 50, 50));
		
		plateau.add(new Terrain(9, "AVENUE DES ALMOHADES", 100, 50, 6, 30, 90, 270, 400, 550, 50, 50));
		plateau.add(new Terrain(10, "RUE ALLAL BENABDELLAH", 120, 60, 8, 40, 100, 300, 450, 600, 50, 50));
		plateau.add(new Case(11,"SIMPLE VISITE DE PRISON" ));
		plateau.add(new Terrain(12, "RUE MOKHTAR SOUSSI", 140, 70, 10, 50, 150, 450, 625, 750, 100, 100));
		plateau.add(new ServicePublic(13, "ONE",150));
		plateau.add(new Terrain(14, "BOULEVARD ABDELMOUMEN", 140, 70, 10, 50, 150, 450, 625, 750, 100, 100));
		plateau.add(new Terrain(15, "BOULEVARD YACOUB EL MANSOUR", 160, 80, 12, 60, 180, 500, 700, 900, 100, 100));
		plateau.add(new Gare(16, "GARE DE TANGER"));
		plateau.add(new Terrain(17, "BOULEVARD ABDELKRIM ALKHATTABI", 180, 90, 14, 70, 200, 550, 750, 950, 100, 100));
		plateau.add(new Terrain(19, "BOULEVARD BRAHIM ROUDANI", 180, 90, 14, 70, 200, 550, 750, 950, 100, 100));
		plateau.add(new Terrain(20, "AVENUE DES FORCES ARMEES ROYALES", 200, 100, 16, 80, 220, 600, 800, 1000, 100, 100));
		plateau.add(new Terrain(22, "AVENUE MOHAMED V", 220, 110, 18, 90, 250, 700, 875, 1050, 150, 150));
		plateau.add(new Terrain(24, "BOULEVARD ABDERRAHIM BOUABID", 220, 110, 18, 90, 250, 700, 875, 1050, 150, 150));
		plateau.add(new Terrain(25, "ROND POINT DES SPORTS", 240, 120, 20, 100, 300, 750, 925, 1100, 150, 150));
		plateau.add(new Gare(26, "GARE DE RABAT"));
		plateau.add(new Terrain(27, "BOULEVARD MOHAMED ZERKTOUNI", 260, 130, 22, 110, 330, 800, 975, 1150, 150, 150));
		plateau.add(new Terrain(28, "AVENUE MOHAMED VI", 260, 130, 22, 110, 330, 800, 975, 1150, 150, 150));
		plateau.add(new ServicePublic(29, "ONEP",150));
		plateau.add(new Terrain(30, "BOULEVARD ABDELLATIF BENKADDOUR", 280, 140, 24, 120, 360, 850, 1025, 1200, 150, 150));
		plateau.add(new Case(31, "ALLEZ EN PRISON"));
		plateau.add(new Terrain(32, "AVENUE HASSAN II", 300, 150, 26, 130, 390, 900, 1100, 1275, 200, 200));
		plateau.add(new Terrain(33, "CORNICHE DE CASABLANCA", 300, 150, 26, 130, 390, 900, 1100, 1275, 200, 200));
		plateau.add(new Terrain(35, "AVE DR SIJELMASSI", 320, 160, 28, 150, 450, 1000, 1200, 1400, 200, 200));
		plateau.add(new Gare(36, "GARE DE CASA PORT"));
		plateau.add(new Terrain(38, "BLD MASSIRA AL KHADRA", 350, 175, 35, 175, 500, 1100, 1300, 1500, 200, 200));
		plateau.add(new Taxe(39, "TAXE DE LUXE", 100));
		plateau.add(new Terrain(40, "BOULEVARD D'ANFA", 400, 200, 50, 200, 600, 1400, 1700, 2000, 200, 200));
		
		carteChance.add(new Carte(0, "Votre imeuble et votre pr�t rapportent. vous devez toucher 150 M", 150, -1));
		carteChance.add(new Carte(1, "Avanceez � la rue MOKHTAR SOUSSI ,si vous passez par la case depart,recevez 200 M", -1, 11));
		carteChance.add(new Carte(2, "Amande pour ex�s de vitesse : payer 15 M", -15, -1));
		carteChance.add(new Carte(3, "Allez � la gare de marrakech, si vous passez par la case depart recevez 200 M", -1, 5));
		carteChance.add(new Carte(4, "Rendez-vous au rond point des sports. si vous passez par la case depart;recevez 200 M", -1, 24));
		carteChance.add(new Carte(5, "La banque vous verse un dividende de 50 M", 50, -1));
		carteChance.add(new Carte(6, "Allez jusqu'� la case D�part (Recevez 200 M)", -1, 0));
		carteChance.add(new Carte(7, "Rendez-vous au boulevard d'anfa", -1, 39));
		carteChance.add(new Carte(8, "Vous etes liber� de prison. cette carte peut etre conserv�e jusqu'� ce qu'elle soit utilis�e ou vendue", -1, -1));
		carteChance.add(new Carte(9, "Allez en prison. Avancez tout droit en prison. Ne passez pas par la case depart. Ne recevez pas 200 M", -1, 10));
		carteChance.add(new Carte(10, "Avancez jusqu'� la gare proche. Si elle n'appartient � personne, vous pouvez l'acheter aupr�s de la banque. Si elle appartient deja � un autre joueur, vous devez lui payer deux fois le loyer demand�.", -1, -1));
		carteChance.add(new Carte(11, "Reculez de trois cases.", -1, -1));
		carteCaisee.add(new Carte(12, "Avancez jusqu'� la compagnie de service public la plus proche. Si elle n'appartient � personne, vous pouvez l'acheter aupr�s de la banque. Si elle appartient deja � un autre joueur, lancez les d�s et payez le montant du total de vos d�s multipli� par 10.", -1, -1));
		carteChance.add(new Carte(13, "Vous faites des reparations sur toutes vos propriet�s : Versez 25 M pour chaque maison et 100 M pour chaque Hotel que vous possedez.", -1, -1));
		carteChance.add(new Carte(14, "Vous etes �t� �lu president du conseil d'administration. Versez 50 M � chaque joueur.", -1, -1));
		
		
		carteCaisee.add(new Carte(0, "les impots vous remboursent 20 M", 20, -1));
		carteCaisee.add(new Carte(1, "Frais de scolarit�. Payer 50 M", -50, -1));
		carteCaisee.add(new Carte(2, "Votre assurance vie vous rapporte 100 M", 100, -1));
		carteCaisee.add(new Carte(3, "Avancez jusqu'� la case d�part (Recevez 200 M)", -1, 0));
		carteCaisee.add(new Carte(4, "Votre placement vous rapporte. Recevez 100 M", 100, -1));
		carteChance.add(new Carte(5, "Commission d'expert immobilier. Recevez 25 M", 25, -1));
		carteCaisee.add(new Carte(6, "Vous h�ritez de 100 M", 100, -1));
		carteCaisee.add(new Carte(7, "Vous etes liber� de prison. cette carte peut etre conserv�e jusqu'� ce qu'elle soit utilis�e ou vendue", -1, -1));
		carteChance.add(new Carte(8, "Erreur de la banque en votre faveur. Recevez 200 M", 200, -1));
		carteCaisee.add(new Carte(9, "La vente de votre stock vous rapporte 50 M", 50, -1));
		carteCaisee.add(new Carte(10, "Visite chez le medecin : Payez 50 M", -50, -1));
		carteCaisee.add(new Carte(11, "Allez en prison. Avancez tout droit en prison. Ne passez pas par la case depart. Ne recevez pas 200 M", -1, 10));
		carteCaisee.add(new Carte(12, "Vous avez gagn� le deuxieme prix de beaut�. Recevez 10 M", 10, -1));
		carteCaisee.add(new Carte(13, "Frais d'hospitalisation. Payer 100 M", 100, -1));
		carteCaisee.add(new Carte(14, "c'est votre anniversaire : chaque joueur doit vous donner 10 M", -1, -1));
		carteCaisee.add(new Carte(15, "Vous faites des reparations sur toutes vos propriet�s : Versez 25 M pour chaque maison et 100 M pour chaque Hotel que vous possedez.", -1, -1));
		
		
	}
	
	

}
