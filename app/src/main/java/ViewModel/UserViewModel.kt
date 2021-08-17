package ViewModel

import Repository.UserRepository
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.registerapp.UI.API.APIclient.ApiClient.retrofit
import com.example.registerapp.UI.Models.RegistrationRequest
import com.example.registerapp.UI.Models.RegistrationResponse
import kotlinx.coroutines.launch

class UserViewModel:ViewModel() {
    var UserRepository=Repository.UserRepository()
    var regResponseLiveData= MutableLiveData <RegistrationResponse()
    var regErrorLiveData-MutableLiveData<String>()

    fun registerStudent(registrationRequest: RegistrationRequest){
//       UserRepository.registerUser(registrationRequest)
        viewModelScope.launch {
            var response = retrofit.registerStudent(registrationRequest)
            if(response.isSuccessful)
                regResponseLiveData.postValue(response.body())
        }
        else{
            regErrorLiveData.postValue(response.errorBody()?.string())
        }
    }
}
//Coroutine Suspendable routine ,light weight threads, created from the view models, UI thread and IO thread
//.launch function creates the coroutine scope from the view model and we will get a response from the view
// model(lifetime of an object) only when the view model is alive
//thread is a process
//dispatcher switches the context fom coroutine and makes it run the context in the IO thread thru the mechanism of the dispatcher

