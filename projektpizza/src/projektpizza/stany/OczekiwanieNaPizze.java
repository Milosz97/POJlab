package projektpizza.stany;

import projektpizza.Pizzeria;
import projektpizza.Zamowienie;
import projektpizza.Pizza.Pizza;

public class OczekiwanieNaPizze implements StanZamowienia{

	Zamowienie zamowienie;
	public OczekiwanieNaPizze(Zamowienie nowezamowienie) {
		zamowienie = nowezamowienie;
	}
	@Override
	public void zlozZamowienie() {
		System.out.println("Doko�cz obecne zam�wienie.");	
	}

	@Override
	public void zrezygnujZZamowienia() {
		System.out.println("Ju� potwierdzi�e� zam�wienie.");	
	}

	@Override
	public void potwierdzZamowienie() {
		System.out.println("Ju� potwierdzi�e� zam�wienie.");	
	}
	@Override
	public void zrobPizze(Pizzeria pizzeria) {
		for(Pizza p : zamowienie.getZamowionePizze()) {
			pizzeria.zrobPizza(p);
		}
		zamowienie.ustawStan(zamowienie.getZrealizowano());
	}
	@Override
	public String toString() {
		return "Oczekiwanie Na Pizze";
	}
	
}
