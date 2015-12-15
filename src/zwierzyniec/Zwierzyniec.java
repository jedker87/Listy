package zwierzyniec;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import zwierzeta.Kot;
import zwierzeta.Kura;
import zwierzeta.Pies;
import zwierzeta.Zwierze;

public class Zwierzyniec {

	private List<Zwierze> zwierzeta;

	public Zwierzyniec() {
		
		

		zwierzeta = new ArrayList<>();
	}

	public void dodajZwierze(Zwierze a) {
		zwierzeta.add(a);
	}

	// za pomoca metody remove usun zwierze takie jak podane w parametrze
	public void usunZwierze(Kura kura) {
		zwierzeta.remove(kura);
	}

	// za pomoca metody remove usun zwierze takie jak podane w parametrze
	public void usunZwierze(Pies pies) {
		zwierzeta.remove(pies);
	}
	
	public void usunZwierze(Kot kot){
		zwierzeta.remove(kot);
	}

	// @Override
	// public String toString() {
	// return "Zwierzyniec [zwierzeta=\n" + zwierzeta + "]";
	// }

	// napisz metode toString tak zeby wyswieltala wszystkie zwierzeta

	public String toString() {
		String tmp = "";
		for (Zwierze s : zwierzeta) {
			tmp += s + "\n";

		}
		return tmp;

	}
	
	public void sortowanie(){
		Collections.sort(zwierzeta);
	}
}
