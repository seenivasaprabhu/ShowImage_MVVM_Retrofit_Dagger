package dev.seenu.fitpeotask.di;

import android.app.Application;
import androidx.lifecycle.ViewModel;
import dagger.android.AndroidInjector;
import dagger.android.DaggerApplication_MembersInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.DispatchingAndroidInjector_Factory;
import dagger.android.support.DaggerAppCompatActivity_MembersInjector;
import dagger.android.support.DaggerFragment_MembersInjector;
import dagger.internal.DoubleCheck;
import dagger.internal.InstanceFactory;
import dagger.internal.MapBuilder;
import dagger.internal.MapProviderFactory;
import dagger.internal.Preconditions;
import dev.seenu.fitpeotask.App;
import dev.seenu.fitpeotask.api.ApiService;
import dev.seenu.fitpeotask.data.repository.Repository;
import dev.seenu.fitpeotask.di.modules.DataModule_ProvidesRepositoryFactory;
import dev.seenu.fitpeotask.di.modules.FragmentBuildersModule_ContributeImagesListFragment;
import dev.seenu.fitpeotask.di.modules.FragmentBuildersModule_ContributeSingleFragment;
import dev.seenu.fitpeotask.di.modules.MainActivityModule_ContributeMainActivity;
import dev.seenu.fitpeotask.di.modules.NetworkModule_ProvideCacheFactory;
import dev.seenu.fitpeotask.di.modules.NetworkModule_ProvidesApiServiceFactory;
import dev.seenu.fitpeotask.di.modules.NetworkModule_ProvidesOkhttpFactory;
import dev.seenu.fitpeotask.di.modules.NetworkModule_ProvidesRetrofitFactory;
import dev.seenu.fitpeotask.presentation.MainActivity;
import dev.seenu.fitpeotask.presentation.fragments.ImagesListFragment;
import dev.seenu.fitpeotask.presentation.fragments.ImagesListFragment_MembersInjector;
import dev.seenu.fitpeotask.presentation.fragments.SingleImageFragment;
import dev.seenu.fitpeotask.presentation.fragments.SingleImageFragment_MembersInjector;
import dev.seenu.fitpeotask.presentation.viewmodels.ImagesListViewModel;
import dev.seenu.fitpeotask.presentation.viewmodels.ImagesListViewModel_Factory;
import dev.seenu.fitpeotask.presentation.viewmodels.SingleImageViewModel;
import dev.seenu.fitpeotask.presentation.viewmodels.SingleImageViewModel_Factory;
import dev.seenu.fitpeotask.presentation.viewmodels.ViewModelFactory;
import dev.seenu.fitpeotask.presentation.viewmodels.ViewModelFactory_Factory;
import java.util.Collections;
import java.util.Map;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import okhttp3.Cache;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class DaggerAppComponent implements AppComponent {
  private Provider<MainActivityModule_ContributeMainActivity.MainActivitySubcomponent.Factory> mainActivitySubcomponentFactoryProvider;

  private Provider<Application> applicationProvider;

  private Provider<Cache> provideCacheProvider;

  private Provider<OkHttpClient> providesOkhttpProvider;

  private Provider<Retrofit> providesRetrofitProvider;

  private Provider<ApiService> providesApiServiceProvider;

  private Provider<Repository> providesRepositoryProvider;

  private Provider<ImagesListViewModel> imagesListViewModelProvider;

  private Provider<SingleImageViewModel> singleImageViewModelProvider;

  private Provider<Map<Class<? extends ViewModel>, Provider<ViewModel>>> mapOfClassOfAndProviderOfViewModelProvider;

  private Provider<ViewModelFactory> viewModelFactoryProvider;

  private DaggerAppComponent(Application applicationParam) {

    initialize(applicationParam);
  }

  public static AppComponent.Builder builder() {
    return new Builder();
  }

  private Map<Class<?>, Provider<AndroidInjector.Factory<?>>> mapOfClassOfAndProviderOfAndroidInjectorFactoryOf(
      ) {
    return Collections.<Class<?>, Provider<AndroidInjector.Factory<?>>>singletonMap(MainActivity.class, (Provider) mainActivitySubcomponentFactoryProvider);
  }

  private DispatchingAndroidInjector<Object> dispatchingAndroidInjectorOfObject() {
    return DispatchingAndroidInjector_Factory.newInstance(mapOfClassOfAndProviderOfAndroidInjectorFactoryOf(), Collections.<String, Provider<AndroidInjector.Factory<?>>>emptyMap());
  }

  @SuppressWarnings("unchecked")
  private void initialize(final Application applicationParam) {
    this.mainActivitySubcomponentFactoryProvider = new Provider<MainActivityModule_ContributeMainActivity.MainActivitySubcomponent.Factory>() {
      @Override
      public MainActivityModule_ContributeMainActivity.MainActivitySubcomponent.Factory get() {
        return new MainActivitySubcomponentFactory();
      }
    };
    this.applicationProvider = InstanceFactory.create(applicationParam);
    this.provideCacheProvider = DoubleCheck.provider(NetworkModule_ProvideCacheFactory.create(applicationProvider));
    this.providesOkhttpProvider = DoubleCheck.provider(NetworkModule_ProvidesOkhttpFactory.create(provideCacheProvider));
    this.providesRetrofitProvider = DoubleCheck.provider(NetworkModule_ProvidesRetrofitFactory.create(providesOkhttpProvider));
    this.providesApiServiceProvider = DoubleCheck.provider(NetworkModule_ProvidesApiServiceFactory.create(providesRetrofitProvider));
    this.providesRepositoryProvider = DoubleCheck.provider(DataModule_ProvidesRepositoryFactory.create(providesApiServiceProvider));
    this.imagesListViewModelProvider = ImagesListViewModel_Factory.create(providesRepositoryProvider);
    this.singleImageViewModelProvider = SingleImageViewModel_Factory.create(applicationProvider);
    this.mapOfClassOfAndProviderOfViewModelProvider = MapProviderFactory.<Class<? extends ViewModel>, ViewModel>builder(2).put(ImagesListViewModel.class, (Provider) imagesListViewModelProvider).put(SingleImageViewModel.class, (Provider) singleImageViewModelProvider).build();
    this.viewModelFactoryProvider = DoubleCheck.provider(ViewModelFactory_Factory.create(mapOfClassOfAndProviderOfViewModelProvider));
  }

  @Override
  public void inject(App arg0) {
    injectApp(arg0);
  }

  private App injectApp(App instance) {
    DaggerApplication_MembersInjector.injectAndroidInjector(instance, dispatchingAndroidInjectorOfObject());
    return instance;
  }

  private static final class Builder implements AppComponent.Builder {
    private Application application;

    @Override
    public Builder application(Application arg0) {
      this.application = Preconditions.checkNotNull(arg0);
      return this;
    }

    @Override
    public AppComponent build() {
      Preconditions.checkBuilderRequirement(application, Application.class);
      return new DaggerAppComponent(application);
    }
  }

  private final class MainActivitySubcomponentFactory implements MainActivityModule_ContributeMainActivity.MainActivitySubcomponent.Factory {
    @Override
    public MainActivityModule_ContributeMainActivity.MainActivitySubcomponent create(
        MainActivity arg0) {
      Preconditions.checkNotNull(arg0);
      return new MainActivitySubcomponentImpl(arg0);
    }
  }

  private final class MainActivitySubcomponentImpl implements MainActivityModule_ContributeMainActivity.MainActivitySubcomponent {
    private Provider<FragmentBuildersModule_ContributeImagesListFragment.ImagesListFragmentSubcomponent.Factory> imagesListFragmentSubcomponentFactoryProvider;

    private Provider<FragmentBuildersModule_ContributeSingleFragment.SingleImageFragmentSubcomponent.Factory> singleImageFragmentSubcomponentFactoryProvider;

    private MainActivitySubcomponentImpl(MainActivity arg0) {

      initialize(arg0);
    }

    private Map<Class<?>, Provider<AndroidInjector.Factory<?>>> mapOfClassOfAndProviderOfAndroidInjectorFactoryOf(
        ) {
      return MapBuilder.<Class<?>, Provider<AndroidInjector.Factory<?>>>newMapBuilder(3).put(MainActivity.class, (Provider) DaggerAppComponent.this.mainActivitySubcomponentFactoryProvider).put(ImagesListFragment.class, (Provider) imagesListFragmentSubcomponentFactoryProvider).put(SingleImageFragment.class, (Provider) singleImageFragmentSubcomponentFactoryProvider).build();
    }

    private DispatchingAndroidInjector<Object> dispatchingAndroidInjectorOfObject() {
      return DispatchingAndroidInjector_Factory.newInstance(mapOfClassOfAndProviderOfAndroidInjectorFactoryOf(), Collections.<String, Provider<AndroidInjector.Factory<?>>>emptyMap());
    }

    @SuppressWarnings("unchecked")
    private void initialize(final MainActivity arg0) {
      this.imagesListFragmentSubcomponentFactoryProvider = new Provider<FragmentBuildersModule_ContributeImagesListFragment.ImagesListFragmentSubcomponent.Factory>() {
        @Override
        public FragmentBuildersModule_ContributeImagesListFragment.ImagesListFragmentSubcomponent.Factory get(
            ) {
          return new ImagesListFragmentSubcomponentFactory();
        }
      };
      this.singleImageFragmentSubcomponentFactoryProvider = new Provider<FragmentBuildersModule_ContributeSingleFragment.SingleImageFragmentSubcomponent.Factory>() {
        @Override
        public FragmentBuildersModule_ContributeSingleFragment.SingleImageFragmentSubcomponent.Factory get(
            ) {
          return new SingleImageFragmentSubcomponentFactory();
        }
      };
    }

    @Override
    public void inject(MainActivity arg0) {
      injectMainActivity(arg0);
    }

    private MainActivity injectMainActivity(MainActivity instance) {
      DaggerAppCompatActivity_MembersInjector.injectAndroidInjector(instance, dispatchingAndroidInjectorOfObject());
      return instance;
    }

    private final class ImagesListFragmentSubcomponentFactory implements FragmentBuildersModule_ContributeImagesListFragment.ImagesListFragmentSubcomponent.Factory {
      @Override
      public FragmentBuildersModule_ContributeImagesListFragment.ImagesListFragmentSubcomponent create(
          ImagesListFragment arg0) {
        Preconditions.checkNotNull(arg0);
        return new ImagesListFragmentSubcomponentImpl(arg0);
      }
    }

    private final class ImagesListFragmentSubcomponentImpl implements FragmentBuildersModule_ContributeImagesListFragment.ImagesListFragmentSubcomponent {
      private ImagesListFragmentSubcomponentImpl(ImagesListFragment arg0) {

      }

      @Override
      public void inject(ImagesListFragment arg0) {
        injectImagesListFragment(arg0);
      }

      private ImagesListFragment injectImagesListFragment(ImagesListFragment instance) {
        DaggerFragment_MembersInjector.injectAndroidInjector(instance, MainActivitySubcomponentImpl.this.dispatchingAndroidInjectorOfObject());
        ImagesListFragment_MembersInjector.injectViewModelFactory(instance, DaggerAppComponent.this.viewModelFactoryProvider.get());
        return instance;
      }
    }

    private final class SingleImageFragmentSubcomponentFactory implements FragmentBuildersModule_ContributeSingleFragment.SingleImageFragmentSubcomponent.Factory {
      @Override
      public FragmentBuildersModule_ContributeSingleFragment.SingleImageFragmentSubcomponent create(
          SingleImageFragment arg0) {
        Preconditions.checkNotNull(arg0);
        return new SingleImageFragmentSubcomponentImpl(arg0);
      }
    }

    private final class SingleImageFragmentSubcomponentImpl implements FragmentBuildersModule_ContributeSingleFragment.SingleImageFragmentSubcomponent {
      private SingleImageFragmentSubcomponentImpl(SingleImageFragment arg0) {

      }

      @Override
      public void inject(SingleImageFragment arg0) {
        injectSingleImageFragment(arg0);
      }

      private SingleImageFragment injectSingleImageFragment(SingleImageFragment instance) {
        DaggerFragment_MembersInjector.injectAndroidInjector(instance, MainActivitySubcomponentImpl.this.dispatchingAndroidInjectorOfObject());
        SingleImageFragment_MembersInjector.injectViewModelFactory(instance, DaggerAppComponent.this.viewModelFactoryProvider.get());
        return instance;
      }
    }
  }
}
