package dev.seenu.fitpeotask.data.datasource

import androidx.paging.PagingSource
import androidx.paging.PagingState
import dev.seenu.fitpeotask.api.ApiService
import dev.seenu.fitpeotask.data.model.ImageResponseModel
import dev.seenu.fitpeotask.utils.STARTING_PAGE
import java.io.IOException



class ImagesDataSource(private val apiService: ApiService, private val orderBy: String) :
    PagingSource<Int, ImageResponseModel>() {

    override suspend fun load(params: LoadParams<Int>): LoadResult<Int, ImageResponseModel> {
        val page = params.key ?: STARTING_PAGE

        return try {
            val data = apiService.getImages(orderBy, page, params.loadSize)
            LoadResult.Page(
                data = data,
                prevKey = if (page == STARTING_PAGE) null else page - 1,
                nextKey = if (data.isEmpty()) null else page + 1
            )

        } catch (throwable: Throwable) {
            var exception = throwable
            if (throwable is IOException) {
                exception = IOException("Please check internet connection")
            }
            LoadResult.Error(exception)
        }

    }

    override fun getRefreshKey(state: PagingState<Int, ImageResponseModel>): Int? {

        return state.anchorPosition

    }

}