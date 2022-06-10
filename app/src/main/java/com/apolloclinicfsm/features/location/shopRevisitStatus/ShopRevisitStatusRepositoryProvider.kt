package com.apolloclinicfsm.features.location.shopRevisitStatus

import com.apolloclinicfsm.features.location.shopdurationapi.ShopDurationApi
import com.apolloclinicfsm.features.location.shopdurationapi.ShopDurationRepository

object ShopRevisitStatusRepositoryProvider {
    fun provideShopRevisitStatusRepository(): ShopRevisitStatusRepository {
        return ShopRevisitStatusRepository(ShopRevisitStatusApi.create())
    }
}