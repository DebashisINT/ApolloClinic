package com.apolloclinicfsm.features.stockAddCurrentStock.api

import com.apolloclinicfsm.features.location.shopRevisitStatus.ShopRevisitStatusApi
import com.apolloclinicfsm.features.location.shopRevisitStatus.ShopRevisitStatusRepository

object ShopAddStockProvider {
    fun provideShopAddStockRepository(): ShopAddStockRepository {
        return ShopAddStockRepository(ShopAddStockApi.create())
    }
}