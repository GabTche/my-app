package com.mycompany.app.my_app;

public class Lien {
	public Lien(Module m, Etudiant e) {
		this.module = m;
		this.etudiant = e;
	}
	
	private Module module;
	private Etudiant etudiant;
	private Notation note;
	
	public Module getModule() {
		return module;
	
	}
	public Etudiant getEtudiant() {
		return etudiant;
	}
	public Notation getNote() {
		return note;
	}
	public void setNote(Notation note) {
		this.note = note;
	}
	
	

}
