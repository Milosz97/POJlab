package projektpizza;

import projektpizza.Pizza.CapricciosaGdansk;
import projektpizza.Pizza.PepperoniGdansk;
import projektpizza.Pizza.Pizza;
import projektpizza.Pizza.WegetarianskaGdansk;
import projektpizza.dekoratory.DuzaDekorator;
import projektpizza.dekoratory.SredniaDekorator;

public class PizzeriaGdansk extends Pizzeria {

	Pizza zamowPizza(int item,int rozmiar) {
		Pizza pizza = null;
		if(item == 1) {
			pizza = new WegetarianskaGdansk();
		}else if(item == 2) {
			pizza = new CapricciosaGdansk();
		}else if(item == 3) {
			pizza = new PepperoniGdansk();
		}
		if(rozmiar == 2) {
			pizza = new SredniaDekorator(pizza);
		}
		else if(rozmiar == 3) {
			pizza = new DuzaDekorator(pizza);
		}

		return pizza;
	}
}
