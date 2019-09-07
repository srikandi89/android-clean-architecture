package com.trackdesk.androidcleanarchitecture.di;

import com.trackdesk.androidcleanarchitecture.ui.LoginActivity;
import com.trackdesk.androidcleanarchitecture.ui.LoginModule;
import com.trackdesk.androidcleanarchitecture.ui.LoginViewModule;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class BuilderModule {
    @ContributesAndroidInjector(modules = {LoginViewModule.class, LoginModule.class})
    abstract LoginActivity bindLoginActivity();
}
