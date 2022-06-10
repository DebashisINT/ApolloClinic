package com.apolloclinicfsm.features.newcollection.model

import com.apolloclinicfsm.app.domain.CollectionDetailsEntity
import com.apolloclinicfsm.base.BaseResponse
import com.apolloclinicfsm.features.shopdetail.presentation.model.collectionlist.CollectionListDataModel

/**
 * Created by Saikat on 15-02-2019.
 */
class NewCollectionListResponseModel : BaseResponse() {
    //var collection_list: ArrayList<CollectionListDataModel>? = null
    var collection_list: ArrayList<CollectionDetailsEntity>? = null
}