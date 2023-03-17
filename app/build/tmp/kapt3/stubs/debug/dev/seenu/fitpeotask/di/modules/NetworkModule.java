package dev.seenu.fitpeotask.di.modules;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0007J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\bH\u0007J\u0010\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0010H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Ldev/seenu/fitpeotask/di/modules/NetworkModule;", "", "()V", "cacheInterceptor", "Lokhttp3/Interceptor;", "loggingInterceptor", "Lokhttp3/logging/HttpLoggingInterceptor;", "provideCache", "Lokhttp3/Cache;", "app", "Landroid/app/Application;", "providesApiService", "Ldev/seenu/fitpeotask/api/ApiService;", "retrofit", "Lretrofit2/Retrofit;", "providesOkhttp", "Lokhttp3/OkHttpClient;", "cache", "providesRetrofit", "client", "app_debug"})
@dagger.Module
public final class NetworkModule {
    private static final okhttp3.logging.HttpLoggingInterceptor loggingInterceptor = null;
    private static final okhttp3.Interceptor cacheInterceptor = null;
    @org.jetbrains.annotations.NotNull
    public static final dev.seenu.fitpeotask.di.modules.NetworkModule INSTANCE = null;
    
    @org.jetbrains.annotations.NotNull
    @dagger.Provides
    @javax.inject.Singleton
    public final okhttp3.OkHttpClient providesOkhttp(@org.jetbrains.annotations.NotNull
    okhttp3.Cache cache) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @dagger.Provides
    @javax.inject.Singleton
    public final retrofit2.Retrofit providesRetrofit(@org.jetbrains.annotations.NotNull
    okhttp3.OkHttpClient client) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @dagger.Provides
    @javax.inject.Singleton
    public final dev.seenu.fitpeotask.api.ApiService providesApiService(@org.jetbrains.annotations.NotNull
    retrofit2.Retrofit retrofit) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @javax.inject.Singleton
    @dagger.Provides
    public final okhttp3.Cache provideCache(@org.jetbrains.annotations.NotNull
    android.app.Application app) {
        return null;
    }
    
    private NetworkModule() {
        super();
    }
}