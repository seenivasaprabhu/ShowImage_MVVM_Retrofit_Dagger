package dev.seenu.fitpeotask.presentation.fragments

import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.isVisible
import androidx.fragment.app.viewModels
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import androidx.navigation.findNavController
import androidx.paging.LoadState
import dagger.android.support.DaggerFragment
import dev.seenu.fitpeotask.R
import dev.seenu.fitpeotask.data.model.ImageResponseModel

import dev.seenu.fitpeotask.databinding.FragmentImagesListBinding
import dev.seenu.fitpeotask.presentation.adapters.ImagesAdapter
import dev.seenu.fitpeotask.presentation.adapters.LoadingStateAdapter
import dev.seenu.fitpeotask.presentation.viewmodels.ImagesListViewModel
import dev.seenu.fitpeotask.utils.toast
import kotlinx.coroutines.Job
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch
import javax.inject.Inject



class ImagesListFragment : DaggerFragment(R.layout.fragment_images_list) {


    private var hasInitiatedInitialCall = false

    private lateinit var binding: FragmentImagesListBinding

    private var job: Job? = null

    private val adapter =
        ImagesAdapter { imagesResponse, imageView -> navigate(imagesResponse, imageView) }

    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory
    private val viewModel: ImagesListViewModel by viewModels {
        viewModelFactory
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentImagesListBinding.bind(view)
        (requireActivity() as AppCompatActivity).setSupportActionBar(binding.toolbar)
        setHasOptionsMenu(true)

        setAdapter()

        //prevents the method being called again onbackpressed pressed.
        if (!hasInitiatedInitialCall) {
            getImages()
            hasInitiatedInitialCall = true
        }
    }

    private fun getImages() {
        job?.cancel()
        job = lifecycleScope.launch {
            viewModel.getImages().collect {
                adapter.submitData(it)
            }

        }
    }

    private fun setAdapter() {
        binding.imagesList.adapter = adapter.withLoadStateFooter(
            LoadingStateAdapter { adapter.retry() }
        )
        adapter.addLoadStateListener {

            binding.progress.isVisible = it.refresh is LoadState.Loading

            if (it.refresh is LoadState.Error) {
                requireContext().toast("There was a problem fetching data")
            }
        }
    }


    private fun navigate(imagesResponse: ImageResponseModel, imageView: ImageView) {
        val action = ImagesListFragmentDirections.toSingleImageFragment(imagesResponse)
        binding.root.findNavController()
            .navigate(action)
    }

}