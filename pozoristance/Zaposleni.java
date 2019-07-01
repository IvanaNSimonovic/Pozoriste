package pozoristance;

public abstract class Zaposleni {
	String ime;
	Pozoriste pozoriste;
	
	public Zaposleni(String i, Pozoriste p) {
		ime=i;
		pozoriste=p;
	}
	
	public abstract String imePosla();

	public String getIme() {
		return ime;
	}

	public Pozoriste getPozoriste() {
		return pozoriste;
	}

	@Override
	public String toString() {
		return "Zaposleni [ime=" + ime + ", pozoriste=" + pozoriste + "]";
	}

}
