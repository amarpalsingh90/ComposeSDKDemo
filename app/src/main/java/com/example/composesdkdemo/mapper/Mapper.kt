package com.example.composesdkdemo.mapper

import com.example.data.model.PersonDTO
import com.example.uisdk.model.Person

fun List<PersonDTO>.toPersonForUI(): List<Person> {

    return map {
        Person(
            name = it.name,
            age = it.age,
            gender = it.gender,
            address = it.address
        )
    }
}