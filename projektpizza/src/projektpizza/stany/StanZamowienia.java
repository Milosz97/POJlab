package projektpizza.stany;

import projektpizza.Pizzeria;

public interface StanZamowienia {

	void zlozZamowienie();
	void zrezygnujZZamowienia();
	void potwierdzZamowienie();
	void zrobPizze(Pizzeria pizzeria);
}
