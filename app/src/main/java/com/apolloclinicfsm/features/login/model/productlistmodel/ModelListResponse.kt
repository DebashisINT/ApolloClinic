package com.apolloclinicfsm.features.login.model.productlistmodel

import com.apolloclinicfsm.app.domain.ModelEntity
import com.apolloclinicfsm.app.domain.ProductListEntity
import com.apolloclinicfsm.base.BaseResponse

class ModelListResponse: BaseResponse() {
    var model_list: ArrayList<ModelEntity>? = null
}