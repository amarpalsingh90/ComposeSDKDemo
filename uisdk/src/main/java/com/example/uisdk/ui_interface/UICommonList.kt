package com.example.uisdk.ui_interface

import com.example.uisdk.model.CommonListData

interface UICommonList {

    fun getCommonListDataModel(): CommonListData
    fun getCommonListDataModel2(): String {
        return ""
    }

    fun getCommonListDataModel3(): Int {
        return 0
    }
}