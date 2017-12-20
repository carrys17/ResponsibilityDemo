package com.example.shang.responsibilitydemo.normal;

/**
 * Created by shang on 2017/12/20.
 */

// 抽象请求
public abstract class AbstractRequest {

    private Object object;

    public AbstractRequest(Object object){
        this.object = object;
    }

    public Object getObject(){
        return object;
    }

    public abstract int getRequestLevel();


}
