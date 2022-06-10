package com.apolloclinicfsm.features.stockAddCurrentStock.api

import com.apolloclinicfsm.base.BaseResponse
import com.apolloclinicfsm.features.location.model.ShopRevisitStatusRequest
import com.apolloclinicfsm.features.location.shopRevisitStatus.ShopRevisitStatusApi
import com.apolloclinicfsm.features.stockAddCurrentStock.ShopAddCurrentStockRequest
import com.apolloclinicfsm.features.stockAddCurrentStock.model.CurrentStockGetData
import com.apolloclinicfsm.features.stockCompetetorStock.model.CompetetorStockGetData
import io.reactivex.Observable

class ShopAddStockRepository (val apiService : ShopAddStockApi){
    fun shopAddStock(shopAddCurrentStockRequest: ShopAddCurrentStockRequest?): Observable<BaseResponse> {
        return apiService.submShopAddStock(shopAddCurrentStockRequest)
    }

    fun getCurrStockList(sessiontoken: String, user_id: String, date: String): Observable<CurrentStockGetData> {
        return apiService.getCurrStockListApi(sessiontoken, user_id, date)
    }

}