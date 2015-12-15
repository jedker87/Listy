package zwierzeta;

public class Kot extends Zwierze {

	private String kolor;
	private int wiek;

	public String getKolor() {
		return kolor;
	}

	public void setKolor(String kolor) {
		this.kolor = kolor;
	}

	public int getWiek() {
		return wiek;
	}

	public void setWiek(int wiek) {
		this.wiek = wiek;
	}

	public Kot(String imie, double waga, String kolor, int wiek) {
		super(imie, waga);
		this.kolor = kolor;
		this.wiek = wiek;

	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((kolor == null) ? 0 : kolor.hashCode());
		result = prime * result + wiek;
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
		Kot other = (Kot) obj;
		if (kolor == null) {
			if (other.kolor != null)
				return false;
		} else if (!kolor.equals(other.kolor))
			return false;
		if (wiek != other.wiek)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Kot [imie=" + imie + ", waga=" + waga + ", kolor=" + kolor + ", wiek=" + wiek + "]";
	}

}
