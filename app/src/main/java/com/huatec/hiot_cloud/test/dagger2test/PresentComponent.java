package com.huatec.hiot_cloud.test.dagger2test;

import com.huatec.hiot_cloud.test.mvptest.TestMVPActivity;

import dagger.Component;

/*
*测试注入器接口
 */
@Component
public interface PresentComponent {
    void inject(TestMVPActivity testMVPActivity);
}
