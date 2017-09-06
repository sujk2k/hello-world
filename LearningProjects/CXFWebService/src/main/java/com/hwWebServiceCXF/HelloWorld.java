package com.hwWebServiceCXF;

import javax.jws.WebService;

@WebService
public interface HelloWorld {
    String sayHi(String text);
    int addMyTwoNumbers(int num1, int num2);
 }

