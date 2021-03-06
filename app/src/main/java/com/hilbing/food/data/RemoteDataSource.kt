package com.hilbing.food.data

import com.hilbing.food.data.network.FoodRecipeApi
import com.hilbing.food.model.FoodRecipe
import retrofit2.Response
import javax.inject.Inject

class RemoteDataSource @Inject constructor(
    private val foodRecipeApi: FoodRecipeApi
) {
    suspend fun getRecipes(queries: Map<String, String>): Response<FoodRecipe>{
        return foodRecipeApi.getRecipes(queries)
    }
}