package projektpizza.stany;

import projektpizza.Pizzeria;
import projektpizza.Zamowienie;

public class NieMaZamowienia implements StanZamowienia {

	Zamowienie zamowienie;
	public NieMaZamowienia(Zamowienie nowezamowienie) {
		zamowienie = nowezamowienie;
	}
	@Override
	public void zlozZamowienie() {
		zamowienie.ustawStan(zamowienie.getJestZamowienie());	
	}

	@Override
	public void zrezygnujZZamowienia() {
//		System.out.println("Nie masz jeszcze zamówienia.");
	}

	@Override
	public void potwierdzZamowienie() {
		System.out.println("Nie masz jeszcze zamówienia, które móg³byœ potwierdziæ.");	
	}
	@Override
	public void zrobPizze(Pizzeria pizzeria) {
		System.out.println("Nie masz jeszcze zamówienia.");	
		
	}
	@Override
	public String toString() {
		return "Nie Ma Zamowienia";
	}



}
