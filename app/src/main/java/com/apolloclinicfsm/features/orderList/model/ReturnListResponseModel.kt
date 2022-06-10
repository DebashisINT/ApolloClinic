package com.apolloclinicfsm.features.orderList.model

import com.apolloclinicfsm.base.BaseResponse


class ReturnListResponseModel: BaseResponse() {
    var return_list: ArrayList<ReturnDataModel>? = null
}