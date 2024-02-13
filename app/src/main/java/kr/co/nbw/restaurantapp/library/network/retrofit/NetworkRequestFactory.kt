package kr.co.nbw.restaurantapp.library.network.retrofit

import kr.co.nbw.restaurantapp.library.network.model.ApiResult
import kr.co.nbw.restaurantapp.library.network.model.NetworkRequestInfo
import java.lang.reflect.Type

interface NetworkRequestFactory {

    suspend fun <T> create(
        url: String,
        requestInfo: NetworkRequestInfo = NetworkRequestInfo.Builder().build(),
        type: Type
    ): ApiResult<T>
}
