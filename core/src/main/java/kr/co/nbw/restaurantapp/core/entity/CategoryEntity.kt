package kr.co.nbw.restaurantapp.core.entity

data class CategoryEntity(
    val id: Int,
    val neighborhood: String,
    val feedEntities: List<RestaurantFeedItemEntity>
)
