package soccer_competition;

public class Club {
	private String naam;
	private int goalsThuis;
	private int goalsUit;
	private int punten;
	
	public Club (String naam) {
		this.naam = naam;
		this.setGoalsThuis(0);
		this.setGoalsUit(0);
		this.setPunten(0);
	}

	private void setGoalsUit(int goals) {
		this.goalsUit = goals;
	}

	private void setGoalsThuis(int goals) {
		this.goalsThuis = goals;
	}

	public String getNaam() {
		return this.naam;
	}
	
	private void setNaam(String naam) {
		this.naam = naam;
	}
	
    public int getGoalsThuis(){
        return this.goalsThuis;
    }

    public int getGoalsUit(){
        return this.goalsUit;
    }

	public void addPunten(int punten) {
		this.setPunten(this.getPunten() + punten);
	}

	public int getPunten() {
		return punten;
	}

	public void setPunten(int punten) {
		this.punten = punten;
	}
}
