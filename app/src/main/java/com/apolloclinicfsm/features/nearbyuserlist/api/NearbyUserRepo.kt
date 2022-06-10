package com.apolloclinicfsm.features.nearbyuserlist.api

import com.apolloclinicfsm.app.Pref
import com.apolloclinicfsm.features.nearbyuserlist.model.NearbyUserResponseModel
import com.apolloclinicfsm.features.newcollection.model.NewCollectionListResponseModel
import com.apolloclinicfsm.features.newcollection.newcollectionlistapi.NewCollectionListApi
import io.reactivex.Observable

class NearbyUserRepo(val apiService: NearbyUserApi) {
    fun nearbyUserList(): Observable<NearbyUserResponseModel> {
        return apiService.getNearbyUserList(Pref.session_token!!, Pref.user_id!!)
    }
}