package com.trackdesk.androidcleanarchitecture.ui;

import com.trackdesk.domain.entities.LoginRequestEntity;
import com.trackdesk.domain.entities.LoginResponseEntity;

public interface LoginContract {
    interface LoginView {
        void onLoginClicked();
        void onLoginSuccess();
        void onLoginFailed();
        void handleLoginResponse(LoginResponseEntity loginResponseSingle);
        void displayLoginError(Throwable throwable);
    }

    interface LoginPresenter {
        void authenticate(LoginRequestEntity requestEntity);
    }
}
