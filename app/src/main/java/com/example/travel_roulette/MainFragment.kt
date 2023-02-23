package com.example.travel_roulette

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.fragment.app.viewModels
import com.example.travel_roulette.databinding.FragmentMainBinding
import com.wada811.databinding.withBinding

class MainFragment: Fragment(R.layout.fragment_main) {

    private val viewModel by activityViewModels<MainViewModel>()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        withBinding<FragmentMainBinding> { binding ->
            binding.viewModel = viewModel
        }
    }

}