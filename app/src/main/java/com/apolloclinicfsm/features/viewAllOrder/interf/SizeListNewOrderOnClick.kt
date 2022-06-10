package com.apolloclinicfsm.features.viewAllOrder.interf

import com.apolloclinicfsm.app.domain.NewOrderProductEntity
import com.apolloclinicfsm.app.domain.NewOrderSizeEntity

interface SizeListNewOrderOnClick {
    fun sizeListOnClick(size: NewOrderSizeEntity)
}