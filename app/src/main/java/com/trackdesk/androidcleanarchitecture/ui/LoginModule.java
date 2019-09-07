package com.trackdesk.androidcleanarchitecture.ui;

import com.trackdesk.androidcleanarchitecture.rx.SchedulersFacade;
import com.trackdesk.data.login.LoginRepositoryImpl;
import com.trackdesk.domain.repositories.LoginRepository;
import com.trackdesk.domain.usecases.login.LoginUseCase;

import dagger.Module;
import dagger.Provides;

@Module
public class LoginModule {
//    @Provides
//    LoginRepository getLoginRepository() {
//        return new LoginRepositoryImpl();
//    }
//
//    @Provides
//    LoginPresenter getLoginPresenter(LoginContract.LoginView view,
//                                     LoginUseCase loginUseCase,
//                                     SchedulersFacade schedulersFacade) {
//        return new LoginPresenter(view, loginUseCase, schedulersFacade);
//    }

    @Provides
    LoginPresenter getLoginPresenter(LoginContract.LoginView view) {
        return new LoginPresenter(view);
    }
}
