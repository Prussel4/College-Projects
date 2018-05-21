import java.io.*;
import java.util.*;
public class FileWriteInt{
	
	public void writing(int[] w , String fp){
		File newFile = new File(fp);
		
		try{
		if (newFile.exists())
			System.out.println("this file already exists and did you know if you only have one line of code you dont need to add brakets in java?");

		else{
			newFile.createNewFile();
			FileWriter fileW = new FileWriter(newFile);
			BufferedWriter buffW = new BufferedWriter(fileW);
			
			
			for ( int i = 0; i <=4; i++){
			
			buffW.write(w[i]+" ");
			}
			buffW.close();
			System.out.println("file created");
		}
		}
		catch(Exception e){
			System.out.println(e);
		}	
	}
	
	
	public static void main (String[] args){
	int myArr[]={16, 31, 90, 45, 89};
	FileWriteInt w = new FileWriteInt();
	w.writing(myArr, "C:\\Users\\Paul Russell\\Desktop\\Java II\\newFile.dat");
	
	}
	
}
	