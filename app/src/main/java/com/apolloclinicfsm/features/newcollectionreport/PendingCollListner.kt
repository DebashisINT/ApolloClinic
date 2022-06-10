package com.apolloclinicfsm.features.newcollectionreport

import com.apolloclinicfsm.features.photoReg.model.UserListResponseModel

interface PendingCollListner {
    fun getUserInfoOnLick(obj: PendingCollData)
}