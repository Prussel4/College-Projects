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
public class Employee extends Person {
	int Id;
	int salary;
	
		public void set Id (int id){
	Id = id;		
	}//end 1st set	
	public String getId(){
	return Id;	
	}//end 1st get 
	
	public void setSal (int sal){
	Salary = sal;	
	}//end 2nd set	
	public String getSalary(){
	return Salary;	
	}//end 2nd get
	
	 public static void main(String []args) {
	Employee e1 = new Employee(  );
	 Employee e2 = new Employee( "Bob","Smith","Keeler street", "Bosmith@gmail.com",e2.FirstName + " " + e2.LastName +" "+ e2.Address +" "+ e2.Email, 123, 28000 );
	e1.setFN("John");    
    e1.getFirstName( );
	e1.setLN("Ron");
	e1.getLastName( );
	e1.setAdd( "Over-There Road 1021");
	e1.getAddress( );
	e1.setEM("Jron4@chattech.edu");
	e1.getEmail( );
	e1.setId(321);
	e1.getId();
	e1.setSal(27000);
	e1.getSalary();
    e1.setDisp( e1.FirstName + " " + e1.LastName +" "+ e1.Address +" "+ e1.Email + "" + e1.Id + "" + e1.salary);
	e1.getDisplay( );
   System.out.println(e1.Display);
   System.out.println(e2.Display);
	 }
}	
	
	