package com.mehmetdulger.recylerviewsample

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.recyclerview.widget.RecyclerView

class RecyclerviewAdapter(
    private val list: List<RealEstateData>,
    private val onItemClickHandler: (realEstateData: RealEstateData) -> Unit
) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val realEstateDataBinding = DataBindingUtil.inflate<ViewDataBinding>(
            LayoutInflater.from(parent.context), R.layout.recycler_item, parent, false
        )
        return RecyclerItemViewHolder(realEstateDataBinding)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        (holder as RecyclerItemViewHolder).onBind(list.get(position), onItemClickHandler)
    }

    override fun getItemCount(): Int {
        return list.size
    }

}

