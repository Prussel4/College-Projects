using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Calc
{
    public partial class Form1 : Form
    {
        //(how it works)
        //So this works by holding a value, an operator and the bool expresion. The bool expression is to decided when and when the 
        //can or cannot edit a number false being it can be edited and true being a cant. First the event handler for buttons 1-9 is made
        //this references the text of the button and puts it into textbox1, that is our output and input screen. Next there is the operator 
        //selction, this is selected similarly to the numbers and then is proccesed through a switch statement to decided the type of math.
        //after that the boolean is what decides when and when you are aloud to input. During true nothing can be inputed so that is false when
        //textbox1.text is 0 and is true when the calc button is clicked. It can be returened to false by selecting another operator
        Double value = 0;
        String value2 = "";
        String operation = "";
        int colorchanger = 0;
        bool operation_press = false;
        


        public Form1()
        {
            InitializeComponent();
            
            
        }

        private void button1_Click(object sender, EventArgs e)
        {
            if ((textBox1.Text == "0") || (operation_press))
            {
                textBox1.Clear();
            }
                operation_press = false;
                Button b = (Button)sender;
                textBox1.Text = textBox1.Text + b.Text;
            
        }

        private void Clear_Click(object sender, EventArgs e)
        {
            textBox1.Text = "0";
            
        }

        private void operater_click(object sender, EventArgs e)
        {
            Button b = (Button)sender;          
            operation = b.Text;
            value = Double.Parse(textBox1.Text);
            operation_press = true;

           
        }

        private void Calcbutton_Click(object sender, EventArgs e)
        {
            //switch works like a mix of a loop and an if expression, it will follow the cases until the corresponding one is found.                   
           value2 = textBox1.Text;

            switch (operation)
            {
               
                case "+":
                    textBox1.Text = (value + Double.Parse(textBox1.Text)).ToString();
                    break;
                case "-":
                    textBox1.Text = (value - Double.Parse(textBox1.Text)).ToString();
                    break;
                case "*":
                    textBox1.Text = (value * Double.Parse(textBox1.Text)).ToString();
                    break;
                case "/":
                    textBox1.Text = (value / Double.Parse(textBox1.Text)).ToString();
                    break;
                default:
                    break;     
                        
            }//switch end
            //shows last equation 
            label2.Text = value + " " + operation + " " + value2;

            operation_press = true;            
        }
   
        private void Exit_op(object sender, EventArgs e)
        {
            this.Close();
        }

        ///menu stuff
        private void infoToolStripMenuItem_Click(object sender, EventArgs e)
        {
            
            MessageBox.Show("You really don't know how to use a calculator it does math, but you can use the color change below me to go form cyan to red to gray");
        }

        private void changeColorsToolStripMenuItem_Click(object sender, EventArgs e)
        {
            if (colorchanger == 0)
            {
                this.BackColor = System.Drawing.Color.Cyan;
                colorchanger = colorchanger + 1;
            }
            else if (colorchanger == 1)
            {
                this.BackColor = System.Drawing.Color.PaleVioletRed;
                colorchanger++;
            }
            else
            {
                this.BackColor = System.Drawing.Color.Gray;
                colorchanger = 0;
            }

        }

        private void howItWorksToolStripMenuItem_Click(object sender, EventArgs e)
        {
            MessageBox.Show(" So this works by holding a value, an operator and the bool expresion. The bool expression is to decided when and when the can or cannot edit a number false being it can be edited and true being a cant. First the event handler for buttons 1-9 is made   this references the text of the button and puts it into textbox1, that is our output and input screen. Next there is the operator selction, this is selected similarly to the numbers and then is proccesed through a switch statement to decided the type of math. after that the boolean is what decides when and when you are aloud to input. During true nothing can be inputed so that is false when textbox1.text is 0 and is true when the calc button is clicked. It can be returened to false by selecting another operator");
        }


        //week 5 work
        private void ForLoop_Click(object sender, EventArgs e)
        {
            for (int i =1; i <= 10; i++)
            {
                Console.WriteLine("Go Pats");
               
            }
        }

        private void WhileLoop_Click(object sender, EventArgs e)
        {
            int lc = 0;
            while (lc < 10) 
            {
                lc = lc + 1;
                Console.WriteLine("Go Pats");
            }
        }

        private void MemBtn_Click(object sender, EventArgs e)
        {
            Mem.Text = textBox1.Text;
        }



        private void Memory_Reset(object sender, EventArgs e)
        {
            Mem.Text = "       ";
        }

        private void MemBtnplus_Click(object sender, EventArgs e)
        {
            Mem.Text = label2.Text;
        }

        private void MemShow(object sender, EventArgs e)
        {
            //mouse enter
            Mem.Visible = true;
        }
    }
}
