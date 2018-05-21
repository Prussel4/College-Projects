using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Convert
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();

            this.Text += "";

            
        }
        
        private void Form1_Load(object sender, EventArgs e)
        {
    
        }

        private void button1_Click(object sender, EventArgs e)
        {

        }


        private void farhtocel_CheckedChanged(object sender, EventArgs e)
        {
            if (farhtocel.Checked)
            {
                this.Text = "Fahr to Celsius";
            }
        }

        private void celtofahr_CheckedChanged(object sender, EventArgs e)
        {
            if (celtofahr.Checked)
            {
                this.Text = "Celsius to Fahr";
            }
         
        }       

        private void calcbtn_Click(object sender, EventArgs e)
        {
            
            if (farhtocel.Checked)
            {
                this.Text = "Fahr to Celsius";
            }
        }

        private void FahrBox_TextChanged(object sender, EventArgs e)
        {

        }
    }
}
