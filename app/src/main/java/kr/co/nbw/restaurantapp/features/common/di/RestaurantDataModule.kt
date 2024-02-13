package kr.co.nbw.restaurantapp.features.common.di

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import kr.co.nbw.restaurantapp.features.common.network.api.IRestaurantAppNetworkApi
import kr.co.nbw.restaurantapp.features.common.network.api.RestaurantAppNetworkApi
import kr.co.nbw.restaurantapp.features.common.repository.IRestaurantDataSource
import kr.co.nbw.restaurantapp.features.common.repository.RestaurantRepository
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class RestaurantDataModule {

    @Singleton
    @Binds
    abstract fun bindRestaurantRepository(restaurantRepository: RestaurantRepository): IRestaurantDataSource

    @Singleton
    @Binds
    abstract fun bindNetwork(networkApi: RestaurantAppNetworkApi): IRestaurantAppNetworkApi

}
