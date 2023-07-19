package Day19;

import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

public class ReadingFiles {

	public static void main(String[] args) {
		
		File f = new File("C:\\Users\\Dell\\eclipse-workspace\\JavaTrainingb6\\src\\test\\resources\\demo.txt");
		FileReader fr ;
		
		try {
			fr = new FileReader(f);
			Scanner s = new Scanner(f);
			
			if(s.hasNextLine())
			{
				System.out.println(s.nextLine());
			}
			else
			{
				System.out.println("File is not presented");
			}
			
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
