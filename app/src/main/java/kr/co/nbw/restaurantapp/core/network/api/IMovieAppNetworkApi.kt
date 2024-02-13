package kr.co.nbw.restaurantapp.core.network.api

import kr.co.nbw.restaurantapp.core.network.model.RestaurantResponse
import kr.co.nbw.restaurantapp.library.network.model.ApiResult

interface IRestaurantAppNetworkApi {
    suspend fun getRestaurantsList(): ApiResult<List<RestaurantResponse>>
}
