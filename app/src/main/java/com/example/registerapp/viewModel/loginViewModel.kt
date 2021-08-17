package com.example.registerapp.viewModel

class loginViewModel {
    var userRepository = logInRepository()
    var logInResponseLiveData = MutableLiveData<logInResponse>()
    var logInRequestErrorLiveData = MutableLiveData<String>()

    fun logInStudent(logInRequest: logInRequest) {
        viewModelScope.launch {
            var response = userRepository.loginUser(logInRequest)
            if (response.isSuccessful) {
                logInResponseLiveData.postValue(response.body())
            } else {
                logInRequestErrorLiveData.postValue(response.errorBody()?.string())
            }
        }
    }
}
