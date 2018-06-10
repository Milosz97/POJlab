package projektpizza.dekoratory;

import java.util.ArrayList;

import projektpizza.Pizza.Pizza;
import projektpizza.Pizza.Skladnik;

public abstract class DekoratorPizzaWzor extends Pizza{

	protected Pizza pizza;
	public DekoratorPizzaWzor(Pizza pizza) {
		this.pizza=pizza;
		nazwa=pizza.getNazwa();
		poziomOstrosci=pizza.getPoziomOstrosci();
	}
	
	public abstract double getCena();
	public abstract String getRozmiarPizza();
	public abstract ArrayList<Skladnik> getListaSkladnikow();
	
}
