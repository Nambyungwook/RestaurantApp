package kr.co.nbw.restaurantapp.features.detail.domain.usecase

import kr.co.nbw.restaurantapp.core.entity.RestaurantDetailEntity
import kr.co.nbw.restaurantapp.core.repository.IRestaurantDataSource
import javax.inject.Inject

class GetRestaurantDetailUseCase @Inject constructor(
    private val dataSource: IRestaurantDataSource
) : IGetRestaurantDetailUseCase {
    override suspend fun invoke(id: Int): RestaurantDetailEntity {
        return dataSource.getRestaurantDetail(id)
    }
}
