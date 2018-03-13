package Markt;

public class Product {

	private String name;
	private double price;

	public String getname(){return name;}
	public void setname(String name){this.name=name;}
	
	public double getprice(){return price;}
	public void setprice(double price){this.price=price;}
	
	@Override
	public String toString(){return "produkt - nazwa="+name+", cena="+price+".";}
}
