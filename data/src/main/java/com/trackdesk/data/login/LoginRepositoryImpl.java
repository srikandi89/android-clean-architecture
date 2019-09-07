package com.trackdesk.data.login;

import com.trackdesk.domain.entities.LoginResponseEntity;
import com.trackdesk.domain.repositories.LoginRepository;

import io.reactivex.Single;

public class LoginRepositoryImpl implements LoginRepository {
    @Override
    public Single<LoginResponseEntity> doLogin(String username, String password) {
        return Single.just(new LoginResponseEntity(200));
    }
}
