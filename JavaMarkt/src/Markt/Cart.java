package Markt;

import java.util.ArrayList;

public class Cart {

	ArrayList<Cartitem> items =new ArrayList<>();
	
	public double sumaproduktow(){
		double sum =0;
		for (Cartitem it : items)
			sum+=it.getprodukt().getprice();
		return sum;
	}
	public ArrayList<Cartitem> getitems(){return items;}
	
	public Cart addProduct(Product p){
		
		items.add(new Cartitem(p));
		return this;
	}
	
	@Override
	public String toString(){return "koszyk - \n items="+items+".";}
	
	
	
}
