package com.huatec.hiot_cloud.test.mvptest;

import com.huatec.hiot_cloud.base.BasePresenter;
import com.huatec.hiot_cloud.test.mvptest.module.User;

public class TestPresenter extends BasePresenter<TestView> {

    public TestPresenter() {
    }

    public void  login(User user){
        if("hjd".equals(user.getUserName()) && "29".equals(user.getPassword())){
            getView().showMessage("登录成功");
        }else {
            getView().showMessage("登录失败");
        }
    }
}
