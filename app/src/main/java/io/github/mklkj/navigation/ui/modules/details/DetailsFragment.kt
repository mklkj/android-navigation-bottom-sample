package io.github.mklkj.navigation.ui.modules.details

import android.os.Bundle
import android.view.View
import androidx.navigation.fragment.navArgs
import io.github.mklkj.navigation.R
import io.github.mklkj.navigation.databinding.FragmentDetailsBinding
import io.github.mklkj.navigation.ui.base.BaseFragment

class DetailsFragment : BaseFragment<FragmentDetailsBinding>(R.layout.fragment_details) {

    private val args: DetailsFragmentArgs by navArgs()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.value.text = args.value
    }
}
