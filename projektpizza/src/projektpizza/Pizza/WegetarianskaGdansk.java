package projektpizza.Pizza;

public class WegetarianskaGdansk extends Pizza{

	public WegetarianskaGdansk() {
		nazwa="Wegetariañska";
		cena=20.00;
		poziomOstrosci=0;
		rozmiarPizza="Ma³a";
		listaSkladnikow.add(new Skladnik("ser",200));
		listaSkladnikow.add(new Skladnik("pomidor",50));
		listaSkladnikow.add(new Skladnik("paryka",40));
	}
}
