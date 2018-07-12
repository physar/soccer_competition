package soccer_competition;

import java.util.Comparator;
import java.util.List;

public class MultiComparator implements Comparator<Club> {
	private List<Comparator<Club>> comparators;
	
	public MultiComparator(List<Comparator<Club>> comparators) {
		this.comparators = comparators;
	}
	
	public int compare(Club o1, Club o2) {
		for (Comparator<Club> comparator : comparators) {
			int comparison = comparator.compare(o1, o2);
			if (comparison != 0) return comparison;
			}
		return 0;
		}
   }



