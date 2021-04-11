package com.huatec.hiot_cloud.injection.component;

import android.app.Application;
import android.content.Context;

import com.huatec.hiot_cloud.App;
import com.huatec.hiot_cloud.injection.module.ApplicationModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * A component whose lifetime is the life of the application.
 */
@Singleton
@Component(modules = ApplicationModule.class)
public interface ApplicationComponent {

    void inject(App application);

    Context context();

    Application application();


    @Component.Builder
    interface ApplicationModuleBuilder {
        ApplicationComponent build();

        ApplicationModuleBuilder applicationModule(ApplicationModule applicationModule);
    }
}
