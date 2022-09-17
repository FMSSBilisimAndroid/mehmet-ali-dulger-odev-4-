package com.mehmetdulger.recylerviewsample

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.GridLayoutManager
import com.mehmetdulger.recylerviewsample.databinding.FragmentCatalogBinding
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class CatalogFragment : Fragment() {

    private lateinit var catalogBinding: FragmentCatalogBinding
    lateinit var list: List<RealEstateData>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        catalogBinding = FragmentCatalogBinding.inflate(inflater)
        return catalogBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        MarsApi.retrofitService.getProperties().enqueue(object : Callback<List<RealEstateData>> {
            override fun onResponse(
                call: Call<List<RealEstateData>>,
                response: Response<List<RealEstateData>>
            ) {
                response.body()?.let { responseList ->

                    val adapter = RecyclerviewAdapter(responseList) { item ->
                        //yazılacak
                    }

                    val gridLayoutManager = GridLayoutManager(context, 2)
                    catalogBinding.apply {
                        recyclerView.layoutManager = gridLayoutManager
                        recyclerView.addItemDecoration(SpacesItemDecoration(20))
                        setVariable(BR.adapter, adapter)
                    }

                }
            }

            override fun onFailure(call: Call<List<RealEstateData>>, t: Throwable) {
                Log.v("ERROR", t.message.toString())
            }

        })


    }

}