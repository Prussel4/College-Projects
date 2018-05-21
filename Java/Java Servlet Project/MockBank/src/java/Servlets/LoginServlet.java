/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.DriverManager;
import java.sql.*;
import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpSession;
/**
 *
 * @author Paul Russell
 */

@WebServlet(name = "/LoginServlet", urlPatterns = {"/LoginServlet"})
public class LoginServlet extends HttpServlet {

    @Override 
    protected void doGet(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
            response.setContentType("text/html;charset=UTF-8");
            PrintWriter out = response.getWriter();
          
        Customer c1;
           c1 = new Customer(); 
                
        String Email = request.getParameter("Email");
        String Password = request.getParameter("Password");
        
        String DBEmail;
        String DBPassword;
        String DBCustID;
        int i = 0;
        try {       
        String driver = "net.ucanaccess.jdbc.UcanaccessDriver";
        Class.forName(driver);
  
        String databasename = "C:/Users/Paul Russell/Desktop/JDB/ChattBankMDB.MDB";
        java.sql.Connection conn;
                        
        conn = DriverManager.getConnection("jdbc:ucanaccess://"+ databasename);
        Statement stmt = conn.createStatement();
              
        String sql = "SELECT CustPassword, CustEmail, CustID FROM Customers WHERE CustEmail =" + "'" + Email + "'";
                
        ResultSet rs = stmt.executeQuery(sql);
        rs.next();
        DBPassword = rs.getString(1);
        DBEmail = rs.getString(2);
        DBCustID = rs.getString(3);
         
            if(Email.equals(DBEmail) && Password.equals(DBPassword)  ){
            RequestDispatcher rd=request.getRequestDispatcher("/accountLookup.html");  
            rd.include(request, response);
             }
            else{
            HttpSession session = request.getSession();
            session.setAttribute("ID", DBCustID);                  
            RequestDispatcher rd=request.getRequestDispatcher("/Error.jsp");  
            rd.include(request, response);
            }
            //else{out.println("Inccorect Email Or Password");}
        } catch (ClassNotFoundException ex) {            
            out.println("<h1>SQL: " + ex + "! <h1>");
            Logger.getLogger(LoginServlet.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) 
        {
            DBCustID = null;
            HttpSession session = request.getSession();
            session.setAttribute("ID", DBCustID);                  
            RequestDispatcher rd=request.getRequestDispatcher("/Error.jsp");  
            rd.include(request, response);
        }    
     } 
}

  

    
   
