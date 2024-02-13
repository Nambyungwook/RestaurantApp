package kr.co.nbw.restaurantapp.library.storage.usecases

import kr.co.nbw.restaurantapp.library.storage.IStorage
import kr.co.nbw.restaurantapp.library.storage.usecases.IStorageClearUseCase
import javax.inject.Inject

class StorageClearUseCase @Inject constructor(
    private val storage: IStorage
) : IStorageClearUseCase {
    override fun invoke() {
        storage.clear()
    }
}
