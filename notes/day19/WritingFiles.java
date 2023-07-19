package Day19;

import java.io.File;
import java.io.FileWriter;

public class WritingFiles {

	public static void main(String[] args) {
		
	File f = new File("C:\\Users\\Dell\\eclipse-workspace\\JavaTrainingb6\\src\\test\\resources\\demo.txt");
	
	FileWriter fw ;
	
	try {
		fw = new FileWriter(f);
		fw.write("This is Last session of java Hope u guys enjoyed it");
		fw.close();
		
	} catch (Exception e) {
		System.out.println(e);
		// TODO: handle exception
	}
		

	}

}
