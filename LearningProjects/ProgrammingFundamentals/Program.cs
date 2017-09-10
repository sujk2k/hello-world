using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using ProgrammingFundamentals.Fundas;

namespace ProgrammingFundamentals
{
    public interface IExcecuteClient
    {
        void ExecuteClient();
    }

    class Program
    {
        public static void Main()
        {
            // 1. Singleton
            IExcecuteClient client = new SingletonClient();client.ExecuteClient();
        }
    }
}
