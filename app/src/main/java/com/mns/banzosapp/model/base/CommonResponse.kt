package com.mns.banzosapp.model.base

import com.google.gson.annotations.SerializedName
import com.mns.banzosapp.model.IntroductionDetails
import com.mns.banzosapp.model.IslandDetails

open class CommonResponse : ResponseData() {

    @SerializedName("image_base_url")
    var image_base_url: String? = null

    @SerializedName("meta")
    var meta: MetaResponseDetails? = null
}