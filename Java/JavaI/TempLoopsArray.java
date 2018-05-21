/***************************
	Paul Russell
	lab 7
	Java I
*****************************/
public class TempLoopsArray {
	public static void main(String[] args){
	//declare vars 
	double fahr = 0;
	double cel = 0;
	int x = 5;
	int y = 0;
	int fahrA[]= new int [11];
	int celA[]= new int [11];
	
	for(int i = 0 ; i < 4 ; i++){
	cel = (fahr-32.0)*(5.0/9.0);	
	FahrA[i] = Fahr	;
	CelA[i] = cel;
	fahr = fahr + 20;

	}//end of for loop
	
	
	
	while (fahr <= 140){
	cel = (fahr-32.0)*(5.0/9.0);	
	FahrA[x] = Fahr;	
	CelA[x] = cel;
	x = x++;
	}//end of while loop
	
	do{
	cel = (fahr-32.0)*(5.0/9.0);	
	FahrA[x] = Fahr;
	CelA[x] = cel;
	x = x++;
	fahr = fahr + 20;		
	}while(fahr <=200);

	System.out.println(fahrA[y] + "/t" + celA[y]);	
	
	
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