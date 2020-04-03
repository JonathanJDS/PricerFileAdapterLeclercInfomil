package com.pricer;

public class Product {


/* Element MART , Mise à Jours ou Création d'un Article */
	// ARTS Groupe MAJ Articles
	private String MDA_ARTS_MART_art; 				// code article pour update ou creation
	private String MDA_ARTS_MART_lib; 				// libellé
	private String MDA_ARTS_SART_art; 				// code article pour suppression

	//TAX
	private String MDA_ARTS_MART_TAX_tva;			//	code tva branch master of TAX
	private String MDA_ARTS_MART_TAX_DEEE_d3em;		//	montant de la taxe D3E
	private String MDA_ARTS_MART_TAX_DEEE_d3et;		//	code tva de la taxe D3E
	private String MDA_ARTS_MART_TAX_TAXE_ct;		//	code de la taxe
	private String MDA_ARTS_MART_TAX_TAXE_val;		//	montant de la taxe

	// PXQT Prix et Quantité de l'article
	// PRXU element list
	private String MDA_ARTS_MART_PXQT_pxz;			// prix quantité (prix à zero oui/non)
	private String MDA_ARTS_MART_PXQT_PRXU_puttc;	// prix unitaire de l'article
	private String MDA_ARTS_MART_PXQT_PRXU_seuil;	// quantité
	private String MDA_ARTS_MART_PXQT_PRXU_type;	// one of them ==> QTEU = à l'unité; QTES = Quantité; QTEQ = vendu au poids; QTEC = quantité dans le code.

	private String MDA_ARTS_MART_PXQT_PRXU_QTEQ_pesee;
	private String MDA_ARTS_MART_PXQT_PRXU_QTEQ_unite;
	private String MDA_ARTS_MART_PXQT_PRXU_QTEC_unite;



	// PRXS element list, prix saisi en caisse
	private String MDA_ARTS_MART_PXQT_PRXS_type;	// one of them ==> QTEU = à l'unité; QTES = Quantité; QTEQ = vendu au poids; QTEC = quantité dans le code.
	private String MDA_ARTS_MART_PXQT_PRXS_QTEQ_pesee;
	private String MDA_ARTS_MART_PXQT_PRXS_QTEQ_unite;

	private String MDA_ARTS_MART_PXQT_PRXS_QTEC_unite;


	// PRXC element list, prix dans le code
	private String MDA_ARTS_MART_PXQT_PRXC_type;	// one of them ==> QTEU = à l'unité; QTES = Quantité.

	// CHA Article ou consigne chainé
	private String MDA_ARTS_MART_cha;				// article ou consigne chainé



	// STM Structure marchandise de l'article
	private String MDA_ARTS_MART_STM_r;			// rayon
	private String MDA_ARTS_MART_STM_f;			// famille
	private String MDA_ARTS_MART_STM_sf;		// sous famille



	//DCOG ; Données opérationnelles de gestion
	private String MDA_ARTS_MART_DCOG_cia;			//	code interne
	private String MDA_ARTS_MART_DCOG_nac; 			//	Accord Galec
	private String MDA_ARTS_MART_DCOG_clec; 		//	CODELEC
	private String MDA_ARTS_MART_DCOG_libs; 		//	Libellé secondaire
	private String MDA_ARTS_MART_DCOG_marq; 		//	Marque
	private	String MDA_ARTS_MART_DCOG_nf; 			//	Fournisseur
	private String MDA_ARTS_MART_DCOG_disp; 		//	oui-non
	private String MDA_ARTS_MART_DCOG_prom;			//	oui-non
	private String MDA_ARTS_MART_DCOG_pdrf; 		//	Prix de reference
	private	String MDA_ARTS_MART_DCOG_trpr; 		//	Pourcentage Réduction
	private	String MDA_ARTS_MART_DCOG_txprc;		//	Texte Réduction Court
	private String MDA_ARTS_MART_DCOG_txprl;		//	Text Réduction Long
	private String MDA_ARTS_MART_DCOG_rfpr;			//	Reference promotion
	private String MDA_ARTS_MART_DCOG_apar;			//	Adresse Produit

	// IUM prix à l'unité de mesure
	private String MDA_ARTS_MART_DCOG_IUM_pum;		//	prix à l'unité de mesure
	private String MDA_ARTS_MART_DCOG_IUM_libu;		//	libellé unité

	// contenance
	private String MDA_ARTS_MART_DCOG_CONT_contv;	//	valeur de contenance
	private String MDA_ARTS_MART_DCOG_CONT_libu;	//	libellé unité
	private String MDA_ARTS_MART_DCOG_CONT_contt;	//	contenance sous forme texte




