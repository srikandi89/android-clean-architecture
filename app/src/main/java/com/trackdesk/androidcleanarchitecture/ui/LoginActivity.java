package com.trackdesk.androidcleanarchitecture.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;

import com.trackdesk.androidcleanarchitecture.R;
import com.trackdesk.domain.entities.LoginResponseEntity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class LoginActivity extends AppCompatActivity implements LoginContract.LoginView{

    private static final String TAG = "LOGIN_ACTIVITY";

    @BindView(R.id.et_username)
    EditText etUsername;

    @BindView(R.id.et_password)
    EditText etPassword;

    @BindView(R.id.btn_sign_in)
    Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        ButterKnife.bind(this);
    }

    @Override
    @OnClick(R.id.btn_sign_in)
    public void onLoginClicked() {
        // Show progress dialog

        Log.d(TAG, "Login button clicked");
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
    }

    @Override
    public void displayLoginError(Throwable throwable) {
        // if something unknown happened, notification goes here
    }
}
