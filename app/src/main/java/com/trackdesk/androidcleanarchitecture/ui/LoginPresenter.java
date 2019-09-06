package com.trackdesk.androidcleanarchitecture.ui;

import com.trackdesk.androidcleanarchitecture.base.BasePresenter;
import com.trackdesk.androidcleanarchitecture.rx.SchedulersFacade;
import com.trackdesk.domain.entities.LoginResponseEntity;
import com.trackdesk.domain.usecases.login.LoginUseCase;

import io.reactivex.Single;

public class LoginPresenter
        extends BasePresenter<LoginContract.LoginView>
        implements LoginContract.LoginPresenter {

    private final LoginUseCase loginUseCase;
    private final SchedulersFacade schedulersFacade;;

    protected LoginPresenter(
            LoginContract.LoginView view,
            LoginUseCase loginUseCase,
            SchedulersFacade schedulersFacade) {
        super(view);

        this.loginUseCase = loginUseCase;
        this.schedulersFacade = schedulersFacade;
    }

    @Override
    public void authenticate() {

    }

    private void loadAuthenticationResult(Single<LoginResponseEntity> loginResponseSingle) {
        addDisposable(loginResponseSingle
                .subscribeOn(schedulersFacade.io())
                .observeOn(schedulersFacade.ui())
                .subscribe(view::handleLoginResponse, view::displayLoginError)
        );
    }
}
