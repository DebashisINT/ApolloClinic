package com.apolloclinicfsm.features.weather.api

import com.apolloclinicfsm.base.BaseResponse
import com.apolloclinicfsm.features.task.api.TaskApi
import com.apolloclinicfsm.features.task.model.AddTaskInputModel
import com.apolloclinicfsm.features.weather.model.ForeCastAPIResponse
import com.apolloclinicfsm.features.weather.model.WeatherAPIResponse
import io.reactivex.Observable

class WeatherRepo(val apiService: WeatherApi) {
    fun getCurrentWeather(zipCode: String): Observable<WeatherAPIResponse> {
        return apiService.getTodayWeather(zipCode)
    }

    fun getWeatherForecast(zipCode: String): Observable<ForeCastAPIResponse> {
        return apiService.getForecast(zipCode)
    }
}