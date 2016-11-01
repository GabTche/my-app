package com.mycompany.app.my_app;

import java.io.Serializable;
import java.util.Map;

public class Module implements Serializable {
	private String code;
	private String Libelle;
	private int hCoursPrev;
	private int hCoursRea;
	private int hTpPrev;
	private int hTpRea;
	private String discipline;
	private int coefTest;
	private int coefCc;
	private int Resp;
	private Map<Etudiant,Notation> etudiants;
	
	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getLibelle() {
		return Libelle;
	}

	public void setLibelle(String libelle) {
		Libelle = libelle;
	}

	public int gethCoursPrev() {
		return hCoursPrev;
	}

	public void sethCoursPrev(int hCoursPrev) {
		this.hCoursPrev = hCoursPrev;
	}

	public int gethCoursRea() {
		return hCoursRea;
	}

	public void sethCoursRea(int hCoursRea) {
		this.hCoursRea = hCoursRea;
	}

	public int gethTpPrev() {
		return hTpPrev;
	}

	public void sethTpPrev(int hTpPrev) {
		this.hTpPrev = hTpPrev;
	}

	public int gethTpRea() {
		return hTpRea;
	}

	public void sethTpRea(int hTpRea) {
		this.hTpRea = hTpRea;
	}

	public String getDiscipline() {
		return discipline;
	}

	public void setDiscipline(String discipline) {
		this.discipline = discipline;
	}

	public int getCoefTest() {
		return coefTest;
	}
	public void setCoefTest(int coefTest) {
		this.coefTest = coefTest;
	}

	public int getCoefCc() {
		return coefCc;
	}

	public void setCoefCc(int coefCc) {
		this.coefCc = coefCc;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Libelle == null) ? 0 : Libelle.hashCode());
		result = prime * result + ((code == null) ? 0 : code.hashCode());
		result = prime * result + coefCc;
		result = prime * result + coefTest;
		result = prime * result + ((discipline == null) ? 0 : discipline.hashCode());
		result = prime * result + hCoursPrev;
		result = prime * result + hCoursRea;
		result = prime * result + hTpPrev;
		result = prime * result + hTpRea;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Module other = (Module) obj;
		if (Libelle == null) {
			if (other.Libelle != null)
				return false;
		} else if (!Libelle.equals(other.Libelle))
			return false;
		if (code == null) {
			if (other.code != null)
				return false;
		} else if (!code.equals(other.code))
			return false;
		if (coefCc != other.coefCc)
			return false;
		if (coefTest != other.coefTest)
			return false;
		if (discipline == null) {
			if (other.discipline != null)
				return false;
		} else if (!discipline.equals(other.discipline))
			return false;
		if (hCoursPrev != other.hCoursPrev)
			return false;
		if (hCoursRea != other.hCoursRea)
			return false;
		if (hTpPrev != other.hTpPrev)
			return false;
		if (hTpRea != other.hTpRea)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Module [code=" + code + ", Libelle=" + Libelle + ", hCoursPrev=" + hCoursPrev + ", hCoursRea="
				+ hCoursRea + ", hTpPrev=" + hTpPrev + ", hTpRea=" + hTpRea + ", discipline=" + discipline
				+ ", coefTest=" + coefTest + ", coefCc=" + coefCc + "]";
	}

	

	public Module(String string, String string2, int i, int j, int k, int l, String string3, int m, int n, int o,int responsable){
		this.code = string;
		this.Libelle = string2;
		this.hCoursPrev = i;
		this.hCoursRea = j;
		this.hTpPrev = k;
		this.hTpRea = l;
		this.discipline = string3;
		this.coefTest = m;
		this.coefCc = n;
		this.Resp = responsable;
	}

	public int getResp() {
		return Resp;
	}

	public void setResp(int resp) {
		Resp = resp;
	}

}
