package com.mycompany.app.my_app;

import java.beans.DefaultPersistenceDelegate;
import java.util.Set;

public class Notation<associationNotation> {
	
	private Set<Lien> liens;
	private associationNotation instance;
	public void creerLien(Module m, Etudiant e, Notation n){
		Lien lien = new Lien(m,e);
		lien.setNote(n);
	}
	public void suprimerLien(Module m, Etudiant e){
		
	}
	public void supprimerLien(Lien lien){
		
	}
	public Lien getLien(Module m,Etudiant e) {

	}
	public Set<Lien> getLiens(Etudiant e) {
		return (Set<Lien>) e;
	}
	public Set<Lien> getLiens(Module m) {
		return (Set<Lien>) m;
	}
	public Set<Module> getModules(Etudiant e){
		return (Set<Module>) e;
	}
	public Set<Etudiant> getEtudiants(Module m){
		return (Set<Etudiant>) m;
	}
	public associationNotation getInstance() {
		return instance;
	}

}
