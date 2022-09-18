package com.mehmetdulger.recylerviewsample

import android.os.Bundle
import android.text.SpannableString
import android.text.Spanned
import android.text.style.TextAppearanceSpan
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
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


        fragmentGetStartedBinding.apply {
            getStartedButton.setOnClickListener {
                findNavController().navigate(R.id.action_getStartedFragment_to_catalogFragment)
            }
            titleTextView.text = getString(R.string.lets_explore)
            setTextStyleSpan(titleTextView, 18, 30, R.style.title_black_style)
            setTextStyleSpan(titleTextView, 17, 30, R.style.title_orange_style)
            setTextStyleSpan(titleTextView, 36, 44, R.style.title_orange_style)
        }

    }

    private fun setTextStyleSpan(
        textView: TextView,
        startPosition: Int,
        endPosition: Int,
        style: Int
    ) {
        val spannableStr = SpannableString(textView.text)
        spannableStr.setSpan(
            TextAppearanceSpan(context, style),
            startPosition,
            endPosition,
            Spanned.SPAN_INCLUSIVE_EXCLUSIVE
        )
        textView.text = spannableStr
    }
}