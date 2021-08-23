
package com.soppo.soppo.view.editTeam

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.soppo.soppo.R

class EditTeamFragment : Fragment() {

    companion object {
        fun newInstance() = EditTeamFragment()
    }

    private lateinit var viewModel: EditTeamViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.edit_team_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(EditTeamViewModel::class.java)
        // TODO: Use the ViewModel
    }

}