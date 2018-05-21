/***************************
	Paul Russell
	
	Java I
*****************************/
import java.util.Scanner;
public class PassWd {	
	public static void main(String[] args){
	//declare vars
	int pass = 0;
	int password = 1234;
	
	System.out.println("Please enter the password");
	 pass = 0;
	Scanner passw = new Scanner(System.in);
	 pass = passw.nextInt();
	 
	
	if (password == pass){
		System.out.println("Welcome Valued Customer");
	
	}// end if

	else{
	System.out.println("Login incorrect");

	};//end else

	}//end main
}//end class	
	
	
	
	