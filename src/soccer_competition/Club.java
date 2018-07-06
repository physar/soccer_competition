package soccer_competition;

import java.util.Collection;

public class Club {
	private String naam;
	
	public Club (String naam) {
		this.naam = naam;
	}

	public String getNaam() {
		return this.naam;
	}
	
	private void setNaam(String naam) {
		this.naam = naam;
	}
}
