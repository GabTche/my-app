package com.mycompany.app.my_app;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class testAsso1 {
	static final String req = "SELECT *" +   
        "FROM PROF P LEFT OUTER JOIN MODULE M ON P.MAT_SPEC=M.CODE";                                     
	public static void main(String[] args) throws SQLException {
	// Objet materialisant la connexion a la base de donnees
	Connection conn = null;
	try {	
		Connection conn1 = ConnexionUnique.getInstance().getConnection();
		// Creation d'une instruction SQL
		Statement stmt = conn1.createStatement();
		// Execution de la requete
		System.out.println("Execution de la requete : " + req + "\n");
		ResultSet rset = stmt.executeQuery(req);
		// Creation de la liste
		ArrayList<Prof> listPr = new ArrayList<Prof>();
		// Remplissage de la liste
		while (rset.next()) {
			listPr.add(new Prof(rset.getInt("NUM_PROF"), rset.getString("NOM_PROF"), rset.getString("PRENOM_PROF"),
					rset.getString("ADR_PROF"),rset.getString("CP_PROF"), rset.getString("VILLE_PROF"),
					new Module (rset.getString("CODE"),rset.getString("LIBELLE"),rset.getInt("H_COURS_PREV"),
							rset.getInt("H_COURS_REA"),rset.getInt("H_TP_PREV"),rset.getInt("H_TP_REA"),
							rset.getString("DISCIPLINE"),rset.getInt("COEFF_TEST"),rset.getInt("COEFF_CC"),
							rset.getInt("RESP"),rset.getInt("NUM_PROF"))));
		}
		// Affichage de la liste
		for (Prof p : listPr)
			System.out.println(p.toString());
		// Fermeture de l'instruction (liberation des ressources)
		stmt.close();
		System.out.println("\nOk.\n");
	}
	catch (SQLException e) {
		e.printStackTrace();// Arggg!!!
		System.out.println(e.getMessage() + "\n");
	}
	finally {
		if (conn != null) {
		// Deconnexion de la base de donnees
		conn.close();
		}
	}
	}
}