package kr.co.nbw.restaurantapp.features.feed.domain.usecase

import kr.co.nbw.restaurantapp.core.entity.CategoryEntity
import kr.co.nbw.restaurantapp.core.entity.EntityWrapper
import kr.co.nbw.restaurantapp.core.repository.IRestaurantDataSource
import javax.inject.Inject

class GetFeedCategoryUseCase @Inject constructor(
    private val dataSource: IRestaurantDataSource
) : IGetFeedCategoryUseCase {
    override suspend fun invoke(): EntityWrapper<List<CategoryEntity>> {
        return dataSource.getCategories()
    }
}
