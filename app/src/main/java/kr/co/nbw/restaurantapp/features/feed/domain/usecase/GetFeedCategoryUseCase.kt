package kr.co.nbw.restaurantapp.features.feed.domain.usecase

import kr.co.nbw.restaurantapp.features.common.entity.CategoryEntity
import kr.co.nbw.restaurantapp.features.common.entity.EntityWrapper
import kr.co.nbw.restaurantapp.features.common.repository.IRestaurantDataSource
import javax.inject.Inject

class GetFeedCategoryUseCase @Inject constructor(
    private val dataSource: IRestaurantDataSource
) : IGetFeedCategoryUseCase {
    override suspend fun invoke(): EntityWrapper<List<CategoryEntity>> {
        return dataSource.getCategories()
    }
}