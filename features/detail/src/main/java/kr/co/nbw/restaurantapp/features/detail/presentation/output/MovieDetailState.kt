package kr.co.nbw.restaurantapp.features.detail.presentation.output

import kr.co.nbw.restaurantapp.core.entity.RestaurantDetailEntity

sealed class RestaurantDetailState {
    object Initial: RestaurantDetailState()
    class Main(val detailEntity: RestaurantDetailEntity): RestaurantDetailState()
}
