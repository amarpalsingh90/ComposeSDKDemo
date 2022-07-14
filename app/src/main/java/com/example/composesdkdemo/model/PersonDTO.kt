package com.example.composesdkdemo.model


import com.example.uisdk.model.BaseDataModel
import com.example.uisdk.model.CommonListData

data class PersonDTO(val name: String, val age: Int, val gender: String, val address: String) :
    BaseDataModel() {

    override fun getCommonListDataModel(): CommonListData {
        return CommonListData(
            name = name,
            age = age,
            gender = gender,
            address = address
        )
    }
}
