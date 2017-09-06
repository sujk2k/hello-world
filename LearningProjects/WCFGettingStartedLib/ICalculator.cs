using System;
using System.Collections.Generic;
using System.Linq;
using System.Runtime.Serialization;
using System.ServiceModel;
using System.ServiceModel.Web;
using System.Text;

namespace WCFGettingStartedLib
{
    [ServiceContract(Namespace = "http://Microsoft.ServiceModel.Samples")]
   public interface ICalculator
    {
        [OperationContract]
        double Add(double num1, double num2);

        [OperationContract]
        double Subtract(double num1, double num2);

        [OperationContract]
        double Multiply(double num1, double num2);

        [OperationContract]
        double Divide(double num1, double num2);
    }
}
