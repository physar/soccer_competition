package soccer_competition;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;

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

			String st;
			while ((st = br.readLine()) != null) {
				System.out.println(st);
				// TBC: create an instance of class club for each line
			};

		} catch (IOException e) {
			System.err.println("Error reading file.");
			e.printStackTrace();
			System.exit(1);
		}
	}
}
