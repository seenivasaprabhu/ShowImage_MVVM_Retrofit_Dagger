package dev.seenu.fitpeotask.presentation.adapters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000eB\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\u0002\u0010\u0006J\u0018\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\nH\u0016J\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\nH\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Ldev/seenu/fitpeotask/presentation/adapters/LoadingStateAdapter;", "Landroidx/paging/LoadStateAdapter;", "Ldev/seenu/fitpeotask/presentation/adapters/LoadingStateAdapter$LoadStateViewHolder;", "retry", "Lkotlin/Function0;", "", "(Lkotlin/jvm/functions/Function0;)V", "onBindViewHolder", "holder", "loadState", "Landroidx/paging/LoadState;", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "LoadStateViewHolder", "app_debug"})
public final class LoadingStateAdapter extends androidx.paging.LoadStateAdapter<dev.seenu.fitpeotask.presentation.adapters.LoadingStateAdapter.LoadStateViewHolder> {
    private final kotlin.jvm.functions.Function0<kotlin.Unit> retry = null;
    
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    dev.seenu.fitpeotask.presentation.adapters.LoadingStateAdapter.LoadStateViewHolder holder, @org.jetbrains.annotations.NotNull
    androidx.paging.LoadState loadState) {
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public dev.seenu.fitpeotask.presentation.adapters.LoadingStateAdapter.LoadStateViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, @org.jetbrains.annotations.NotNull
    androidx.paging.LoadState loadState) {
        return null;
    }
    
    public LoadingStateAdapter(@org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<kotlin.Unit> retry) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Ldev/seenu/fitpeotask/presentation/adapters/LoadingStateAdapter$LoadStateViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Ldev/seenu/fitpeotask/databinding/NetworkStateItemBinding;", "(Ldev/seenu/fitpeotask/databinding/NetworkStateItemBinding;)V", "getBinding", "()Ldev/seenu/fitpeotask/databinding/NetworkStateItemBinding;", "app_debug"})
    public static final class LoadStateViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull
        private final dev.seenu.fitpeotask.databinding.NetworkStateItemBinding binding = null;
        
        @org.jetbrains.annotations.NotNull
        public final dev.seenu.fitpeotask.databinding.NetworkStateItemBinding getBinding() {
            return null;
        }
        
        public LoadStateViewHolder(@org.jetbrains.annotations.NotNull
        dev.seenu.fitpeotask.databinding.NetworkStateItemBinding binding) {
            super(null);
        }
    }
}