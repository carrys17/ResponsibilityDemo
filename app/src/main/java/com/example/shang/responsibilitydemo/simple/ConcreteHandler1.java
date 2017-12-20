package com.example.shang.responsibilitydemo.simple;

/**
 * Created by shang on 2017/12/20.
 */

// 具体处理者1
public class ConcreteHandler1 extends Handler {
    @Override
    public void handleRequest(String condition) {
        if (condition.equals("ConcreteHandler1")){
            System.out.println("ConcreteHandler1 handled");
            return;
        }else {
            next.handleRequest(condition);
        }
    }
}
