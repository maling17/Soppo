package com.soppo.soppo.view.detailArticle

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.soppo.soppo.R

class DetailArticleFragment : Fragment() {

    companion object {
        fun newInstance() = DetailArticleFragment()
    }

    private lateinit var viewModel: DetailArticleViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.detail_article_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(DetailArticleViewModel::class.java)
        // TODO: Use the ViewModel
    }

}