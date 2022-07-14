package com.example.composesdkdemo.repository.user

import com.example.composesdkdemo.model.PersonDTO


class UserRepository {
    fun getAllPersonList(): List<PersonDTO> {
        return listOf(
            PersonDTO(
                name = "Mansi",
                age = 25,
                gender = "Female",
                address = "Gomti Nagar Lucknow 226010"
            ),
            PersonDTO(
                name = "Poonam",
                age = 25,
                gender = "Female",
                address = "Gomti Nagar Lucknow 226010"
            ),
            PersonDTO(
                name = "Gourav",
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