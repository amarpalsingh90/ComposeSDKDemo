package com.example.uisdk.model


class CommonUIData {
    data class PersonData(val name: String, val age: Int, val gender: String, val address: String)
    data class MovieData(val movieName: String, val thumbnail: String, val releaseYear: String)
    data class SportData(val teamNameA: String, val teamNameB: String)
}

