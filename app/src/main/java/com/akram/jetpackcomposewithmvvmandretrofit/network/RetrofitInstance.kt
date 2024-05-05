import com.akram.jetpackcomposewithmvvmandretrofit.network.UserInfoService
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

// object is di
object RetrofitInstance {
    private const val BASE_URL = "https://jsonplaceholder.typicode.com/"

    private val retrofit: Retrofit by lazy {
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    val userInfoService: UserInfoService by lazy {
        retrofit.create(UserInfoService::class.java)
    }
}