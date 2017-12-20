package com.example.shang.responsibilitydemo.normal;

/**
 * Created by shang on 2017/12/20.
 */

// 抽象处理者
public abstract class AbstractHandler {
    // 下一个处理者
    protected AbstractHandler next;

    // 处理请求
    public final void handleRequest(AbstractRequest request){
        if (getHandleLevel() == request.getRequestLevel()){
            handle(request);
        }else {
            next.handleRequest(request);
        }

    }

    // 每个处理者对象的具体处理方式
    protected abstract void handle(AbstractRequest request);

    // 处理级别
    public abstract int getHandleLevel();
}
