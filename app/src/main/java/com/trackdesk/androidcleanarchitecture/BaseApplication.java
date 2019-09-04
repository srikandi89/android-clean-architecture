package com.trackdesk.androidcleanarchitecture;

import android.app.Application;

public class BaseApplication extends Application {

    private MyComponent component;

    @Override
    public void onCreate() {
        super.onCreate();

        component = createMyComponent();
    }

    public MyComponent getComponent() {
        return component;
    }

    private MyComponent createMyComponent() {
        component = DaggerMyComponent.create();

        return component;
    }
}
