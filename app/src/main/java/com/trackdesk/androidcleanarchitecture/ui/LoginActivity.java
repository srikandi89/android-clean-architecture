package com.trackdesk.androidcleanarchitecture.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;

import com.trackdesk.androidcleanarchitecture.R;
import com.trackdesk.domain.entities.LoginRequestEntity;
import com.trackdesk.domain.entities.LoginResponseEntity;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import dagger.android.AndroidInjection;

public class LoginActivity extends AppCompatActivity implements LoginContract.LoginView{

    private static final String TAG = "LOGIN_ACTIVITY";

    @BindView(R.id.et_username)
    EditText etUsername;

    @BindView(R.id.et_password)
    EditText etPassword;

    @BindView(R.id.btn_sign_in)
    Button btnLogin;

    @Inject
    LoginPresenter loginPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        AndroidInjection.inject(this);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        ButterKnife.bind(this);
    }

    @Override
    protected void onStop() {
        super.onStop();

        loginPresenter.stop();
    }

    @Override
    @OnClick(R.id.btn_sign_in)
    public void onLoginClicked() {
        // Show progress dialog

        String username = etUsername.getText().toString();
        String password = etPassword.getText().toString();

        loginPresenter.authenticate(new LoginRequestEntity(username, password));
    }

    @Override
    public void onLoginSuccess() {
        // goto main activity
    }

    @Override
    public void onLoginFailed() {
        // display failure message dialog
    }

    @Override
    public void handleLoginResponse(LoginResponseEntity loginResponseSingle) {
        // decide what kind of ui action should be performed

        Log.d(TAG, "Retrieved from rxjava stream");
        Log.d(TAG, "Status Code : "+loginResponseSingle.getStatusCode());
    }

    @Override
    public void displayLoginError(Throwable throwable) {
        // if something unknown happened, notification goes here
    }
}
