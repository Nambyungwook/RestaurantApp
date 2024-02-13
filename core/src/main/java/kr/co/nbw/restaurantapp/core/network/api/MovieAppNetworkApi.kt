package kr.co.nbw.restaurantapp.core.network.api

import com.google.gson.reflect.TypeToken
import kr.co.nbw.restaurantapp.core.network.model.RestaurantResponse
import kr.co.nbw.restaurantapp.libraries.network_contract.api.NetworkRequestFactory
import kr.co.nbw.restaurantapp.libraries.network_contract.model.ApiResult
import javax.inject.Inject

class RestaurantAppNetworkApi @Inject constructor(
    private val networkRequestFactory: NetworkRequestFactory
): IRestaurantAppNetworkApi {
    override suspend fun getRestaurantsList(): ApiResult<List<RestaurantResponse>> {
        return networkRequestFactory.create(
            url = "restaurants.json",
            type = object : TypeToken<List<RestaurantResponse>>(){}.type
        )
    }
}
