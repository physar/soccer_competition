package soccer_competition;

import java.util.Collections;
import java.util.Comparator;

public class Club {
	private String naam;
	private int goalsThuis;
	private int goalsUit;
	private int punten;
	private int gewonnen;
	private int verloren;
	private int gelijkspelen;
	
	public Club (String naam) {
		this.naam = naam;
		this.setGoalsThuis(0);
		this.setGoalsUit(0);
		this.setPunten(0);
		this.setGewonnen(0);
		this.setGelijkspelen(0);
		this.setVerloren(0);
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

	public Integer getPunten() {
		return punten;
	}

	public void setPunten(int punten) {
		this.punten = punten;
	}

	public void gewonnenWedstrijd(int goalsThuis, int goalsUit) {
		//System.out.println(this.getNaam() + "\tgewonnen: (" + this.goalsThuis + "-" + this.goalsUit + ") + (" + goalsThuis + "-" + goalsUit + ")");
		this.addPunten(3);
		this.goalsThuis += goalsThuis;
		this.goalsUit += goalsUit;
		this.setGewonnen(this.getGewonnen() + 1);
		
	}

	public void verlorenWedstrijd(int goalsThuis, int goalsUit) {
		//System.out.println(this.getNaam() + "\tverloren: (" + this.goalsThuis + "-" + this.goalsUit + ") + (" + goalsThuis + "-" + goalsUit + ")");
		this.addPunten(0);
		this.goalsThuis += goalsThuis;
		this.goalsUit += goalsUit;
		this.setVerloren(this.getVerloren() + 1);
	}

	public void gelijkSpel(int goalsThuis, int goalsUit) {
		//System.out.println(this.getNaam() + "\tgelijk: (" + this.goalsThuis + "-" + this.goalsUit + ") + (" + goalsThuis + "-" + goalsUit + ")");
		this.addPunten(1);
		this.goalsThuis += goalsThuis;
		this.goalsUit += goalsUit;
		this.setGelijkspelen(this.getGelijkspelen() + 1);
	}

	public int getGewonnen() {
		return this.gewonnen;
	}

	public void setGewonnen(int gewonnen) {
		this.gewonnen = gewonnen;
	}

	public int getVerloren() {
		return this.verloren;
	}

	public void setVerloren(int verloren) {
		this.verloren = verloren;
	}

	public int getGelijkspelen() {
		return this.gelijkspelen;
	}

	public void setGelijkspelen(int gelijkspelen) {
		this.gelijkspelen = gelijkspelen;
	}
	
}


