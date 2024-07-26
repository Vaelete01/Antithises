package com.example.navibar.ui.upload

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.navibar.data.Book
import com.example.navibar.data.BookRepository
import kotlinx.coroutines.launch

class UploadViewModel(private val repository: BookRepository) : ViewModel() {

    fun insert(book: Book) = viewModelScope.launch {
        repository.insert(book)
    }
}
