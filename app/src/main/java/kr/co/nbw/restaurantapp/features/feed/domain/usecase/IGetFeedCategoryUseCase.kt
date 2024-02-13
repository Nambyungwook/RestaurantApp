package kr.co.nbw.restaurantapp.features.feed.domain.usecase

import kr.co.nbw.restaurantapp.features.common.entity.CategoryEntity
import kr.co.nbw.restaurantapp.features.common.entity.EntityWrapper

interface IGetFeedCategoryUseCase {
    suspend operator fun invoke(): EntityWrapper<List<CategoryEntity>>
}
