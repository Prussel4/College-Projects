//Paul Russell
//Java II
//Lab I - 1
import javax.swing.*;
import java.awt.*;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
public class StudentData{
	

	public StudentData (){
		GUI();	
	}
	public void GUI() {
	//*****make frame
	JFrame frame = new JFrame("Student Data");
    frame.setSize(600,400);
	frame.setLayout(new BorderLayout());
    frame.setVisible( true );
    frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
	//*****Components
	
	//NP
	JLabel SD = new JLabel ("Student Data");
	
	//CP
	JLabel ID = new JLabel("Student ID");
	JLabel FN = new JLabel("First  Name");
	JLabel LN = new JLabel("Last Name");
	JLabel EM = new JLabel("Email");
	JLabel AD = new JLabel("Address");
	
	TextField tf1 = new TextField();
	TextField tf2 = new TextField();
	TextField tf3 = new TextField();
	TextField tf4 = new TextField();
	TextField tf5 = new TextField();
	
	// SP
	JButton Fbtn = new JButton("Find");
	JButton Ibtn = new JButton("Delete");
	JButton Ubtn = new JButton("Update");
	JButton Dbtn = new JButton("Delete");
	JButton Ebtn = new JButton("Exit");
	
	
	//ext btn
	
	
	//listeners
	
	
	
	
	//*****panels
	
	//NP
	JPanel NP = new JPanel();
	NP.add(SD);
	
	//CP
	JTabbedPane CP = new JTabbedPane ();
	JComponent panel1 = makeTextPanel("Tab 1");
	
	CP.setLayout(new GridLayout(5,2));
	CP.add(ID);
	CP.add(tf1);
	CP.add(FN);
	CP.add(tf2);
	CP.add(LN);
	CP.add(tf3);
	CP.add(EM);
	CP.add(tf4);
	CP.add(AD);
	CP.add(tf5);
	
	
	//SP
	JPanel SP = new JPanel();
	
	SP.add(Fbtn);
	SP.add(Ibtn);
	SP.add(Ubtn);
	SP.add(Dbtn);
	SP.add(Ebtn);
	
	//add panels
	frame.add(NP , BorderLayout.NORTH);
	frame.add(CP , BorderLayout.CENTER);
	frame.add(SP , BorderLayout.SOUTH);
	}
	public void ExitListener() {

}	

		
	public static void main (String[] args) {
	//run GUI
	new StudentData();

	}
}