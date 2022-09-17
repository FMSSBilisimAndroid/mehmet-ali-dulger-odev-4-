package com.mehmetdulger.recylerviewsample

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class RealEstateData(
    var price: String,
    var id: String,
    var type: String,
    val img_src: String
) : Parcelable