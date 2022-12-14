package com.example.lapor_yuk

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager

// TODO: Rename parameter arguments, choose names that match
class FirstFragment : Fragment(R.layout.fragment_first) {

//    private lateinit var rvdata: RecyclerView
//    private var list = ArrayList<DataHome>()
    private val layoutmanager = LinearLayoutManager(context)
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?

    ): View? {

        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

//        rvdata = view.findViewById(R.id.rv_data)
//        rvdata.setHasFixedSize(true)
//        rvdata.layoutManager
      // rvdata.layoutManager = LinearLayoutManager(context,LinearLayoutManager.HORIZONTAL,false)
//        list.addAll(listdata)
//        showRecyclerList()
    }

//    val listdata: ArrayList<DataHome>
//        get() {
//            val dataJudul = nama
//            val dataPhoto = gambar
//            val listMovie = ArrayList<DataHome>()
//            for (i in dataJudul.indices) {
//                val data = DataHome(dataJudul[i], dataPhoto[i])
//                listMovie.add(data)
//            }
//            return listMovie
//        }

    private fun showRecyclerList() {
//        rvdata.layoutManager = layoutmanager
//        rvdata.layoutManager= LinearLayoutManager(context,LinearLayoutManager.HORIZONTAL,false)
//        val listMovieAdapter = DataAdapter(list)
//        rvdata.adapter = listMovieAdapter
//
//        if(context?.applicationContext?.resources?.configuration?.orientation== Configuration.ORIENTATION_PORTRAIT){
//            //rvdata.layoutManager= GridLayoutManager(context,3)
//            rvdata.layoutManager= LinearLayoutManager(context,LinearLayoutManager.HORIZONTAL,false)
//        }
//        val listMovieAdapter = DataAdapter(list)
//        rvdata.adapter = listMovieAdapter
    }

}