package com.example.uisdk

import com.example.uisdk.model.BaseDataModel
import com.example.uisdk.model.CommonListData

internal object PreviewData {
    var dataItem = object : BaseDataModel() {
        override fun getCommonListDataModel(): CommonListData {
            return CommonListData("Amar", 32, "Male", "Ratanpur")
        }
    }
}