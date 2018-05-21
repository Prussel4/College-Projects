/***************************
	Paul Russell
	lab 7
	Java I
*****************************/
import java.util.Arrays;
class SimpleArray{
	public static void main(String[] args){
	int x = 500;
	int y = 0;
	int z = 0;
	for(int i = 0; i<99; i = i +1){
		int Array[]=new int [99];
		Array[y] = x + 1;
		x = x++;
		y = y++;
	}//end of inputting array
	while(z<100){
		System.out.println(Array[z]);
		z = z++;		
	}//end output 
	
	
}//end main
}//end class