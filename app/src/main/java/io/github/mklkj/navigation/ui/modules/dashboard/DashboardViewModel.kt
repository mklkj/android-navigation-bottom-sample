package io.github.mklkj.navigation.ui.modules.dashboard

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import io.github.mklkj.navigation.ui.base.BaseViewModel
import io.github.mklkj.navigation.ui.modules.dashboard.DashboardFragmentDirections.Companion.actionToDetails

class DashboardViewModel : BaseViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is dashboard Fragment"
    }

    val text: LiveData<String> = _text

    fun navigateToDetails(value: String) {
        navigate(actionToDetails(value))
    }
}
