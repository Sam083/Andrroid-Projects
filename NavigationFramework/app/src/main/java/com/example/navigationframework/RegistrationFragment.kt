package com.example.navigationframework

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.navigation.fragment.findNavController


/**
 * A simple [Fragment] subclass.
 * Use the [RegistrationFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class RegistrationFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view =  inflater.inflate(R.layout.fragment_registration, container, false)
        val login = view.findViewById<Button>(R.id.loginBtn)
        val main = view.findViewById<Button>(R.id.skipBtn);
        login.setOnClickListener{findNavController().navigate(R.id.action_registrationFragment2_to_loginFragment)}
        main.setOnClickListener{findNavController().navigate(R.id.action_registrationFragment2_to_mainFragment)}
        return view;
    }

}

