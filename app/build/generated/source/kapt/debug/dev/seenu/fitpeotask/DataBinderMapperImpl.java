package dev.seenu.fitpeotask;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import dev.seenu.fitpeotask.databinding.ActivityMainBindingImpl;
import dev.seenu.fitpeotask.databinding.FragmentImagesListBindingImpl;
import dev.seenu.fitpeotask.databinding.FragmentSingleImageBindingImpl;
import dev.seenu.fitpeotask.databinding.ImageItemBindingImpl;
import dev.seenu.fitpeotask.databinding.NetworkStateItemBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_ACTIVITYMAIN = 1;

  private static final int LAYOUT_FRAGMENTIMAGESLIST = 2;

  private static final int LAYOUT_FRAGMENTSINGLEIMAGE = 3;

  private static final int LAYOUT_IMAGEITEM = 4;

  private static final int LAYOUT_NETWORKSTATEITEM = 5;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(5);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(dev.seenu.fitpeotask.R.layout.activity_main, LAYOUT_ACTIVITYMAIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(dev.seenu.fitpeotask.R.layout.fragment_images_list, LAYOUT_FRAGMENTIMAGESLIST);
    INTERNAL_LAYOUT_ID_LOOKUP.put(dev.seenu.fitpeotask.R.layout.fragment_single_image, LAYOUT_FRAGMENTSINGLEIMAGE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(dev.seenu.fitpeotask.R.layout.image_item, LAYOUT_IMAGEITEM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(dev.seenu.fitpeotask.R.layout.network_state_item, LAYOUT_NETWORKSTATEITEM);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_ACTIVITYMAIN: {
          if ("layout/activity_main_0".equals(tag)) {
            return new ActivityMainBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_main is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTIMAGESLIST: {
          if ("layout/fragment_images_list_0".equals(tag)) {
            return new FragmentImagesListBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_images_list is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTSINGLEIMAGE: {
          if ("layout/fragment_single_image_0".equals(tag)) {
            return new FragmentSingleImageBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_single_image is invalid. Received: " + tag);
        }
        case  LAYOUT_IMAGEITEM: {
          if ("layout/image_item_0".equals(tag)) {
            return new ImageItemBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for image_item is invalid. Received: " + tag);
        }
        case  LAYOUT_NETWORKSTATEITEM: {
          if ("layout/network_state_item_0".equals(tag)) {
            return new NetworkStateItemBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for network_state_item is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(4);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "image");
      sKeys.put(2, "shouldRound");
      sKeys.put(3, "viewmodel");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(5);

    static {
      sKeys.put("layout/activity_main_0", dev.seenu.fitpeotask.R.layout.activity_main);
      sKeys.put("layout/fragment_images_list_0", dev.seenu.fitpeotask.R.layout.fragment_images_list);
      sKeys.put("layout/fragment_single_image_0", dev.seenu.fitpeotask.R.layout.fragment_single_image);
      sKeys.put("layout/image_item_0", dev.seenu.fitpeotask.R.layout.image_item);
      sKeys.put("layout/network_state_item_0", dev.seenu.fitpeotask.R.layout.network_state_item);
    }
  }
}
