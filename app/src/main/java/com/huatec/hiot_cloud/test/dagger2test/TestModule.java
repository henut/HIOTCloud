package com.huatec.hiot_cloud.test.dagger2test;

import dagger.Module;
import dagger.Provides;

/*
*dagger测试module类
 */
@Module
public class TestModule {

    @Provides
    public ThirdObj geThirdObj(){
        return new ThirdObj();
    }
}
