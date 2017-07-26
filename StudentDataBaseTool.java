
import java.sql.*;

public class Student{
	
	// properties
	private static int studentId;
	private static String firstName;
	private static String lastName;
	private static String streetAddress;
	private static String city;
	private static String state;
	private static int zip;
	private static String email;
	private static double gpa;
	
	// constructors
	public Student()
	{
		studentId = 0;
		firstName = "";
		lastName = "";
		streetAddress = "";
		city = "";
		state = "";
		zip = 0;		
		email = "";
		gpa = 0.0;
	}
	
	public Student(int id, String fn, String ln, String sa, String c, String s, int z, String e, double g)
	{
		setstudentId(id);
		setfirstName(fn);
		setlastName(ln);
		setstreetAddress(sa);
		setcity(c);
		setstate(s);
		setzip(z);
		setemail(e);
		setgpa(g);
	}
	
	// set and get
	public void setstudentId(int id) {studentId = id;}
	public int getstudentId() {return studentId;}
	
	public void setfirstName(String fn) {firstName = fn;}
	public String getfirstName() {return firstName;}
	
	public void setlastName(String ln) {lastName = ln;}
	public String getlastName() {return lastName;}
	
	public void setstreetAddress(String sa) {streetAddress = sa;}
	public String getstreetAddress() {return streetAddress;}
	
	public void setcity(String c) {city = c;}
	public String getcity() {return city;}
	
	public void setstate(String s) {state = s;}
	public String getstate() {return state;}
	
	public void setzip(int z) {zip = z;}
	public int getzip() {return zip;}
	
	public void setemail(String e) {email = e;}
	public String getemail() {return email;}
	
	public void setgpa(double g) {gpa = g;}
	public double getgpa() {return gpa;}
	
	
	public void selectDB(int id){
		try{
		//load driver
		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		System.out.println("Driver Loaded");
		
		//make connection
		Connection c1 = DriverManager.getConnection("jdbc:odbc:JavaDB");
		System.out.println("DataBase Connected");
		System.out.println("");
		
		//make statement
		Statement st = c1.createStatement();
		String sql = "Select* From Students Where ID = " + id;
		
		//execute statement
		ResultSet rs = st.executeQuery(sql);
		
		//results
		System.out.println("Search Results");
		rs.next();
		/*this*/new Student(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getInt(7),rs.getString(8),rs.getDouble(9));
		/* OR **************************************
		setstudentId(rs.getInt(1));
		setfirstName(rs.getString(2));
		setlastName(rs.getString(3));
		setstreetAddress(rs.getString(4));
		setcity(rs.getString(5));
		setstate(rs.getString(6));
		setzip(rs.getInt(7));
		setemail(rs.getString(8));
		setgpa(rs.getDouble(9));
		********************************************/
		
		c1.close();
		}//end try
				
		catch (SQLException se){System.out.println("Error " + se); }
		catch (Exception ex){System.out.println("Error " + ex); }
	}
	
	public void insertDB(int id, String fn, String ln, String sa, String c, String s, int z, String e, double g){
		try{
		//load driver
		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		System.out.println("Driver Loaded");
		
		//make connection
		Connection c1 = DriverManager.getConnection("jdbc:odbc:JavaDB");
		System.out.println("DataBase Connected");
		System.out.println("");
		
		//make statement
		Statement st = c1.createStatement();
		String sql = "INSERT INTO Students VALUES("+id+",'"+fn+"','"+ln+"','"+sa+"','"+c+"','"+s+"',"+z+",'"+e+"',"+g+")";
		System.out.println(sql);
		
		//execute statement
		st.executeUpdate(sql);
		c1.close();
		/*this*/new Student(id, fn, ln, sa, c, s, z, e,g);
		/* OR **************************************
		setstudentId(rs.getInt(1));
		setfirstName(rs.getString(2));
		setlastName(rs.getString(3));
		setstreetAddress(rs.getString(4));
		setcity(rs.getString(5));
		setstate(rs.getString(6));
		setzip(rs.getInt(7));
		setemail(rs.getString(8));
		setgpa(rs.getDouble(9));
		********************************************/
		}//end try
		
		catch (SQLException se){System.out.println("Error " + se); }
		catch (Exception ex){System.out.println("Error " + ex); }
		
	
	}
	
	public void deleteDB(){
		try{
		//load driver
		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		System.out.println("Driver Loaded");
		
		//make connection
		Connection c1 = DriverManager.getConnection("jdbc:odbc:JavaDB");
		System.out.println("DataBase Connected");
		System.out.println("");
		
		//make statement
		Statement st = c1.createStatement();
		String sql = "Delete From Students Where ID = " + studentId;
		System.out.println(sql);
		
		//execute statement
		st.executeUpdate(sql);
		c1.close();
		}//end try
		
		catch (SQLException se){System.out.println("Error " + se); }
		catch (Exception ex){System.out.println("Error " + ex); }
		
	}
	
	public void updateDB(){
		try{
		//load driver
		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		System.out.println("Driver Loaded");
		
		//make connection
		Connection c1 = DriverManager.getConnection("jdbc:odbc:JavaDB");
		System.out.println("DataBase Connected");
		System.out.println("");
		
		//make statement
		Statement st = c1.createStatement();
		String sql = "UPDATE Students SET id =" + studentId +", FirstName = '"+firstName+"', LastName = '"+lastName+"', Street = '"+streetAddress+"', City = '"+city+"', State = '"+state+"', Zip = "+zip+", EMail = '"+email+"', GPA = "+gpa+ " WHERE ID = "+studentId;
		System.out.println(sql);
		
		//execute statement
		st.executeUpdate(sql);
		c1.close();
		}//end try
		
		catch (SQLException se){System.out.println("Error " + se); }
		catch (Exception ex){System.out.println("Error " + ex); }
		
	}
	
	
	public void display()
	{
		System.out.println("Student ID: " + studentId);
		System.out.println("Name: " + firstName + " " + lastName);
		System.out.println("Address: " + streetAddress + ", " + city + " " + state + ", " + zip);
		System.out.println("Email: " + email);
		System.out.println("GPA: " + gpa);
	}
	
	//main
	public static void main(String args[])
	{
		/* WITHOUT DATABASE
		Student  s1 = new Student(4,"Frank", "Jones", "123 Main", "Atlanta", "GA", 30133, "fj@yahoo.com", 3.2);
		s1.display();
		*/
		
		//Gathering Data
		Student  s2 = new Student();  
		s2.selectDB(5);
		s2.display(); 
		
		//Inserting Data
		Student s3 = new Student();
		s3.insertDB(33, "Frank", "Mayes", "123 Main street", "Atlanta", "GA", 30100,"fmayes@yahoo.com",3.3);
		s3.display();
		
		//Deleting Data
		Student s4 = new Student();
		s4.selectDB(17);
		s4.deleteDB();
		
		//Updating Data
		Student s5 = new Student();
		s5.selectDB(7);
		s5.setzip(30106);
		s5.updateDB();
	}
	
}//end class