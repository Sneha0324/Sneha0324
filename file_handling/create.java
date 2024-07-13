package file_handling;

import java.io.File;
import java.io.IOException;

public class create {

	public static void main(String[] args) {
		
		try{
			File myFile = new File("filename.txt");
			
			if(myFile.createNewFile()) {
				System.out.println("File created: "+myFile.getName());
			}else {
				System.out.println("File already exists");
			}
		} catch(IOException e) {
			System.out.println("An error occured");
			e.printStackTrace();
		}
		
		
	}
}
