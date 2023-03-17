package dev.seenu.fitpeotask.di.modules;

import android.app.Application;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import okhttp3.Cache;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class NetworkModule_ProvideCacheFactory implements Factory<Cache> {
  private final Provider<Application> appProvider;

  public NetworkModule_ProvideCacheFactory(Provider<Application> appProvider) {
    this.appProvider = appProvider;
  }

  @Override
  public Cache get() {
    return provideCache(appProvider.get());
  }

  public static NetworkModule_ProvideCacheFactory create(Provider<Application> appProvider) {
    return new NetworkModule_ProvideCacheFactory(appProvider);
  }

  public static Cache provideCache(Application app) {
    return Preconditions.checkNotNullFromProvides(NetworkModule.INSTANCE.provideCache(app));
  }
}
