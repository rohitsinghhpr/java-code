package file_handling;
import java.io.File;
import java.io.IOException;

public class FileClass {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		// File - used to create a file 
		File myfile = new File("index.html");
		
		// method of File class
		
		myfile.createNewFile();
		
		System.out.println(myfile.exists());
		
		if(myfile.exists()) {
		    myfile.delete();
		}
		
	}

}
