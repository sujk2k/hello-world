using System;
using System.Collections.Generic;
using System.Linq;
using System.ServiceModel;
using System.ServiceModel.Description;
using System.Text;
using System.Threading.Tasks;
using WCFGettingStartedLib;

namespace WCFGettingStartedHost
{
    class Program
    {
        static void Main(string[] args)
        {
            // Step 1: Create URI to serve as base address
            Uri baseAddress = new Uri("http://localhost:8000/WCFGettingStarted/");

            // Step 2: Create a ServiceHost instance
            ServiceHost selfHost = new ServiceHost(typeof(CalculatorService), baseAddress);

            try
            {
                // Step 3: Add a service endpoint
                selfHost.AddServiceEndpoint(typeof(ICalculator), new WSHttpBinding(), "CalculatorService");

                // Step 4: Enable metadata exchange.  
                ServiceMetadataBehavior smb = new ServiceMetadataBehavior();
                smb.HttpGetEnabled = true;
                selfHost.Description.Behaviors.Add(smb);

                // Step 5: Start the service
                selfHost.Open();

                Console.WriteLine("The service is ready.");
                Console.WriteLine("Press <ENTER> to terminate service.");
                Console.WriteLine();
                Console.ReadLine();

                // Close the ServiceHostBase to shutdown the service.  
                selfHost.Close();

            }
            catch (CommunicationException ce)
            {
                // If host not able to access port on local machine use below command as admin
                // netsh http add urlacl url=http://+:8000/WCFGettingStarted user=SUJK2K\sujk2k_user

                Console.WriteLine("An exception occurred: {0}", ce.Message);
                selfHost.Abort();
            }
        }
    }
}
