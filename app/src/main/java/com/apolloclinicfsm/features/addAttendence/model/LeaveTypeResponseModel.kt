package com.apolloclinicfsm.features.addAttendence.model

import com.apolloclinicfsm.base.BaseResponse

/**
 * Created by Saikat on 22-11-2018.
 */
class LeaveTypeResponseModel : BaseResponse() {
    var leave_type_list: ArrayList<LeaveTypeDataModel>? = null
}