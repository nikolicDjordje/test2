package zadatak2;

import java.util.ArrayList;
import java.util.List;

public class Stajling {
	
	// Stajling sadrzi ime kreatora, jedan par obuce i jedan ili vise odevnih predmeta. 
	
	private String imeKreatora;
	private String oznaka;
	List<Obuca> parObuce = new ArrayList<Obuca>();
	List<Odeca> odevniPredmeti = new ArrayList<Odeca>();
	public Stajling(String imeKreatora) {
		super();
		this.imeKreatora = imeKreatora;
	}
	
	/* Moguce je postaviti, dohvatiti i izbaciti obucu, kao i dohvatiti sve odevne predmete,
	 dodati neki odevni predmet, kao i ukloniti odevni predmet sa neke pozicije. */
	
	public List<Odeca> getOdevniPredmeti() {
		Odeca o2 = new Odeca (100, "kosulja", 50, "m", "na pruge");
		Odeca o3 = new Odeca (50, "majica", 36, "z", "cvetna");
		Odeca o4 = new Odeca (25, "kacket", 30, "m", "karirani");
		odevniPredmeti.add(o3);
	    odevniPredmeti.add(o2);
		return odevniPredmeti;
	}

	public List<Obuca> getParObuce() {
		Obuca o1 = new Obuca (100.55, "mokasine", 44, "m","koza");
		parObuce.add(o1);
		return parObuce;
	}

	public void setParObuce(List<Obuca> parObuce) {
		this.parObuce = parObuce;
	}

	public void ukloniPredmet (int i) {
		odevniPredmeti.remove(i);
	}
	
	public void dodajPredmet (Odeca o) {
		odevniPredmeti.add(o);
	}

	public void izbaciObucu (Obuca o) {
		parObuce.remove(o);
	}
	/*  Oznaka stajling je “z” ukoliko ima vise zenskih stvari, “m” ukoliko ima vise muskih stvari ili
    “u” ukoliko ima jednak broj muskih I zenskih stvari ili su sve stvari unisex */
 

@Override
public String toString() {
	StringBuilder sb = new StringBuilder();
	sb.append(imeKreatora);
	sb.append(" ");
	sb.append("-");
	sb.append(oznakaStajlinga(odevniPredmeti, parObuce));
	sb.append("-");
	sb.append(ukupnaCena(odevniPredmeti, parObuce));
	return sb.toString();
}
 
 //Tekstualni opis je kreator - oznaka stajlinga – ukupna cena stajlinga.
	
public static String oznakaStajlinga (List<Odeca> odevniPredmeti, List<Obuca>parObuce) {
	int muskaOznaka = 0;
	int zenskaOznaka = 0;
	int unisexOznaka = 0;
	 String musko = "m";
	 String zensko = "z";
	 String unisex = "u";
	 for (int i = 0; i <= odevniPredmeti.size() - 1; i++) {
		if (odevniPredmeti.get(i).getOznaka().equals(musko)) {
			muskaOznaka = muskaOznaka + 1;
		} else if (odevniPredmeti.get(i).getOznaka().equals(zensko) || parObuce.get(i).getOznaka().equals(zensko)) {
			zenskaOznaka = zenskaOznaka + 1;
		} 
	 }
	 for (int j = 0; j <= parObuce.size() - 1; j++) {
		 if (parObuce.get(j).getOznaka().equals(musko)) {
			 muskaOznaka = muskaOznaka + 1;
		 } else if (parObuce.get(j).getOznaka().equals(zensko)) {
				zenskaOznaka = zenskaOznaka + 1;
			} 
	 }
	 if (muskaOznaka > zenskaOznaka) {
		 return musko;
	 } else if (zenskaOznaka > muskaOznaka) {
		 return zensko;
	 }
	 else if (muskaOznaka == zenskaOznaka) {
		 return unisex;
	 } else {
		 return unisex;
	 }
 }
 
 public static double ukupnaCena (List<Odeca> odevniPredmeti, List<Obuca> parObuce) {
	 double cenaOdece = 0;
	 double cenaObuce = 0;
	 for (int i = 0; i <= odevniPredmeti.size() - 1; i++) {
		 cenaOdece = cenaOdece + odevniPredmeti.get(i).getCena();
	 }
	 for (int i = 0; i <= parObuce.size() - 1; i++) {
	 cenaObuce = cenaObuce + parObuce.get(i).getCena();
	 }
return cenaOdece + cenaObuce;
 }
}
