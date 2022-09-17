package com.mehmetdulger.recylerviewsample

import android.app.Application
import android.util.Log
import android.widget.ImageView
import android.widget.Toast
import androidx.databinding.ViewDataBinding
import androidx.navigation.Navigation
import androidx.navigation.fragment.NavHostFragment.Companion.findNavController
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.mehmetdulger.recylerviewsample.databinding.FragmentCatalogBinding
import com.mehmetdulger.recylerviewsample.databinding.RecyclerItemBinding

class RecyclerItemViewHolder(
    val realEstateBinding: ViewDataBinding,
) : RecyclerView.ViewHolder(realEstateBinding.root) {

    fun onBind(
        realEstateData: RealEstateData,
        onItemClickHandler: (realEstateData: RealEstateData) -> Unit
    ) {
        val binding = realEstateBinding as RecyclerItemBinding
        binding.root.setOnClickListener { onItemClickHandler(realEstateData) }

        binding.imageView.load(realEstateData.img_src)

        binding.imageView.setOnClickListener {
           onItemClickHandler(realEstateData)
        }

        binding.setVariable(BR.realEstateData, realEstateData)
    }
    fun ImageView.load(url: String) {
        Glide.with(context)
            .load(url)
            .into(this)
    }

}