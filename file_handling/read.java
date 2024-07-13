package file_handling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class read {

	public static void main(String[] args) {
		
		try{
			File myFile = new File("filename.txt");
			Scanner myReader = new Scanner(myFile);
			while(myReader.hasNextLine()) {
				String data = myReader.nextLine();
				System.out.println(data);
			}
		}catch(FileNotFoundException e) {
			System.out.println("An error occured");
			e.printStackTrace();
		}
		
	}
}
