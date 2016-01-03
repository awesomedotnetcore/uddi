using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Text;
using System.Windows.Forms;

namespace UDDI
{
    public partial class SearchServicesFrm : Form
    {
        public SearchServicesFrm()
        {
            InitializeComponent();
        }

        private void linkLabel1_LinkClicked(object sender, LinkLabelLinkClickedEventArgs e)
        {
            new SystemDiscovererFrm().Show();
        }

        private void linkLabel3_LinkClicked(object sender, LinkLabelLinkClickedEventArgs e)
        {
            new ServiceRepositoryFrm().Show();
        }

        private void SearchServicesFrm_Load(object sender, EventArgs e)
        {

        }

    }
}