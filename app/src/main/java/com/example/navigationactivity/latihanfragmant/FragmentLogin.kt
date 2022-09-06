package com.example.navigationactivity.latihanfragmant

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import com.example.navigationactivity.R
import kotlinx.android.synthetic.main.fragment_login.*
import kotlinx.android.synthetic.main.fragment_register2.*

class FragmentLogin : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_login, container, false)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        btnlogin.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_fragmentLogin_to_fragmentHome)
        }
        tvlupapassword.setOnClickListener{
            Navigation.findNavController(view).navigate(R.id.action_fragmentLogin_to_lupaPasswordFragment)
        }
        tvRegsiter.setOnClickListener{
            Navigation.findNavController(view).navigate(R.id.action_fragmentLogin_to_fragmentRegister)
        }
        btnChat.setOnClickListener{
            Navigation.findNavController(view).navigate(R.id.action_fragmentLogin_to_chatFragment)
        }
        btnHelp.setOnClickListener{
            Navigation.findNavController(view).navigate(R.id.action_fragmentLogin_to_fragmentHelp)
        }
    }
}