package com.apolloclinicfsm.features.addAttendence.api.leavetytpeapi

import com.apolloclinicfsm.app.Pref
import com.apolloclinicfsm.base.BaseResponse
import com.apolloclinicfsm.features.addAttendence.model.ApprovalLeaveResponseModel
import com.apolloclinicfsm.features.addAttendence.model.LeaveTypeResponseModel
import com.apolloclinicfsm.features.leaveapplynew.model.ApprovalRejectReqModel
import com.apolloclinicfsm.features.leaveapplynew.model.clearAttendanceonRejectReqModelRejectReqModel
import io.reactivex.Observable

/**
 * Created by Saikat on 22-11-2018.
 */
class LeaveTypeRepo(val apiService: LeaveTypeApi) {
    fun getLeaveTypeList(): Observable<LeaveTypeResponseModel> {
        return apiService.getLeaveTypeList(Pref.session_token!!, Pref.user_id!!)
    }


    fun getApprovalLeaveList(userId:String): Observable<ApprovalLeaveResponseModel> {
        return apiService.getApprovalLeaveList(Pref.session_token!!,userId)
    }

    fun postApprovalRejectclick(ApprovalRejectReqModel: ApprovalRejectReqModel): Observable<BaseResponse> {
        return apiService.postApprovalRejectclick(ApprovalRejectReqModel)
    }

    fun clearAttendanceonRejectclick(clearAttendanceonRejectReModel: clearAttendanceonRejectReqModelRejectReqModel): Observable<BaseResponse> {
        return apiService.clearAttendanceonRejectclick(clearAttendanceonRejectReModel)
    }
}