package com.apolloclinicfsm.features.survey.api

import com.apolloclinicfsm.features.photoReg.api.GetUserListPhotoRegApi
import com.apolloclinicfsm.features.photoReg.api.GetUserListPhotoRegRepository

object SurveyDataProvider{

    fun provideSurveyQ(): SurveyDataRepository {
        return SurveyDataRepository(SurveyDataApi.create())
    }

    fun provideSurveyQMultiP(): SurveyDataRepository {
        return SurveyDataRepository(SurveyDataApi.createImage())
    }
}