package projektpizza.Pizza;

public class PepperoniGdansk extends Pizza {

	public PepperoniGdansk() {
		nazwa="Peperoni";
		cena=25.00;
		poziomOstrosci=5;
		rozmiarPizza="Ma³a";
		listaSkladnikow.add(new Skladnik("ser",200));
		listaSkladnikow.add(new Skladnik("cebula",50));
		listaSkladnikow.add(new Skladnik("paryka ostra",30));
		listaSkladnikow.add(new Skladnik("salami",40));
	}
}
