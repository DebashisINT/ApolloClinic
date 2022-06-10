package com.apolloclinicfsm.features.viewAllOrder.interf

import com.apolloclinicfsm.app.domain.NewOrderGenderEntity
import com.apolloclinicfsm.features.viewAllOrder.model.ProductOrder

interface ColorListOnCLick {
    fun colorListOnCLick(size_qty_list: ArrayList<ProductOrder>, adpPosition:Int)
}