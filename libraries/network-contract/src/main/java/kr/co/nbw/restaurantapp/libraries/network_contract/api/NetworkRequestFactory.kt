package kr.co.nbw.restaurantapp.libraries.network_contract.api


import kr.co.nbw.restaurantapp.libraries.network_contract.model.ApiResult
import kr.co.nbw.restaurantapp.libraries.network_contract.model.NetworkRequestInfo
import java.lang.reflect.Type

interface NetworkRequestFactory {

    suspend fun <T> create(
        url: String,
        requestInfo: NetworkRequestInfo = NetworkRequestInfo.Builder().build(),
        type: Type
    ): ApiResult<T>
}
