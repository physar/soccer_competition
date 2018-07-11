package soccer_competition;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.io.BufferedReader;
import java.util.ArrayList;

public class Competition {

	public static void main(String[] args) {

		File f = new File("eredivisie.txt");

		if (args.length == 1) {
			f = new File(args[0]);
		} else if (args.length > 1){
			System.out.println("Give a textfile with the clubnames in the competition");
		}
		ArrayList<Club> voetbal = new ArrayList<Club>();
		try {

			FileReader fr = new FileReader(f);
			BufferedReader br = new BufferedReader(fr);

			String a = "";
			while ((a = br.readLine()) != null) {
				//System.out.println(a);	
				Club d = new Club(a);
				voetbal.add(d);
			};
			

		} catch (IOException e) {
			System.err.println("Error reading file.");
			e.printStackTrace();
			System.exit(1);
		}
		
		for(int i = 0; i < voetbal.size(); i++) {
			for(int j = 0; j < voetbal.size(); j++) {
				if(voetbal.get(i).getNaam() != voetbal.get(j).getNaam()) {
					Wedstrijd wed = new Wedstrijd(voetbal.get(i),voetbal.get(j));
				}
			}
		}
		Collections.sort(voetbal, Collections.reverseOrder(new ClubComparator()));
		System.out.println("Pos\tClub\t\tGew\tGel\tVer\tPun\tVoo\tTeg");
		for(int i = 0; i < voetbal.size(); i++) {
			
	//		if(i > 0) {
	//		System.out.println(voetbal.get(i).compare(voetbal.get(i), voetbal.get(i-1)));
	//		}
			System.out.printf((i+1) + "\t" + "%9s" + 
					"\t" + voetbal.get(i).getGewonnen() + "\t" + 
					voetbal.get(i).getGelijkspelen() + "\t" + 
					voetbal.get(i).getVerloren() + "\t" + 
					voetbal.get(i).getPunten() + "\t"+
					voetbal.get(i).getGoalsThuis() + "\t" +
					voetbal.get(i).getGoalsUit() + "\t" +
					"\n", voetbal.get(i).getNaam());
		}
	}
}
