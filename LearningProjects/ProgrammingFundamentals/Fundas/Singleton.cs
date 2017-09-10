using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using ProgrammingFundamentals;

namespace ProgrammingFundamentals.Fundas
{

    public class SingletonClient : IExcecuteClient
    {
        public void ExecuteClient()
        {
            // Try to create 3 instances from Singleton class
            Singleton instance1 = Singleton.SingleInsance;
            Singleton instance2 = Singleton.SingleInsance;
            Singleton instance3 = Singleton.SingleInsance;

            // Display WorkerMethod output from Singleton
            Console.WriteLine(instance1.WorkerMethod());
            Console.WriteLine(instance2.WorkerMethod());
            Console.WriteLine(instance3.WorkerMethod());
        }
    }

    public class Singleton
    {
        // instance variable to prove that only one instance is being used
        int callerCount = 1;

        // Private constructro to avoid initialization of class from outside clients
        private Singleton()
        {
        }

        // Static single instance variable to hold insance of the class
        private static Singleton singleInstance = null;

        // Lazy instantiation. New single instance will created only when class property is referenced
        public static Singleton SingleInsance
        {
            get
            {
                if (singleInstance == null)
                {
                    singleInstance = new Singleton();
                }
                return singleInstance;
            }
        }

        // Sample worker method which proves that call is happening to same instance of this class
        // via incrementing and returning same callerCount variable on each instance call
        public string WorkerMethod()
        {
            String str = "Hello from WorkerMethod " + (callerCount++) + " time";
            return str;
        }
    }
}
