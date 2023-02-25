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
    }

    private fun View.onDoRippleEffect() {
        this.isPressed = true
        this.isPressed = false
        this.performClick()
    }
}