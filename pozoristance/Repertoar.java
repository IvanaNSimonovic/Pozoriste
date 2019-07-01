package pozoristance;

import java.util.LinkedList;

public class Repertoar {
	
	private Pozoriste pozoriste;
	private LinkedList<Predstava> predstave;
	
	public Repertoar (Pozoriste p) {
		pozoriste=p;
	}
	
	public void dodaj(Predstava p) {
		predstave.add(p);
		
	}
	
	public void ukloni (String imePredstave) {
		for(int i=0; i<predstave.size()-1; i++) {
			if ((predstave.get(i).getNaziv()).contentEquals(imePredstave)) predstave.remove(i);
		}
	}

	@Override
	public String toString() {
		return "Repertoar [pozoriste=" + pozoriste + ", predstave=" + predstave + "]";
	}

}
