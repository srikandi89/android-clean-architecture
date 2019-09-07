package com.trackdesk.domain.usecases.login;

import com.trackdesk.domain.entities.LoginRequestEntity;
import com.trackdesk.domain.entities.LoginResponseEntity;
import com.trackdesk.domain.repositories.LoginRepository;
import com.trackdesk.domain.usecases.UseCase;

import javax.inject.Inject;

import io.reactivex.Single;

public final class LoginUseCase implements UseCase<LoginRequestEntity, LoginResponseEntity> {

    private final LoginRepository loginRepository;

    @Inject
    public LoginUseCase(LoginRepository loginRepository) {
        this.loginRepository = loginRepository;
    }

    @Override
    public Single<LoginResponseEntity> execute(LoginRequestEntity input) {
        return loginRepository.doLogin(input.getUsername(), input.getPassword());
    }
}
