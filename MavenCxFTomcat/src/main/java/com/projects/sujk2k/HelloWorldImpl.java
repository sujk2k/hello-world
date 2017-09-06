
package com.projects.sujk2k;

import javax.jws.WebService;

@WebService(endpointInterface = "com.projects.sujk2k.HelloWorld")
public class HelloWorldImpl implements HelloWorld {

    public String sayHi(String text) {
        return "Hello " + text;
    }
}

