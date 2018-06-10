package projektpizza;

import projektpizza.Pizza.Pizza;

public abstract class Pizzeria {

	public void zrobPizza(Pizza pizza) {
		pizza.przygotowanie();
		pizza.pieczenie();
		pizza.krojenie();
		pizza.pakowanie();
		
	}
	abstract Pizza zamowPizza(int rodzaj,int rozmiar);
}
