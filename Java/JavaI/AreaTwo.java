public class AreaTwo {
	public static void main(String[] args){
	//declare vars
	int CaseNum = 0;
	int rad = 0;
	int side = 0;
	int hei = 0;
	int wid = 0;
	int area = 0;
	
	string shape = "hold";
	
	System.out.println("Are you trying to find the area of a Circle, Square, or Rectangle");
	
	scanner findshape = new findshape(System.in);
	shape = findshape.nextline();
	
	if(shape = circle);{
		 CaseNum = 0;
	}//end first if
	
	else if (shape = Square);{
		 CaseNum = 1; 
	}//end of second if
	
	else(shape = Rectangle);{
			CaseNum = 2;
		
	}//end of third if
		
	//start case
	
	switch(CaseNum)
	{
		case 0;//circle
		
	held code circle  System.out.println("What is the radius of the circle");
	scanner radius = new radius(System.in);
	 rad = radius.nextint();
	area = rad * rad * 3.14;
	
		break;
		
		case 1;//square
	
	System.out.println("What is the length of the sides of the square");	
	scanner sides = new sides(System.in);
	 side = sides.nextint();
	area = side * side;	
	
		break;
		
		case 2;//rectangle
		System.out.println("What is the height of the Rectangle?");	
		scanner Height = new height(System.in);
		 hei = Height.nextint();
		
		System.out.println("What is the width of the Rectangle?");	
		scanner Width = new Width(System.in);
		 wid = Width.netint();
		
		area = hei * wid;
		
		break;
	}//end switch
	}// end main
	
}// end class
	
	
	
	
	
	//held code circle  System.out.println("What is the radius of the circle");
	//scanner radius = new radius(System.in);
	//int rad = radius.nextint();
	//area = rad * rad * 3.14
	
	//held code square
	//System.out.println("What is the length of the sides of the square");	
	//scanner sides = new sides(System.in);
	//int side = sides.nextint();
	//area = side * side;	
	
	//held code rectangle
	//	System.out.println("What is the height of the Rectangle?");	
	//	scanner Height = new height(System.in);
	//	int hei = Height.nextint();
		
	//	System.out.println("What is the width of the Rectangle?");	
	//	scanner Width = new Width(System.in);
	//	int wid = Width.netint();
		
	//	area = hei * wid;