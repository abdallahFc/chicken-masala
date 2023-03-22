package com.example.chickenmasala.ui

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter

class PagerAdapter(
    fm: FragmentManager,
    lifecycle: Lifecycle,
    private val ingredients: String,
    private val instructions: String
) :
    FragmentStateAdapter(fm, lifecycle) {
    override fun getItemCount(): Int {
        return 2
    }

    override fun createFragment(position: Int): Fragment {
        return if (position == 0) {
            IngredientsFragment.newInstance(ingredients)
        } else {
            InstructionsFragment.newInstance(instructions)
        }
    }


}