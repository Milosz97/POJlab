package demo;

public class program {

	public static void main(String[] args) {
		
		Car car = new Car("BMW",true,0,100000.99);
		car.printcar();
		System.out.println("===> zmieniam wartosc");
		car.setprzebieg(100);
		System.out.println("nowy przebieg: "+ car.getprzebieg());
		
	}

}
