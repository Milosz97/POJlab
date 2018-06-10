package projektpizza.stany;

import projektpizza.Pizzeria;
import projektpizza.Zamowienie;

public class Zrealizowano implements StanZamowienia{

	Zamowienie zamowienie;
	public Zrealizowano(Zamowienie nowezamowienie) {
		zamowienie = nowezamowienie;
	}
	@Override
	public void zlozZamowienie() {
		System.out.println("Zrealizowano");
	}

	@Override
	public void zrezygnujZZamowienia() {
		System.out.println("Zrealizowano");
	}

	@Override
	public void potwierdzZamowienie() {
		System.out.println("Zrealizowano");
	}
	@Override
	public void zrobPizze(Pizzeria pizzeria) {
		System.out.println("Zrealizowano");
	}
	@Override
	public String toString() {
		return "Zrealizowano";
	}
	
}
