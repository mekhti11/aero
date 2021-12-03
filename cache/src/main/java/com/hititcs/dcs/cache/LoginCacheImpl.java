package com.hititcs.dcs.cache;

import com.hititcs.dcs.data.cache.LoginCache;
import com.hititcs.dcs.data.shared.AuthManager;
import com.hititcs.dcs.data.shared.PreferenceHelper;
import com.hititcs.dcs.domain.model.AuthModel;
import com.hititcs.dcs.domain.model.LoginRequest;
import io.reactivex.Completable;
import io.reactivex.Single;
import javax.inject.Inject;

public class LoginCacheImpl implements LoginCache {

  private final String PREF_USERNAME = "PREF_USERNAME";

  private final AuthManager authManager;
  private PreferenceHelper preferenceHelper;

  @Inject
  public LoginCacheImpl(AuthManager authManager, PreferenceHelper preferenceHelper) {
    this.authManager = authManager;
    this.preferenceHelper = preferenceHelper;
  }

  @Override
  public Single<AuthModel> login(LoginRequest loginRequest) {
    return Single.defer(() -> Single.just(authManager.getAuthModel()))
        .filter(authModel -> authModel != null)
        .toSingle();
  }

  @Override public Completable saveUsernameToCache(String username) {
    return Completable.defer(() -> {
      preferenceHelper.putString(PREF_USERNAME, username);
      return Completable.complete();
    });
  }

  @Override public Single<String> getUsernameFromCache() {
    return Single.defer(() -> Single.just(preferenceHelper.getString(PREF_USERNAME)));
  }

  @Override
  public Completable saveAuth(AuthModel authModel) {
    return Completable.defer(() -> {
      authManager.saveAuthModel(authModel);
      return Completable.complete();
    });
  }

  @Override
  public Completable clear() {
    return Completable.defer(() -> {
      authManager.clear();
      return Completable.complete();
    });
  }

  @Override
  public Single<Boolean> isCached() {
    return Single
        .defer(() -> Single.just(authManager.isContain()));
  }
}
