package com.mehmetdulger.recylerviewsample

import android.graphics.drawable.Drawable
import android.widget.ImageView
import androidx.core.net.toUri
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import retrofit2.Response.error

class DataBindingAdapter {

     companion object {
         @JvmStatic
         @BindingAdapter("imageResource")
         fun setImageResource(imageView: ImageView, resource: Int) {
             imageView.setImageResource(resource)
         }
     }



}