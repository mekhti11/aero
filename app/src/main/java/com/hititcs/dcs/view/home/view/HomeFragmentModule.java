package com.hititcs.dcs.view.home.view;

import com.hititcs.dcs.domain.interactor.login.GetUsernameUseCase;
import dagger.Binds;
import dagger.Module;
import dagger.Provides;

@Module
public abstract class HomeFragmentModule {

  @Provides
  static HomeContract.HomePresenter provideHomePresenter(HomeContract.HomeView view,
      GetUsernameUseCase getUsernameUseCase) {
    return new HomePresenterImpl(view, getUsernameUseCase);
  }

  @Binds
  abstract HomeContract.HomeView bindHomeView(HomeFragment homeFragment);
}
