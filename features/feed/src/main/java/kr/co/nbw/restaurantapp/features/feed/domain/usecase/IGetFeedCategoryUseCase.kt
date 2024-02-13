package kr.co.nbw.restaurantapp.features.feed.domain.usecase

import kr.co.nbw.restaurantapp.core.entity.CategoryEntity
import kr.co.nbw.restaurantapp.core.entity.EntityWrapper

interface IGetFeedCategoryUseCase {
    suspend operator fun invoke(): EntityWrapper<List<CategoryEntity>>
}
