package kr.co.nbw.restaurantapp.features.detail.domain.usecase

import kr.co.nbw.restaurantapp.features.common.entity.RestaurantDetailEntity

interface IGetRestaurantDetailUseCase {
    suspend operator fun invoke(id: Int): RestaurantDetailEntity
}
