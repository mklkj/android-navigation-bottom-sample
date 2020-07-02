package io.github.mklkj.navigation.ui.modules.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import io.github.mklkj.navigation.ui.base.BaseViewModel

class HomeViewModel : BaseViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is home Fragment"
    }

    val text: LiveData<String> = _text
}