	// DCOT ; Données complémentaires optionnelles tiers
	private String MDA_ARTS_MART_DCOT_lmrg;			//	lettre de marge
	private String MDA_ARTS_MART_DCOT_TAS_tas; 		//	TAS

	// DFL Données Friuts et legumes pour EEG
	private String MDA_ARTS_MART_DCOT_DFL_orig; 	//	origine
	private String MDA_ARTS_MART_DCOT_DFL_cal;	 	//	calibre
	private String MDA_ARTS_MART_DCOT_DFL_cat; 		//	categorie
	private String MDA_ARTS_MART_DCOT_DFL_vart; 	//	variété
	private String MDA_ARTS_MART_DCOT_DFL_plub; 	//	PLU balance
	private String MDA_ARTS_MART_DCOT_DFL_bio; 		//	indicateur produit bio
	private String MDA_ARTS_MART_DCOT_DFL_mesp1; 	//	1ere mention specifique
	private String MDA_ARTS_MART_DCOT_DFL_mesp2; 	//	2eme mention specifique

	// TRTFL traitement appliqué sur le produit
	private String MDA_ARTS_MART_DCOT_TRTFL_trtfl;	//	Traitement appliqué sur le produit (pour les EEF F&L)

	// BCO2 Bilan carbone
	private String MDA_ARTS_MART_DCOT_BCO2_vcuv;	// valeur carbone par uv
	private String MDA_ARTS_MART_DCOT_BCO2_vcum;	// valeur carbone par unité de mesure
	private String MDA_ARTS_MART_DCOT_BCO2_libu;	// unité de mesure

	// DCOC Données complementaires optionnelles pour vente en caisse
	private String MDA_ARTS_MART_DCOC_txt;			// sur ticket
	private String MDA_ARTS_MART_DCOC_msg;			// caissiere
	private String MDA_ARTS_MART_DCOC_avol;			// oui/non
	private String MDA_ARTS_MART_DCOC_ssc;			// self scanning oui/non


	// ITCS impression ticket complémentaire
	private String MDA_ARTS_MART_DCOC_ITCS_notg;	// ticket générateur
	private String MDA_ARTS_MART_DCOC_ITCS_lgn;		// (txt_siz;txt_siz.......) concat TXT with SIZ according to List of LGN elements

	// ITCC impression ticket complementaire au choix
	private String MDA_ARTS_MART_DCOC_ITCC_notg;	// ticket générateur
	private String MDA_ARTS_MART_DCOC_ITCC_libt;	// intitulé
	private String MDA_ARTS_MART_DCOC_ITCC_lgn;		// (txt_siz;txt_siz.......) concat TXT with SIZ according to List of LGN elements


	// DTECH Données article technique
	private String MDA_ARTS_MART_DTECH_ldnc;		// Libellé info non communiqué

	// GTIE Durée de garantie
	private String MDA_ARTS_MART_DTECH_GTIE_lgar;			// libellé ticket de la garantie
	private String MDA_ARTS_MART_DTECH_GTIE_dgar;			// durée garantie sans unité
	private String MDA_ARTS_MART_DTECH_GTIE_ugar;			// unité de la garantie


	// PIEC Durée de fourniture des pieces détachées
	private String MDA_ARTS_MART_DTECH_PIEC_lpie;			// libellé ticket de la fourniture
	private String MDA_ARTS_MART_DTECH_PIEC_dpie;			// durée fourniture pieces
	private String MDA_ARTS_MART_DTECH_PIEC_upie;			// unité de la durée


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

	public String getMDA_ARTS_SART_art() {
		return MDA_ARTS_SART_art;
	}

