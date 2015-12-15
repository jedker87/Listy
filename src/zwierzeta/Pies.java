package zwierzeta;

public class Pies extends Zwierze {

	private String rasa;
	private boolean domowy;

	public Pies(String imie, double waga, String rasa, boolean domowy) {
		super(imie, waga);
		this.rasa = rasa;
		this.domowy = domowy;
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

	public String getRasa() {
		return rasa;
	}

	public void setRasa(String rasa) {
		this.rasa = rasa;
	}

	public boolean isDomowy() {
		return domowy;
	}

	public void setDomowy(boolean domowy) {
		this.domowy = domowy;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + (domowy ? 1231 : 1237);
		result = prime * result + ((rasa == null) ? 0 : rasa.hashCode());
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
		Pies other = (Pies) obj;
		if (domowy != other.domowy)
			return false;
		if (rasa == null) {
			if (other.rasa != null)
				return false;
		} else if (!rasa.equals(other.rasa))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Pies [imie=" + imie + ", waga=" + waga + ", rasa=" + rasa + ", domowy=" + domowy + "]";
	}

	// dopisz metode toString
}
