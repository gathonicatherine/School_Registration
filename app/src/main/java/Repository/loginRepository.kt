package Repository

class loginRepository {
    var retrofit = ApiClient.buildApiClient(ApiInterface::class.java)

    suspend fun loginUser(logInRequest: logInRequest): Response<logInResponse> =
            withContext(Dispatchers.IO) {
                var response = retrofit.loginStudent(logInRequest)
                return@withContext response
            }
}
}