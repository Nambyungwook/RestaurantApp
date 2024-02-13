package kr.co.nbw.restaurantapp.features.feed.presentation.output

import kr.co.nbw.restaurantapp.core.entity.CategoryEntity


sealed class FeedState {
    object Loading: FeedState()
    class Main(
        val categories: List<CategoryEntity>
    ): FeedState()
    class Failed(
        val reason: String
    ): FeedState()
}
