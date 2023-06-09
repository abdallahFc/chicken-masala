package com.example.chickenmasala.ui.interfaces

import com.example.chickenmasala.entities.Cuisine
import com.example.chickenmasala.entities.Recipe

interface HomeInteractionListener {
    fun onCuisineClicked(cuisine: Cuisine)
    fun onRecipeClicked(recipe: Recipe)

}