package com.pricer;

import java.util.List;

public class Product {

/* Element MART , Mise à Jours ou Création d'un Article */
	// ARTS Groupe MAJ Articles
	private String MDA_ARTS_MART_art; 				// code article
	private String MDA_ARTS_MART_lib; 				// libellé

	// TAX
	private String MDA_ARTS_MART_TAX_tva;			//	code tva branch master of TAX
	private String MDA_ARTS_MART_TAX_DEEE_d3em;		//	montant de la taxe D3E
	private String MDA_ARTS_MART_TAX_DEEE_d3et;		//	code tva de la taxe D3E

	// PXQT Prix et Quantité de l'article
	// PRXU element list
	private String MDA_ARTS_MART_PXQT_PRXU_puttc;	// prix unitaire de l'article



	//DCOG ; Données opérationnelles de gestion
	private String MDA_ARTS_MART_DCOG_CIA;			//	code interne
	private String MDA_ARTS_MART_DCOG_NAC; 			//	Accord Galec
	private String MDA_ARTS_MART_DCOG_CLEC; 		//	CODELEC
	private String MDA_ARTS_MART_DCOG_LIBS; 		//	Libellé secondaire
	private String MDA_ARTS_MART_DCOG_MARQ; 		//	Marque
	private	String MDA_ARTS_MART_DCOG_NF; 			//	Fournisseur
	private String MDA_ARTS_MART_DCOG_DISP; 		//	oui-non
	private String MDA_ARTS_MART_DCOG_PDRF; 		//	Prix de reference
	private	String MDA_ARTS_MART_DCOG_TRPR; 		//	Pourcentage Réduction
	private	String MDA_ARTS_MART_DCOG_TXPRC;		//	Texte Réduction Court
	private String MDA_ARTS_MART_DCOG_TXPRL;		//	Text Réduction Long
	private String MDA_ARTS_MART_DCOG_RFPR;			//	Reference promotion
	private String MDA_ARTS_MART_DCOG_APAR;			//	Adresse Produit


	public String getMDA_ARTS_MART_art() {
		return MDA_ARTS_MART_art;
	}

	public void setMDA_ARTS_MART_art(String MDA_ARTS_MART_art) {
		this.MDA_ARTS_MART_art = MDA_ARTS_MART_art;
	}

	public String getMDA_ARTS_MART_lib() {
		return MDA_ARTS_MART_lib;
	}

	public void setMDA_ARTS_MART_lib(String MDA_ARTS_MART_lib) {
		this.MDA_ARTS_MART_lib = MDA_ARTS_MART_lib;
	}

	public String getMDA_ARTS_MART_TAX_tva() {
		return MDA_ARTS_MART_TAX_tva;
	}

	public void setMDA_ARTS_MART_TAX_tva(String MDA_ARTS_MART_TAX_tva) {
		this.MDA_ARTS_MART_TAX_tva = MDA_ARTS_MART_TAX_tva;
	}

	public String getMDA_ARTS_MART_TAX_DEEE_d3em() {
		return MDA_ARTS_MART_TAX_DEEE_d3em;
	}

	public void setMDA_ARTS_MART_TAX_DEEE_d3em(String MDA_ARTS_MART_TAX_DEEE_d3em) {
		this.MDA_ARTS_MART_TAX_DEEE_d3em = MDA_ARTS_MART_TAX_DEEE_d3em;
	}

	public String getMDA_ARTS_MART_TAX_DEEE_d3et() {
		return MDA_ARTS_MART_TAX_DEEE_d3et;
	}

	public void setMDA_ARTS_MART_TAX_DEEE_d3et(String MDA_ARTS_MART_TAX_DEEE_d3et) {
		this.MDA_ARTS_MART_TAX_DEEE_d3et = MDA_ARTS_MART_TAX_DEEE_d3et;
	}

	public String getMDA_ARTS_MART_PXQT_PRXU_puttc() {
		return MDA_ARTS_MART_PXQT_PRXU_puttc;
	}

	public void setMDA_ARTS_MART_PXQT_PRXU_puttc(String MDA_ARTS_MART_PXQT_PRXU_puttc) {
		this.MDA_ARTS_MART_PXQT_PRXU_puttc = MDA_ARTS_MART_PXQT_PRXU_puttc;
	}

	public String getMDA_ARTS_MART_DCOG_CIA() {
		return MDA_ARTS_MART_DCOG_CIA;
	}

	public void setMDA_ARTS_MART_DCOG_CIA(String MDA_ARTS_MART_DCOG_CIA) {
		this.MDA_ARTS_MART_DCOG_CIA = MDA_ARTS_MART_DCOG_CIA;
	}

