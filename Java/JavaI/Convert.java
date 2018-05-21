/***************************
	Paul Russell
	lab 2
	Java I
*****************************/
import java.util.Scanner;
public class Convert {
	
	public static void main(String[] args){
	//declare vars
	double cel = 0;
	double fahr = 0f;
	//conversion
	
	System.out.println("Please input the Fahrenheit");
	
	Scanner temp = new Scanner(System.in);
	
	fahr = temp.nextInt();
	
	cel = (5.0/9.0)*(fahr-32.0) ;
	System.out.println("The temp in C is :" + cel);
	}//end class
	}//end main