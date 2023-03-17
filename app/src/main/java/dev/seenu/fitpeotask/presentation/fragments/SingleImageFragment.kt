package dev.seenu.fitpeotask.presentation.fragments

import android.os.Bundle
import android.view.MenuItem
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.viewModels
import androidx.lifecycle.ViewModelProvider
import dagger.android.support.DaggerFragment
import dev.seenu.fitpeotask.R
import dev.seenu.fitpeotask.data.model.ImageResponseModel
import dev.seenu.fitpeotask.databinding.FragmentSingleImageBinding
import dev.seenu.fitpeotask.presentation.viewmodels.SingleImageViewModel
import javax.inject.Inject


class SingleImageFragment : DaggerFragment(R.layout.fragment_single_image){

    private lateinit var binding: FragmentSingleImageBinding
    private val args = SingleImageFragmentArgs

    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory

    private val viewModel: SingleImageViewModel by viewModels {
        viewModelFactory
    }

    private var model: ImageResponseModel? = null


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding = FragmentSingleImageBinding.bind(view)
        (requireActivity() as AppCompatActivity).setSupportActionBar(binding.toolbar)
        (requireActivity() as AppCompatActivity).supportActionBar?.setHomeButtonEnabled(true)
        (requireActivity() as AppCompatActivity).supportActionBar?.setDisplayShowHomeEnabled(true)

        setHasOptionsMenu(true)

        model = arguments?.let { args.fromBundle(it).image }

        viewModel.imageString = model?.url
        viewModel.titleSting = model?.title

        binding.viewmodel = viewModel

    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            android.R.id.home -> {
                requireActivity().onBackPressed()
                return true
            }
        }
        return super.onOptionsItemSelected(item)
    }

}