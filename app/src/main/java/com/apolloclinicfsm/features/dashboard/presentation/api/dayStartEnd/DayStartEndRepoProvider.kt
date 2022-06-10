package com.apolloclinicfsm.features.dashboard.presentation.api.dayStartEnd

import com.apolloclinicfsm.features.stockCompetetorStock.api.AddCompStockApi
import com.apolloclinicfsm.features.stockCompetetorStock.api.AddCompStockRepository

object DayStartEndRepoProvider {
    fun dayStartRepositiry(): DayStartEndRepository {
        return DayStartEndRepository(DayStartEndApi.create())
    }

}