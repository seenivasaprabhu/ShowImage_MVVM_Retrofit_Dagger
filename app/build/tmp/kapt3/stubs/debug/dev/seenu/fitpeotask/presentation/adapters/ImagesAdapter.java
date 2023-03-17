package dev.seenu.fitpeotask.presentation.adapters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003R\u00020\u00000\u0001:\u0002\u0011\u0012B\u001f\u0012\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u00a2\u0006\u0002\u0010\bJ\u001c\u0010\t\u001a\u00020\u00072\n\u0010\n\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u001c\u0010\r\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\fH\u0016R \u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Ldev/seenu/fitpeotask/presentation/adapters/ImagesAdapter;", "Landroidx/paging/PagingDataAdapter;", "Ldev/seenu/fitpeotask/data/model/ImageResponseModel;", "Ldev/seenu/fitpeotask/presentation/adapters/ImagesAdapter$ViewHolder;", "navigate", "Lkotlin/Function2;", "Landroid/widget/ImageView;", "", "(Lkotlin/jvm/functions/Function2;)V", "onBindViewHolder", "holder", "position", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "DiffCallback", "ViewHolder", "app_debug"})
public final class ImagesAdapter extends androidx.paging.PagingDataAdapter<dev.seenu.fitpeotask.data.model.ImageResponseModel, dev.seenu.fitpeotask.presentation.adapters.ImagesAdapter.ViewHolder> {
    private final kotlin.jvm.functions.Function2<dev.seenu.fitpeotask.data.model.ImageResponseModel, android.widget.ImageView, kotlin.Unit> navigate = null;
    
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    dev.seenu.fitpeotask.presentation.adapters.ImagesAdapter.ViewHolder holder, int position) {
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public dev.seenu.fitpeotask.presentation.adapters.ImagesAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    public ImagesAdapter(@org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function2<? super dev.seenu.fitpeotask.data.model.ImageResponseModel, ? super android.widget.ImageView, kotlin.Unit> navigate) {
        super(null, null, null);
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Ldev/seenu/fitpeotask/presentation/adapters/ImagesAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Ldev/seenu/fitpeotask/databinding/ImageItemBinding;", "(Ldev/seenu/fitpeotask/presentation/adapters/ImagesAdapter;Ldev/seenu/fitpeotask/databinding/ImageItemBinding;)V", "imageResponse", "Ldev/seenu/fitpeotask/data/model/ImageResponseModel;", "bind", "", "imagesResponse", "position", "", "app_debug"})
    public final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private dev.seenu.fitpeotask.data.model.ImageResponseModel imageResponse;
        private final dev.seenu.fitpeotask.databinding.ImageItemBinding binding = null;
        
        public final void bind(@org.jetbrains.annotations.NotNull
        dev.seenu.fitpeotask.data.model.ImageResponseModel imagesResponse, int position) {
        }
        
        public ViewHolder(@org.jetbrains.annotations.NotNull
        dev.seenu.fitpeotask.databinding.ImageItemBinding binding) {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016\u00a8\u0006\t"}, d2 = {"Ldev/seenu/fitpeotask/presentation/adapters/ImagesAdapter$DiffCallback;", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Ldev/seenu/fitpeotask/data/model/ImageResponseModel;", "()V", "areContentsTheSame", "", "oldItem", "newItem", "areItemsTheSame", "app_debug"})
    static final class DiffCallback extends androidx.recyclerview.widget.DiffUtil.ItemCallback<dev.seenu.fitpeotask.data.model.ImageResponseModel> {
        
        @java.lang.Override
        public boolean areItemsTheSame(@org.jetbrains.annotations.NotNull
        dev.seenu.fitpeotask.data.model.ImageResponseModel oldItem, @org.jetbrains.annotations.NotNull
        dev.seenu.fitpeotask.data.model.ImageResponseModel newItem) {
            return false;
        }
        
        @java.lang.Override
        public boolean areContentsTheSame(@org.jetbrains.annotations.NotNull
        dev.seenu.fitpeotask.data.model.ImageResponseModel oldItem, @org.jetbrains.annotations.NotNull
        dev.seenu.fitpeotask.data.model.ImageResponseModel newItem) {
            return false;
        }
        
        public DiffCallback() {
            super();
        }
    }
}