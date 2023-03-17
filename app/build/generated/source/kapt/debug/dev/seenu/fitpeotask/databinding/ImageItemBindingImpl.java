package dev.seenu.fitpeotask.databinding;
import dev.seenu.fitpeotask.R;
import dev.seenu.fitpeotask.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ImageItemBindingImpl extends ImageItemBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ImageItemBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 3, sIncludes, sViewsWithIds));
    }
    private ImageItemBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.TextView) bindings[2]
            , (android.widget.ImageView) bindings[1]
            );
        this.desc.setTag(null);
        this.imageView.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.image == variableId) {
            setImage((dev.seenu.fitpeotask.data.model.ImageResponseModel) variable);
        }
        else if (BR.shouldRound == variableId) {
            setShouldRound((java.lang.Boolean) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setImage(@Nullable dev.seenu.fitpeotask.data.model.ImageResponseModel Image) {
        this.mImage = Image;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.image);
        super.requestRebind();
    }
    public void setShouldRound(@Nullable java.lang.Boolean ShouldRound) {
        this.mShouldRound = ShouldRound;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.shouldRound);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        dev.seenu.fitpeotask.data.model.ImageResponseModel image = mImage;
        java.lang.String imageTitle = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxShouldRound = false;
        java.lang.String imageUrl = null;
        java.lang.Boolean shouldRound = mShouldRound;

        if ((dirtyFlags & 0x7L) != 0) {


            if ((dirtyFlags & 0x5L) != 0) {

                    if (image != null) {
                        // read image.title
                        imageTitle = image.getTitle();
                    }
            }

                if (image != null) {
                    // read image.url
                    imageUrl = image.getUrl();
                }
                // read androidx.databinding.ViewDataBinding.safeUnbox(shouldRound)
                androidxDatabindingViewDataBindingSafeUnboxShouldRound = androidx.databinding.ViewDataBinding.safeUnbox(shouldRound);
        }
        // batch finished
        if ((dirtyFlags & 0x5L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.desc, imageTitle);
        }
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            dev.seenu.fitpeotask.presentation.adapters.BindingAdaptersKt.bindImageFromUrl(this.imageView, imageUrl, androidxDatabindingViewDataBindingSafeUnboxShouldRound);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): image
        flag 1 (0x2L): shouldRound
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}