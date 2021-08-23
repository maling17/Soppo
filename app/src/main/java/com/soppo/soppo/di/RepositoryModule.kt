package com.soppo.soppo.di

import com.soppo.soppo.network.AuthApi
import com.soppo.soppo.repository.signin.DefaultSignInRepository
import com.soppo.soppo.repository.signin.SignInRepository
import com.soppo.soppo.repository.signup.DefaultSignUpRepository
import com.soppo.soppo.repository.signup.SignUpRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.scopes.ViewModelScoped

@Module
@InstallIn(ViewModelComponent::class)
object RepositoryModule {

    @ViewModelScoped
    @Provides
    fun provideSignInRepository(api: AuthApi): SignInRepository = DefaultSignInRepository(api)

    @ViewModelScoped
    @Provides
    fun provideSignUpRepository(api: AuthApi): SignUpRepository = DefaultSignUpRepository(api)

}