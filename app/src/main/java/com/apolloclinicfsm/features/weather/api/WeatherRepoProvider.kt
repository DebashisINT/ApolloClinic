package com.apolloclinicfsm.features.weather.api

import com.apolloclinicfsm.features.task.api.TaskApi
import com.apolloclinicfsm.features.task.api.TaskRepo

object WeatherRepoProvider {
    fun weatherRepoProvider(): WeatherRepo {
        return WeatherRepo(WeatherApi.create())
    }
}