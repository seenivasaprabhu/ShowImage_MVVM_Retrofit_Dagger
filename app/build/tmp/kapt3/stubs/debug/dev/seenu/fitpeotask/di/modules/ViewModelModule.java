package dev.seenu.fitpeotask.di.modules;

import java.lang.System;

@kotlin.Suppress(names = {"unused"})
@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\'J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tH\'J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\'\u00a8\u0006\u000e"}, d2 = {"Ldev/seenu/fitpeotask/di/modules/ViewModelModule;", "", "()V", "bindImagesListViewModel", "Landroidx/lifecycle/ViewModel;", "imagesListViewModel", "Ldev/seenu/fitpeotask/presentation/viewmodels/ImagesListViewModel;", "bindSingleImageViewModel", "singleImageViewModel", "Ldev/seenu/fitpeotask/presentation/viewmodels/SingleImageViewModel;", "bindViewModelFactory", "Landroidx/lifecycle/ViewModelProvider$Factory;", "factory", "Ldev/seenu/fitpeotask/presentation/viewmodels/ViewModelFactory;", "app_debug"})
@dagger.Module
public abstract class ViewModelModule {
    
    @org.jetbrains.annotations.NotNull
    @ViewModelKey(value = dev.seenu.fitpeotask.presentation.viewmodels.ImagesListViewModel.class)
    @dagger.multibindings.IntoMap
    @dagger.Binds
    public abstract androidx.lifecycle.ViewModel bindImagesListViewModel(@org.jetbrains.annotations.NotNull
    dev.seenu.fitpeotask.presentation.viewmodels.ImagesListViewModel imagesListViewModel);
    
    @org.jetbrains.annotations.NotNull
    @ViewModelKey(value = dev.seenu.fitpeotask.presentation.viewmodels.SingleImageViewModel.class)
    @dagger.multibindings.IntoMap
    @dagger.Binds
    public abstract androidx.lifecycle.ViewModel bindSingleImageViewModel(@org.jetbrains.annotations.NotNull
    dev.seenu.fitpeotask.presentation.viewmodels.SingleImageViewModel singleImageViewModel);
    
    @org.jetbrains.annotations.NotNull
    @dagger.Binds
    public abstract androidx.lifecycle.ViewModelProvider.Factory bindViewModelFactory(@org.jetbrains.annotations.NotNull
    dev.seenu.fitpeotask.presentation.viewmodels.ViewModelFactory factory);
    
    public ViewModelModule() {
        super();
    }
}