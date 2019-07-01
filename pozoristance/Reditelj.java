package pozoristance;

public class Reditelj extends Zaposleni{
	
	private final String imePosla="Reditelj";
	
	public Reditelj(String s, Pozoriste p) {
		super(s,p);
		
	}

	@Override
	public String imePosla() {
		return imePosla;
	}

}
