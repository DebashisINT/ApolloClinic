package com.apolloclinicfsm.features.viewAllOrder.interf

import com.apolloclinicfsm.app.domain.NewOrderColorEntity
import com.apolloclinicfsm.app.domain.NewOrderProductEntity

interface ColorListNewOrderOnClick {
    fun productListOnClick(color: NewOrderColorEntity)
}