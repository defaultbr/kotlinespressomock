package com.elyeproj.javadaggeruitest

import javax.inject.Singleton

import dagger.Component

@Singleton
@Component(modules = arrayOf(ApplicationModule::class))
interface ApplicationComponent {
    fun inject(mainActivity: MainActivity)

    fun dataManager(): InjectedData
}

