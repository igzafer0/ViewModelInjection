package com.igzafer.viewmodelinjection

import android.util.Log
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import dagger.hilt.android.scopes.ViewModelScoped
import javax.inject.Inject

@HiltViewModel
class MainActivityViewModel @Inject constructor(
    private val randomString: String
) : ViewModel() {
    init {
        Log.i("winter", randomString)
    }
}