package menjacnica;

import java.util.LinkedList;

import menjacnica_interfejs.IMenjacnica;

public class Menjacnica implements IMenjacnica {
	
	private LinkedList<Valuta> valute = new LinkedList<>();
	

	public LinkedList<Valuta> getValute() {
		return valute;
	}

	public void setValute(Valuta v) {
		if(v == null) throw new RuntimeException("Ne sme biti null");
		
		this.valute.add(v);
	}

	@Override
	public void dodajKurs(String valuta, Kurs k) {
		for(int i = 0; i < valute.size(); i++) {
			if(valuta != null && valute.get(i).getNazivValute().equals(valuta)) {
				valute.get(i).setKursevi(k);
			}
			else throw new RuntimeException("Ta valuta ne postoji");
		}
	}

	@Override
	public void obrisiKurs(String valuta, Kurs k) {
		for(int i = 0; i < valute.size(); i++) {
			if(valuta != null && valute.get(i).getNazivValute().equals(valuta)) {
				for(int j = 0; j < valute.get(i).getKursevi().size(); j++) {
					if(valute.get(i).getKursevi().get(j).equals(k)) {
						valute.get(i).getKursevi().remove(j);
					}
				}
			}
			else throw new RuntimeException("Ta valuta ne postoji");
		}
	}

	@Override
	public Kurs pronadjiKurs(String valuta, Kurs k) {
		for(int i = 0; i < valute.size(); i++) {
			if(valuta != null && valute.get(i).getNazivValute().equals(valuta)) {
				for(int j = 0; j < valute.get(i).getKursevi().size(); j++) {
					if(valute.get(i).getKursevi().get(j).equals(k)) {
						return valute.get(i).getKursevi().get(j);
					}
				}
			}			
		}
		throw new RuntimeException("Trazeni kurs ne postoji");
	}

}
