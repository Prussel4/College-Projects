import java.io.*;
import java.util.*;
public class FileRead{
	private Scanner x;
	
	public void openFile(){
		try{
			x = new Scanner(new File("C:\\Users\\Paul Russell\\Desktop\\Java II\\newFile.txt"));
		}
		catch (Exception e){
			System.out.println(e);
		}
	}
	
	public void readFile(){
		while (x.hasNext()){
			String a = x.next();
			 a = a + " ";
			System.out.printf(a);
		}
	}
		
	public void closeFile(){
		x.close();
	}
	
	public static void main (String[] args){
		FileRead r = new FileRead();
		r.openFile();
		r.readFile();
		r.closeFile();
	}
	}
