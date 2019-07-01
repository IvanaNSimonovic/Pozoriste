package pozoristance;

public class Kostimograf extends Zaposleni {
	
	private final String imePosla="Kostimograf";
	
	public Kostimograf(String i, Pozoriste p) {
		super(i, p);
		
	}

	@Override
	public String imePosla() {
		
		return imePosla;
	}

}
