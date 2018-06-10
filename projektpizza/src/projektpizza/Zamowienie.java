package projektpizza;

import java.util.ArrayList;
import java.util.List;

import projektpizza.Pizza.Pizza;
import projektpizza.stany.JestZamowienie;
import projektpizza.stany.NieMaZamowienia;
import projektpizza.stany.OczekiwanieNaPizze;
import projektpizza.stany.StanZamowienia;
import projektpizza.stany.Zrealizowano;

public class Zamowienie {
	
	private StanZamowienia stanZamowienia;
	
	private StanZamowienia nieMaZamowienia;
	private StanZamowienia jestZamowienie;
	private StanZamowienia oczekiwanieNaPizze;
	private StanZamowienia zrealizowano;
	private boolean dowoz;
	private String odbiorca;
	private List<Pizza> zamowionePizze; 

	
	
	public Zamowienie() {
		nieMaZamowienia = new NieMaZamowienia(this);
		jestZamowienie = new JestZamowienie(this);
		oczekiwanieNaPizze = new OczekiwanieNaPizze(this);
		zrealizowano = new Zrealizowano(this); 
		zamowionePizze = new ArrayList<Pizza>();
		
		stanZamowienia = nieMaZamowienia;
	}
	
	public double obliczSuma() {
		double suma = 0;
		for(Pizza p : zamowionePizze) {
			suma += p.getCena();
		}
		if(dowoz) {
			suma += 5.0;
		}
		return suma;
		
	}
	
	public StanZamowienia getStanZamowienia() {
		return stanZamowienia;
	}

	public void ustawStan(StanZamowienia nowystanzamówienia) {
		stanZamowienia = nowystanzamówienia;
	}
	public void zlozZamowienie() {
		stanZamowienia.zlozZamowienie();
	}
	public void zrezygnujZZamowienia() {
		stanZamowienia.zrezygnujZZamowienia();
	}
	public void potwierdzZamowienie() {
		stanZamowienia.potwierdzZamowienie();
	}
	public void zrobPizze(Pizzeria pizzeria) {
		stanZamowienia.zrobPizze(pizzeria);
	}

	public StanZamowienia getNieMaZamowienia() {
		return nieMaZamowienia;
	}

	public StanZamowienia getJestZamowienie() {
		return jestZamowienie;
	}

	public StanZamowienia getOczekiwanieNaPizze() {
		return oczekiwanieNaPizze;
	}

	public StanZamowienia getZrealizowano() {
		return zrealizowano;
	}

	public List<Pizza> getZamowionePizze() {
		return zamowionePizze;
	}

	public void setZamowionePizze(List<Pizza> zamowionePizze) {
		this.zamowionePizze = zamowionePizze;
	}

	public boolean isDowoz() {
		return dowoz;
	}

	public void setDowoz(boolean dowoz) {
		this.dowoz = dowoz;
	}

	public String getOdbiorca() {
		return odbiorca;
	}

	public void setOdbiorca(String odbiorca) {
		this.odbiorca = odbiorca;
	}

	@Override
	public String toString() {
		String str = "Twoje Zamowienie: \n dowoz = " + dowoz+ ",\n odbiorca = " + odbiorca + ",\n zamowionePizze:";
		for(Pizza p : zamowionePizze) {
			str += "\n - "+p.getNazwa()+" - "+p.getRozmiarPizza()+" - "+p.getCena();
		}
		str += "\n Suma zamówienia: "+obliczSuma();
		return str;
	}
}
