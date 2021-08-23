package com.soppo.soppo.view.findTeam

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.soppo.soppo.R

class FindTeamFragment : Fragment() {

    companion object {
        fun newInstance() = FindTeamFragment()
    }

    private lateinit var viewModel: FindTeamViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.find_team_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(FindTeamViewModel::class.java)
        // TODO: Use the ViewModel
    }

}