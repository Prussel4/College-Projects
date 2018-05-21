/***************************
	Paul Russell
	lab 7
	Java I
*****************************/

public class Person {
    //Class vars
	String FirstName;
	String LastName;
	String Address;
	String Email;
	String Display;


	public void setFN (String fn){
	FirstName = fn;	
	}//end 1st set
	public String getFirstName(){
	return FirstName;	
	}//end 1st get
	
	public void setLN (String ln){
	LastName = ln ;	
	}//end second set
	public String getLastName(){
	return LastName	;
	}//end second get
	
	public void setAdd (String add){
	Address = add ;		
	}//end 3rd set	
	public String getAddress(){
	return Address;		
	}//end 3rd get
  
	public void setEM (String em){
	Email = em;		
	}//end 4th set	
	public String getEmail(){
	return Email;	
	}//end 4th get 
	
	public void setDisp (String dis){
	Display = dis;	
	}//end 5th set	
	public String getDisplay(){
	return Display;	
	}//end 5th get
 
 public static void main(String []args) {
    //make object  
	String Test = "test";
   Person p1 = new Person(  );
	 Person p2 = new Person( "Sam","Sinclair","Keeler Woods Drive", "Samjam93@gmail.com",p2.FirstName + " " + p2.LastName +" "+ p2.Address +" "+ p2.Email );
	p1.setFN("Paul");    
    p1.getFirstName( );
	p1.setLN("Russell");
	p1.getLastName( );
	p1.setAdd( "Over-There Road 1021");
	p1.getAddress( );
	p1.setEM("PRussel4@chattech.edu");
	p1.getEmail( );
    p1.setDisp( p1.FirstName + " " + p1.LastName +" "+ p1.Address +" "+ p1.Email);
	p1.getDisplay( );
   System.out.println(p1.Display);
   System.out.println(p2.Display);
   }//end main
}//end class
