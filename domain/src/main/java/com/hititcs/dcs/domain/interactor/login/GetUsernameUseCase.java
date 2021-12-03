package com.hititcs.dcs.domain.interactor.login;

import com.hititcs.dcs.domain.executor.PostExecutionThread;
import com.hititcs.dcs.domain.executor.ThreadExecutor;
import com.hititcs.dcs.domain.interactor.SingleUseCase;
import com.hititcs.dcs.domain.repository.LoginRepository;
import io.reactivex.Single;
import javax.inject.Inject;

public class GetUsernameUseCase extends SingleUseCase<String> {

  LoginRepository loginRepository;

  @Inject
  public GetUsernameUseCase(LoginRepository loginRepository,
      PostExecutionThread postExecutionThread,
      ThreadExecutor threadExecutor) {
    super(postExecutionThread, threadExecutor);
    this.loginRepository = loginRepository;
  }

  @Override
  protected Single<String> buildUseCaseObservable() {
    return loginRepository.getUsernameFromCache();
  }
}
