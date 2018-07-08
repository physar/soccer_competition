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
		//System.out.println(this.thuis.getNaam() + "-" + this.uit.getNaam() +
		//		"\t" + this.getGoalsThuis() + "\t" + this.getGoalsUit());
		if(getGoalsThuis() == getGoalsUit()) {
			thuis.gelijkSpel(goalsThuis, goalsUit);
			uit.gelijkSpel(goalsUit, goalsThuis);
		}else if(getGoalsThuis() > getGoalsUit()) {
			thuis.gewonnenWedstrijd(goalsThuis, goalsUit);
			uit.verlorenWedstrijd(goalsUit, goalsThuis);
		}else if(getGoalsThuis() < getGoalsUit()) {
			thuis.verlorenWedstrijd(goalsThuis, goalsUit);
			uit.gewonnenWedstrijd(goalsUit, goalsThuis);
		}
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
