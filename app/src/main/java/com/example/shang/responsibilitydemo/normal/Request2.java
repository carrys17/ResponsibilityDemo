package com.example.shang.responsibilitydemo.normal;

/**
 * Created by shang on 2017/12/20.
 */

public class Request2 extends AbstractRequest {
    public Request2(Object object) {
        super(object);
    }

    @Override
    public int getRequestLevel() {
        return 2;
    }
}
