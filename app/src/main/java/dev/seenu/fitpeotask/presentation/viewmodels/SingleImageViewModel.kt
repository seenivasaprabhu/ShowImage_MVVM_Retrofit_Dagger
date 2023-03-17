package dev.seenu.fitpeotask.presentation.viewmodels

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import javax.inject.Inject




class SingleImageViewModel @Inject constructor(
    private val app: Application
) :
    AndroidViewModel(app) {
    var imageString: String? = null
    var titleSting: String? = null
    val shouldRound = false


}