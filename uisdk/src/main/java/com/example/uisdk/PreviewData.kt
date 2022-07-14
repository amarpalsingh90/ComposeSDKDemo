package com.example.uisdk

import com.example.uisdk.model.BaseDataModel
import com.example.uisdk.model.CommonUIData

internal object PreviewData {
    var dataItem = object : BaseDataModel() {
        override fun getPersonData(): CommonUIData.PersonData {
            return CommonUIData.PersonData("Amar", 32, "Male", "Ratanpur")
        }

        override fun getMovieData(): CommonUIData.MovieData {
            TODO("Not yet implemented")
        }

        override fun getSportData(): CommonUIData.SportData {
            TODO("Not yet implemented")
        }
    }
}