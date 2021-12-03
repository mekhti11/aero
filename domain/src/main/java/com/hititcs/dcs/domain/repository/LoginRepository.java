package com.hititcs.dcs.domain.repository;

import com.hititcs.dcs.domain.model.AuthModel;
import com.hititcs.dcs.domain.model.LoginRequest;
import io.reactivex.Completable;
import io.reactivex.Single;

public interface LoginRepository {

  Single<AuthModel> login(LoginRequest loginRequest);

  Single<Boolean> saveUsernameToCache(String username);

  Single<String> getUsernameFromCache();

  Completable saveAuth(AuthModel authModel);

  Completable clear();
}
