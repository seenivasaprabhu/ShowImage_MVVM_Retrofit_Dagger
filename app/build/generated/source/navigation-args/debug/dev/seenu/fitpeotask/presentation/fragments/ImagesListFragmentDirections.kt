package dev.seenu.fitpeotask.presentation.fragments

import android.os.Bundle
import android.os.Parcelable
import androidx.navigation.NavDirections
import dev.seenu.fitpeotask.R
import dev.seenu.fitpeotask.`data`.model.ImageResponseModel
import java.io.Serializable
import java.lang.UnsupportedOperationException
import kotlin.Int
import kotlin.Suppress

public class ImagesListFragmentDirections private constructor() {
  private data class ToSingleImageFragment(
    public val image: ImageResponseModel
  ) : NavDirections {
    public override fun getActionId(): Int = R.id.to_singleImageFragment

    @Suppress("CAST_NEVER_SUCCEEDS")
    public override fun getArguments(): Bundle {
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
  }

  public companion object {
    public fun toSingleImageFragment(image: ImageResponseModel): NavDirections =
        ToSingleImageFragment(image)
  }
}
