package file_handling;

import java.io.FileWriter;
import java.io.IOException;

public class write {

	public static void main(String[] args) {
		try {
			FileWriter myWriter = new FileWriter("filename.txt");
			myWriter.write("This is the file which is created by file handling code.\n");
			myWriter.write("This is the second line.\n");
			myWriter.write("This is the third line.");
			myWriter.close();
			System.out.println("Sucessfully wrote to the file.");
		}catch(IOException e) {
			System.out.println("An error occured");
			e.printStackTrace();
		}
	}
}
