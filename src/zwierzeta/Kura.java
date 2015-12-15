package zwierzeta;

public class Kura extends Zwierze {

	private int iloscJajekNaTydzien;

	public Kura(String imie, double waga, int iloscJajekNaTydzien) {
		super(imie, waga);
		this.iloscJajekNaTydzien = iloscJajekNaTydzien;
	}

	public String getImie() {
		return imie;
	}

	public void setImie(String imie) {
		this.imie = imie;
	}

	public double getWaga() {
		return waga;
	}

	public void setWaga(double waga) {
		this.waga = waga;
	}

	public int getIloscJajekNaTydzien() {
		return iloscJajekNaTydzien;
	}

	public void setIloscJajekNaTydzien(int iloscJajekNaTydzien) {
		this.iloscJajekNaTydzien = iloscJajekNaTydzien;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + iloscJajekNaTydzien;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Kura other = (Kura) obj;
		if (iloscJajekNaTydzien != other.iloscJajekNaTydzien)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Kura [imie=" + imie + ", waga=" + waga + ", iloscJajekNaTydzien=" + iloscJajekNaTydzien + "]";
	}

}
