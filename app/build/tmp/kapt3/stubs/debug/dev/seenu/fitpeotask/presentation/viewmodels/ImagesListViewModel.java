package dev.seenu.fitpeotask.presentation.viewmodels;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0012\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006R\u001c\u0010\u0005\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Ldev/seenu/fitpeotask/presentation/viewmodels/ImagesListViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Ldev/seenu/fitpeotask/data/repository/Repository;", "(Ldev/seenu/fitpeotask/data/repository/Repository;)V", "currentResult", "Lkotlinx/coroutines/flow/Flow;", "Landroidx/paging/PagingData;", "Ldev/seenu/fitpeotask/data/model/ImageResponseModel;", "getImages", "app_debug"})
public final class ImagesListViewModel extends androidx.lifecycle.ViewModel {
    private kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<dev.seenu.fitpeotask.data.model.ImageResponseModel>> currentResult;
    private final dev.seenu.fitpeotask.data.repository.Repository repository = null;
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<dev.seenu.fitpeotask.data.model.ImageResponseModel>> getImages() {
        return null;
    }
    
    @javax.inject.Inject
    public ImagesListViewModel(@org.jetbrains.annotations.NotNull
    dev.seenu.fitpeotask.data.repository.Repository repository) {
        super();
    }
}