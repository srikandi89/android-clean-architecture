package com.trackdesk.androidcleanarchitecture.ui;

import dagger.Binds;
import dagger.Module;

@Module
public interface LoginViewModule {
    @Binds
    LoginContract.LoginView provideLoginView(LoginActivity activity);
}
