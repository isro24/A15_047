package com.example.uas.service_api

import com.example.uas.model.AllMonitoringResponse
import com.example.uas.model.Monitoring
import com.example.uas.model.MonitoringDetailResponse
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Path

interface MonitoringService {
    @Headers(
        "Accept: application/json",
        "Content-Type: application/json"
    )

    @POST("store")
    suspend fun insertMonitoring(@Body monitoring: Monitoring)

    @GET(".")
    suspend fun getAllMonitoring(): AllMonitoringResponse

    @GET("{id_monitoring}")
    suspend fun getMonitoringById(@Path("id_monitoring") idMonitoring:String): MonitoringDetailResponse

    @PUT("{id_monitoring}")
    suspend fun updateMonitoring(@Path("id_monitoring") idMonitoring:String, @Body monitoring: Monitoring)
}