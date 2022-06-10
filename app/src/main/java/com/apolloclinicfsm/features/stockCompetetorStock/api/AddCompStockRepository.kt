package com.apolloclinicfsm.features.stockCompetetorStock.api

import com.apolloclinicfsm.base.BaseResponse
import com.apolloclinicfsm.features.orderList.model.NewOrderListResponseModel
import com.apolloclinicfsm.features.stockCompetetorStock.ShopAddCompetetorStockRequest
import com.apolloclinicfsm.features.stockCompetetorStock.model.CompetetorStockGetData
import io.reactivex.Observable

class AddCompStockRepository(val apiService:AddCompStockApi){

    fun addCompStock(shopAddCompetetorStockRequest: ShopAddCompetetorStockRequest): Observable<BaseResponse> {
        return apiService.submShopCompStock(shopAddCompetetorStockRequest)
    }

    fun getCompStockList(sessiontoken: String, user_id: String, date: String): Observable<CompetetorStockGetData> {
        return apiService.getCompStockList(sessiontoken, user_id, date)
    }
}