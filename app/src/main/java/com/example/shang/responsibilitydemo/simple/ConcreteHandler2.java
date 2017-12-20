package com.example.shang.responsibilitydemo.simple;

/**
 * Created by shang on 2017/12/20.
 */

// 具体处理者2
public class ConcreteHandler2 extends Handler {
    @Override
    public void handleRequest(String condition) {
        if (condition.equals("ConcreteHandler2")){
            System.out.println("ConcreteHandler2 handled");
            return;
        }else {
            next.handleRequest(condition);
        }
    }
}
