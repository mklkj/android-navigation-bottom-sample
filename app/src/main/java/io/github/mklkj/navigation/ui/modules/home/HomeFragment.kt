package io.github.mklkj.navigation.ui.modules.home

import android.os.Bundle
import android.view.View
import androidx.fragment.app.viewModels
import androidx.lifecycle.observe
import io.github.mklkj.navigation.R
import io.github.mklkj.navigation.databinding.FragmentHomeBinding
import io.github.mklkj.navigation.ui.base.BaseFragment

class HomeFragment : BaseFragment<FragmentHomeBinding>(R.layout.fragment_home) {

    override val viewModel: HomeViewModel by viewModels()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel.text.observe(viewLifecycleOwner) {
            binding.textHome.text = it
        }
    }
}
