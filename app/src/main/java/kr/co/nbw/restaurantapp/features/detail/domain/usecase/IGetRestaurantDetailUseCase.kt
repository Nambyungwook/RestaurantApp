package kr.co.nbw.restaurantapp.features.detail.domain.usecase

import kr.co.nbw.restaurantapp.core.entity.RestaurantDetailEntity

interface IGetRestaurantDetailUseCase {
    suspend operator fun invoke(id: Int): RestaurantDetailEntity
}
