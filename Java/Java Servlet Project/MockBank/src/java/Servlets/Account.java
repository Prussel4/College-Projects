package Servlets;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Paul Russell
 */
import java.sql.*;
import java.util.ArrayList;

public class Account {
    protected int acctNo;
    protected String type;
    protected float balance;
    protected int cid;
   protected int withdraw;
   protected int deposite;
   
   
    public Account(){
    acctNo = 0;
    type = "";
    balance = 0;
    cid = 0;
    }
    
    public Account(int i, String type, float balance, int cid){
    acctNo = i;
    type = this.type;
    balance = this.balance;
    cid = this.cid;
    }
    public void selectDB(int i){
        try{
        
        acctNo = i;
        String driver = "net.ucanaccess.jdbc.UcanaccessDriver";
        Class.forName(driver);
  
        String databasename = "C:/Users/Paul Russell/Desktop/JDB/ChattBankMDB.MDB";
        java.sql.Connection conn;
                        
        conn = DriverManager.getConnection("jdbc:ucanaccess://"+ databasename);
        Statement stmt = conn.createStatement();
              
        String sql = "SELECT AcctNo, Cid, Type, Balance FROM Accounts WHERE AcctNo =" + "'"+ i + "'";
                
        ResultSet rs = stmt.executeQuery(sql);
        rs.next();
        cid = rs.getInt(2);
        type = rs.getString(3);
        balance = rs.getInt(4);
         
            //else{out.println("Inccorect Email Or Password");}
        } catch (ClassNotFoundException ex) {
           System.out.println("<h1> Class Not Found:" + ex +" <h1>");
            
        } catch (SQLException ex) {
            System.out.println("<h1>SQL: " + ex + "! <h1>");
           
        }    
      
    }
    
 public void depositeDB(int d){
        try{
        this.balance = this.balance + d; 
        String driver = "net.ucanaccess.jdbc.UcanaccessDriver";
        Class.forName(driver);
  
        String databasename = "C:/Users/Paul Russell/Desktop/JDB/ChattBankMDB.MDB";
        java.sql.Connection conn;
                        
        conn = DriverManager.getConnection("jdbc:ucanaccess://"+ databasename);
        Statement stmt = conn.createStatement();
              
        String sql = "UPDATE Accounts SET Balance = " + "'" + balance + "'" + "WHERE AcctNo = " + this.acctNo;
                
        stmt.executeUpdate(sql);
  
            //else{out.println("Inccorect Email Or Password");}
        } catch (ClassNotFoundException ex) {
           System.out.println("<h1> Class Not Found:" + ex +" <h1>");
            
        } catch (SQLException ex) {
            System.out.println("<h1>SQL: " + ex + "! <h1>");
           
        }    
      
    }
    
    public void withdrawDB(int w){
        try{
        this.balance = this.balance - w; 
        String driver = "net.ucanaccess.jdbc.UcanaccessDriver";
        Class.forName(driver);
  
        String databasename = "C:/Users/Paul Russell/Desktop/JDB/ChattBankMDB.MDB";
        java.sql.Connection conn;
                        
        conn = DriverManager.getConnection("jdbc:ucanaccess://"+ databasename);
        Statement stmt = conn.createStatement();
              
        String sql = "UPDATE Accounts SET Balance = " + "'" + this.balance + "'"  ;
                
        stmt.executeUpdate(sql);
        System.out.println("Account Balance = " + balance);
            //else{out.println("Inccorect Email Or Password");}
        } catch (ClassNotFoundException ex) {
           System.out.println("<h1> Class Not Found:" + ex +" <h1>");
            
        } catch (SQLException ex) {
            System.out.println("<h1>SQL: " + ex + "! <h1>");
           
        }    
      
    }
    
    public int getAcctNo() {
        return acctNo;
    }

    public void setAcctNo(int acctNo) {
        this.acctNo = acctNo;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }
    
    public void display(){
        System.out.println("Account Num = " + acctNo);
        System.out.println("Account Type = " + type);
        System.out.println("Account Balance = " + balance);
        System.out.println("Account Cust ID = " + cid);
    }
    @Override
public String toString() {
    return "Account No : " + this.getAcctNo() + " Type : " + this.getType() + " Balance :" + this.getBalance() + " Cust ID: " + this.getCid() + "\n"; 
}
    public static void main(String args[]){
    Account a1;
    a1 = new Account();
    a1.selectDB(90000);
    a1.withdrawDB(19);
    a1.depositeDB(100);
    a1.display();
    Account a2;
    a2 = new Account();
    a2.selectDB(90001);
    a2.display();
    }
}
