/***************************
	Paul Russell
	lab 7
	Java I
*****************************/

public class Account {
    //Class vars
	int AcctNo;
	String Owner;
	int balance;
	String Display;


	public void setAn (int An){
	AcctNO = An;	
	}//end 1st set
	public String getAcctNo(){
	return AcctNo;	
	}//end 1st get
	
	public void setOw (String Ow){
	Owner = Ow ;	
	}//end second set
	public String getOwner(){
	return Owner	;
	}//end second get
	
	public void setbal (int bal){
	balance = bal ;		
	}//end 3rd set	
	public String getbalance(){
	return Address;		
	}//end 3rd get
  
	public void setDisp (String dis){
	Display = dis;	
	}//end 4th set	
	public String getDisplay(){
	return Display;	
	}//end 4th get
 
 public static void main(String []args) {
    //make object  
   Account a1 = new Account(  );
	 Account a2 = new Account( 871, "Russell Paul", 192, p2.AcctNo + " " + p2.Owner +" "+ p2.balance);
	a1.setAn(178);    
    a1.getAcctNo( );
	a1.setOw("Paul Russell");
	a1.getOwner( );
	a1.setbal(291);
	a1.getbalance( );
    a1.setDisp( p1.AcctNo + " " + p1.Owner +" "+ p1.balance);
	a1.getDisplay( );
   System.out.println(a1.Display);
   System.out.println(a2.Display);
   }//end main
}//end class