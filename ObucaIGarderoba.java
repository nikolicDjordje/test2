package zadatak2;

import java.util.ArrayList;
import java.util.List;

public class ObucaIGarderoba {

	public static void main(String[] args) {

		/* Napisati program na programskom jeziku Java koji sluzi za evidenciju i kombinovanje obuce i garderobe.
Stvar  ima cenu, naziv, velicinu i oznaku za kolekciju (m – muska, z – zenska, u - unisex).
 Tekstulani opis je naziv – cena.
Obuca je stvar koja ima materijal. Tekstualni opis je naziv – velicina/materijal - cena.
Odeca je stvar koja ima dezen. Tekstualni opis je naziv - velicina/dezen – cena.
Stajling sadrzi ime kreatora, jedan par obuce i jedan ili vise odevnih predmeta. 
Prilikom kreiranja stajlinga prosledjuje se samo ime kreatora. 
Moguce je postaviti, dohvatiti i izbaciti obucu, kao i dohvatiti sve odevne predmete,
 dodati neki odevni predmet, kao i ukloniti odevni predmet sa neke pozicije. 
 Odevni predmeti dodaju se pojedinacno, a ne vise njih odjednom.
  Tekstualni opis je kreator - oznaka stajlinga – ukupna cena stajlinga.
   Oznaka stajling je “z” ukoliko ima vise zenskih stvari, “m” ukoliko ima vise muskih stvari ili
    “u” ukoliko ima jednak broj muskih I zenskih stvari ili su sve stvari unisex
*/
		
		Stvar s1 = new Stvar (150.55, "farmerke", 42, "m");
		System.out.println(s1.toString());
		Obuca o1 = new Obuca (100.55, "mokasine", 44, "m","koza");
		System.out.println(o1.toString());
		Odeca o2 = new Odeca (100, "kosulja", 50, "m", "na pruge");
		Odeca o3 = new Odeca (50, "majica", 36, "z", "cvetna");
		System.out.println(o2.toString());
		
		List<Obuca> parObuce = new ArrayList<Obuca>();
		List<Odeca> odevniPredmeti = new ArrayList<Odeca>();
		parObuce.add(o1);
		odevniPredmeti.add(o2);
		odevniPredmeti.add(o3);
		Odeca o4 = new Odeca (200, "polo majica", 34, "u", "pruge");
		
		Stajling s100 = new Stajling ("Djani Versace");
		
		System.out.println(s100.toString());
		System.out.println(odevniPredmeti.size());
		System.out.println(odevniPredmeti.get(0).getOznaka());
		
	}

}
