package com.soppo.soppo.di

import com.soppo.soppo.network.AuthApi
import com.soppo.soppo.network.MatchApi
import com.soppo.soppo.network.PlayerApi
import com.soppo.soppo.network.TeamApi
import com.soppo.soppo.utils.Constant
import com.soppo.soppo.utils.DispatchersProvider
import com.soppo.soppo.utils.Preferences
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {


    val retrofit by lazy {
        val logging = HttpLoggingInterceptor()
        logging.setLevel(HttpLoggingInterceptor.Level.BODY)

        val client = OkHttpClient.Builder()
            .addInterceptor(logging)
            .build()

        Retrofit.Builder()
            .baseUrl(Constant.BASE_URL)
            .client(client)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    @Singleton
    @Provides
    fun provideAuthApi(): AuthApi = retrofit.create(AuthApi::class.java)

    @Singleton
    @Provides
    fun provideMatchApi():MatchApi = retrofit.create(MatchApi::class.java)

    @Singleton
    @Provides
    fun providePlayerApi():PlayerApi = retrofit.create(PlayerApi::class.java)

    @Singleton
    @Provides
    fun provideTeamApi():TeamApi = retrofit.create(TeamApi::class.java)



    @Singleton
    @Provides
    fun provideDispatchers(): DispatchersProvider = object : DispatchersProvider {
        override val main: CoroutineDispatcher
            get() = Dispatchers.Main
        override val io: CoroutineDispatcher
            get() = Dispatchers.IO
        override val default: CoroutineDispatcher
            get() = Dispatchers.Default
        override val unconfined: CoroutineDispatcher
            get() = Dispatchers.Unconfined
    }
}