package com.maixuanviet.cxf.introduction;

import javax.xml.ws.Endpoint;

public class Server {
    public static void main(String args[]) throws InterruptedException {
        VietMXImpl implementor = new VietMXImpl();
        String address = "http://localhost:8080/vietmx";
        Endpoint.publish(address, implementor);
        System.out.println("Server ready...");
        Thread.sleep(60 * 1000);
        System.out.println("Server exiting");
        System.exit(0);
    }
}