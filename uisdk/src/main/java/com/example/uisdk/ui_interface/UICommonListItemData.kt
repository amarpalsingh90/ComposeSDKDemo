package com.example.uisdk.ui_interface

import com.example.uisdk.model.CommonUIData


interface UICommonListItemData {
    fun getPersonData(): CommonUIData.PersonData
    fun getMovieData(): CommonUIData.MovieData
    fun getSportData(): CommonUIData.SportData

}