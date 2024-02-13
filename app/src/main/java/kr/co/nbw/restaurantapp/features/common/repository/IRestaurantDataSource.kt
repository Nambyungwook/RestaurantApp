package kr.co.nbw.restaurantapp.features.common.repository

import kr.co.nbw.restaurantapp.features.common.entity.CategoryEntity
import kr.co.nbw.restaurantapp.features.common.entity.EntityWrapper
import kr.co.nbw.restaurantapp.features.common.entity.RestaurantDetailEntity

interface IRestaurantDataSource {
    suspend fun getCategories(): EntityWrapper<List<CategoryEntity>>
    suspend fun getRestaurantDetail(id: Int): RestaurantDetailEntity
}
