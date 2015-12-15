
import zwierzeta.Kot;
import zwierzeta.Kura;
import zwierzeta.Pies;
import zwierzyniec.Zwierzyniec;

public class Main {

	public static void main(String[] args) {

		Kura kura1 = new Kura("Edward", 5.2, 15);
		Kura kura2 = new Kura("Zbyszek", 4.9, 13);
		Pies pies1 = new Pies("Stefan", 3.6, "York", true);
		Pies pies2 = new Pies("Fred", 14.8, "Bokser", false);
		Kot kot1 = new Kot("Antek", 5.3, "Czarny", 8);
		Kot kot2 = new Kot("Filemon", 8.3, "Bialy", 5);
		
		//System.out.println(kot1.getClass().getSimpleName());

		Zwierzyniec mojZwierzyniec = new Zwierzyniec();
		mojZwierzyniec.dodajZwierze(kura1);
		mojZwierzyniec.dodajZwierze(pies1);
		mojZwierzyniec.dodajZwierze(kot1);
		mojZwierzyniec.dodajZwierze(kura2);
		mojZwierzyniec.dodajZwierze(pies2);
		mojZwierzyniec.dodajZwierze(kot2);
		mojZwierzyniec.sortowanie();
		System.out.println("Pelna lista zwierzat: ");
		System.out.println(mojZwierzyniec);
		System.out.println("Lista zwierzat po usunieciu Psow: ");
		mojZwierzyniec.usunZwierze(pies1);
		mojZwierzyniec.usunZwierze(pies2);
		System.out.println(mojZwierzyniec);
		mojZwierzyniec.usunZwierze(kot1);
		mojZwierzyniec.usunZwierze(kot2);
		System.out.println("Lista po usunieciu Psow i Kotow: ");
		System.out.println(mojZwierzyniec);

	}

}
