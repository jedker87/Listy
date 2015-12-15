package zwierzeta;

public class Zwierze implements Comparable<Zwierze> {

	protected String imie;
	protected double waga;

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

	public Zwierze(String imie, double waga) {
		this.imie = imie;
		this.waga = waga;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((imie == null) ? 0 : imie.hashCode());
		long temp;
		temp = Double.doubleToLongBits(waga);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Zwierze other = (Zwierze) obj;
		if (imie == null) {
			if (other.imie != null)
				return false;
		} else if (!imie.equals(other.imie))
			return false;
		if (Double.doubleToLongBits(waga) != Double.doubleToLongBits(other.waga))
			return false;
		return true;
	}

	@Override
	public int compareTo(Zwierze arg0) {
//		String klasa1 = arg0.getClass().getSimpleName();
//		String klasa2 = this.getClass().getSimpleName();
//		return klasa2.compareTo(klasa1);
		return imie.compareTo(arg0.getImie());
	}

}