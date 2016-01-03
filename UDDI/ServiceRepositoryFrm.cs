using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Text;
using System.Windows.Forms;

namespace UDDI
{
    public partial class ServiceRepositoryFrm : Form
    {
        public ServiceRepositoryFrm()
        {
            InitializeComponent();

            DataTable dt = new DataTable();
            dt.Columns.Add("Name");
            dt.Columns.Add("Email");

            DataRow row = dt.NewRow();
            row["Name"] = "Jane Doe";
            row["Email"] = "janedoe@somewhere.com";

            dt.Rows.Add(row);

            dataGridView3.DataSource = dt;

            row = dt.NewRow();
            row["Name"] = "John Doe";
            row["Email"] = "johndoe@somewhere.com";

            dt.Rows.Add(row);

            dataGridView4.DataSource = dt;
        }

        private void tabPage2_Click(object sender, EventArgs e)
        {

        }
    }
}