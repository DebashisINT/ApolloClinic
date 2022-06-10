package com.apolloclinicfsm.features.lead.api

import com.apolloclinicfsm.features.NewQuotation.api.GetQuotListRegRepository
import com.apolloclinicfsm.features.NewQuotation.api.GetQutoListApi


object GetLeadRegProvider {
    fun provideList(): GetLeadListRegRepository {
        return GetLeadListRegRepository(GetLeadListApi.create())
    }
}