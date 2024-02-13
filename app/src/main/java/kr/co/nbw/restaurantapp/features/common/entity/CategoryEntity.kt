package kr.co.nbw.restaurantapp.features.common.entity

data class CategoryEntity(
    val id: Int,
    val neighborhood: String,
    val feedEntities: List<RestaurantFeedItemEntity>
)
