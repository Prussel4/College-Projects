using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Area
{
    public partial class Form1 : Form
    {
        //These Vars will hold The Numbers until Passed into Calc Method
        String PreOp = "0";
        String PreNum = "0";
        String PreNum2 = "1";
        int EnCheck = 0;
        public void ChangeShowShape(String Shape)
        {
            ShapeShow.Text = Shape;
        }
        //this method displays important info and disables unimportant info
        public void CloseMeth()
        {
            if (MessageBox.Show("Would you like to exit?", "Exit", MessageBoxButtons.YesNo) == System.Windows.Forms.DialogResult.Yes)
            {
                this.Close();
            }
        }



        public void ClearMeth()
        {
            PreNum = "";
            PreNum2 = "";

            AreaTB.Text = "";
            WidthTB.Text = "";
            RadTB.Text = "";
            AnswerTB.Text = "";

            RadBtn.Checked = false;
            WidthBtn.Checked = false;
            AreaBtn.Checked = false;
        }
        public void Enableinfo(int x)
        {
            if (x == 0)
            {
                RadLab.Visible = true;
                RadTB.Visible = true;

                PreNum = RadTB.Text;
                WidthLab.Visible = false;
                WidthTB.Visible = false;
                AreaLab.Visible = false;
                AreaTB.Visible = false;
            }
            if (x == 1)
            {
                WidthLab.Visible = true;
                WidthTB.Visible = true;

                PreNum = WidthTB.Text;
                RadLab.Visible = false;
                RadTB.Visible = false;
                AreaLab.Visible = false;
                AreaTB.Visible = false;
            }
            if (x == 2)
            {
                AreaLab.Visible = true;
                AreaTB.Visible = true;
                WidthLab.Visible = true;
                WidthTB.Visible = true;

                PreNum = AreaTB.Text;
                PreNum2 = WidthTB.Text;
                RadLab.Visible = false;
                RadTB.Visible = false;
            }
        }//end enable info
        //This method works by turning the holders we had earlier into doubles, uses a switch to determine the operator and does the apporprite equation 
        public void Calc(String Operation, String Number, String Number2)
        {
            Double Num = 0;
            Double Num2 = 0;
            String Ans = "";

            if (Number != null)
            {
                Num = Double.Parse(Number);
            }
            if (Number2 != null)
            {
                Num2 = Double.Parse(Number2);
            }

            switch (Operation)
            {
                case "Circle":
                    Ans = (Math.Sqrt(Num) * 3.14).ToString();
                    break;
                case "Square":
                    Ans = (Num * Num).ToString();
                    break;
                case "Rectangle":
                    Ans = (Num * Num2).ToString();
                    break;
                default:
                    break;
            }
            AnswerTB.Text = Ans;
        }

        //ini Form initialzies
        public Form1()
        {
            InitializeComponent();
        }
        //Checks for buttons and sets the pre op
        private void RadBtn_CheckedChanged(object sender, EventArgs e)
        {
            ChangeShowShape("Circle");
            EnCheck = 0;
            Enableinfo(EnCheck);
            PreOp = "Circle";

        }

        private void WidthBtn_CheckedChanged(object sender, EventArgs e)
        {
            ChangeShowShape("Square");
            EnCheck = 1;
            Enableinfo(EnCheck);
            PreOp = "Square";

        }

        private void AreaBtn_CheckedChanged(object sender, EventArgs e)
        {
            ChangeShowShape("Rectangle");
            EnCheck = 2;
            Enableinfo(EnCheck);
            PreOp = "Rectangle";

        }

        private void CalcBtn_Click(object sender, EventArgs e)
        {
            //Catches errors and sets the numbers calls calc function and checks combo box


            switch (PreOp)
            {
                case "Circle":
                    PreNum = RadTB.Text;
                    PreNum2 = "0";
                    break;
                case "Square":
                    PreNum = WidthTB.Text;
                    PreNum2 = "0";
                    break;
                case "Rectangle":
                    PreNum = AreaTB.Text;
                    PreNum2 = WidthTB.Text;
                    break;
                default:
                    break;
            }


            Calc(PreOp, PreNum, PreNum2);
        }

        private void ClearBtn_Click(object sender, EventArgs e)
        {
            ClearMeth();
        }

        private void ExitBtn_Click(object sender, EventArgs e)
        {
            CloseMeth();
        }

        private void CBO_SelectedIndexChanged(object sender, EventArgs e)
        {
            if (CBO.Text != null)
            {
                PreOp = CBO.Text;
                ChangeShowShape("PreOp");
                switch (CBO.Text)
                {
                    case "Circle":
                        EnCheck = 0;
                        break;
                    case "Square":
                        EnCheck = 1;
                        break;
                    case "Rectangle":
                        EnCheck = 2;
                        break;
                    default:
                        break;
                }
                AnswerTB.Text = EnCheck.ToString(); 
                Enableinfo(EnCheck);
            }
        }
    }


