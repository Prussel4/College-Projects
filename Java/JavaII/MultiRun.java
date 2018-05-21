/***************************
	Paul Russell
	lab 7
	Java II
*****************************/
public class MyThread extends Thread {	
	public void run(int x) {		
		while(x < 100){
		System.out.println("Thread Running..." + x);
		x++
		}		
	}	
	public static void main (String[] args){
		Mythread mt2 = new Mythread();
		MyThread mt = new MyThread();
		mt.start(25);
		mt2.start(1);
	}
}