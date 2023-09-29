package com.apolloclinicfsm.features.viewAllOrder.orderOptimized

import com.apolloclinicfsm.app.domain.ProductOnlineRateTempEntity
import com.apolloclinicfsm.base.BaseResponse
import com.apolloclinicfsm.features.login.model.productlistmodel.ProductRateDataModel
import java.io.Serializable

class ProductRateOnlineListResponseModel: BaseResponse(), Serializable {
    var product_rate_list: ArrayList<ProductOnlineRateTempEntity>? = null
}