/***************************
	Paul Russell
	
	Java I
*****************************/
import java.util.Scanner;
public class Login {
		public void main(String [] args)  {
		//Declare vars
	String ID = "hold";
	String pass = "hold";
	
	System.out.println("Please enter the User ID");
	
	Scanner name = new Scanner (System.in);
	ID = name.nextLine();
	
	System.out.println("Please enter the User Password");
	
	Scanner password = new Scanner(System.in);
	pass = password.nextLine();
	
	if (ID == "Admin"){
	if (pass == " CTC"){
	System.out.println("Admin User Logged In.");
	}//end of second if	
	else {
	System.out.println("Admin password is incorrect");
	};//end of first else
	}else {
	System.out.println("Welcome user.");
	};//end of first if
	
	}//endmain
}//end class