package com.mehmetdulger.recylerviewsample

import androidx.databinding.ViewDataBinding
import androidx.recyclerview.widget.RecyclerView
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

        val realEstateDataClicked = RealEstateData(
            "right bottom clicked",
            "right bottom clicked",
            "right bottom clicked",
            0
        )

        binding.imageView.setOnClickListener { onItemClickHandler(realEstateDataClicked) }
        binding.setVariable(BR.realEstateData, realEstateData)
    }

}