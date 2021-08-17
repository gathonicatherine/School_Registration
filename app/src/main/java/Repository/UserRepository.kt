package Repository

import com.example.registerapp.UI.API.APIclient
import com.example.registerapp.UI.API.APIinterface
import com.example.registerapp.UI.Models.RegistrationRequest
import retrofit2.Response

class UserRepository {
    var retrofit = APIclient.buildAPIcleint(APIinterface::class.java)

    fun registration(registrationRequest: RegistrationRequest):Response<registrationRequest> =
    withContext(Dispatchers.10){
        var response = retrofitStudent(registrationRequest)
        return @withContext response
    }
}
