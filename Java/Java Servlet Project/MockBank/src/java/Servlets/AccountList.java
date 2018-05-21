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
public class AccountList extends Account {
   
    public static void main(String args[]){
    int accountsOpened = 10;
    Account a1;
    a1 = new Account();
    a1.selectDB(90000);
    Account a2;
    a2 = new Account();
    a2.selectDB(90001);
    a2.display();
    accountsOpened++;
    Account a3;
    a3 = new Account();
    a3.selectDB(90003);
    Account a4;
    a4 = new Account();
    a4.selectDB(90004);
    a4.display();
    Account a5;
    a5 = new Account();
    a5.selectDB(90005);
    Account a6;
    a6 = new Account();
    a6.selectDB(90006);
    a6.display();
    Account a7;
    a7 = new Account();
    a7.selectDB(90007);
    Account a8;
    a8 = new Account();
    a8.selectDB(90008);
    a8.display();
    Account a9;
    a9 = new Account();
    a9.selectDB(90009);
    Account a10;
    a10 = new Account();
    a10.selectDB(90010);
    a10.display();
    
   ArrayList<Account> aList = new ArrayList<Account>();
   aList.add(a1);
   aList.add(a2);
   aList.add(a3);
   aList.add(a4);
   aList.add(a5);
   aList.add(a6);
   aList.add(a7);
   aList.add(a8);
   aList.add(a9);
   aList.add(a10);
   System.out.println(aList);
       
      }
}
