package com.example.shang.responsibilitydemo.normal;

/**
 * Created by shang on 2017/12/20.
 */

public class Handler1 extends AbstractHandler {
    @Override
    protected void handle(AbstractRequest request) {
        System.out.println("Handler1 handle request: level = "+request.getRequestLevel()+", content = "+request.getObject());
    }

    @Override
    public int getHandleLevel() {
        return 1;
    }
}
