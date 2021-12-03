package com.hititcs.dcs.domain.interactor.login;

import com.hititcs.dcs.domain.executor.PostExecutionThread;
import com.hititcs.dcs.domain.executor.ThreadExecutor;
import com.hititcs.dcs.domain.interactor.SingleWithParamUseCase;
import com.hititcs.dcs.domain.repository.LoginRepository;
import io.reactivex.Single;
import javax.inject.Inject;

public class SaveUsernameUseCase extends SingleWithParamUseCase<Boolean, String> {

  LoginRepository loginRepository;

  @Inject
  public SaveUsernameUseCase(LoginRepository loginRepository,
      PostExecutionThread postExecutionThread,
      ThreadExecutor threadExecutor) {
    super(postExecutionThread, threadExecutor);
    this.loginRepository = loginRepository;
  }

  @Override
  protected Single<Boolean> buildUseCaseObservable(String param) {
    if (param == null) {
      return Single.error(new NullPointerException("SaveUsername request null"));
    }
    return loginRepository.saveUsernameToCache(param);
  }
}
