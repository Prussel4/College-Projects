package Servlets;

/**
 *
 * @author Paul Russell
 */
import java.sql.*;
import java.util.ArrayList;

public class Customer {

    private int custID = 0;
    private String custPassword = "";
    private String custFName = "";
    private String custLName = "";
    private String custAddress = "";
    private String custEmail = "";
    ArrayList<Integer> custAList = new ArrayList<>();
    public Customer(){
    custID = 0;
    custPassword = "";
    custFName = "";
    custLName = "";
    custAddress = "";
    custEmail = "";
    }
    
    public Customer(int i, String custPassword, String custFName, String custLName, String custAddress, String custEmail){
    custID = i;
    custPassword = this.custPassword;
    custFName = this.custFName;
    custLName = this.custLName;
    custAddress = this.custAddress;
    custEmail = this.custEmail;
    }
    
    public void selectAndFindAccountsDB(int i){
        try{
        
        custID = i;
        String driver = "net.ucanaccess.jdbc.UcanaccessDriver";
        Class.forName(driver);
  
        String databasename = "C:/Users/Paul Russell/Desktop/JDB/ChattBankMDB.MDB";
        java.sql.Connection conn;
                        
        conn = DriverManager.getConnection("jdbc:ucanaccess://"+ databasename);
        Statement stmt = conn.createStatement();
              
        String sql = "SELECT CustPassword, CustFirstName, CustLastName, CustAddress, CustEmail FROM Customers WHERE CustID =" + "'"+ i + "'";
                
        ResultSet rs = stmt.executeQuery(sql);
        rs.next();
        custPassword = rs.getString(1);
        custFName = rs.getString(2);
        custLName = rs.getString(3);
        custAddress = rs.getString(4);
        custEmail = rs.getString(5);
        
        String sql2 = "SELECT AcctNo FROM Accounts WHERE Cid =" + "'"+ i + "'";
        ResultSet rs2 = stmt.executeQuery(sql2);
        while(rs2.next()){
         int I = 1;
        custAList.add(rs2.getInt(I));
        I++;
        }
          System.out.println(custAList);
            //else{out.println("Inccorect Email Or Password");}
        } catch (ClassNotFoundException ex) {
           System.out.println("<h1> Class Not Found:" + ex +" <h1>");
            
        } catch (SQLException ex) {
            System.out.println("<h1>SQL: " + ex + "! <h1>");
           
        }    
      
    }

    
        public int getCustID() {
        return custID;
    }
    public void setCustID(int custID) {
        this.custID = custID;
    }
    public String getCustPassword() {
        return custPassword;
    }
    public void setCustPassword(String custPassword) {
        this.custPassword = custPassword;
    }
    public String getCustFName() {
        return custFName;
    }
    public void setCustFName(String custFName) {
        this.custFName = custFName;
    }
    public String getCustLName() {
        return custLName;
    }
    public void setCustLName(String custLName) {
        this.custLName = custLName;
    }
    public String getCustAddress() {
        return custAddress;
    }
    public void setCustAddress(String custAddress) {
        this.custAddress = custAddress;
    }
    public String getCustEmail() {
        return custEmail;
    }
    public void setCustEmail(String custEmail) {
        this.custEmail = custEmail;
    }
    
    public void display(){
        System.out.println("Account Num = " + custPassword);
        System.out.println("Account Type = " + custFName);
        System.out.println("Account Balance = " + custLName);
        System.out.println("Account Cust ID = " + custAddress);
         System.out.println("Account Cust ID = " + custEmail);
    }
    
    public static void main(String args[]){
    Customer c1;
    c1 = new Customer();
    c1.selectAndFindAccountsDB(3001);
    c1.display();
        
    }
}
