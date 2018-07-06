package soccer_competition;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
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

		try {

			FileReader fr = new FileReader(f);
			BufferedReader br = new BufferedReader(fr);

			Club d = new Club("");
			String a = d.getNaam();
			//ArrayList<Object> voetbal1 = new ArrayList<Object>();
			while ((a = br.readLine()) != null) {
				//System.out.println(a);
				ArrayList<Object> voetbal = new ArrayList<Object>();
				voetbal.add(a);
				System.out.println(voetbal);
				for(int i = 0; i < voetbal.size(); i++) {
					for(int j = voetbal.size(); j <= 0; j--) {
						if(voetbal.get(i) != voetbal.get(j)) {
							System.out.println(voetbal.get(i) + "-" + voetbal.get(j)); 
						}
					}
				}
				//voetbal1.add(voetbal);
				// TBC: create an instance of class club for each line
			};
			

		} catch (IOException e) {
			System.err.println("Error reading file.");
			e.printStackTrace();
			System.exit(1);
		}
	}
}
