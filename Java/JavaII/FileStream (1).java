/***************************
	Paul Russell
	lab 6
	Java II
*****************************/
import java.io.*;

public class FileStream{
	
	public void writing(String w , String fp){
		File newFile3 = new File(fp);
		
		try{
		if (newFile3.exists())
			System.out.println("this file already exists and did you know if you only have one line of code you dont need to add brakets in java?");

		else{
			newFile3.createNewFile();
			PrintStream PS = new PrintStream(System.out);
			PS.println("Hello World from a stream");
			PS.flush();
			System.out.println("file created");
		}
		}
		catch(Exception e){
			System.out.println(e);
		}	
	}
	
	
	public static void main (String[] args){
	FileStream w = new FileStream();
	w.writing("Did it work?", "C:\\Users\\Paul Russell\\Desktop\\Java II\\newFile2.txt");
	
	}
	
}
	