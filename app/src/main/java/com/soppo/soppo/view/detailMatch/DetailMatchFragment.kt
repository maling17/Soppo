package com.soppo.soppo.view.detailMatch

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.soppo.soppo.R

class DetailMatchFragment : Fragment() {

    companion object {
        fun newInstance() = DetailMatchFragment()
    }

    private lateinit var viewModel: DetailMatchViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.detail_match_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(DetailMatchViewModel::class.java)
        // TODO: Use the ViewModel
    }

}