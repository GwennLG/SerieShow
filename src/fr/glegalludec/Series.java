package fr.glegalludec;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Series {
	private static final String DATABASE_URL = "jdbc:mysql://localhost:3306/SerieShow?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
	private static final String DATABASE_LOGIN = "root";
	private static final String DATABASE_SECRET = "activ";
	

	private static final void utiliserInsert() {
		try {
			Connection connexion = DriverManager.getConnection(DATABASE_URL, DATABASE_LOGIN, DATABASE_SECRET);
			String requette = "INSERT INTO Serie (S_titre,S_realisateur,S_anneeSortie,S_anneeFin) VALUE (?,?, ?,?);";
			PreparedStatement preparateur = connexion.prepareStatement(requette);
			preparateur.setString(1, "Casa de Papel");
			preparateur.setInt(2, 2);
			preparateur.setString(3, "2 mai 2017");
			preparateur.setString(4, null);
			preparateur.execute();
			
			ajouterActeur(1, 3);
			ajouterActeur(1, 4);
			
			ajouterGenre(1, 1);
			ajouterGenre(1, 2);
		
			
			
			preparateur.setString(1, "Sex and the city");
			preparateur.setInt(2, 3);
			preparateur.setString(3, "6 juin 1998");
			preparateur.setString(4, "22 février 2004"); 
			preparateur.execute();
			
			ajouterActeur(2, 5);
			ajouterActeur(2, 6);
			ajouterActeur(2, 7);
			ajouterActeur(2, 8);
			
			ajouterGenre(2, 3);
			
			preparateur.setString(1, "Grey's Anatomy");
			preparateur.setInt(2, 1);
			preparateur.setString(3, "27 mars 2005");
			preparateur.setString(4, null);
			preparateur.execute();

			ajouterActeur(3, 1);
			ajouterActeur(3, 2);
			
			ajouterGenre(3, 4);
			ajouterGenre(3, 5);
			
			preparateur.setString(1, "Desperate Housewives");
			preparateur.setInt(2, 4);
			preparateur.setString(3, "3 octobre 2004");
			preparateur.setString(4, "13 mai 2012");
			preparateur.execute();

			ajouterActeur(4, 9);
			ajouterActeur(4, 10);
			ajouterActeur(4, 11);
			ajouterActeur(4, 12);
			
			ajouterGenre(4, 4);
			
			preparateur.setString(1, "Big Bang Theory");
			preparateur.setInt(2, 5);
			preparateur.setString(3, "27 septembre 2007");
			preparateur.setString(4, null);
			preparateur.execute();
			
			ajouterActeur(5, 13);
			ajouterActeur(5, 14);
			
			ajouterGenre(5, 6);
			
			preparateur.setString(1, "Charmed");
			preparateur.setInt(2, 6);
			preparateur.setString(3, "7 octobre 1998");
			preparateur.setString(4, "21 mai 2006");
			preparateur.execute();
			
			ajouterActeur(6, 15);
			ajouterActeur(6, 16);
			ajouterActeur(6, 17);
			
			ajouterGenre(6, 7);
			ajouterGenre(6, 1);
			
			preparateur.setString(1, "13 reasons why");
			preparateur.setInt(2, 7);
			preparateur.setString(3, "31 mars 2017");
			preparateur.setString(4, null);
			preparateur.execute();
			
			ajouterActeur(7, 18);
			ajouterActeur(7, 19);
			
			ajouterGenre(7, 8);
			
			preparateur.setString(1, "Black Sails");
			preparateur.setInt(2, 8);
			preparateur.setString(3, "25 janvier 2014");
			preparateur.setString(4, "2 avril 2017");
			preparateur.execute();
			
			ajouterActeur(8, 20);
			ajouterActeur(8, 21);
			
			ajouterGenre(8, 9);
			ajouterGenre(8, 10);
			
			preparateur.setString(1, "Lucifer");
			preparateur.setInt(2, 9);
			preparateur.setString(3, "25 janvier 2016");
			preparateur.setString(4, null);
			preparateur.execute();
			
			ajouterActeur(9, 22);
			ajouterActeur(9, 23);
			
			ajouterGenre(9, 7);
			ajouterGenre(9, 11);
			
			preparateur.setString(1, "Gotham");
			preparateur.setInt(2, 10);
			preparateur.setString(3, "22 septembre 2014");
			preparateur.setString(4, null);
			preparateur.execute();
			
			ajouterActeur(10, 24);
			
			ajouterGenre(10, 12);
			ajouterGenre(10, 11);
			
			preparateur.setString(1, "The Last Ship");
			preparateur.setInt(2, 11);
			preparateur.setString(3, "22 juin 2014");
			preparateur.setString(4, "11 novembre 2018");
			preparateur.execute();
			
			ajouterActeur(11, 25);
			ajouterActeur(11, 26);
			
			ajouterGenre(11, 13);
			ajouterGenre(11, 12);
			
			preparateur.setString(1, "Outlander");
			preparateur.setInt(2, 12);
			preparateur.setString(3, "9 août 2014");
			preparateur.setString(4, null);
			preparateur.execute();
			
			ajouterActeur(12, 27);
			ajouterActeur(12, 28);
			
			ajouterGenre(12, 1);
			ajouterGenre(12, 7);
			
			preparateur.setString(1, "The Originals");
			preparateur.setInt(2, 13);
			preparateur.setString(3, "3 octobre 2013");
			preparateur.setString(4, "1 août 2018");
			preparateur.execute();
			
			ajouterActeur(13, 29);
			ajouterActeur(13, 30);
			
			ajouterGenre(13, 7);
			ajouterGenre(13, 14);
			
			preparateur.setString(1, "How to Get Away with Murder");
			preparateur.setInt(2, 1);
			preparateur.setString(3, "25 septembre 2014");
			preparateur.setString(4, null);
			preparateur.execute();
			
			ajouterActeur(14, 31);
			ajouterActeur(14, 32);
			ajouterActeur(14, 33);
			
			ajouterGenre(14, 1);
			ajouterGenre(14, 15);
			
			preparateur.setString(1, "The 100");
			preparateur.setInt(2, 14);
			preparateur.setString(3, "19 mars 2014");
			preparateur.setString(4, null);
			preparateur.execute();
			
			ajouterActeur(15, 34);
			ajouterActeur(15, 35);
			
			ajouterGenre(15, 13);
			ajouterGenre(15, 12);
			
			preparateur.setString(1, "Good Doctor");
			preparateur.setInt(2, 15);
			preparateur.setString(3, "25 septembre 2017");
			preparateur.setString(4, null);
			preparateur.execute();
			
			ajouterActeur(16, 36);
			ajouterActeur(16, 37);
			
			ajouterGenre(16, 5);
			ajouterGenre(16, 1);
			
			preparateur.setString(1, "Game of Thrones");
			preparateur.setInt(2, 16);
			preparateur.setString(3, "17 avril 2011");
			preparateur.setString(4, null);
			preparateur.execute();
			
			ajouterActeur(17, 38);
			ajouterActeur(17, 39);
			
			ajouterGenre(17, 7);
			ajouterGenre(17, 1);
			
			preparateur.setString(1, "DownTon Abey");
			preparateur.setInt(2, 17);
			preparateur.setString(3, "26 septembre 2010");
			preparateur.setString(4, "25 décembre 2015");
			preparateur.execute();
			
			ajouterActeur(18, 40);
			ajouterActeur(18, 41);
			
			ajouterGenre(18, 10);
			
			preparateur.setString(1, "Empire");
			preparateur.setInt(2, 18);
			preparateur.setString(3, "7 janvier 2015");
			preparateur.setString(4, null);
			preparateur.execute();
			
			ajouterActeur(19, 42);
			ajouterActeur(19, 43);
			
			ajouterGenre(19, 1);
			ajouterGenre(19, 16);
			
			preparateur.setString(1, "IZombie");
			preparateur.setInt(2, 19);
			preparateur.setString(3, "17 mars 2015");
			preparateur.setString(4, null);
			preparateur.execute();
			
			ajouterActeur(20, 44);
			ajouterActeur(20, 45);
			
			ajouterGenre(20, 4);
			ajouterGenre(20, 17);
			
			preparateur.close();
			connexion.close();
			 

			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void ajouterGenre(int idSerie, int idGenre) {
		Connection connexion;
		try {
			connexion = DriverManager.getConnection(DATABASE_URL, DATABASE_LOGIN, DATABASE_SECRET);
			String requetteGenre = "INSERT INTO Genrer (Ge_id_serie, Ge_id_genre) VALUE (?,?);";
			PreparedStatement preparateurGenre = connexion.prepareStatement(requetteGenre);
			preparateurGenre.setInt(1, idSerie);
			preparateurGenre.setInt(2, idGenre);
			preparateurGenre.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	
	public static void ajouterActeur(int idSerie, int idActeur) {
		Connection connexion;
		try {
			connexion = DriverManager.getConnection(DATABASE_URL, DATABASE_LOGIN, DATABASE_SECRET);
			String requetteActeur = "INSERT INTO Jouer (J_id_serie, J_id_acteur) VALUE (?,?);";
			PreparedStatement preparateurActeur = connexion.prepareStatement(requetteActeur);
			preparateurActeur.setInt(1, idSerie);
			preparateurActeur.setInt(2, idActeur);
			preparateurActeur.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
}
