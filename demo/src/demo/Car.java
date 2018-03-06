package demo;

public class Car {
private String marka;
private boolean nowy;
private int przebieg;
private double cena;

void printcar(){
System.out.println("Marka: "+ marka);
System.out.println("Nowy: "+nowy);
System.out.println("Przebieg: "+przebieg);
System.out.println("Cena: "+cena);
}

Car(){
	System.out.println("Inicjacja z nowego konstruktora");
}

Car(String marka){
	this();
	this.marka=marka;
}
Car(String marka,boolean nowy,int przebieg,double cena){
	this(marka);
	this.nowy=nowy;
	this.przebieg=przebieg;
	this.cena=cena;
	}

public String getmarka(){ return marka;}
public boolean nowy(){ return nowy;}
public void setnowy(boolean nowy){ this.nowy=nowy;}
public int getprzebieg(){ return przebieg;}
public void setprzebieg(int przebieg){ this.przebieg=przebieg;}
public double getcena(){ return cena;}
public void setcena(double cena){this.cena=cena;}



}

