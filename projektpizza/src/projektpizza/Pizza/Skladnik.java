package projektpizza.Pizza;

public class Skladnik {

	private String nazwa;
	private int ilosc;

	public Skladnik(String nazwa,int ilosc) {
		this.nazwa=nazwa;
		this.ilosc=ilosc;
	}

	public String getNazwa() {
		return nazwa;
	}

	public void setNazwa(String nazwa) {
		this.nazwa = nazwa;
	}

	public int getIlosc() {
		return ilosc;
	}

	public void setIlosc(int ilosc) {
		this.ilosc = ilosc;
	}
	
	

	@Override
	public String toString() {
		return nazwa+" - "+ilosc+"g ";
	}
	
	
}
