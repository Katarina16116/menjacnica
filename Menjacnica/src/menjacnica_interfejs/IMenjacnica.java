package menjacnica_interfejs;

import menjacnica.Kurs;

public interface IMenjacnica {
	
	public void dodajKurs(String valuta, Kurs k);
	public void obrisiKurs(String valuta, Kurs k);
	public Kurs pronadjiKurs(String valuta, Kurs k);

}
