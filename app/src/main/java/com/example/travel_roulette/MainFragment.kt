package com.example.travel_roulette

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import com.example.travel_roulette.databinding.FragmentMainBinding
import com.example.travel_roulette.vo.Area
import com.wada811.databinding.withBinding

class MainFragment : Fragment(R.layout.fragment_main) {

    private val viewModel by activityViewModels<MainViewModel>()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        withBinding<FragmentMainBinding> { binding ->
            binding.viewModel = viewModel
            binding.owner = this

            setupChubuRipple(binding)
        }
    }

    private fun setupChubuRipple(binding: FragmentMainBinding) {
        // 中部地方は形が複雑で２つのViewになっているためrippleをここでそろえる
        binding.chubu.root.setOnClickListener {
            if (viewModel.onClickChubuArea.value.not()) {
                viewModel.onClickChubu()
                binding.chubuSide.root.onDoRippleEffect()
            }
        }
        binding.chubuSide.root.setOnClickListener {
            if (viewModel.onClickChubuArea.value.not()) {
                viewModel.onClickChubu()
                binding.chubu.root.onDoRippleEffect()
            }
        }
    }

    fun onClickArea(area: Area) {
        val navigationId = when (area) {
            Area.Tohoku -> R.id.tohokuAreaFragment
            Area.Kanto -> R.id.kantoAreaFragment
            Area.Chubu -> R.id.chubuAreaFragment
            Area.Kansai -> R.id.kansaiAreaFragment
            Area.Chugoku -> R.id.chugokuAreaFragment
            Area.Shikoku -> R.id.shikokuAreaFragment
            Area.Kyushu -> R.id.kyushuAreaFragment
        }

        findNavController().navigate(navigationId)
    }

    private fun View.onDoRippleEffect() {
        this.isPressed = true
        this.isPressed = false
        this.performClick()
    }
}