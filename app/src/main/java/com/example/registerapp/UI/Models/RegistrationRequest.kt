package com.example.registerapp.UI.Models

import com.google.gson.annotations.SerializedName


data class RegistrationRequest(
    var name: String,
    @SerializedName("phoneNumber") var phoneNumber:String,
    var email:String,
    var nationality:String,
    @SerializedName("date_of_birth") var dateOfBirth:String,
)
//How to use a progress bar
