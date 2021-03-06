package projektpizza.stany;

import projektpizza.Pizzeria;
import projektpizza.Zamowienie;

public class JestZamowienie implements StanZamowienia {

	Zamowienie zamowienie;
	public JestZamowienie(Zamowienie nowezamowienie) {
		zamowienie = nowezamowienie;
	}
	@Override
	public void zlozZamowienie() {
		System.out.println("Jesteś w trakcie składania zamówienia.");	
	}

	@Override
	public void zrezygnujZZamowienia() {
		zamowienie.ustawStan(zamowienie.getNieMaZamowienia());	
	}
	@Override
	public void potwierdzZamowienie() {
		zamowienie.ustawStan(zamowienie.getOczekiwanieNaPizze());
	}
	@Override
	public void zrobPizze(Pizzeria pizzeria) {
		System.out.println("Musisz potwierdzić zamówienie.");
		
	}
	@Override
	public String toString() {
		return "Jest Zamowienie";
	}


}
