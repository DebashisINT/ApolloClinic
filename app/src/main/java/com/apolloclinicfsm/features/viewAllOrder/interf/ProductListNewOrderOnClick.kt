package com.apolloclinicfsm.features.viewAllOrder.interf

import com.apolloclinicfsm.app.domain.NewOrderGenderEntity
import com.apolloclinicfsm.app.domain.NewOrderProductEntity

interface ProductListNewOrderOnClick {
    fun productListOnClick(product: NewOrderProductEntity)
}