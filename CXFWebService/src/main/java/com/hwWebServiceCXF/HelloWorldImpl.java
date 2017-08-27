
package com.hwWebServiceCXF;

import javax.jws.WebService;

@WebService(endpointInterface = "com.hwWebServiceCXF.HelloWorld")
public class HelloWorldImpl implements HelloWorld {

    public String sayHi(String text) {
        return "Hello " + text;
    }

    public int addMyTwoNumbers(int num1, int num2) {
        return num1 + num2;
    }
}

