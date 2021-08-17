package com.example.registerapp.viewModel

class userViewModel {
    var userRepository=UserRepository()
    var registrationResponseLiveData=MutableLiveData<RegistrationResponse>()
    var registrationErrorLiveData=MutableLiveData<String>()



    fun registerStudent(registrationRequest: RegistrationRequest){
        viewModelScope.launch {
            var response=userRepository.registerUser(registrationRequest)
            if (response.isSuccessful){
                registrationResponseLiveData.postValue(response.body())
            }
            else{
                registrationErrorLiveData.postValue(response.errorBody()?.string())
            }
        }
    }

}
}