/***************************
	Paul Russell
	lab 4
	Java I
*****************************/
public class TempLoops {
	public static void main(String[] args){
	//declare vars 
	double fahr = 0;
	double cel = 0;
	
	for(int i = 0 ; i < 3 ; i++){
	cel = (fahr-32.0)*(5.0/9.0);	
	System.out.println(fahr + "," + cel);	
	fahr = fahr + 20;
	}//end of for loop
	
	fahr = 80;
	
	while (fahr <= 140){
	cel = (fahr-32.0)*(5.0/9.0);	
	System.out.println(fahr + "," + cel);	
	fahr = fahr + 20;	
	}//end of while loop
	
	do{
	cel = (fahr-32.0)*(5.0/9.0);	
	System.out.println(fahr + "," + cel);	
	fahr = fahr + 20;		
	}while(fahr <=200);

	
	
	
//notes for( <initialization> ; <condition> ; <statement> ){
//        <Block of statements>;
//}

//while (Boolean expression) {
//    statement(s) //block of statements
//}

//  do {
//System.out.println("Count is: " + count);
//           count++;
//        } while (count < 11);

	}
}