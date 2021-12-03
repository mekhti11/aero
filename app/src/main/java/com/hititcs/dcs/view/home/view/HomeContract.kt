package com.hititcs.dcs.view.home.view

import com.hititcs.dcs.view.LoadPresenter
import com.hititcs.dcs.view.LoadView

interface HomeContract {
  interface HomePresenter : LoadPresenter<HomeView> {
    fun getUsername()
  }

  interface HomeView : LoadView {
    fun showUsername(username: String)
  }
}