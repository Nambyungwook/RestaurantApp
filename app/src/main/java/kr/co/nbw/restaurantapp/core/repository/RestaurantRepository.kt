package kr.co.nbw.restaurantapp.core.repository

import kr.co.nbw.restaurantapp.core.entity.CategoryEntity
import kr.co.nbw.restaurantapp.core.entity.EntityWrapper
import kr.co.nbw.restaurantapp.core.entity.RestaurantDetailEntity
import kr.co.nbw.restaurantapp.core.network.api.IRestaurantAppNetworkApi
import kr.co.nbw.restaurantapp.features.feed.data.FeedConstants
import kr.co.nbw.restaurantapp.features.feed.data.mapper.CategoryMapper
import kr.co.nbw.restaurantapp.library.storage.IStorage
import javax.inject.Inject

class RestaurantRepository @Inject constructor(
    private val restaurantNetworkApi: IRestaurantAppNetworkApi,
    private val storage: IStorage,
    private val categoryMapper: CategoryMapper
): IRestaurantDataSource {
    override suspend fun getCategories(): EntityWrapper<List<CategoryEntity>> {
        return categoryMapper.mapFromResult(
            result = restaurantNetworkApi.getRestaurantsList()
        )
    }

    override suspend fun getRestaurantDetail(id: Int): RestaurantDetailEntity {
        return storage
            .get<List<RestaurantDetailEntity>>(FeedConstants.RESTAURANT_LIST_KEY)
            ?.single { it.id == id }
            ?: RestaurantDetailEntity()
    }
}
