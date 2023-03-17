package dev.seenu.fitpeotask.data.repository

import androidx.paging.Pager
import androidx.paging.PagingConfig
import dev.seenu.fitpeotask.data.datasource.ImagesDataSource
import dev.seenu.fitpeotask.api.ApiService
import dev.seenu.fitpeotask.utils.LOAD_SIZE

import javax.inject.Inject


class Repository @Inject constructor(private val apiService: ApiService) {

    fun getImages(orderBy: String) = Pager(
        config = PagingConfig(enablePlaceholders = false, pageSize = LOAD_SIZE),
        pagingSourceFactory = {
            ImagesDataSource(apiService, orderBy)
        }
    ).flow
}