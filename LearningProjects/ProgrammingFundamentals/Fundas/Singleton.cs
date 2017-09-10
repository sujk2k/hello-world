using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using ProgrammingFundamentals;
using System.Threading;

namespace ProgrammingFundamentals.Fundas
{
    public class SingletonClient : IExcecuteClient
    {
        public void ExecuteClient()
        {
            // Client to test Singleton implementation with Lazy instantiation and with NO thread safety
            ExecuteSingletonNoThreadSafe();

            //Client to test Singleton implementation with Lazy instantiation and WITH thread safety
            ExecuteSingletonThreadSafe();
        }


        private void ExecuteSingletonThreadSafe()
        {
            Thread th1 = new Thread(delegate () { SingletonThreadSafe.GetInstance(); });
            Thread th2 = new Thread(delegate () { SingletonThreadSafe.GetInstance(); });
            th1.Start();
            th2.Start();
        }

        private static void ExecuteSingletonNoThreadSafe()
        {
            // Try to create 3 instances from SingletonNoThreadSafe class
            SingletonNoThreadSafe instance1 = SingletonNoThreadSafe.SingleInsance;
            SingletonNoThreadSafe instance2 = SingletonNoThreadSafe.SingleInsance;
            SingletonNoThreadSafe instance3 = SingletonNoThreadSafe.SingleInsance;

            // Display WorkerMethod output from Singleton
            Console.WriteLine(instance1.WorkerMethod());
            Console.WriteLine(instance2.WorkerMethod());
            Console.WriteLine(instance3.WorkerMethod());
        }
    }
    /// <summary>
    /// Below implementation is not thread safe as two threads may create 2 separate instances in case
    /// </summary>
    public class SingletonNoThreadSafe
    {
        // instance variable to prove that only one instance is being used
        int callerCount = 1;

        // Private constructor to avoid initialization of class from outside clients
        private SingletonNoThreadSafe()
        {
        }

        // Static single instance variable to hold insance of the class
        private static SingletonNoThreadSafe singleInstance = null;

        // Lazy instantiation. New single instance will created only when class property is referenced
        // This is not thread safe implementation as 2 same threads can evaluate false condition and create multiple instances
        public static SingletonNoThreadSafe SingleInsance
        {
            get
            {
                if (singleInstance == null)
                {
                    singleInstance = new SingletonNoThreadSafe();
                }
                return singleInstance;
            }
        }

        // Sample worker method which proves that call is happening to same instance of this class
        // via incrementing and returning same callerCount variable on each instance call
        public string WorkerMethod()
        {
            String str = "Hello from SingletonNoThreadSafe WorkerMethod " + (callerCount++) + " time";
            return str;
        }
    }

    /// <summary>
    /// Thread safe implementation of Singleton
    /// Lock avoids multiple threads simultaniously accessing multiple instances using Lock
    /// </summary>
    public class SingletonThreadSafe
    {
        private SingletonThreadSafe()
        {

        }

        private static SingletonThreadSafe instance = null;

        private static readonly object padLock = new object();

        public static SingletonThreadSafe GetInstance()
        {
            lock (padLock)
            {
                if (instance == null)
                {
                    instance = new SingletonThreadSafe();
                }
                return instance;
            }
        }
    }
}
