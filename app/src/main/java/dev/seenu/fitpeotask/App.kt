package dev.seenu.fitpeotask

import dagger.android.AndroidInjector
import dagger.android.DaggerApplication
import dev.seenu.fitpeotask.di.DaggerAppComponent

class App : DaggerApplication() {
    private val applicationInjector = DaggerAppComponent.builder().application(this).build()
    override fun applicationInjector(): AndroidInjector<out DaggerApplication> = applicationInjector
}
