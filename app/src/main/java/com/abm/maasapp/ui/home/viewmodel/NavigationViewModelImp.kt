package com.abm.maasapp.ui.home.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel


class NavigationViewModelImp :ViewModel() {

    private var goHomeBackPressed:MutableLiveData<Boolean> = MutableLiveData()
    val goHomeBackPressed_:LiveData<Boolean> = goHomeBackPressed

    fun goHomeNavigation(){
        goHomeBackPressed.postValue(true)
    }
}