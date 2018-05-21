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
@WebServlet(name = "/AccountLookupServlet", urlPatterns = {"/AccountLookupServlet"})
public class AccountLookupServlet extends HttpServlet {

    @Override 
    protected void doGet(HttpServletRequest request, HttpServletResponse response) 
        throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();


        try {
         Account a1;
        a1 = new Account();

        int DBacctNo;
        String DBtype;
        int DBbalance;
        int DBcid;
        int i;

        String AcctNO = request.getParameter("AcctNO");

        String driver = "net.ucanaccess.jdbc.UcanaccessDriver";
        Class.forName(driver);

        String databasename = "C:/Users/Paul Russell/Desktop/JDB/ChattBankMDB.MDB";
        java.sql.Connection conn;

        conn = DriverManager.getConnection("jdbc:ucanaccess://"+ databasename);
        Statement stmt = conn.createStatement();

        String sql = "SELECT AcctNo, Cid, Type, Balance FROM Accounts WHERE AcctNo =" + "'" + AcctNO + "'";

        ResultSet rs = stmt.executeQuery(sql);
        rs.next();
        DBacctNo = rs.getInt(1);
        DBbalance = rs.getInt(4);
        DBtype = rs.getString(3);
        DBcid = rs.getInt(2);
        
        a1.acctNo = DBacctNo;
        a1.balance = DBbalance;
        a1.type = DBtype;
        a1.cid = DBcid;
        
        //out.println( "Account Num = "+ DBacctNo + " Balance =" + DBbalance + " balance = " + DBtype + " Cid =" + DBcid ); 
        HttpSession session = request.getSession();
            session.setAttribute("Account", a1);                  
            RequestDispatcher rd=request.getRequestDispatcher("/AccountDetails.jsp");  
            rd.include(request, response);
        

        } catch (ClassNotFoundException ex) {
            out.println("<h1> Class Not Found:" + ex +" <h1>");
            Logger.getLogger(LoginServlet.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {               
            out.print("AccountError!");
        }    
     } 
}
