package soccer_competition;

import java.util.Comparator;

public class ClubComparator implements Comparator<Club> {
	
    public int comparePoints(Club self, Club other) {
    	return self.getPunten().compareTo(other.getPunten());
    }
    
    public int compare(Club self, Club other) {
    	return  Integer.compare(self.getGoalsThuis()-self.getGoalsUit(),other.getGoalsThuis()-other.getGoalsUit());
    }
}
