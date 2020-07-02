package io.github.mklkj.navigation.ui.modules.dashboard

import android.os.Bundle
import android.view.View
import androidx.fragment.app.viewModels
import androidx.lifecycle.observe
import io.github.mklkj.navigation.R
import io.github.mklkj.navigation.databinding.FragmentDashboardBinding
import io.github.mklkj.navigation.ui.base.BaseFragment

class DashboardFragment : BaseFragment<FragmentDashboardBinding>(R.layout.fragment_dashboard) {

    override val viewModel: DashboardViewModel by viewModels()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewModel.text.observe(viewLifecycleOwner) {
            binding.textDashboard.text = it
        }
    }
}
