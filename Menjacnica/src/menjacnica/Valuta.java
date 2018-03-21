package menjacnica;

import java.util.LinkedList;

public class Valuta {
	
	private String nazivValute;
	private String oznakaValute;
	private LinkedList<Kurs> kursevi = new LinkedList<Kurs>();
	
	public String getNazivValute() {
		return nazivValute;
	}
	public void setNazivValute(String nazivValute) {
		if(nazivValute == null)
			throw new RuntimeException("Naziv valute je null");
		this.nazivValute = nazivValute;
	}
	public String getOznakaValute() {
		return oznakaValute;
	}
	public void setOznakaValute(String oznakaValute) {
		if(oznakaValute == null)
			throw new RuntimeException("Oznaka valute je null");
		this.oznakaValute = oznakaValute;
	}
	public LinkedList<Kurs> getKursevi() {
		return kursevi;
	}
	public void setKursevi(Kurs k) {
		if(k == null) throw new RuntimeException("Kurs ne sme biti null");
		this.kursevi.add(k);
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((kursevi == null) ? 0 : kursevi.hashCode());
		result = prime * result + ((nazivValute == null) ? 0 : nazivValute.hashCode());
		result = prime * result + ((oznakaValute == null) ? 0 : oznakaValute.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Valuta))
			return false;
		
		Valuta v = (Valuta)(obj);
		if(!(oznakaValute == v.getOznakaValute()))
			return false;
		
		return true;
	}
	@Override
	public String toString() {
		return nazivValute+ " (" +oznakaValute+ ") , kursevi: " +kursevi;
	}
	

}
