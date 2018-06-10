package projektpizza.Pizza;

public class CapricciosaGdansk extends Pizza {

	public CapricciosaGdansk() {
		nazwa="Capricciosa";
		cena=22.00;
		poziomOstrosci=1;
		rozmiarPizza="Ma³a";
		listaSkladnikow.add(new Skladnik("pieczarki",100));
		listaSkladnikow.add(new Skladnik("sos",20));
		listaSkladnikow.add(new Skladnik("szynka",80));
	}
}
