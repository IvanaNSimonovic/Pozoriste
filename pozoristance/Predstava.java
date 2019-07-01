package pozoristance;

import java.util.LinkedList;

public class Predstava {
	
	private String naziv;
	private Pozoriste pozoriste;
	private LinkedList zaposleni;
	
	public Predstava (String n, Pozoriste p, Reditelj r) {
		naziv=n;
		pozoriste=p;
		zaposleni.add(r);
	}
	
	public boolean dodaj (Glumac g) {
		zaposleni.add(g);
		return true;
	}
	
	public boolean dodaj (Kostimograf k) {
		int j=0;
		while(j<2) {
		for(int i=0; i<zaposleni.size()-1;i++) {
			if (zaposleni.get(i) instanceof Kostimograf) {
				j+=1;zaposleni.add(k);
				}
	     }
		zaposleni.add(k);
		return true;
		}
	  return false;
   }

	public String getNaziv() {
		return naziv;
	}

	public Pozoriste getPozoriste() {
		return pozoriste;
	}

	@Override
	public String toString() {
		return "Predstava [naziv=" + naziv + ", pozoriste=" + pozoriste + ", zaposleni=" + zaposleni + "]";
	}
	
	
}
