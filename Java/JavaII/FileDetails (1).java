/***************************
	Paul Russell
	lab 6
	Java II
*****************************/
import java.io.*;
public class FileDetails{
String filePath;

	public void FD(String fp){
		filePath = fp;
		
			try{
				File Tfile = new File(filePath);
				System.out.println(Tfile.length());
				boolean read = Tfile.canRead();
				if(!true){
					System.out.println("This file cant be read");
				}
				else{
					System.out.println("This file can be read");
				}
				System.out.println("this file can be written in " + Tfile.canWrite());
			}
				
			catch(Exception e){
				System.out.println(e);
				
			}
		}

		
		public static void main (String[] args){
		FileDetails f = new FileDetails();
		f.FD("C:\\Users\\Paul Russell\\Desktop\\Java II\\test.txt");
		}
}