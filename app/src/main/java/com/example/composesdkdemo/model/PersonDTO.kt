package com.example.composesdkdemo.model


import com.example.uisdk.model.BaseDataModel
import com.example.uisdk.model.CommonUIData


data class PersonDTO(val name: String, val age: Int, val gender: String, val address: String) :
    BaseDataModel() {

    override fun getPersonData(): CommonUIData.PersonData {
        return CommonUIData.PersonData(
            name = name,
            age = age,
            gender = gender,
            address = address
        )
    }

    override fun getMovieData(): CommonUIData.MovieData {
        TODO("Not yet implemented")
    }

    override fun getSportData(): CommonUIData.SportData {
        TODO("Not yet implemented")
    }
}
