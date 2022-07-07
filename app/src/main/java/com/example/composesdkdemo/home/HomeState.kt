package com.example.composesdkdemo.home

import com.example.uisdk.model.Person

data class HomeState(
    var isLoading: Boolean = false,
    var data: List<Person> = emptyList(),
    var error: String = ""
)