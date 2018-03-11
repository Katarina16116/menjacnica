package menjacnica;

import java.util.GregorianCalendar;

public class Kurs {
	
	private GregorianCalendar datum;
	private double prodajniKurs;
	private double kupovniKurs;
	private double srednjiKurs;
	
	public GregorianCalendar getDatum() {
		return datum;
	}
	public void setDatum(GregorianCalendar datum) {
		if(datum == null)
			throw new RuntimeException("Vrednost datuma ne sme biti null");
		this.datum = datum;
	}
	public double getProdajniKurs() {
		return prodajniKurs;
	}
	public void setProdajniKurs(double prodajniKurs) {
		if(prodajniKurs <= 0)
			throw new RuntimeException("Uneta je negativna vrednost za kurs");
		this.prodajniKurs = prodajniKurs;
	}
	public double getKupovniKurs() {
		return kupovniKurs;
	}
	public void setKupovniKurs(double kupovniKurs) {
		if(kupovniKurs <= 0)
			throw new RuntimeException("Uneta je negativna vrednost za kurs");
		this.kupovniKurs = kupovniKurs;
	}
	public double getSrednjiKurs() {
		return srednjiKurs;
	}
	public void setSrednjiKurs(double srednjiKurs) {
		if(srednjiKurs <= 0)
			throw new RuntimeException("Uneta je negativna vrednost za kurs");
		this.srednjiKurs = srednjiKurs;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((datum == null) ? 0 : datum.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Kurs))
			return false;
		Kurs k = (Kurs)(obj);
		if(!this.datum.equals(k.getDatum()))
			return false;
		
		return true;
		
	}
	@Override
	public String toString() {
		return "Datuma " +datum.getTime()+ ":\n-prodajni kurs: " +prodajniKurs+ "\n-kupovnikurs: " +kupovniKurs+
				"\n-srednji kurs: " +srednjiKurs+ "\n";
	}	

	
}
