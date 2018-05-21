/***************************
	Paul Russell
	lab 7
	Java I
*****************************/

public class Course {
    //Class vars
	int CourseID;
	int CreditHours;
	String CourseName;
	String Discription;
	String Display;
	String Display2;
	//constructors 
    public void setID( int id ) {
      CourseID = id;
    }//end 1st set	
    
	public int getID( ) { 
    return CourseID;
    }//end 1st get
	
	public void setCH(int ch){
	CreditHours = ch;
	}//end 2nd set
	
	public int getCreditHours(){
	return CreditHours;	
	}//end 2nd get
 
	public void setCN (String cn){
	CourseName = cn ;		
	}//end 3rd set
	
	public String getCourseName(){
	return CourseName;		
	}//end 3rd get
  
	public void setDisc (String disc){
	Discription = disc;		
	}//end 4th set
	
	public String getDiscription(){
	return Discription;	
	}//end 4th get
 
	public void setDisp (String dis){
	Display = dis;	
	}//end 5th set
	
	public String getDisplay(){
	return Display;	
	}//end 5th get

 public static void main(String []args) {
    //make object  
    Course c1 = new Course(  );
	Course c2 = new Course(110,5, "Advanced Python", "This course expands your python use", c2.CourseName + "" + c2.CourseID +" "+ c2.CreditHours +" "+ c2.Discription);
	c1.setID(109);    
    c1.getID( );
	c1.setCH(4);
	c1.getCreditHours( );
	c1.setCN( "Intro to Python");
	c1.getCourseName( );
	c1.setDisc("This course intros the Python Prog Lang.");
	c1.getDiscription( );
    c1.setDisp( c1.CourseName + "" + c1.CourseID +" "+ c1.CreditHours +" "+ c1.Discription);
	c1.getDisplay( );
   System.out.println(c1.Display);
	Systen.out.println(c2.Display);
   }//end main
}//end class