package kr.co.nbw.restaurantapp.core.repository

import kr.co.nbw.restaurantapp.core.entity.CategoryEntity
import kr.co.nbw.restaurantapp.core.entity.EntityWrapper
import kr.co.nbw.restaurantapp.core.entity.RestaurantDetailEntity
import kr.co.nbw.restaurantapp.core.mapper.CategoryMapper
import kr.co.nbw.restaurantapp.core.network.api.IRestaurantAppNetworkApi
import kr.co.nbw.restaurantapp.libraries.storage_contract.IStorage
import kr.co.nbw.restaurantapp.libraries.storage_contract.constants.StorageKeys
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
            .get<List<RestaurantDetailEntity>>(StorageKeys.RESTAURANT_LIST_KEY)
            ?.single { it.id == id }
            ?: RestaurantDetailEntity()
    }
}
