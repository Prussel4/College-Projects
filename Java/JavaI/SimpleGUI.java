import javax.swing.*;
import java.awt.*;
import java.awt.FlowLayout;
public class SimpleGUI {
	
	private JFrame f;	
	private JButton b1;
	private JPanel p1;
	public SimpleGUI (){
		GUI();	
	}
	public void GUI(){
	 
	 f = new JFrame("Sample");	
	f.setVisible(true);
	f.setSize (600,400);
	
	p1.setLayout(new FlowLayout());
	p1 = new JPanel();
	
	
	b1 = new JButton ("Test");
	b1.setVisible(true);
	}
	
	public static void main (String[] args) {
	
	new SimpleGUI();

	}
}