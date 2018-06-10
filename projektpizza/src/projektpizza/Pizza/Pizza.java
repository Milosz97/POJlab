package projektpizza.Pizza;

import java.util.ArrayList;

public abstract class Pizza {

	protected String nazwa;
	protected double cena;
	protected int poziomOstrosci;
	protected String rozmiarPizza;
	protected ArrayList<Skladnik> listaSkladnikow = new ArrayList<>();
	
	public void przygotowanie() {
		System.out.println("Przygotowywanie: "+nazwa);
		System.out.println("Poziom ostroœci: "+poziomOstrosci);
		System.out.println("Rozmiar: "+getRozmiarPizza());
		System.out.println("Cena: "+getCena());
		System.out.println("Sk³adniki: ");
		for(Skladnik s : getListaSkladnikow()) {
			System.out.println(" "+s);
		}
	}
	
	public void pieczenie() {
		System.out.println("Twoja pizza siê w³aœnie piecze");
	}
	public void krojenie() {
		System.out.println("Kroimy pizze");
	}
	public void pakowanie() {
		System.out.println("Pakujemy pizze do pude³ka");
	}
	public String getNazwa() {
		return nazwa;
	}

	public void setNazwa(String nazwa) {
		this.nazwa = nazwa;
	}

	public double getCena() {
		return cena;
	}

	public void setCena(double cena) {
		this.cena = cena;
	}

	public int getPoziomOstrosci() {
		return poziomOstrosci;
	}

	public void setPoziomOstrosci(int poziom_ostroœci) {
		this.poziomOstrosci = poziom_ostroœci;
	}
	
	public String getRozmiarPizza() {
		return rozmiarPizza;
	}

	public void setRozmiarPizza(String rozmiarPizza) {
		this.rozmiarPizza = rozmiarPizza;
	}

	public ArrayList<Skladnik> getListaSkladnikow() {
		return listaSkladnikow;
	}

	public void setListaSkladnikow(ArrayList<Skladnik> listaSkladnikow) {
		this.listaSkladnikow = listaSkladnikow;
	}

	@Override
	public String toString() {
		return "Pizza [nazwa=" + getNazwa() + ", cena=" + getCena() + ", poziomOstrosci=" + getPoziomOstrosci() + ", rozmiarPizza="
				+ getRozmiarPizza() + ", listaSkladnikow=" + getListaSkladnikow() + "]";
	}

}
