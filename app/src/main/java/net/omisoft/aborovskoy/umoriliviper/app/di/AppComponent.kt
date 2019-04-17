package net.omisoft.aborovskoy.umoriliviper.app.di

import dagger.BindsInstance
import dagger.Component
import net.omisoft.aborovskoy.umoriliviper.app.App
import retrofit2.Retrofit
import javax.inject.Singleton

@Singleton
@Component(modules = [AppModule::class])
interface AppComponent {

    fun inject(target: App)

    fun app(): App

    fun retrofit(): Retrofit

    @Component.Builder
    interface Builder {
        @BindsInstance
        fun context(app: App): Builder

        fun plus(module: AppModule): Builder

        fun build(): AppComponent
    }
}