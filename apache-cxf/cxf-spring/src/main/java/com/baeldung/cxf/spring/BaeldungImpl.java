package com.nklkarthi.cxf.spring;

import javax.jws.WebService;

@WebService(endpointInterface = "com.nklkarthi.cxf.spring.nklkarthi")
public class nklkarthiImpl implements nklkarthi {
    private int counter;

    public String hello(String name) {
        return "Hello " + name + "!";
    }

    public String register(Student student) {
        counter++;
        return student.getName() + " is registered student number " + counter;
    }
}