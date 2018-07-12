package soccer_competition;

import java.util.Comparator;

public class ComparatorPoints implements Comparator<Club> {
	
    public int compare(Club self, Club other) {
    	return self.getPunten().compareTo(other.getPunten());
    }
    
}
