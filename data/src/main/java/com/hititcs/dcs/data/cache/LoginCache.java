package com.hititcs.dcs.data.cache;

import com.hititcs.dcs.domain.model.AuthModel;
import com.hititcs.dcs.domain.model.LoginRequest;
import io.reactivex.Completable;
import io.reactivex.Single;

public interface LoginCache {

  Single<AuthModel> login(LoginRequest loginRequest);

  Completable saveUsernameToCache(String username);

  Single<String> getUsernameFromCache();

  Completable saveAuth(AuthModel authModel);

  Completable clear();

  Single<Boolean> isCached();
}