	public String getMDA_ARTS_MART_DCOG_NAC() {
		return MDA_ARTS_MART_DCOG_NAC;
	}

	public void setMDA_ARTS_MART_DCOG_NAC(String MDA_ARTS_MART_DCOG_NAC) {
		this.MDA_ARTS_MART_DCOG_NAC = MDA_ARTS_MART_DCOG_NAC;
	}

	public String getMDA_ARTS_MART_DCOG_CLEC() {
		return MDA_ARTS_MART_DCOG_CLEC;
	}

	public void setMDA_ARTS_MART_DCOG_CLEC(String MDA_ARTS_MART_DCOG_CLEC) {
		this.MDA_ARTS_MART_DCOG_CLEC = MDA_ARTS_MART_DCOG_CLEC;
	}

	public String getMDA_ARTS_MART_DCOG_LIBS() {
		return MDA_ARTS_MART_DCOG_LIBS;
	}

	public void setMDA_ARTS_MART_DCOG_LIBS(String MDA_ARTS_MART_DCOG_LIBS) {
		this.MDA_ARTS_MART_DCOG_LIBS = MDA_ARTS_MART_DCOG_LIBS;
	}

	public String getMDA_ARTS_MART_DCOG_MARQ() {
		return MDA_ARTS_MART_DCOG_MARQ;
	}

	public void setMDA_ARTS_MART_DCOG_MARQ(String MDA_ARTS_MART_DCOG_MARQ) {
		this.MDA_ARTS_MART_DCOG_MARQ = MDA_ARTS_MART_DCOG_MARQ;
	}

	public String getMDA_ARTS_MART_DCOG_NF() {
		return MDA_ARTS_MART_DCOG_NF;
	}

	public void setMDA_ARTS_MART_DCOG_NF(String MDA_ARTS_MART_DCOG_NF) {
		this.MDA_ARTS_MART_DCOG_NF = MDA_ARTS_MART_DCOG_NF;
	}

	public String getMDA_ARTS_MART_DCOG_DISP() {
		return MDA_ARTS_MART_DCOG_DISP;
	}

	public void setMDA_ARTS_MART_DCOG_DISP(String MDA_ARTS_MART_DCOG_DISP) {
		this.MDA_ARTS_MART_DCOG_DISP = MDA_ARTS_MART_DCOG_DISP;
	}

	public String getMDA_ARTS_MART_DCOG_PDRF() {
		return MDA_ARTS_MART_DCOG_PDRF;
	}

	public void setMDA_ARTS_MART_DCOG_PDRF(String MDA_ARTS_MART_DCOG_PDRF) {
		this.MDA_ARTS_MART_DCOG_PDRF = MDA_ARTS_MART_DCOG_PDRF;
	}

	public String getMDA_ARTS_MART_DCOG_TRPR() {
		return MDA_ARTS_MART_DCOG_TRPR;
	}

	public void setMDA_ARTS_MART_DCOG_TRPR(String MDA_ARTS_MART_DCOG_TRPR) {
		this.MDA_ARTS_MART_DCOG_TRPR = MDA_ARTS_MART_DCOG_TRPR;
	}

	public String getMDA_ARTS_MART_DCOG_TXPRC() {
		return MDA_ARTS_MART_DCOG_TXPRC;
	}

	public void setMDA_ARTS_MART_DCOG_TXPRC(String MDA_ARTS_MART_DCOG_TXPRC) {
		this.MDA_ARTS_MART_DCOG_TXPRC = MDA_ARTS_MART_DCOG_TXPRC;
	}

	public String getMDA_ARTS_MART_DCOG_TXPRL() {
		return MDA_ARTS_MART_DCOG_TXPRL;
	}

	public void setMDA_ARTS_MART_DCOG_TXPRL(String MDA_ARTS_MART_DCOG_TXPRL) {
		this.MDA_ARTS_MART_DCOG_TXPRL = MDA_ARTS_MART_DCOG_TXPRL;
	}

	public String getMDA_ARTS_MART_DCOG_RFPR() {
		return MDA_ARTS_MART_DCOG_RFPR;
	}

	public void setMDA_ARTS_MART_DCOG_RFPR(String MDA_ARTS_MART_DCOG_RFPR) {
		this.MDA_ARTS_MART_DCOG_RFPR = MDA_ARTS_MART_DCOG_RFPR;
	}

	public String getMDA_ARTS_MART_DCOG_APAR() {
		return MDA_ARTS_MART_DCOG_APAR;
	}

	public void setMDA_ARTS_MART_DCOG_APAR(String MDA_ARTS_MART_DCOG_APAR) {
		this.MDA_ARTS_MART_DCOG_APAR = MDA_ARTS_MART_DCOG_APAR;
	}
}
