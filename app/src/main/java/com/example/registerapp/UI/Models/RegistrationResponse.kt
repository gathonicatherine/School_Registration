package com.example.registerapp.UI.Models

class RegistrationResponse
    (
    var name: String,
    @SerializedName("phone_number")
    var phoneNumber:String,
    var email:String,
    var password:String,
    var nationality:String,
    @SerializedName("date_of_birth")
    var dateOfBirth:String,
    @SerializedName("student_id")
    var studentId:String
            )
