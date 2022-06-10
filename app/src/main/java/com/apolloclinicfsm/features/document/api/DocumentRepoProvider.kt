package com.apolloclinicfsm.features.document.api

import com.apolloclinicfsm.features.dymanicSection.api.DynamicApi
import com.apolloclinicfsm.features.dymanicSection.api.DynamicRepo

object DocumentRepoProvider {
    fun documentRepoProvider(): DocumentRepo {
        return DocumentRepo(DocumentApi.create())
    }

    fun documentRepoProviderMultipart(): DocumentRepo {
        return DocumentRepo(DocumentApi.createImage())
    }
}