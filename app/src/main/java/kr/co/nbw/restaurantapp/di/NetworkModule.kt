package kr.co.nbw.restaurantapp.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import kr.co.nbw.restaurantapp.libraries.network.retrofit.NetworkRequestFactoryImpl
import kr.co.nbw.restaurantapp.libraries.network_contract.api.NetworkRequestFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class NetworkModule {
    @Provides
    @Singleton
    fun bindNetworkRequestFactory(networkRequestFactory: NetworkRequestFactoryImpl): NetworkRequestFactory =
        networkRequestFactory
}