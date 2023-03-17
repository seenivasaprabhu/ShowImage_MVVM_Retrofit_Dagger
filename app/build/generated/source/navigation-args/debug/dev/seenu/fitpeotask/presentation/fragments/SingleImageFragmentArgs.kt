package dev.seenu.fitpeotask.presentation.fragments

import android.os.Bundle
import android.os.Parcelable
import androidx.navigation.NavArgs
import dev.seenu.fitpeotask.`data`.model.ImageResponseModel
import java.io.Serializable
import java.lang.IllegalArgumentException
import java.lang.UnsupportedOperationException
import kotlin.Suppress
import kotlin.jvm.JvmStatic

public data class SingleImageFragmentArgs(
  public val image: ImageResponseModel
) : NavArgs {
  @Suppress("CAST_NEVER_SUCCEEDS")
  public fun toBundle(): Bundle {
    val result = Bundle()
    if (Parcelable::class.java.isAssignableFrom(ImageResponseModel::class.java)) {
      result.putParcelable("image", this.image as Parcelable)
    } else if (Serializable::class.java.isAssignableFrom(ImageResponseModel::class.java)) {
      result.putSerializable("image", this.image as Serializable)
    } else {
      throw UnsupportedOperationException(ImageResponseModel::class.java.name +
          " must implement Parcelable or Serializable or must be an Enum.")
    }
    return result
  }

  public companion object {
    @JvmStatic
    public fun fromBundle(bundle: Bundle): SingleImageFragmentArgs {
      bundle.setClassLoader(SingleImageFragmentArgs::class.java.classLoader)
      val __image : ImageResponseModel?
      if (bundle.containsKey("image")) {
        if (Parcelable::class.java.isAssignableFrom(ImageResponseModel::class.java) ||
            Serializable::class.java.isAssignableFrom(ImageResponseModel::class.java)) {
          __image = bundle.get("image") as ImageResponseModel?
        } else {
          throw UnsupportedOperationException(ImageResponseModel::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
        if (__image == null) {
          throw IllegalArgumentException("Argument \"image\" is marked as non-null but was passed a null value.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"image\" is missing and does not have an android:defaultValue")
      }
      return SingleImageFragmentArgs(__image)
    }
  }
}
