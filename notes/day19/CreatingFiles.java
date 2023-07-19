package Day19;

import java.io.File;

public class CreatingFiles {

	public static void main(String[] args) {
		
		File f = new File("C:\\Users\\Dell\\eclipse-workspace\\JavaTrainingb6\\src\\test\\resources\\demo.txt");
		
		try {
			
			if(f.createNewFile())
			{
				System.out.println("File has been created");
			}
			else
			{
				System.out.println("File is alread created ");
			}
			
			
		} catch (Exception e) {System.out.println(e);// TODO: handle exception
		}
		
		
	}

}
