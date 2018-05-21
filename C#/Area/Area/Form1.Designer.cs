namespace Area
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
            this.Title = new System.Windows.Forms.Label();
            this.CalcBtn = new System.Windows.Forms.Button();
            this.ClearBtn = new System.Windows.Forms.Button();
            this.ExitBtn = new System.Windows.Forms.Button();
            this.RadTB = new System.Windows.Forms.TextBox();
            this.WidthTB = new System.Windows.Forms.TextBox();
            this.RadLab = new System.Windows.Forms.Label();
            this.WidthLab = new System.Windows.Forms.Label();
            this.AreaLab = new System.Windows.Forms.Label();
            this.AreaTB = new System.Windows.Forms.TextBox();
            this.ShapeShow = new System.Windows.Forms.Label();
            this.AnswerLab = new System.Windows.Forms.Label();
            this.AnswerTB = new System.Windows.Forms.TextBox();
            this.AreaBtn = new System.Windows.Forms.RadioButton();
            this.WidthBtn = new System.Windows.Forms.RadioButton();
            this.RadBtn = new System.Windows.Forms.RadioButton();
            this.menuStrip1 = new System.Windows.Forms.MenuStrip();
            this.menuToolStripMenuItem = new System.Windows.Forms.ToolStripMenuItem();
            this.clearToolStripMenuItem = new System.Windows.Forms.ToolStripMenuItem();
            this.exitToolStripMenuItem = new System.Windows.Forms.ToolStripMenuItem();
            this.CBO = new System.Windows.Forms.ComboBox();
            this.menuStrip1.SuspendLayout();
            this.SuspendLayout();
            // 
            // Title
            // 
            this.Title.AutoSize = true;
            this.Title.Location = new System.Drawing.Point(110, 13);
            this.Title.Name = "Title";
            this.Title.Size = new System.Drawing.Size(53, 13);
            this.Title.TabIndex = 0;
            this.Title.Text = "Area Calc";
            // 
            // CalcBtn
            // 
            this.CalcBtn.Location = new System.Drawing.Point(13, 40);
            this.CalcBtn.Name = "CalcBtn";
            this.CalcBtn.Size = new System.Drawing.Size(75, 23);
            this.CalcBtn.TabIndex = 1;
            this.CalcBtn.Text = "Calc";
            this.CalcBtn.UseVisualStyleBackColor = true;
            this.CalcBtn.Click += new System.EventHandler(this.CalcBtn_Click);
            // 
            // ClearBtn
            // 
            this.ClearBtn.Location = new System.Drawing.Point(13, 70);
            this.ClearBtn.Name = "ClearBtn";
            this.ClearBtn.Size = new System.Drawing.Size(75, 23);
            this.ClearBtn.TabIndex = 2;
            this.ClearBtn.Text = "Clear";
            this.ClearBtn.UseVisualStyleBackColor = true;
            this.ClearBtn.Click += new System.EventHandler(this.ClearBtn_Click);
            // 
            // ExitBtn
            // 
            this.ExitBtn.Location = new System.Drawing.Point(197, 226);
            this.ExitBtn.Name = "ExitBtn";
            this.ExitBtn.Size = new System.Drawing.Size(75, 23);
            this.ExitBtn.TabIndex = 3;
            this.ExitBtn.Text = "Exit";
            this.ExitBtn.UseVisualStyleBackColor = true;
            this.ExitBtn.Click += new System.EventHandler(this.ExitBtn_Click);
            // 
            // RadTB
            // 
            this.RadTB.Location = new System.Drawing.Point(177, 51);
            this.RadTB.Name = "RadTB";
            this.RadTB.Size = new System.Drawing.Size(100, 20);
            this.RadTB.TabIndex = 4;
            this.RadTB.Visible = false;
            // 
            // WidthTB
            // 
            this.WidthTB.Location = new System.Drawing.Point(177, 77);
            this.WidthTB.Name = "WidthTB";
            this.WidthTB.Size = new System.Drawing.Size(100, 20);
            this.WidthTB.TabIndex = 5;
            this.WidthTB.Visible = false;
            // 
            // RadLab
            // 
            this.RadLab.AutoSize = true;
            this.RadLab.Location = new System.Drawing.Point(131, 51);
            this.RadLab.Name = "RadLab";
            this.RadLab.Size = new System.Drawing.Size(40, 13);
            this.RadLab.TabIndex = 6;
            this.RadLab.Text = "Radius";
            this.RadLab.Visible = false;
            // 
            // WidthLab
            // 
            this.WidthLab.AutoSize = true;
            this.WidthLab.Location = new System.Drawing.Point(142, 80);
            this.WidthLab.Name = "WidthLab";
            this.WidthLab.Size = new System.Drawing.Size(35, 13);
            this.WidthLab.TabIndex = 7;
            this.WidthLab.Text = "Width";
            this.WidthLab.Visible = false;
            // 
            // AreaLab
            // 
            this.AreaLab.AutoSize = true;
            this.AreaLab.Location = new System.Drawing.Point(142, 106);
            this.AreaLab.Name = "AreaLab";
            this.AreaLab.Size = new System.Drawing.Size(29, 13);
            this.AreaLab.TabIndex = 8;
            this.AreaLab.Text = "Area";
            this.AreaLab.Visible = false;
            // 
            // AreaTB
            // 
            this.AreaTB.Location = new System.Drawing.Point(177, 103);
            this.AreaTB.Name = "AreaTB";
            this.AreaTB.Size = new System.Drawing.Size(100, 20);
            this.AreaTB.TabIndex = 9;
            this.AreaTB.Visible = false;
            // 
            // ShapeShow
            // 
            this.ShapeShow.AutoSize = true;
            this.ShapeShow.Location = new System.Drawing.Point(183, 35);
            this.ShapeShow.Name = "ShapeShow";
            this.ShapeShow.Size = new System.Drawing.Size(82, 13);
            this.ShapeShow.TabIndex = 13;
            this.ShapeShow.Text = "Select a button.";
            // 
            // AnswerLab
            // 
            this.AnswerLab.AutoSize = true;
            this.AnswerLab.Location = new System.Drawing.Point(145, 169);
            this.AnswerLab.Name = "AnswerLab";
            this.AnswerLab.Size = new System.Drawing.Size(42, 13);
            this.AnswerLab.TabIndex = 14;
            this.AnswerLab.Text = "Answer";
            // 
            // AnswerTB
            // 
            this.AnswerTB.Location = new System.Drawing.Point(186, 166);
            this.AnswerTB.Name = "AnswerTB";
            this.AnswerTB.ReadOnly = true;
            this.AnswerTB.Size = new System.Drawing.Size(100, 20);
            this.AnswerTB.TabIndex = 15;
            // 
            // AreaBtn
            // 
            this.AreaBtn.AutoSize = true;
            this.AreaBtn.Location = new System.Drawing.Point(29, 178);
            this.AreaBtn.Name = "AreaBtn";
            this.AreaBtn.Size = new System.Drawing.Size(74, 17);
            this.AreaBtn.TabIndex = 18;
            this.AreaBtn.TabStop = true;
            this.AreaBtn.Text = "Rectangle";
            this.AreaBtn.UseVisualStyleBackColor = true;
            this.AreaBtn.CheckedChanged += new System.EventHandler(this.AreaBtn_CheckedChanged);
            // 
            // WidthBtn
            // 
            this.WidthBtn.AutoSize = true;
            this.WidthBtn.Location = new System.Drawing.Point(29, 155);
            this.WidthBtn.Name = "WidthBtn";
            this.WidthBtn.Size = new System.Drawing.Size(59, 17);
            this.WidthBtn.TabIndex = 17;
            this.WidthBtn.TabStop = true;
            this.WidthBtn.Text = "Square";
            this.WidthBtn.UseVisualStyleBackColor = true;
            this.WidthBtn.CheckedChanged += new System.EventHandler(this.WidthBtn_CheckedChanged);
            // 
            // RadBtn
            // 
            this.RadBtn.AutoSize = true;
            this.RadBtn.Location = new System.Drawing.Point(29, 132);
            this.RadBtn.Name = "RadBtn";
            this.RadBtn.Size = new System.Drawing.Size(51, 17);
            this.RadBtn.TabIndex = 16;
            this.RadBtn.TabStop = true;
            this.RadBtn.Text = "Circle";
            this.RadBtn.UseVisualStyleBackColor = true;
            this.RadBtn.CheckedChanged += new System.EventHandler(this.RadBtn_CheckedChanged);
            // 
            // menuStrip1
            // 
            this.menuStrip1.Items.AddRange(new System.Windows.Forms.ToolStripItem[] {
            this.menuToolStripMenuItem});
            this.menuStrip1.Location = new System.Drawing.Point(0, 0);
            this.menuStrip1.Name = "menuStrip1";
            this.menuStrip1.Size = new System.Drawing.Size(520, 24);
            this.menuStrip1.TabIndex = 19;
            this.menuStrip1.Text = "menuStrip1";
            // 
            // menuToolStripMenuItem
            // 
            this.menuToolStripMenuItem.DropDownItems.AddRange(new System.Windows.Forms.ToolStripItem[] {
            this.clearToolStripMenuItem,
            this.exitToolStripMenuItem});
            this.menuToolStripMenuItem.Name = "menuToolStripMenuItem";
            this.menuToolStripMenuItem.Size = new System.Drawing.Size(50, 20);
            this.menuToolStripMenuItem.Text = "Menu";
            // 
            // clearToolStripMenuItem
            // 
            this.clearToolStripMenuItem.Name = "clearToolStripMenuItem";
            this.clearToolStripMenuItem.Size = new System.Drawing.Size(101, 22);
            this.clearToolStripMenuItem.Text = "Clear";
            // 
            // exitToolStripMenuItem
            // 
            this.exitToolStripMenuItem.Name = "exitToolStripMenuItem";
            this.exitToolStripMenuItem.Size = new System.Drawing.Size(101, 22);
            this.exitToolStripMenuItem.Text = "Exit";
            // 
            // CBO
            // 
            this.CBO.DropDownStyle = System.Windows.Forms.ComboBoxStyle.DropDownList;
            this.CBO.FormattingEnabled = true;
            this.CBO.Items.AddRange(new object[] {
            "",
            "Circle",
            "Square",
            "Rectangle"});
            this.CBO.Location = new System.Drawing.Point(13, 201);
            this.CBO.Name = "CBO";
            this.CBO.Size = new System.Drawing.Size(121, 21);
            this.CBO.TabIndex = 20;
            this.CBO.SelectedIndexChanged += new System.EventHandler(this.CBO_SelectedIndexChanged);
            // 
            // Form1
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(520, 261);
            this.Controls.Add(this.CBO);
            this.Controls.Add(this.AreaBtn);
            this.Controls.Add(this.WidthBtn);
            this.Controls.Add(this.RadBtn);
            this.Controls.Add(this.AnswerTB);
            this.Controls.Add(this.AnswerLab);
            this.Controls.Add(this.ShapeShow);
            this.Controls.Add(this.AreaTB);
            this.Controls.Add(this.AreaLab);
            this.Controls.Add(this.WidthLab);
            this.Controls.Add(this.RadLab);
            this.Controls.Add(this.WidthTB);
            this.Controls.Add(this.RadTB);
            this.Controls.Add(this.ExitBtn);
            this.Controls.Add(this.ClearBtn);
            this.Controls.Add(this.CalcBtn);
            this.Controls.Add(this.Title);
            this.Controls.Add(this.menuStrip1);
            this.Name = "Form1";
            this.Text = "Area";
            this.menuStrip1.ResumeLayout(false);
            this.menuStrip1.PerformLayout();
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.Label Title;
        private System.Windows.Forms.Button CalcBtn;
        private System.Windows.Forms.Button ClearBtn;
        private System.Windows.Forms.Button ExitBtn;
        private System.Windows.Forms.TextBox RadTB;
        private System.Windows.Forms.TextBox WidthTB;
        private System.Windows.Forms.Label RadLab;
        private System.Windows.Forms.Label WidthLab;
        private System.Windows.Forms.Label AreaLab;
        private System.Windows.Forms.TextBox AreaTB;
        private System.Windows.Forms.Label ShapeShow;
        private System.Windows.Forms.Label AnswerLab;
        private System.Windows.Forms.TextBox AnswerTB;
        private System.Windows.Forms.RadioButton AreaBtn;
        private System.Windows.Forms.RadioButton WidthBtn;
        private System.Windows.Forms.RadioButton RadBtn;
        private System.Windows.Forms.MenuStrip menuStrip1;
        private System.Windows.Forms.ToolStripMenuItem menuToolStripMenuItem;
        private System.Windows.Forms.ToolStripMenuItem clearToolStripMenuItem;
        private System.Windows.Forms.ToolStripMenuItem exitToolStripMenuItem;
        private System.Windows.Forms.ComboBox CBO;
    }
}

