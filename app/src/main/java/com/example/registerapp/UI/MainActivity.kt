package com.example.registerapp.UI

import ViewModel.UserViewModel
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import com.example.registerapp.R

class MainActivity : AppCompatActivity() {
    lateinit var binding:ActivitymainBinding
    val UserViewModel:UserViewModel by viewModels()
//   By VIEWMODELS factory design patterns. Calling an interface that returns an instance of userviewmodel
//    Dispatcher swithches information from the UI thread to the IO thread(its like a bridge)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var nationalities = arrayOf("Rwanda", "Uganda", "Kenya", "South Sudan","Sudan")
        var nationalitiesAdapter =
                ArrayAdapter(baseContext, android.R.layout.simple_spinner_item, nationalities)
        nationalitiesAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spNationality.adapter = nationalitiesAdapter

        btnRegister.setOnClickListener {
            if (etName.text.toString().isEmpty() || etDob.text.toString()
                            .isEmpty() || etphone.text.toString().isEmpty()
            ) {
                etName.setError("Please input name")
                etDob.setError("Please input Date of Birth")
                etEmail.setError("Please input email")
                etphone.setError("Please input phone")

            }


            var name = etName.text.toString()
            var date_of_birth = etDob.text.toString()
            var email = etEmail.text.toString()
            var phone_number = etphone.text.toString()

            var nationality = spNationality.selectedItem.toString()


            var registrationRequest = RegistrationRequest(
                    name = name,
                    phoneNumber = phone_number,
                    email = email,
                    nationality = nationality,
                    dateOfBirth = date_of_birth,
            )
            UserViewModel.registerStudent(regRequest)

//
//            val retrofit = ApiClient.buildApiClient(ApiInterface::class.java)
//            var request = retrofit.registerStudent(registrationRequest)
//            request.enqueue(object : Callback<RegistrationResponse?> {
//                override fun onResponse(
//                        call: Call<RegistrationResponse?>,
//                        response: Response<RegistrationResponse?>
//                ) {
//                    if (response.isSuccessful){
//                        Toast.makeText(baseContext,"Registration Successful",Toast.LENGTH_LONG).show()
//                        var intent = Intent(baseContext, loginActivity::class.java)
//                        startActivity(intent)
//
//                    }
//                    else{
//                        try {
//                            val error = JSONObject(response.errorBody()!!.string())
//                            Toast.makeText(baseContext,error.toString(), Toast.LENGTH_LONG).show()
//                        }
//                        catch (e:Exception){
//                            Toast.makeText(baseContext,e.message, Toast.LENGTH_LONG).show()
//                        }
//                    }
//                }
//
//                override fun onFailure(call: Call<RegistrationResponse?>, t: Throwable) {
//                    Toast.makeText(baseContext,t.message,Toast.LENGTH_SHORT).show()
//
//                }
//            })
//
//
//        }
//
//    }
//    data class ApiError(var errors:List<String>)
//
//}
    }
}