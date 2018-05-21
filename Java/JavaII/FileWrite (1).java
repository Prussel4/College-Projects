import java.io.*;

public class FileWrite{
	
	public void writing(String w , String fp){
		File newFile = new File(fp);
		
		try{
		if (newFile.exists())
			System.out.println("this file already exists and did you know if you only have one line of code you dont need to add brakets in java?");

		else{
			newFile.createNewFile();
			FileWriter fileW = new FileWriter(newFile);
			BufferedWriter buffW = new BufferedWriter(fileW);
			buffW.write(w);
			buffW.close();
			System.out.println("file created");
		}
		}
		catch(Exception e){
			System.out.println(e);
		}	
	}
	
	
	public static void main (String[] args){
	FileWrite w = new FileWrite();
	w.writing("Did it work?", "C:\\Users\\Paul Russell\\Desktop\\Java II\\newFile.txt");
	
	}
	
}
	