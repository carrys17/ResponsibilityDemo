package com.example.shang.responsibilitydemo.normal;

/**
 * Created by shang on 2017/12/20.
 */

public class Client {
    public static void main(String []args){
        AbstractHandler handler1 = new Handler1();
        AbstractHandler handler2 = new Handler2();
        AbstractHandler handler3 = new Handler3();

        handler1.next = handler2;
        handler2.next = handler3;

        AbstractRequest request1 = new Request1("request1");
        AbstractRequest request2 = new Request2("request2");
        AbstractRequest request3 = new Request3("request3");

        handler1.handleRequest(request1);
        handler1.handleRequest(request2);
        handler1.handleRequest(request3);


    }
}
