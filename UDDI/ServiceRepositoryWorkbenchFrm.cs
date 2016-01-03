using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Text;
using System.Windows.Forms;

namespace UDDI
{
    public partial class ServiceRepositoryWorkbenchFrm : Form
    {
        public ServiceRepositoryWorkbenchFrm()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            new NewServiceFrm().Show();
        }

        private void button2_Click(object sender, EventArgs e)
        {
            new ServiceRepositoryFrm().Show();
        }

        private void button3_Click(object sender, EventArgs e)
        {
            new SearchServicesFrm().Show();
        }



    }
}