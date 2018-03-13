package Markt;

public class Cartitem {

	private Product produkt;
	private double obecnacena;
	
	public Cartitem(Product produkt){
		this.produkt=produkt;
		this.obecnacena=produkt.getprice();
	}
	
	public Product getprodukt(){return produkt;}
	public void setprodukt(Product produkt){this.produkt=produkt;}
	
	public double getobecnacena(){return obecnacena;}
	public void setobecnacena(double obecnacena){this.obecnacena=obecnacena;}
	
	@Override
	public String toString(){return "rzecz w koszyku - produkt=" +produkt+",obecna cena="+obecnacena+".";}
	
}
