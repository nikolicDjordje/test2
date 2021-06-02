package zadatak2;

public class Stvar {
 // Stvar  ima cenu, naziv, velicinu i oznaku za kolekciju (m – muska, z – zenska, u - unisex).
	
	
	private double cena;
	private String naziv;
	private int velicina;
	private String oznaka;
	public Stvar(double cena, String naziv, int velicina, String oznaka) {
		super();
		this.cena = cena;
		this.naziv = naziv;
		this.velicina = velicina;
		this.oznaka = oznaka;
	}
	public double getCena() {
		return cena;
	}
	public void setCena(double cena) {
		this.cena = cena;
	}
	public String getNaziv() {
		return naziv;
	}
	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}
	public int getVelicina() {
		return velicina;
	}
	public String getOznaka() {
		return oznaka;
	}
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(naziv);
		sb.append("-");
		sb.append(cena);
		return sb.toString();
	}
	
//  Tekstulani opis je naziv – cena.
	
	
}
