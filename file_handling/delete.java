package file_handling;

import java.io.File;

public class delete {

	public static void main(String[] args) {
		File myFile = new File("filename.txt");
		if(myFile.delete()) {
			System.out.println("Deleted File: "+myFile.getName());
		}else {
			System.out.println("Failed to delete the file.");
		}
	}
}
