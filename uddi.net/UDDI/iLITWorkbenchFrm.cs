using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Text;
using System.Windows.Forms;

namespace UDDI
{
    public partial class WorkbenchFrm : Form
    {
        public WorkbenchFrm()
        {
            InitializeComponent();
        }


        private void button4_Click(object sender, EventArgs e)
        {
            new SCRUMAssistantFrm().Show();
        }

        private void button3_Click(object sender, EventArgs e)
        {
            new CustomerFrm().Show();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            new ServiceRepositoryWorkbenchFrm().Show();
        }

        private void button2_Click(object sender, EventArgs e)
        {
            new SystemDiscovererFrm().Show();
        }

    }
}