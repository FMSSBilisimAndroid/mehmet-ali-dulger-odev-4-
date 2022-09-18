package com.mehmetdulger.recylerviewsample

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.navigation.fragment.navArgs
import com.bumptech.glide.Glide
import com.mehmetdulger.recylerviewsample.databinding.FragmentDetailBinding

class DetailFragment : Fragment() {

    private lateinit var detailBinding: FragmentDetailBinding
    private val args: DetailFragmentArgs by navArgs()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        detailBinding = FragmentDetailBinding.inflate(inflater)
        return detailBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val price = args.currentRealEstateData.price
        val id = args.currentRealEstateData.id
        val type = args.currentRealEstateData.type
        val img_src = args.currentRealEstateData.img_src


        detailBinding.apply {
            piriceDetailTextView.text = price
            idDetailTextView.text=id
            typeDetailTextView.text=type
            detailimageView.load(img_src)

        }
        
    }
    fun ImageView.load(url: String) {
        Glide.with(context)
            .load(url)
            .into(this)
    }

}