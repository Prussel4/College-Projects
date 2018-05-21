/***************************
	Paul Russell
	lab 4
	Java I
*****************************/
import java.util.Scanner;
public class Arealoop {
	public static void main(String[] args){
	// declare vars
	String term = "hold";
	int x = 0;
	int looprun = 0;
	int rad = 0;
	int side = 0;
	int hei = 0;
	int wid = 0;
	double p = 3.14;
	double area = 0;
	String shape = "hold";
	
	System.out.println("How many shapes do you need to find the area of?");
	Scanner loopsent = new Scanner(System.in);
	looprun = loopsent.nextInt();
	while(looprun > x){
	x++;

	System.out.println("Are you trying to find the area of a Circle Square or Rectangle?");		
	Scanner findshape = new Scanner(System.in);
	shape = findshape.nextLine();
	
	if(shape.equals("cirlce"));{
	System.out.println("What is the radius of the circle?");
	Scanner radius = new Scanner(System.in);
	rad = radius.nextInt();
	area = (rad * rad * p );
	}//end of first if	
	
	if(shape.equals("square")) ;{
	System.out.println("What is the length of the sides of the square");
	Scanner sides = new Scanner(System.in);
	side = sides.nextInt();
	area = (side * side );
	}//end of second if	
	
	if(shape.equals("rectangle"));{
	System.out.println("What is the height of the Rectangle?");
	Scanner height = new Scanner(System.in);
	hei = height.nextInt();
	
	System.out.println("What is the width of the Rectangle?");
	Scanner width = new Scanner(System.in);
	wid = width.nextInt();
	area = (hei * wid );
	}//end of third if	
	
	System.out.println("To end the program early enter x");
	Scanner terminate = new Scanner(System.in);
	term = terminate.nextLine();
	
	if(term.equals("x")){
	x = x + looprun;	
		
	}//end fourth if
	}//end loop
	}//end class
	
	}//end main

