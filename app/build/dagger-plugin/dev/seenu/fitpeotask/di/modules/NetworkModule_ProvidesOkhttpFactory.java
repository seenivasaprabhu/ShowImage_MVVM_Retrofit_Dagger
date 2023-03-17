package dev.seenu.fitpeotask.di.modules;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import okhttp3.Cache;
import okhttp3.OkHttpClient;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class NetworkModule_ProvidesOkhttpFactory implements Factory<OkHttpClient> {
  private final Provider<Cache> cacheProvider;

  public NetworkModule_ProvidesOkhttpFactory(Provider<Cache> cacheProvider) {
    this.cacheProvider = cacheProvider;
  }

  @Override
  public OkHttpClient get() {
    return providesOkhttp(cacheProvider.get());
  }

  public static NetworkModule_ProvidesOkhttpFactory create(Provider<Cache> cacheProvider) {
    return new NetworkModule_ProvidesOkhttpFactory(cacheProvider);
  }

  public static OkHttpClient providesOkhttp(Cache cache) {
    return Preconditions.checkNotNullFromProvides(NetworkModule.INSTANCE.providesOkhttp(cache));
  }
}
