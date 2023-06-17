package com.example.sistemaagrotcc

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

class PainelAdapter(fa: FragmentActivity, private val contents: List<Page>) : FragmentStateAdapter(fa) {
    override fun getItemCount(): Int {
        return contents.size
    }

    override fun createFragment(position: Int): Fragment {
        return PainelFragment.newInstance(contents[position])
    }
}