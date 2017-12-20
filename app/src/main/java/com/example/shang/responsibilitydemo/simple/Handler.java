package com.example.shang.responsibilitydemo.simple;

/**
 * Created by shang on 2017/12/20.
 */

// 抽象处理者
public abstract class Handler {
    protected Handler next;

    public abstract void handleRequest(String condition);
}
