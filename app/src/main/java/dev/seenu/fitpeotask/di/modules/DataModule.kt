package dev.seenu.fitpeotask.di.modules

import dagger.Module
import dagger.Provides
import dev.seenu.fitpeotask.api.ApiService
import dev.seenu.fitpeotask.data.repository.Repository
import javax.inject.Singleton



@Module
object DataModule {

    @Singleton
    @Provides
    fun providesRepository(apiService: ApiService): Repository =
        Repository(apiService)
}