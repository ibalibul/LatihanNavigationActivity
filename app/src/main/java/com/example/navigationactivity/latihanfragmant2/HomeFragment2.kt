package com.example.navigationactivity.latihanfragmant2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.navigationactivity.R
import kotlinx.android.synthetic.main.fragment_home2.*


class HomeFragment2 : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home2, container, false)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        tvProfile.setOnClickListener{
            Navigation.findNavController(view).navigate(R.id.action_homeFragment2_to_profileFragment2)
        }
        btnHitung2.setOnClickListener{

            var tahunSekarang = 2022
             var dataumur = edInputumur.text.toString().toInt()
            var hasil = (tahunSekarang - dataumur)
             var bund = Bundle()
             bund.putInt("dataumur",dataumur)
            bund.putInt("datahasil",hasil)

            Navigation.findNavController(view).navigate(R.id.action_homeFragment2_to_hasilFragment2,bund)

        }
    }

}