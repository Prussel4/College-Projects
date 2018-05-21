namespace Convert
{
    partial class Form1
    {
        /// <summary>
        /// Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Clean up any resources being used.
        /// </summary>
        /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form Designer generated code

        /// <summary>
        /// Required method for Designer support - do not modify
        /// the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            this.label = new System.Windows.Forms.Label();
            this.Fahrenheit = new System.Windows.Forms.Label();
            this.Celsius = new System.Windows.Forms.Label();
            this.CelBox = new System.Windows.Forms.TextBox();
            this.FahrBox = new System.Windows.Forms.TextBox();
            this.exitbtn = new System.Windows.Forms.Button();
            this.calcbtn = new System.Windows.Forms.Button();
            this.farhtocel = new System.Windows.Forms.RadioButton();
            this.celtofahr = new System.Windows.Forms.RadioButton();
            this.SuspendLayout();
            // 
            // label
            // 
            this.label.AutoSize = true;
            this.label.Location = new System.Drawing.Point(80, 13);
            this.label.Name = "label";
            this.label.Size = new System.Drawing.Size(44, 13);
            this.label.TabIndex = 0;
            this.label.Text = "Convert";
            // 
            // Fahrenheit
            // 
            this.Fahrenheit.AutoSize = true;
            this.Fahrenheit.Location = new System.Drawing.Point(127, 71);
            this.Fahrenheit.Name = "Fahrenheit";
            this.Fahrenheit.Size = new System.Drawing.Size(57, 13);
            this.Fahrenheit.TabIndex = 1;
            this.Fahrenheit.Text = "Fahrenheit";
            // 
            // Celsius
            // 
            this.Celsius.AutoSize = true;
            this.Celsius.Location = new System.Drawing.Point(144, 103);
            this.Celsius.Name = "Celsius";
            this.Celsius.Size = new System.Drawing.Size(40, 13);
            this.Celsius.TabIndex = 2;
            this.Celsius.Text = "Celsius";
            // 
            // CelBox
            // 
            this.CelBox.Location = new System.Drawing.Point(190, 103);
            this.CelBox.Name = "CelBox";
            this.CelBox.Size = new System.Drawing.Size(82, 20);
            this.CelBox.TabIndex = 3;
            // 
            // FahrBox
            // 
            this.FahrBox.Location = new System.Drawing.Point(190, 68);
            this.FahrBox.Name = "FahrBox";
            this.FahrBox.Size = new System.Drawing.Size(82, 20);
            this.FahrBox.TabIndex = 4;
            this.FahrBox.TextChanged += new System.EventHandler(this.FahrBox_TextChanged);
            // 
            // exitbtn
            // 
            this.exitbtn.Location = new System.Drawing.Point(197, 182);
            this.exitbtn.Name = "exitbtn";
            this.exitbtn.Size = new System.Drawing.Size(75, 23);
            this.exitbtn.TabIndex = 5;
            this.exitbtn.Text = "Exit";
            this.exitbtn.UseVisualStyleBackColor = true;
            this.exitbtn.Click += new System.EventHandler(this.button1_Click);
            // 
            // calcbtn
            // 
            this.calcbtn.Location = new System.Drawing.Point(12, 182);
            this.calcbtn.Name = "calcbtn";
            this.calcbtn.Size = new System.Drawing.Size(75, 23);
            this.calcbtn.TabIndex = 6;
            this.calcbtn.Text = "Calc";
            this.calcbtn.UseVisualStyleBackColor = true;
            this.calcbtn.Click += new System.EventHandler(this.calcbtn_Click);
            // 
            // farhtocel
            // 
            this.farhtocel.AutoSize = true;
            this.farhtocel.Location = new System.Drawing.Point(12, 71);
            this.farhtocel.Name = "farhtocel";
            this.farhtocel.Size = new System.Drawing.Size(94, 17);
            this.farhtocel.TabIndex = 7;
            this.farhtocel.TabStop = true;
            this.farhtocel.Text = "Fahr to Celsius";
            this.farhtocel.UseVisualStyleBackColor = true;
            this.farhtocel.CheckedChanged += new System.EventHandler(this.farhtocel_CheckedChanged);
            // 
            // celtofahr
            // 
            this.celtofahr.AutoSize = true;
            this.celtofahr.Location = new System.Drawing.Point(13, 105);
            this.celtofahr.Name = "celtofahr";
            this.celtofahr.Size = new System.Drawing.Size(94, 17);
            this.celtofahr.TabIndex = 8;
            this.celtofahr.TabStop = true;
            this.celtofahr.Text = "Celsius to Fahr";
            this.celtofahr.UseVisualStyleBackColor = true;
            this.celtofahr.CheckedChanged += new System.EventHandler(this.celtofahr_CheckedChanged);
            // 
            // Form1
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.BackColor = System.Drawing.SystemColors.ControlDark;
            this.ClientSize = new System.Drawing.Size(284, 261);
            this.Controls.Add(this.celtofahr);
            this.Controls.Add(this.farhtocel);
            this.Controls.Add(this.calcbtn);
            this.Controls.Add(this.exitbtn);
            this.Controls.Add(this.FahrBox);
            this.Controls.Add(this.CelBox);
            this.Controls.Add(this.Celsius);
            this.Controls.Add(this.Fahrenheit);
            this.Controls.Add(this.label);
            this.Name = "Form1";
            this.Text = "Convert";
            this.Load += new System.EventHandler(this.Form1_Load);
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.Label label;
        private System.Windows.Forms.Label Fahrenheit;
        private System.Windows.Forms.Label Celsius;
        private System.Windows.Forms.TextBox CelBox;
        private System.Windows.Forms.TextBox FahrBox;
        private System.Windows.Forms.Button exitbtn;
        private System.Windows.Forms.Button calcbtn;
        private System.Windows.Forms.RadioButton farhtocel;
        private System.Windows.Forms.RadioButton celtofahr;
    }
}

