package com.example.taily.ui.treatments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.taily.databinding.FragmentAppointmentsBinding
import com.example.taily.databinding.FragmentTreatmentsBinding

class TreatmentsFragment : Fragment() {

    private var _binding: FragmentTreatmentsBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View {
        val appointmentsViewModel =
                ViewModelProvider(this).get(TreatmentsViewModel::class.java)

        _binding = FragmentTreatmentsBinding.inflate(inflater, container, false)
        val root: View = binding.root


        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}