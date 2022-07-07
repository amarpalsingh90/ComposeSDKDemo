package com.example.composesdkdemo.home

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import com.example.composesdkdemo.mapper.toPersonForUI
import com.example.data.remote.RemoteData
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor() : ViewModel() {
    private val _persons = mutableStateOf<HomeState>(HomeState())
    val persons: State<HomeState> = _persons

    init {
        getPersonList()
    }

    private fun getPersonList() {
        _persons.value = HomeState(data = RemoteData().getAllPerson().toPersonForUI())

    }
}