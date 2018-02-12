package DAO;

import java.sql.Connection;
import java.sql.DriverManager;

public class SingletonConnexion {
	
	private static Connection connexion;
	//quand une classe est chargee en memoire ,le premier bloc qui s'excecute c'est le bloc static
	//pour creer un objet une seule fois 
	static {
		
		//charger le pilote jdbc
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			connexion=DriverManager.getConnection("jdbc:mysql://localhost/Spectacles","root","Larbi1991");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	public static Connection getConnection() {
		return connexion;
	}
	
}
