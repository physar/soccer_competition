package soccer_competition;

import java.util.List;

public class MultiComparator<Club> implements Comparator<Club> {
	private List<Comparator<Club>> comparators;
	
	public MultiComparator(List<Comparator<Club>> comparators) {
		this.comparators = comparators;
	}
	
	public int compare(Club o1, Club o2) {
		for (Comparator<CLub>> comparator : comparators) {
			int comparison = comparator.compare(o1, o2);
			if (comparison != 0) return comparison;
			}
		return 0;
	    }
	}
}
}