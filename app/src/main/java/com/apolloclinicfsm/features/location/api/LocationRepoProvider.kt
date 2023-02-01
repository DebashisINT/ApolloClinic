package com.apolloclinicfsm.features.location.api

import com.apolloclinicfsm.features.location.shopdurationapi.ShopDurationApi
import com.apolloclinicfsm.features.location.shopdurationapi.ShopDurationRepository


object LocationRepoProvider {
    fun provideLocationRepository(): LocationRepo {
        return LocationRepo(LocationApi.create())
    }
}