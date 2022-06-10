package com.apolloclinicfsm.features.viewAllOrder.model

import com.apolloclinicfsm.app.domain.NewOrderColorEntity
import com.apolloclinicfsm.app.domain.NewOrderGenderEntity
import com.apolloclinicfsm.app.domain.NewOrderProductEntity
import com.apolloclinicfsm.app.domain.NewOrderSizeEntity
import com.apolloclinicfsm.features.stockCompetetorStock.model.CompetetorStockGetDataDtls

class NewOrderDataModel {
    var status:String ? = null
    var message:String ? = null
    var Gender_list :ArrayList<NewOrderGenderEntity>? = null
    var Product_list :ArrayList<NewOrderProductEntity>? = null
    var Color_list :ArrayList<NewOrderColorEntity>? = null
    var size_list :ArrayList<NewOrderSizeEntity>? = null
}

