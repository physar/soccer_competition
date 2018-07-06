package soccer_competition;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
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
			ArrayList<String> s = new ArrayList<String>();
			while ((a = br.readLine()) != null) {
				System.out.println(a);
				s.add(a);
				// TBC: create an instance of class club for each line
			};
			System.out.println(s);
			

		} catch (IOException e) {
			System.err.println("Error reading file.");
			e.printStackTrace();
			System.exit(1);
		}
	}
}
