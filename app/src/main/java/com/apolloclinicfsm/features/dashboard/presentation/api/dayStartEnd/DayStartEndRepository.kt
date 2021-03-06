package com.apolloclinicfsm.features.dashboard.presentation.api.dayStartEnd

import com.apolloclinicfsm.app.Pref
import com.apolloclinicfsm.base.BaseResponse
import com.apolloclinicfsm.features.dashboard.presentation.model.DaystartDayendRequest
import com.apolloclinicfsm.features.dashboard.presentation.model.StatusDayStartEnd
import com.apolloclinicfsm.features.stockCompetetorStock.ShopAddCompetetorStockRequest
import com.apolloclinicfsm.features.stockCompetetorStock.api.AddCompStockApi
import io.reactivex.Observable

class DayStartEndRepository (val apiService: DayStartEndApi){
    fun dayStart(daystartDayendRequest: DaystartDayendRequest): Observable<BaseResponse> {
        return apiService.submitDayStartEnd(daystartDayendRequest)
    }

    fun dayStartEndStatus(date:String): Observable<StatusDayStartEnd> {
        return apiService.statusDayStartEnd(Pref.session_token!!, Pref.user_id!!,date)
    }


}