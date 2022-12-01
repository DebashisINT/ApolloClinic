package com.apolloclinicfsm.features.damageProduct.api

import android.content.Context
import android.net.Uri
import android.text.TextUtils
import android.util.Log
import com.apolloclinicfsm.app.FileUtils
import com.apolloclinicfsm.base.BaseResponse
import com.apolloclinicfsm.features.NewQuotation.model.*
import com.apolloclinicfsm.features.addshop.model.AddShopRequestData
import com.apolloclinicfsm.features.addshop.model.AddShopResponse
import com.apolloclinicfsm.features.damageProduct.model.DamageProductResponseModel
import com.apolloclinicfsm.features.damageProduct.model.delBreakageReq
import com.apolloclinicfsm.features.damageProduct.model.viewAllBreakageReq
import com.apolloclinicfsm.features.login.model.userconfig.UserConfigResponseModel
import com.apolloclinicfsm.features.myjobs.model.WIPImageSubmit
import com.apolloclinicfsm.features.photoReg.model.*
import com.fasterxml.jackson.databind.ObjectMapper
import com.google.gson.Gson
import io.reactivex.Observable
import okhttp3.MediaType
import okhttp3.MultipartBody
import okhttp3.RequestBody
import java.io.File

class GetDamageProductListRegRepository(val apiService : GetDamageProductListApi) {

    fun viewBreakage(req: viewAllBreakageReq): Observable<DamageProductResponseModel> {
        return apiService.viewBreakage(req)
    }

    fun delBreakage(req: delBreakageReq): Observable<BaseResponse>{
        return apiService.BreakageDel(req.user_id!!,req.breakage_number!!,req.session_token!!)
    }

}