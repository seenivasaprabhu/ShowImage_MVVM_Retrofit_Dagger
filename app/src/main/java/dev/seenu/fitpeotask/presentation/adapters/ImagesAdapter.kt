package dev.seenu.fitpeotask.presentation.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import androidx.paging.PagingDataAdapter
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import dev.seenu.fitpeotask.data.model.ImageResponseModel
import dev.seenu.fitpeotask.databinding.ImageItemBinding

class ImagesAdapter(private val navigate: (ImageResponseModel, ImageView) -> Unit) :
    PagingDataAdapter<ImageResponseModel, ImagesAdapter.ViewHolder>(
        DiffCallback()
    ) {
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        getItem(position)?.let {
            holder.bind(it, position)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            ImageItemBinding.inflate(
                LayoutInflater.from(parent.context), parent, false
            )
        )

    }

    inner class ViewHolder(
        private val binding: ImageItemBinding
    ) : RecyclerView.ViewHolder(binding.root) {

        private var imageResponse: ImageResponseModel? = null


        fun bind(imagesResponse: ImageResponseModel, position: Int) {
            this.imageResponse = imagesResponse
            binding.apply {
                image = imagesResponse
                shouldRound = true

                binding.root.setOnClickListener {
                    imageResponse?.let {
                        navigate.invoke(it, imageView)
                    }
                }
                executePendingBindings()
            }
        }

    }


    private class DiffCallback : DiffUtil.ItemCallback<ImageResponseModel>() {
        override fun areItemsTheSame(oldItem: ImageResponseModel, newItem: ImageResponseModel): Boolean {
            return oldItem.id == newItem.id
        }

        override fun areContentsTheSame(oldItem: ImageResponseModel, newItem: ImageResponseModel): Boolean {
            return oldItem == newItem
        }
    }
}