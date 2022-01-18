package com.maixuanviet.cxf.spring;

import javax.jws.WebService;

@WebService(endpointInterface = "com.maixuanviet.cxf.spring.VietMX")
public class VietMXImpl implements VietMX {
    private int counter;

    public String hello(String name) {
        return "Hello " + name + "!";
    }

    public String register(Student student) {
        counter++;
        return student.getName() + " is registered student number " + counter;
    }
}