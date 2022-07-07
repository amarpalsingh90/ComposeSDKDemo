package com.example.data.remote

import com.example.data.model.PersonDTO

class RemoteData {

    fun getAllPerson(): List<PersonDTO> {
        return listOf(
            PersonDTO(
                name = "Amar Pal",
                age = 31,
                gender = "Male",
                address = "Gomti Nagar Lucknow 226010"
            ),
            PersonDTO(
                name = "Vijay",
                age = 32,
                gender = "Male",
                address = "Delhi 110048"
            ),
            PersonDTO(
                name = "Prashant",
                age = 22,
                gender = "Male",
                address = "Bhopal 110099"
            ),
            PersonDTO(
                name = "Amar Pal",
                age = 31,
                gender = "Male",
                address = "Gomti Nagar Lucknow 226010"
            ),
            PersonDTO(
                name = "Vijay",
                age = 32,
                gender = "Male",
                address = "Delhi 110048"
            ),
            PersonDTO(
                name = "Prashant",
                age = 22,
                gender = "Male",
                address = "Bhopal 110099"
            ), PersonDTO(
                name = "Amar Pal",
                age = 31,
                gender = "Male",
                address = "Gomti Nagar Lucknow 226010"
            ),
            PersonDTO(
                name = "Vijay",
                age = 32,
                gender = "Male",
                address = "Delhi 110048"
            ),
            PersonDTO(
                name = "Prashant",
                age = 22,
                gender = "Male",
                address = "Bhopal 110099"
            )
        )
    }
}