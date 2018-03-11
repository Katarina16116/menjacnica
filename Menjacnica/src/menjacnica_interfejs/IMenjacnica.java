package menjacnica_interfejs;

import menjacnica.Kurs;

public interface IMenjacnica {
	
	public void dodajKurs(Kurs k);
	public void obrisiKurs(Kurs k);
	public Kurs pronadjiKurs(Kurs k);

}
