package kr.co.nbw.restaurantapp.core.mapper

import kr.co.nbw.restaurantapp.core.entity.CategoryEntity
import kr.co.nbw.restaurantapp.core.entity.EntityWrapper
import kr.co.nbw.restaurantapp.core.entity.RestaurantDetailEntity
import kr.co.nbw.restaurantapp.core.network.model.RestaurantResponse
import kr.co.nbw.restaurantapp.libraries.storage_contract.IStorage
import kr.co.nbw.restaurantapp.libraries.storage_contract.constants.StorageKeys.RESTAURANT_LIST_KEY
import javax.inject.Inject

class CategoryMapper @Inject constructor(
    private val storage: IStorage
): BaseMapper<List<RestaurantResponse>, List<CategoryEntity>>() {
    override fun getSuccess(
        model: List<RestaurantResponse>?,
        extra: Any?
    ): EntityWrapper.Success<List<CategoryEntity>> {
        return model?.let {
            EntityWrapper.Success(
                entity = mutableListOf<RestaurantDetailEntity>()
                    .apply {
                        addAll(model.map{ item -> item.toDetailEntity() })
                    }
                    .also {
                        storage.save(RESTAURANT_LIST_KEY, it)
                    }
                    .toCategoryList()
            )
        } ?: EntityWrapper.Success(
                entity = listOf()
            )
    }

    override fun getFailure(error: Throwable): EntityWrapper.Fail<List<CategoryEntity>> {
        return EntityWrapper.Fail(error)
    }
}
