package com.mycompany.app.my_app;


import java.sql.*;
import java.util.ArrayList;

public class TestEntite {
	// La requete de test
	static final String req = "SELECT NUM_ET, NOM_ET, PRENOM_ET, CP_ET, VILLE_ET, ANNEE, GROUPE " + "FROM ETUDIANT "
			+ "WHERE VILLE_ET = 'AIX-EN-PROVENCE'";
	public static void main(String[] args) throws SQLException {
		try (Connection connection = ConnexionUnique.getInstance().getConnection()) {
			// Creation d'une instruction SQL
			Statement stmt = connection.createStatement();
			// Execution de la requete
			System.out.println("Execution de la requete : " + req + "\n");
			ResultSet rset = stmt.executeQuery(req);
			// Creation de la liste
			ArrayList<Etudiant> listEt = new ArrayList<Etudiant>();
			// Remplissage de la liste
			while (rset.next()) {
				listEt.add(new Etudiant(rset.getInt("NUM_ET"), rset.getString("NOM_ET"), rset.getString("PRENOM_ET"),
						rset.getString("CP_ET"), rset.getString("VILLE_ET"), rset.getInt("ANNEE"),
						rset.getInt("GROUPE")));
			}
			// Affichage de la liste
			for (Etudiant e : listEt)
				System.out.println(e.toString());
			// Fermeture de l'instruction (liberation des ressources)
			stmt.close();
			System.out.println("\nOk.\n");
		} catch (SQLException e) {
			e.printStackTrace();// Arggg!!!
			System.out.println(e.getMessage() + "\n");
		}
	}
}
