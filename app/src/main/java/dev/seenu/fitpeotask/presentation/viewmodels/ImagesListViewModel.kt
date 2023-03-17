package dev.seenu.fitpeotask.presentation.viewmodels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.paging.PagingData
import androidx.paging.cachedIn
import dev.seenu.fitpeotask.data.model.ImageResponseModel
import dev.seenu.fitpeotask.data.repository.Repository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject



class ImagesListViewModel @Inject constructor(private val repository: Repository) : ViewModel() {

    private var currentResult: Flow<PagingData<ImageResponseModel>>? = null

    fun getImages(): Flow<PagingData<ImageResponseModel>> {
        val orderBy = listOf("latest", "oldest", "popular").random()
        val newResult: Flow<PagingData<ImageResponseModel>> =
            repository.getImages(orderBy).cachedIn(viewModelScope)
        currentResult = newResult
        return newResult
    }
}