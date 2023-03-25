package com.example.chickenmasala.ui.fragments

import android.os.Bundle
import android.view.View
import com.example.chickenmasala.databinding.FragmentIngredientsBinding
import com.example.chickenmasala.ui.adapters.IngredientsAdapter

class IngredientsFragment(private val translatedIngredients:List<String>) :
    BaseFragment<FragmentIngredientsBinding>(FragmentIngredientsBinding::inflate) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val adapter = IngredientsAdapter(translatedIngredients)
        binding.ingredientRecycler.adapter = adapter
    }

}


