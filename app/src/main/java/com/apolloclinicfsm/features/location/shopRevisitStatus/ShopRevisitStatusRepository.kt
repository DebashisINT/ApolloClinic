package com.apolloclinicfsm.features.location.shopRevisitStatus

import com.apolloclinicfsm.base.BaseResponse
import com.apolloclinicfsm.features.location.model.ShopDurationRequest
import com.apolloclinicfsm.features.location.model.ShopRevisitStatusRequest
import io.reactivex.Observable

class ShopRevisitStatusRepository(val apiService : ShopRevisitStatusApi) {
    fun shopRevisitStatus(shopRevisitStatus: ShopRevisitStatusRequest?): Observable<BaseResponse> {
        return apiService.submShopRevisitStatus(shopRevisitStatus)
    }
}