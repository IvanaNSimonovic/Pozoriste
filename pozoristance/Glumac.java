package pozoristance;

public class Glumac extends Zaposleni{
	
	private final String imePosla="Glumac";
	
	public Glumac(String i, Pozoriste p) {
		super(i, p);
	}

	@Override
	public String imePosla() {
		return imePosla;
	}

	
	

}
