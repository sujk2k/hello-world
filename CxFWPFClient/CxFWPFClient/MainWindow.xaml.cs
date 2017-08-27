using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows;
using System.Windows.Controls;
using System.Windows.Data;
using System.Windows.Documents;
using System.Windows.Input;
using System.Windows.Media;
using System.Windows.Media.Imaging;
using System.Windows.Navigation;
using System.Windows.Shapes;

namespace CxFWPFClient
{
    /// <summary>
    /// Interaction logic for MainWindow.xaml
    /// </summary>
    public partial class MainWindow : Window
    {
        JavaCxFReference.HelloWorldClient helloWorldClient;

        public MainWindow()
        {
            InitializeComponent();
            helloWorldClient = new JavaCxFReference.HelloWorldClient();
        }

        private void btnProcessRequest_Click(object sender, RoutedEventArgs e)
        {
            int result = helloWorldClient.addMyTwoNumbers(int.Parse(txtNumber1.Text), int.Parse(txtNumber2.Text));
            txtResult.Text = result.ToString();
        }
    }
}
