package io.github.mklkj.navigation.ui.modules.notifications

import android.os.Bundle
import android.view.View
import androidx.fragment.app.viewModels
import androidx.lifecycle.observe
import io.github.mklkj.navigation.R
import io.github.mklkj.navigation.databinding.FragmentNotificationsBinding
import io.github.mklkj.navigation.ui.base.BaseFragment

class NotificationsFragment :
    BaseFragment<FragmentNotificationsBinding>(R.layout.fragment_notifications) {

    override val viewModel: NotificationsViewModel by viewModels()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel.text.observe(viewLifecycleOwner) {
            binding.textNotifications.text = it
        }
    }
}
