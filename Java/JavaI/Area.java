public class Area {
	public static void main(String[] args){
	// declare vars
	int rad = 0;
	int side = 0;
	int hei = 0;
	int wid = 0;
	double p = 3.14;
	double area = 0;
	String Shape = "hold";
	
	System.out.println("Are you trying to find the area of a Circle Square or Rectangle?")
		
	Scanner findshape = new Scanner(System.in);
	shape = findshape.nextLine	
	
	if(shape.equalsIgnoreCase("Circle"));{
	System.out.println("What is the radius of the circle?");
	Scanner radius = new Scanner(System.in);
	rad = radius.nextInt;
	area = (rad * rad * p );
	}//end of first if	
	
	if(shape.equalsIgnoreCase("Square"));{
	System.out.println("What is the length of the sides of the square");
	Scanner sides = new Scanner(System.in);
	side = sides.nextInt;
	area = (side * side );
	}//end of second if	
	
	if(shape.equalsIgnoreCase("Rectangle"));{
	System.out.println("What is the height of the Rectangle?");
	Scanner height = new Scanner(System.in);
	hei = height.nextInt;
	
	System.out.println("What is the width of the Rectangle?");
	Scanner width = new Scanner(System.in);
	wid = Width.nextInt
	area = (hei * wid );
	}//end of third if	
	
	System.out.println(area);
	
	}//end main
}//end class