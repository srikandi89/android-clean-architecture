package com.trackdesk.domain.repositories;

import com.trackdesk.domain.entities.LoginResponseEntity;

import io.reactivex.Single;

public interface LoginRepository {
    Single<LoginResponseEntity> doLogin(String username, String password);
}
