package com.apolloclinicfsm.features.activities.api

import com.apolloclinicfsm.features.member.api.TeamApi
import com.apolloclinicfsm.features.member.api.TeamRepo

object ActivityRepoProvider {
    fun activityRepoProvider(): ActivityRepo {
        return ActivityRepo(ActivityApi.create())
    }

    fun activityImageRepoProvider(): ActivityRepo {
        return ActivityRepo(ActivityApi.createImage())
    }
}