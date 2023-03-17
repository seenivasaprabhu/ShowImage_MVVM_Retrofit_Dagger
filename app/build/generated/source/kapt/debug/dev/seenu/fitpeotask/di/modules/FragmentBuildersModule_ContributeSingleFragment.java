package dev.seenu.fitpeotask.di.modules;

import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import dev.seenu.fitpeotask.presentation.fragments.SingleImageFragment;

@Module(
  subcomponents =
      FragmentBuildersModule_ContributeSingleFragment.SingleImageFragmentSubcomponent.class
)
public abstract class FragmentBuildersModule_ContributeSingleFragment {
  private FragmentBuildersModule_ContributeSingleFragment() {}

  @Binds
  @IntoMap
  @ClassKey(SingleImageFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      SingleImageFragmentSubcomponent.Factory builder);

  @Subcomponent
  public interface SingleImageFragmentSubcomponent extends AndroidInjector<SingleImageFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<SingleImageFragment> {}
  }
}
