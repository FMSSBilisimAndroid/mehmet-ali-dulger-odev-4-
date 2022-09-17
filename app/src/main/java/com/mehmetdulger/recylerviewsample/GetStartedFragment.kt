package com.mehmetdulger.recylerviewsample

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.mehmetdulger.recylerviewsample.databinding.FragmentGetStartedBinding

class GetStartedFragment : Fragment() {

    private lateinit var fragmentGetStartedBinding: FragmentGetStartedBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        fragmentGetStartedBinding = FragmentGetStartedBinding.inflate(inflater)
        return fragmentGetStartedBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }
}