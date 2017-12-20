package com.example.shang.responsibilitydemo.simple;

/**
 * Created by shang on 2017/12/20.
 */


//  客户端类
public class Client {
    public static void main(String []args){
        ConcreteHandler1 handler1 = new ConcreteHandler1();
        ConcreteHandler2 handler2 = new ConcreteHandler2();
        handler1.next = handler2;
        handler2.next = handler1;
        handler1.handleRequest("ConcreteHandler2");
    }
}
