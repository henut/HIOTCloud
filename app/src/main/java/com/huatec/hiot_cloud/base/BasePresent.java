package com.huatec.hiot_cloud.base;

/*
 *MVP架构present层基类
 */
public class BasePresent <V extends BaseView>{
    private V view;

    public BasePresent() {
    }

    public void setView(V view){
        this.view = view;
    }

    public void destroy(){
        if (viewAttached()){
            view = null;
        }
    }

    public boolean viewAttached(){
        return view != null;
    }
}
