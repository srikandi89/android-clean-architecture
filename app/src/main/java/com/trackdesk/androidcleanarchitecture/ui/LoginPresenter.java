package com.trackdesk.androidcleanarchitecture.ui;

import android.util.Log;

import com.trackdesk.androidcleanarchitecture.base.BasePresenter;
import com.trackdesk.androidcleanarchitecture.rx.SchedulersFacade;
import com.trackdesk.data.login.LoginRepositoryImpl;
import com.trackdesk.domain.entities.LoginRequestEntity;
import com.trackdesk.domain.entities.LoginResponseEntity;
import com.trackdesk.domain.repositories.LoginRepository;
import com.trackdesk.domain.usecases.login.LoginUseCase;

import io.reactivex.Single;

public class LoginPresenter
        extends BasePresenter<LoginContract.LoginView>
        implements LoginContract.LoginPresenter {

    private static final String TAG = "LOGIN_PRESENTER";

    private LoginUseCase loginUseCase;
    private LoginRepository loginRepository;
//    private final SchedulersFacade schedulersFacade;

    protected LoginPresenter(LoginContract.LoginView view) {
        super(view);

        loginRepository = new LoginRepositoryImpl();
        loginUseCase    = new LoginUseCase(loginRepository);
    }

    @Override
    public void authenticate(LoginRequestEntity requestEntity) {
        Log.d(TAG, "Authentication triggered");
    }

//    private void loadAuthenticationResult(Single<LoginResponseEntity> loginResponseSingle) {
//        addDisposable(loginResponseSingle
//                .subscribeOn(schedulersFacade.io())
//                .observeOn(schedulersFacade.ui())
//                .subscribe(view::handleLoginResponse, view::displayLoginError)
//        );
//    }

}
