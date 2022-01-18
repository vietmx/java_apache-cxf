package com.maixuanviet.cxf.spring;

import javax.jws.WebService;

@WebService
public interface VietMX {
    String hello(String name);

    String register(Student student);
}