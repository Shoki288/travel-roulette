package com.example.travel_roulette.area

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import com.example.travel_roulette.MainViewModel
import com.example.travel_roulette.R
import com.example.travel_roulette.databinding.FragmentAreaShikokuBinding
import com.wada811.databinding.withBinding

class ShikokuAreaFragment : Fragment(R.layout.fragment_area_shikoku) {

    private val viewModel by activityViewModels<MainViewModel>()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        withBinding<FragmentAreaShikokuBinding> { binding ->
            binding.viewModel = viewModel
        }
    }

}