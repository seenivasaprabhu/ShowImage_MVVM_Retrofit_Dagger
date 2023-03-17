package dev.seenu.fitpeotask.di.modules


import dagger.Module
import dagger.android.ContributesAndroidInjector

import dev.seenu.fitpeotask.presentation.fragments.ImagesListFragment
import dev.seenu.fitpeotask.presentation.fragments.SingleImageFragment

@Suppress("unused")
@Module
abstract class FragmentBuildersModule {
    @ContributesAndroidInjector
    abstract fun contributeImagesListFragment(): ImagesListFragment

    @ContributesAndroidInjector
    abstract fun contributeSingleFragment(): SingleImageFragment

}
