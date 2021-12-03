package com.hititcs.dcs.view.home.view;

import com.hititcs.dcs.domain.interactor.login.GetUsernameUseCase;
import com.hititcs.dcs.subscriber.SingleSubscriber;
import javax.inject.Inject;

public class HomePresenterImpl implements HomeContract.HomePresenter {

  private final GetUsernameUseCase getUsernameUseCase;
  private HomeContract.HomeView view;

  @Inject
  public HomePresenterImpl(HomeContract.HomeView view, GetUsernameUseCase getUsernameUseCase) {
    this.view = view;
    this.getUsernameUseCase = getUsernameUseCase;
  }

  @Override public HomeContract.HomeView getView() {
    return view;
  }

  @Override public void setView(HomeContract.HomeView view) {
    this.view = view;
  }

  @Override public void dispose() {
    if (getUsernameUseCase != null) {
      getUsernameUseCase.dispose();
    }
  }

  @Override public void getUsername() {
    showViewLoading();
    getUsernameUseCase.execute(new SingleSubscriber<String>(this) {
      @Override public void onResponse(String data) {
        view.showUsername(data);
        hideViewLoading();
      }
    });
  }
}
