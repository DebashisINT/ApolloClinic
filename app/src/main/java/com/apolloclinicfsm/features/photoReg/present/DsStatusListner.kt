package com.apolloclinicfsm.features.photoReg.present

import com.apolloclinicfsm.app.domain.ProspectEntity
import com.apolloclinicfsm.features.photoReg.model.UserListResponseModel

interface DsStatusListner {
    fun getDSInfoOnLick(obj: ProspectEntity)
}