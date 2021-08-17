package com.example.registerapp.UI.API
import com.example.first_app.models.RegistrationRequest
import com.example.first_app.models.RegistrationResponse
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.POST
interface APIinterface {



    interface ApiInterface {
        @POST("/student/register")
        fun registerStudent(@Body registrationRequest: RegistrationRequest):Call<RegistrationResponse>

        @POST("/students/login")
        fun loginStudent(@Body logInRequest:RegistrationRequest): Call<RegistrationResponse>

    }
}