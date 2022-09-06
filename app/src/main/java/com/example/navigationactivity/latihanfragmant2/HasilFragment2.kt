package com.example.navigationactivity.latihanfragmant2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.example.navigationactivity.R
import kotlinx.android.synthetic.main.fragment_hasil2.*


class HasilFragment2 : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_hasil2, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

//        mengambil data dari fragmant 2
        var getUmur = arguments?.getInt("dataumur")
        var gethasil = arguments?.getInt("datahasil")
//        set data umur ke dalam textview
        tvumurhasilsaya.text = gethasil.toString()




        Toast.makeText(context,"Umur Saya ", Toast.LENGTH_LONG).show()
    }


}