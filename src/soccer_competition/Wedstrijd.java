package soccer_competition;

import java.util.concurrent.ThreadLocalRandom;

public class Wedstrijd {
	private Club thuis;
	private Club uit;
	private int goalsThuis;
	private int goalsUit;
	
	
	public Wedstrijd(Club thuis, Club uit) {
		this.thuis = thuis;
		this.uit = uit;
		setGoalsThuis();
		setGoalsUit();
		if(getGoalsThuis() == getGoalsThuis()) {
			thuis.addPunten(1);
			uit.addPunten(1);
		}
		// Winst en verlies 3-0 en 0-3
	}
	
    public int getGoalsThuis(){
        return this.goalsThuis;
    }

    public int getGoalsUit(){
        return this.goalsUit;
    }
	
	private void setGoalsThuis(){
        this.goalsThuis = ThreadLocalRandom.current().nextInt(0, 5);
    }
	
    private void setGoalsUit(){
        this.goalsUit = ThreadLocalRandom.current().nextInt(0, 3);
    }

}
