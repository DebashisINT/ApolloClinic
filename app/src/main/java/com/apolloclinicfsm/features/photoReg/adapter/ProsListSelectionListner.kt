package com.apolloclinicfsm.features.photoReg.adapter

import com.apolloclinicfsm.features.photoReg.model.ProsCustom
import com.apolloclinicfsm.features.photoReg.model.UserListResponseModel

interface ProsListSelectionListner {
    fun getInfo(obj: ProsCustom)
}