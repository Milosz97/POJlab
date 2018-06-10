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
//		System.out.println("Nie masz jeszcze zam�wienia.");
	}

	@Override
	public void potwierdzZamowienie() {
		System.out.println("Nie masz jeszcze zam�wienia, kt�re m�g�by� potwierdzi�.");	
	}
	@Override
	public void zrobPizze(Pizzeria pizzeria) {
		System.out.println("Nie masz jeszcze zam�wienia.");	
		
	}
	@Override
	public String toString() {
		return "Nie Ma Zamowienia";
	}



}
