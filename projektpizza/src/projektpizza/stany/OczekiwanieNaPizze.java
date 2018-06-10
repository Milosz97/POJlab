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
		System.out.println("Dokoñcz obecne zamówienie.");	
	}

	@Override
	public void zrezygnujZZamowienia() {
		System.out.println("Ju¿ potwierdzi³eœ zamówienie.");	
	}

	@Override
	public void potwierdzZamowienie() {
		System.out.println("Ju¿ potwierdzi³eœ zamówienie.");	
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
