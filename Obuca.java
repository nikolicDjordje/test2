package zadatak2;

public class Obuca extends Stvar {

	//Obuca je stvar koja ima materijal. Tekstualni opis je naziv – velicina/materijal - cena.
	
	private String materijal;

	public Obuca(double cena, String naziv, int velicina, String oznaka, String materijal) {
		super(cena, naziv, velicina, oznaka);
		this.materijal = materijal;
	}

	public String getMaterijal() {
		return materijal;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(getNaziv());
		sb.append("-");
		sb.append(getVelicina());
		sb.append("/");
		sb.append(materijal);
		sb.append("-");
		sb.append(getCena());
		return sb.toString();
	}
	
	
}
