package pozoristance;

public class Pozoriste {
	
	public static int idGlobal=0;
	private int id;
	private String naziv;
	
	public Pozoriste(String naziv) {
		id=idGlobal++;
		this.naziv=naziv;
		
	}

	public int getId() {
		return id;
	}

	public String getNaziv() {
		return naziv;
	}
	
	public String getSkraceniNaziv(String naziv) {
		String acronym=null;
	    acronym += naziv.toUpperCase().charAt(0);

        for (int i = 1; i <= naziv.length() - 1; i++) {
            if (naziv.charAt(i - 1) == ' ') {
                acronym += naziv.toUpperCase().charAt(i);
            }
        }    
        return acronym;
    }

	@Override
	public String toString() {
		return "Pozoriste [id=" + id + ", naziv=" + naziv + "]";
	}
}
