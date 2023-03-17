package dev.seenu.fitpeotask.di.modules


import dagger.Module
import dagger.android.ContributesAndroidInjector
import dev.seenu.fitpeotask.presentation.MainActivity

@Suppress("unused")
@Module
abstract class MainActivityModule {
    @ContributesAndroidInjector(
        modules = [
            FragmentBuildersModule::class
        ]
    )
    abstract fun contributeMainActivity(): MainActivity
}
