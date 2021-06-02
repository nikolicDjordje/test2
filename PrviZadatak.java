package zadatak1;

import java.util.Scanner;

public class PrviZadatak {

	public static void main(String[] args) {
		
		/* Prvi zadatak
Napisati program na programskom jeziku Java koji sluzi za pronalazenje niza sa vecim prosecnim elementom. 
Korisnik na standardniu ulaz unosi duzniu prvog niza, a zatim i sve njegove elemente.
 Nakon toga unosi duzinu drugog niza i sve njegove elemente. 
 Ukoliko korisnik unese nevalidnu vrednost za duzinu niza ispisati poruku o tome i
  prekinuti izvrsavanje programa. Pretpostaviti da ce korisnik uneti cele brojeve za elemente niza. 
  Ucitavanje niza izvrsiti u zasebnoj funkciji. 
  Napisati funkciju pronadji kojoj se proslednjuju oba niza. 
  Funkcija pronadji racuna prosecnu vrednost elementa za oba niza i 
  kao rezultat vreca vecu od te dve prosecne vrednosti. 
  Na stendardni izlaz ispisati rezultat funkcije. */
		

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Unesite duzinu prvog niza: ");
		int duzina1 = sc.nextInt();
		if (duzina1 <= 0) {
			System.out.println("Uneli ste nevalidnu vrednost!");
		} 
			int [] niz1 = new int[duzina1];
			
		
		System.out.println("Unesite duzinu drugog niza: ");
		int duzina2 = sc.nextInt();
		int [] niz2 = new int [duzina2];
		if (duzina2 <= 0) {
			System.out.println("Uneli ste nevalidnu vrednost!");
			
			
		}
		unosNiza(niz1);
		unosNiza(niz2);
		
		
		
		double rezultat = pronadjiVeci(niz1, niz2);
		System.out.println("Veca prosecna vrednost iznosi: " + rezultat);
		
		}

	
	public static void unosNiza (int [] niz) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < niz.length; i++) {
			System.out.println("Unesite " + (i + 1) + ". element niza: ");
			niz[i] = sc.nextInt();
		}
	}
	
	public static double pronadjiVeci (int [] niz1, int [] niz2 ) {
		double zbir1 = 0;
		int brojElemenataNiza1 = 0;
		int brojElemenataNiza2 = 0;
		
		double zbir2 = 0;
		
		for (int i = 0; i < niz1.length; i++) {
			for (int j = 0; j < niz2.length; j++) {
				if (niz1[i] > 0 && niz2[i] > 0) {
					zbir1 = zbir1 + niz1[i];
					brojElemenataNiza1 = brojElemenataNiza1 + 1;
					zbir2 = zbir2 + niz2[j];
					brojElemenataNiza2 = brojElemenataNiza2 + 1;
				}
				
			}
		}
		double prosecnaVrednost1 = zbir1 / brojElemenataNiza1;
		double prosecnaVrednost2 = zbir2 / brojElemenataNiza2;
		
		if (prosecnaVrednost1 > prosecnaVrednost2) {
			return prosecnaVrednost1;
		} else {
			return prosecnaVrednost2;
		} 
	}

	}
