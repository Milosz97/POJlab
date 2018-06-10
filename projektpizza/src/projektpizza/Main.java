package projektpizza;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Witaj");
		Scanner skaner = new Scanner(System.in);
		Scanner skaner2 = new Scanner(System.in);
		boolean kontynuuj = true;
		Zamowienie zamowienie = new Zamowienie();
		Pizzeria pizzeria = new PizzeriaGdansk();
		
		System.out.println("Obecny stan: "+zamowienie.getStanZamowienia());
		while(kontynuuj) {
			if(!zamowienie.getZamowionePizze().isEmpty()){
				System.out.println("Czy chcesz dodaæ wiêcej pizz do zamówienia?");
				System.out.println("[1] Tak");
				System.out.println("[2] Nie");
				
				int wybor3 = skaner.nextInt();
				
				if(wybor3 == 2) {
					kontynuuj = false;
					continue;
				}else if(wybor3 != 1 && wybor3 != 2) {
					System.out.println("Poda³eœ z³¹ liczbe");
					continue;
				}
			}
			
			System.out.println("Wybierz pizze");
			System.out.println("[1] Wegetariañska");
			System.out.println("[2] Capricciosa");
			System.out.println("[3] Pepperoni");
			System.out.println("[4] Zrezygnuj");
		
			int wybor1 = skaner.nextInt();
			
			if(wybor1 == 4) {
				System.out.println("Zrezygnowa³eœ");
				zamowienie.zrezygnujZZamowienia();
				System.out.println("Obecny stan: "+zamowienie.getStanZamowienia());
				
				return;
			}else if(wybor1 != 1 && wybor1 != 2 && wybor1 != 3 && wybor1 != 4 ) {
				System.out.println("Poda³eœ z³¹ liczbe");
				continue;
			}
			
			System.out.println("Wybierz rozmiar");
			System.out.println("[1] Ma³a");
			System.out.println("[2] Œrednia");
			System.out.println("[3] Du¿a");
			
			int wybor2 = skaner.nextInt();
			
			if(wybor2 != 1 && wybor2 != 2 && wybor2 != 3) {
				System.out.println("Poda³eœ z³¹ liczbe");
				continue;
			}
			
			zamowienie.getZamowionePizze().add(pizzeria.zamowPizza(wybor1, wybor2));
			
		}
		zamowienie.zlozZamowienie();
		System.out.println("Obecny stan: "+zamowienie.getStanZamowienia());
		
		int wybor4 = 0;
		while(wybor4 != 1 && wybor4 != 2) {
			System.out.println("Z dostaw¹ pod adres, czy odbiór osobisty?");
			System.out.println("[1] Wyœlij pod podany adres (+5 PLN)");
			System.out.println("[2] Odbiorê osobiœie");
			wybor4 = skaner.nextInt();
		}
		
		if(wybor4 == 1) {
			System.out.println("Podaj adres");
			zamowienie.setDowoz(true);
		}else if(wybor4 == 2) {
			System.out.println("Podaj osobê, która bêdzie odbieraæ zamówienie");	
		}
		zamowienie.setOdbiorca(skaner2.nextLine());
		System.out.println(zamowienie);
		
		int wybor5 = 0;
		while(wybor5 != 1 && wybor5 != 2) {
			System.out.println("[1] PotwierdŸ");
			System.out.println("[2] Zrezygnuj z zamówienia");
			wybor5 = skaner.nextInt();
		}
	
		if(wybor5 == 1) {
			System.out.println("Potwierdzono zamówienie");
			zamowienie.potwierdzZamowienie();
			System.out.println("Obecny stan: "+zamowienie.getStanZamowienia());
		}else {
			System.out.println("Zrezygnowa³eœ z zamówienia");
			zamowienie.zrezygnujZZamowienia();
			System.out.println("Obecny stan: "+zamowienie.getStanZamowienia());
			return;
		}
		zamowienie.zrobPizze(pizzeria);
		System.out.println("Obecny stan: "+zamowienie.getStanZamowienia());
		skaner.close();
		skaner2.close();
	}

}
