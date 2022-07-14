package com.example.composesdkdemo.home

import com.example.composesdkdemo.model.PersonDTO


data class HomeState(
    var isLoading: Boolean = false,
    var data: List<PersonDTO> = emptyList(),
    var error: String = ""
)