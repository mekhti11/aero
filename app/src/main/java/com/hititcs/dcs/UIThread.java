package com.hititcs.dcs;

import com.hititcs.dcs.domain.executor.PostExecutionThread;

import javax.inject.Inject;
import javax.inject.Singleton;

import io.reactivex.Scheduler;
import io.reactivex.android.schedulers.AndroidSchedulers;

@Singleton
public class UIThread implements PostExecutionThread {

  @Inject
  public UIThread() {
  }

  @Override
  public Scheduler getScheduler() {
    return AndroidSchedulers.mainThread();
  }
}
