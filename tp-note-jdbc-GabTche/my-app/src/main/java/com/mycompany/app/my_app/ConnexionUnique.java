package com.mycompany.app.my_app;

import java.sql.*;

public class ConnexionUnique {
	// Chaine de connexion
	private Connection connexion;
	private static ConnexionUnique instance;
	static final String CONNECT_URL = "jdbc:mysql://mysql-kaamelox.alwaysdata.net:3306/kaamelox_bd";
	static final String LOGIN = "kaamelox";
	static final String PASSWORD = "12345";

	public ConnexionUnique() {

		try {
			System.out.println("Connexion a " + CONNECT_URL);
			connexion = DriverManager.getConnection(CONNECT_URL, LOGIN, PASSWORD);
			System.out.println("Connecte\n");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public Connection getConnection() {
		return connexion;
	}

	public static ConnexionUnique getInstance() {
		if (instance == null)
			instance = new ConnexionUnique();
		return instance;
	}

}