	public void setMDA_ARTS_SART_art(String MDA_ARTS_SART_art) {
		this.MDA_ARTS_SART_art = MDA_ARTS_SART_art;
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

	public String getMDA_ARTS_MART_TAX_TAXE_ct() {
		return MDA_ARTS_MART_TAX_TAXE_ct;
	}

	public void setMDA_ARTS_MART_TAX_TAXE_ct(String MDA_ARTS_MART_TAX_TAXE_ct) {
		this.MDA_ARTS_MART_TAX_TAXE_ct = MDA_ARTS_MART_TAX_TAXE_ct;
	}

	public String getMDA_ARTS_MART_TAX_TAXE_val() {
		return MDA_ARTS_MART_TAX_TAXE_val;
	}

	public void setMDA_ARTS_MART_TAX_TAXE_val(String MDA_ARTS_MART_TAX_TAXE_val) {
		this.MDA_ARTS_MART_TAX_TAXE_val = MDA_ARTS_MART_TAX_TAXE_val;
	}

	public String getMDA_ARTS_MART_PXQT_pxz() {
		return MDA_ARTS_MART_PXQT_pxz;
	}

	public void setMDA_ARTS_MART_PXQT_pxz(String MDA_ARTS_MART_PXQT_pxz) {
		this.MDA_ARTS_MART_PXQT_pxz = MDA_ARTS_MART_PXQT_pxz;
	}


	public String getMDA_ARTS_MART_PXQT_PRXU_puttc() {
		return MDA_ARTS_MART_PXQT_PRXU_puttc;
	}

	public void setMDA_ARTS_MART_PXQT_PRXU_puttc(String MDA_ARTS_MART_PXQT_PRXU_puttc) {
		this.MDA_ARTS_MART_PXQT_PRXU_puttc = MDA_ARTS_MART_PXQT_PRXU_puttc;
	}

	public String getMDA_ARTS_MART_PXQT_PRXU_seuil() {
		return MDA_ARTS_MART_PXQT_PRXU_seuil;
	}

	public void setMDA_ARTS_MART_PXQT_PRXU_seuil(String MDA_ARTS_MART_PXQT_PRXU_seuil) {
		this.MDA_ARTS_MART_PXQT_PRXU_seuil = MDA_ARTS_MART_PXQT_PRXU_seuil;
	}

	public String getMDA_ARTS_MART_PXQT_PRXU_QTEQ_pesee() {
		return MDA_ARTS_MART_PXQT_PRXU_QTEQ_pesee;
	}

	public void setMDA_ARTS_MART_PXQT_PRXU_QTEQ_pesee(String MDA_ARTS_MART_PXQT_PRXU_QTEQ_pesee) {
		this.MDA_ARTS_MART_PXQT_PRXU_QTEQ_pesee = MDA_ARTS_MART_PXQT_PRXU_QTEQ_pesee;
	}

	public String getMDA_ARTS_MART_PXQT_PRXU_QTEQ_unite() {
		return MDA_ARTS_MART_PXQT_PRXU_QTEQ_unite;
	}

	public void setMDA_ARTS_MART_PXQT_PRXU_QTEQ_unite(String MDA_ARTS_MART_PXQT_PRXU_QTEQ_unite) {
		this.MDA_ARTS_MART_PXQT_PRXU_QTEQ_unite = MDA_ARTS_MART_PXQT_PRXU_QTEQ_unite;
	}


	public String getMDA_ARTS_MART_PXQT_PRXU_QTEC_unite() {
		return MDA_ARTS_MART_PXQT_PRXU_QTEC_unite;
	}

	public void setMDA_ARTS_MART_PXQT_PRXU_QTEC_unite(String MDA_ARTS_MART_PXQT_PRXU_QTEC_unite) {
		this.MDA_ARTS_MART_PXQT_PRXU_QTEC_unite = MDA_ARTS_MART_PXQT_PRXU_QTEC_unite;
	}

	public String getMDA_ARTS_MART_PXQT_PRXU_type() {
		return MDA_ARTS_MART_PXQT_PRXU_type;
	}

	public void setMDA_ARTS_MART_PXQT_PRXU_type(String MDA_ARTS_MART_PXQT_PRXU_type) {
		this.MDA_ARTS_MART_PXQT_PRXU_type = MDA_ARTS_MART_PXQT_PRXU_type;
	}

	public String getMDA_ARTS_MART_PXQT_PRXS_type() {
		return MDA_ARTS_MART_PXQT_PRXS_type;
	}

	public void setMDA_ARTS_MART_PXQT_PRXS_type(String MDA_ARTS_MART_PXQT_PRXS_type) {
		this.MDA_ARTS_MART_PXQT_PRXS_type = MDA_ARTS_MART_PXQT_PRXS_type;
	}


	public String getMDA_ARTS_MART_PXQT_PRXS_QTEQ_pesee() {
		return MDA_ARTS_MART_PXQT_PRXS_QTEQ_pesee;
	}

	public void setMDA_ARTS_MART_PXQT_PRXS_QTEQ_pesee(String MDA_ARTS_MART_PXQT_PRXS_QTEQ_pesee) {
		this.MDA_ARTS_MART_PXQT_PRXS_QTEQ_pesee = MDA_ARTS_MART_PXQT_PRXS_QTEQ_pesee;
	}

	public String getMDA_ARTS_MART_PXQT_PRXS_QTEQ_unite() {
		return MDA_ARTS_MART_PXQT_PRXS_QTEQ_unite;
	}

	public void setMDA_ARTS_MART_PXQT_PRXS_QTEQ_unite(String MDA_ARTS_MART_PXQT_PRXS_QTEQ_unite) {
		this.MDA_ARTS_MART_PXQT_PRXS_QTEQ_unite = MDA_ARTS_MART_PXQT_PRXS_QTEQ_unite;
	}

	public String getMDA_ARTS_MART_PXQT_PRXS_QTEC_unite() {
		return MDA_ARTS_MART_PXQT_PRXS_QTEC_unite;
	}

	public void setMDA_ARTS_MART_PXQT_PRXS_QTEC_unite(String MDA_ARTS_MART_PXQT_PRXS_QTEC_unite) {
		this.MDA_ARTS_MART_PXQT_PRXS_QTEC_unite = MDA_ARTS_MART_PXQT_PRXS_QTEC_unite;
	}

	public String getMDA_ARTS_MART_PXQT_PRXC_type() {
		return MDA_ARTS_MART_PXQT_PRXC_type;
	}

	public void setMDA_ARTS_MART_PXQT_PRXC_type(String MDA_ARTS_MART_PXQT_PRXC_type) {
		this.MDA_ARTS_MART_PXQT_PRXC_type = MDA_ARTS_MART_PXQT_PRXC_type;
	}


	public String getMDA_ARTS_MART_cha() {
		return MDA_ARTS_MART_cha;
	}

	public void setMDA_ARTS_MART_cha(String MDA_ARTS_MART_cha) {
		this.MDA_ARTS_MART_cha = MDA_ARTS_MART_cha;
	}

	public String getMDA_ARTS_MART_STM_r() {
		return MDA_ARTS_MART_STM_r;
	}

	public void setMDA_ARTS_MART_STM_r(String MDA_ARTS_MART_STM_r) {
		this.MDA_ARTS_MART_STM_r = MDA_ARTS_MART_STM_r;
	}

	public String getMDA_ARTS_MART_STM_f() {
		return MDA_ARTS_MART_STM_f;
	}

	public void setMDA_ARTS_MART_STM_f(String MDA_ARTS_MART_STM_f) {
		this.MDA_ARTS_MART_STM_f = MDA_ARTS_MART_STM_f;
	}

	public String getMDA_ARTS_MART_STM_sf() {
		return MDA_ARTS_MART_STM_sf;
	}

	public void setMDA_ARTS_MART_STM_sf(String MDA_ARTS_MART_STM_sf) {
		this.MDA_ARTS_MART_STM_sf = MDA_ARTS_MART_STM_sf;
	}

	public String getMDA_ARTS_MART_DCOG_cia() {
		return MDA_ARTS_MART_DCOG_cia;
	}

	public void setMDA_ARTS_MART_DCOG_cia(String MDA_ARTS_MART_DCOG_cia) {
		this.MDA_ARTS_MART_DCOG_cia = MDA_ARTS_MART_DCOG_cia;
	}

	public String getMDA_ARTS_MART_DCOG_nac() {
		return MDA_ARTS_MART_DCOG_nac;
	}

	public void setMDA_ARTS_MART_DCOG_nac(String MDA_ARTS_MART_DCOG_nac) {
		this.MDA_ARTS_MART_DCOG_nac = MDA_ARTS_MART_DCOG_nac;
	}

	public String getMDA_ARTS_MART_DCOG_clec() {
		return MDA_ARTS_MART_DCOG_clec;
	}

	public void setMDA_ARTS_MART_DCOG_clec(String MDA_ARTS_MART_DCOG_clec) {
		this.MDA_ARTS_MART_DCOG_clec = MDA_ARTS_MART_DCOG_clec;
	}

	public String getMDA_ARTS_MART_DCOG_libs() {
		return MDA_ARTS_MART_DCOG_libs;
	}

	public void setMDA_ARTS_MART_DCOG_libs(String MDA_ARTS_MART_DCOG_libs) {
		this.MDA_ARTS_MART_DCOG_libs = MDA_ARTS_MART_DCOG_libs;
	}

	public String getMDA_ARTS_MART_DCOG_marq() {
		return MDA_ARTS_MART_DCOG_marq;
	}

	public void setMDA_ARTS_MART_DCOG_marq(String MDA_ARTS_MART_DCOG_marq) {
		this.MDA_ARTS_MART_DCOG_marq = MDA_ARTS_MART_DCOG_marq;
	}

	public String getMDA_ARTS_MART_DCOG_nf() {
		return MDA_ARTS_MART_DCOG_nf;
	}

	public void setMDA_ARTS_MART_DCOG_nf(String MDA_ARTS_MART_DCOG_nf) {
		this.MDA_ARTS_MART_DCOG_nf = MDA_ARTS_MART_DCOG_nf;
	}

	public String getMDA_ARTS_MART_DCOG_disp() {
		return MDA_ARTS_MART_DCOG_disp;
	}

	public void setMDA_ARTS_MART_DCOG_disp(String MDA_ARTS_MART_DCOG_disp) {
		this.MDA_ARTS_MART_DCOG_disp = MDA_ARTS_MART_DCOG_disp;
	}

	public String getMDA_ARTS_MART_DCOG_prom() {
		return MDA_ARTS_MART_DCOG_prom;
	}

	public void setMDA_ARTS_MART_DCOG_prom(String MDA_ARTS_MART_DCOG_prom) {
		this.MDA_ARTS_MART_DCOG_prom = MDA_ARTS_MART_DCOG_prom;
	}

	public String getMDA_ARTS_MART_DCOG_pdrf() {
		return MDA_ARTS_MART_DCOG_pdrf;
	}

	public void setMDA_ARTS_MART_DCOG_pdrf(String MDA_ARTS_MART_DCOG_pdrf) {
		this.MDA_ARTS_MART_DCOG_pdrf = MDA_ARTS_MART_DCOG_pdrf;
	}

	public String getMDA_ARTS_MART_DCOG_trpr() {
		return MDA_ARTS_MART_DCOG_trpr;
	}

	public void setMDA_ARTS_MART_DCOG_trpr(String MDA_ARTS_MART_DCOG_trpr) {
		this.MDA_ARTS_MART_DCOG_trpr = MDA_ARTS_MART_DCOG_trpr;
	}

	public String getMDA_ARTS_MART_DCOG_txprc() {
		return MDA_ARTS_MART_DCOG_txprc;
	}

	public void setMDA_ARTS_MART_DCOG_txprc(String MDA_ARTS_MART_DCOG_txprc) {
		this.MDA_ARTS_MART_DCOG_txprc = MDA_ARTS_MART_DCOG_txprc;
	}

	public String getMDA_ARTS_MART_DCOG_txprl() {
		return MDA_ARTS_MART_DCOG_txprl;
	}

	public void setMDA_ARTS_MART_DCOG_txprl(String MDA_ARTS_MART_DCOG_txprl) {
		this.MDA_ARTS_MART_DCOG_txprl = MDA_ARTS_MART_DCOG_txprl;
	}

	public String getMDA_ARTS_MART_DCOG_rfpr() {
		return MDA_ARTS_MART_DCOG_rfpr;
	}

	public void setMDA_ARTS_MART_DCOG_rfpr(String MDA_ARTS_MART_DCOG_rfpr) {
		this.MDA_ARTS_MART_DCOG_rfpr = MDA_ARTS_MART_DCOG_rfpr;
	}

	public String getMDA_ARTS_MART_DCOG_apar() {
		return MDA_ARTS_MART_DCOG_apar;
	}

	public void setMDA_ARTS_MART_DCOG_apar(String MDA_ARTS_MART_DCOG_apar) {
		this.MDA_ARTS_MART_DCOG_apar = MDA_ARTS_MART_DCOG_apar;
	}

	public String getMDA_ARTS_MART_DCOG_IUM_pum() {
		return MDA_ARTS_MART_DCOG_IUM_pum;
	}

	public void setMDA_ARTS_MART_DCOG_IUM_pum(String MDA_ARTS_MART_DCOG_IUM_pum) {
		this.MDA_ARTS_MART_DCOG_IUM_pum = MDA_ARTS_MART_DCOG_IUM_pum;
	}

	public String getMDA_ARTS_MART_DCOG_IUM_libu() {
		return MDA_ARTS_MART_DCOG_IUM_libu;
	}

	public void setMDA_ARTS_MART_DCOG_IUM_libu(String MDA_ARTS_MART_DCOG_IUM_libu) {
		this.MDA_ARTS_MART_DCOG_IUM_libu = MDA_ARTS_MART_DCOG_IUM_libu;
	}

	public String getMDA_ARTS_MART_DCOG_CONT_contv() {
		return MDA_ARTS_MART_DCOG_CONT_contv;
	}

	public void setMDA_ARTS_MART_DCOG_CONT_contv(String MDA_ARTS_MART_DCOG_CONT_contv) {
		this.MDA_ARTS_MART_DCOG_CONT_contv = MDA_ARTS_MART_DCOG_CONT_contv;
	}

	public String getMDA_ARTS_MART_DCOG_CONT_libu() {
		return MDA_ARTS_MART_DCOG_CONT_libu;
	}

	public void setMDA_ARTS_MART_DCOG_CONT_libu(String MDA_ARTS_MART_DCOG_CONT_libu) {
		this.MDA_ARTS_MART_DCOG_CONT_libu = MDA_ARTS_MART_DCOG_CONT_libu;
	}

	public String getMDA_ARTS_MART_DCOG_CONT_contt() {
		return MDA_ARTS_MART_DCOG_CONT_contt;
	}

	public void setMDA_ARTS_MART_DCOG_CONT_contt(String MDA_ARTS_MART_DCOG_CONT_contt) {
		this.MDA_ARTS_MART_DCOG_CONT_contt = MDA_ARTS_MART_DCOG_CONT_contt;
	}

	public String getMDA_ARTS_MART_DCOT_lmrg() {
		return MDA_ARTS_MART_DCOT_lmrg;
	}

	public void setMDA_ARTS_MART_DCOT_lmrg(String MDA_ARTS_MART_DCOT_lmrg) {
		this.MDA_ARTS_MART_DCOT_lmrg = MDA_ARTS_MART_DCOT_lmrg;
	}

	public String getMDA_ARTS_MART_DCOT_TAS_tas() {
		return MDA_ARTS_MART_DCOT_TAS_tas;
	}

	public void setMDA_ARTS_MART_DCOT_TAS_tas(String MDA_ARTS_MART_DCOT_TAS_tas) {
		this.MDA_ARTS_MART_DCOT_TAS_tas = MDA_ARTS_MART_DCOT_TAS_tas;
	}

	public String getMDA_ARTS_MART_DCOT_DFL_orig() {
		return MDA_ARTS_MART_DCOT_DFL_orig;
	}

	public void setMDA_ARTS_MART_DCOT_DFL_orig(String MDA_ARTS_MART_DCOT_DFL_orig) {
		this.MDA_ARTS_MART_DCOT_DFL_orig = MDA_ARTS_MART_DCOT_DFL_orig;
	}

	public String getMDA_ARTS_MART_DCOT_DFL_cal() {
		return MDA_ARTS_MART_DCOT_DFL_cal;
	}

	public void setMDA_ARTS_MART_DCOT_DFL_cal(String MDA_ARTS_MART_DCOT_DFL_cal) {
		this.MDA_ARTS_MART_DCOT_DFL_cal = MDA_ARTS_MART_DCOT_DFL_cal;
	}

	public String getMDA_ARTS_MART_DCOT_DFL_cat() {
		return MDA_ARTS_MART_DCOT_DFL_cat;
	}

	public void setMDA_ARTS_MART_DCOT_DFL_cat(String MDA_ARTS_MART_DCOT_DFL_cat) {
		this.MDA_ARTS_MART_DCOT_DFL_cat = MDA_ARTS_MART_DCOT_DFL_cat;
	}

	public String getMDA_ARTS_MART_DCOT_DFL_vart() {
		return MDA_ARTS_MART_DCOT_DFL_vart;
	}

	public void setMDA_ARTS_MART_DCOT_DFL_vart(String MDA_ARTS_MART_DCOT_DFL_vart) {
		this.MDA_ARTS_MART_DCOT_DFL_vart = MDA_ARTS_MART_DCOT_DFL_vart;
	}

	public String getMDA_ARTS_MART_DCOT_DFL_plub() {
		return MDA_ARTS_MART_DCOT_DFL_plub;
	}

	public void setMDA_ARTS_MART_DCOT_DFL_plub(String MDA_ARTS_MART_DCOT_DFL_plub) {
		this.MDA_ARTS_MART_DCOT_DFL_plub = MDA_ARTS_MART_DCOT_DFL_plub;
	}

	public String getMDA_ARTS_MART_DCOT_DFL_bio() {
		return MDA_ARTS_MART_DCOT_DFL_bio;
	}

	public void setMDA_ARTS_MART_DCOT_DFL_bio(String MDA_ARTS_MART_DCOT_DFL_bio) {
		this.MDA_ARTS_MART_DCOT_DFL_bio = MDA_ARTS_MART_DCOT_DFL_bio;
	}

	public String getMDA_ARTS_MART_DCOT_DFL_mesp1() {
		return MDA_ARTS_MART_DCOT_DFL_mesp1;
	}

	public void setMDA_ARTS_MART_DCOT_DFL_mesp1(String MDA_ARTS_MART_DCOT_DFL_mesp1) {
		this.MDA_ARTS_MART_DCOT_DFL_mesp1 = MDA_ARTS_MART_DCOT_DFL_mesp1;
	}

	public String getMDA_ARTS_MART_DCOT_DFL_mesp2() {
		return MDA_ARTS_MART_DCOT_DFL_mesp2;
	}

	public void setMDA_ARTS_MART_DCOT_DFL_mesp2(String MDA_ARTS_MART_DCOT_DFL_mesp2) {
		this.MDA_ARTS_MART_DCOT_DFL_mesp2 = MDA_ARTS_MART_DCOT_DFL_mesp2;
	}

	public String getMDA_ARTS_MART_DCOT_TRTFL_trtfl() {
		return MDA_ARTS_MART_DCOT_TRTFL_trtfl;
	}

	public void setMDA_ARTS_MART_DCOT_TRTFL_trtfl(String MDA_ARTS_MART_DCOT_TRTFL_trtfl) {
		this.MDA_ARTS_MART_DCOT_TRTFL_trtfl = MDA_ARTS_MART_DCOT_TRTFL_trtfl;
	}

	public String getMDA_ARTS_MART_DCOT_BCO2_vcuv() {
		return MDA_ARTS_MART_DCOT_BCO2_vcuv;
	}

	public void setMDA_ARTS_MART_DCOT_BCO2_vcuv(String MDA_ARTS_MART_DCOT_BCO2_vcuv) {
		this.MDA_ARTS_MART_DCOT_BCO2_vcuv = MDA_ARTS_MART_DCOT_BCO2_vcuv;
	}

	public String getMDA_ARTS_MART_DCOT_BCO2_vcum() {
		return MDA_ARTS_MART_DCOT_BCO2_vcum;
	}

	public void setMDA_ARTS_MART_DCOT_BCO2_vcum(String MDA_ARTS_MART_DCOT_BCO2_vcum) {
		this.MDA_ARTS_MART_DCOT_BCO2_vcum = MDA_ARTS_MART_DCOT_BCO2_vcum;
	}

	public String getMDA_ARTS_MART_DCOT_BCO2_libu() {
		return MDA_ARTS_MART_DCOT_BCO2_libu;
	}

	public void setMDA_ARTS_MART_DCOT_BCO2_libu(String MDA_ARTS_MART_DCOT_BCO2_libu) {
		this.MDA_ARTS_MART_DCOT_BCO2_libu = MDA_ARTS_MART_DCOT_BCO2_libu;
	}

	public String getMDA_ARTS_MART_DCOC_txt() {
		return MDA_ARTS_MART_DCOC_txt;
	}

	public void setMDA_ARTS_MART_DCOC_txt(String MDA_ARTS_MART_DCOC_txt) {
		this.MDA_ARTS_MART_DCOC_txt = MDA_ARTS_MART_DCOC_txt;
	}

	public String getMDA_ARTS_MART_DCOC_msg() {
		return MDA_ARTS_MART_DCOC_msg;
	}

	public void setMDA_ARTS_MART_DCOC_msg(String MDA_ARTS_MART_DCOC_msg) {
		this.MDA_ARTS_MART_DCOC_msg = MDA_ARTS_MART_DCOC_msg;
	}

	public String getMDA_ARTS_MART_DCOC_avol() {
		return MDA_ARTS_MART_DCOC_avol;
	}

	public void setMDA_ARTS_MART_DCOC_avol(String MDA_ARTS_MART_DCOC_avol) {
		this.MDA_ARTS_MART_DCOC_avol = MDA_ARTS_MART_DCOC_avol;
	}

	public String getMDA_ARTS_MART_DCOC_ssc() {
		return MDA_ARTS_MART_DCOC_ssc;
	}

	public void setMDA_ARTS_MART_DCOC_ssc(String MDA_ARTS_MART_DCOC_ssc) {
		this.MDA_ARTS_MART_DCOC_ssc = MDA_ARTS_MART_DCOC_ssc;
	}

	public String getMDA_ARTS_MART_DCOC_ITCS_notg() {
		return MDA_ARTS_MART_DCOC_ITCS_notg;
	}

	public void setMDA_ARTS_MART_DCOC_ITCS_notg(String MDA_ARTS_MART_DCOC_ITCS_notg) {
		this.MDA_ARTS_MART_DCOC_ITCS_notg = MDA_ARTS_MART_DCOC_ITCS_notg;
	}

	public String getMDA_ARTS_MART_DCOC_ITCS_lgn() {
		return MDA_ARTS_MART_DCOC_ITCS_lgn;
	}

	public void setMDA_ARTS_MART_DCOC_ITCS_lgn(String MDA_ARTS_MART_DCOC_ITCS_lgn) {
		this.MDA_ARTS_MART_DCOC_ITCS_lgn = MDA_ARTS_MART_DCOC_ITCS_lgn;
	}

	public String getMDA_ARTS_MART_DCOC_ITCC_notg() {
		return MDA_ARTS_MART_DCOC_ITCC_notg;
	}

	public void setMDA_ARTS_MART_DCOC_ITCC_notg(String MDA_ARTS_MART_DCOC_ITCC_notg) {
		this.MDA_ARTS_MART_DCOC_ITCC_notg = MDA_ARTS_MART_DCOC_ITCC_notg;
	}

	public String getMDA_ARTS_MART_DCOC_ITCC_libt() {
		return MDA_ARTS_MART_DCOC_ITCC_libt;
	}

	public void setMDA_ARTS_MART_DCOC_ITCC_libt(String MDA_ARTS_MART_DCOC_ITCC_libt) {
		this.MDA_ARTS_MART_DCOC_ITCC_libt = MDA_ARTS_MART_DCOC_ITCC_libt;
	}

	public String getMDA_ARTS_MART_DCOC_ITCC_lgn() {
		return MDA_ARTS_MART_DCOC_ITCC_lgn;
	}

	public void setMDA_ARTS_MART_DCOC_ITCC_lgn(String MDA_ARTS_MART_DCOC_ITCC_lgn) {
		this.MDA_ARTS_MART_DCOC_ITCC_lgn = MDA_ARTS_MART_DCOC_ITCC_lgn;
	}

	public String getMDA_ARTS_MART_DTECH_ldnc() {
		return MDA_ARTS_MART_DTECH_ldnc;
	}

	public void setMDA_ARTS_MART_DTECH_ldnc(String MDA_ARTS_MART_DTECH_ldnc) {
		this.MDA_ARTS_MART_DTECH_ldnc = MDA_ARTS_MART_DTECH_ldnc;
	}

	public String getMDA_ARTS_MART_DTECH_GTIE_lgar() {
		return MDA_ARTS_MART_DTECH_GTIE_lgar;
	}

	public void setMDA_ARTS_MART_DTECH_GTIE_lgar(String MDA_ARTS_MART_DTECH_GTIE_lgar) {
		this.MDA_ARTS_MART_DTECH_GTIE_lgar = MDA_ARTS_MART_DTECH_GTIE_lgar;
	}

	public String getMDA_ARTS_MART_DTECH_GTIE_dgar() {
		return MDA_ARTS_MART_DTECH_GTIE_dgar;
	}

	public void setMDA_ARTS_MART_DTECH_GTIE_dgar(String MDA_ARTS_MART_DTECH_GTIE_dgar) {
		this.MDA_ARTS_MART_DTECH_GTIE_dgar = MDA_ARTS_MART_DTECH_GTIE_dgar;
	}

	public String getMDA_ARTS_MART_DTECH_GTIE_ugar() {
		return MDA_ARTS_MART_DTECH_GTIE_ugar;
	}

	public void setMDA_ARTS_MART_DTECH_GTIE_ugar(String MDA_ARTS_MART_DTECH_GTIE_ugar) {
		this.MDA_ARTS_MART_DTECH_GTIE_ugar = MDA_ARTS_MART_DTECH_GTIE_ugar;
	}

	public String getMDA_ARTS_MART_DTECH_PIEC_lpie() {
		return MDA_ARTS_MART_DTECH_PIEC_lpie;
	}

	public void setMDA_ARTS_MART_DTECH_PIEC_lpie(String MDA_ARTS_MART_DTECH_PIEC_lpie) {
		this.MDA_ARTS_MART_DTECH_PIEC_lpie = MDA_ARTS_MART_DTECH_PIEC_lpie;
	}

	public String getMDA_ARTS_MART_DTECH_PIEC_dpie() {
		return MDA_ARTS_MART_DTECH_PIEC_dpie;
	}

	public void setMDA_ARTS_MART_DTECH_PIEC_dpie(String MDA_ARTS_MART_DTECH_PIEC_dpie) {
		this.MDA_ARTS_MART_DTECH_PIEC_dpie = MDA_ARTS_MART_DTECH_PIEC_dpie;
	}

	public String getMDA_ARTS_MART_DTECH_PIEC_upie() {
		return MDA_ARTS_MART_DTECH_PIEC_upie;
	}

	public void setMDA_ARTS_MART_DTECH_PIEC_upie(String MDA_ARTS_MART_DTECH_PIEC_upie) {
		this.MDA_ARTS_MART_DTECH_PIEC_upie = MDA_ARTS_MART_DTECH_PIEC_upie;
	}
}
