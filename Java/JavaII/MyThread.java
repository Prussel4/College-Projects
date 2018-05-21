/***************************
	Paul Russell
	lab 7
	Java II
*****************************/
public class MyThread extends Thread {	
	public void run() {		
		for(int x = 200 , x < 250, x++){
		System.out.println("Thread Running..." + x);
		}		
	}		
	public static void main (String[] args){
		MyThread mt = new MyThread();
		mt.start();
	}
}