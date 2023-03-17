package dev.seenu.fitpeotask.di.modules;

import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import dev.seenu.fitpeotask.presentation.fragments.ImagesListFragment;

@Module(
  subcomponents =
      FragmentBuildersModule_ContributeImagesListFragment.ImagesListFragmentSubcomponent.class
)
public abstract class FragmentBuildersModule_ContributeImagesListFragment {
  private FragmentBuildersModule_ContributeImagesListFragment() {}

  @Binds
  @IntoMap
  @ClassKey(ImagesListFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      ImagesListFragmentSubcomponent.Factory builder);

  @Subcomponent
  public interface ImagesListFragmentSubcomponent extends AndroidInjector<ImagesListFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<ImagesListFragment> {}
  }
}
