package projektpizza.dekoratory;

import java.util.ArrayList;

import projektpizza.Pizza.Pizza;
import projektpizza.Pizza.Skladnik;

public class DuzaDekorator extends DekoratorPizzaWzor {

	public DuzaDekorator(Pizza pizza) {
		super(pizza);
	}
	@Override
	public double getCena() {
		return pizza.getCena()+10.0;
	}
	@Override
	public String getRozmiarPizza() {
		return "Du¿a";
	}
	@Override
	public ArrayList<Skladnik> getListaSkladnikow() {
		ArrayList<Skladnik> lista = pizza.getListaSkladnikow();
		
		for(int i=0;i<lista.size();i++) {
			int temp = lista.get(i).getIlosc();
			temp = (int) ((int)temp*1.1);
			lista.get(i).setIlosc(temp);
		}
		return lista;
	}
	
}