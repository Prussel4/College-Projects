/***************************
	Paul Russell
	lab 6
	Java II
*****************************/
import java.io.*;
import java.util.*;
public class ReadInts{
	private Scanner x;
	
	public void openFile(){
		try{
			x = new Scanner(new File("C:\\Users\\Paul Russell\\Desktop\\Java II\\newFile.dat"));
		}
		catch (Exception e){
			System.out.println(e);
		}
	}
	
	public void readFile(){
		while (x.hasNext()){
			String a = x.next();
			 a = a + " ";
			System.out.println("");
			System.out.printf(a);
		}
	}
		
	public void closeFile(){
		x.close();
	}
	
	public static void main (String[] args){
		ReadInts r = new ReadInts();
		r.openFile();
		r.readFile();
		r.closeFile();
	}
	}
