package com.example.homework3_6

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup


class BlankFragment1 : Fragment() {
    private lateinit var binding: Fragment_Blink_Binding
    private  lateinit var movieAdapter: movieAdapter
    private  var movieList= ArrayList<Movie>()


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = Fragment_Blik_Binding.inflate(inflater, container, false)
        return binding.root    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        loadData()
        movieAdapter = movieAdapter(movieList)
        binding.rvAnime.adapter = movieAdapter
    }
    private fun loadData(){
        movieList.add(Movie("https://thumbs.dfs.ivi.ru/storage9/contents/0/7/b918e9457f07b12e6ee666adb5bae2.jpg/234x360/?q=85","women","1-20"))
        movieList.add(Movie("https://static.hdrezka.ac/i/2022/6/26/s3682bb41b7b1lb63v26t.jpg","women","1-20"))
        movieList.add(Movie("https://static.hdrezka.ac/i/2021/3/6/f94a8d30ee89bsc62w90d.jpeg","women","1-20"))
        movieList.add(Movie("https://static.hdrezka.ac/i/2023/7/11/db9bdb2bc3993rx95g34j.jpg","women","1-20"))
        movieList.add(Movie("https://static.hdrezka.ac/i/2023/4/5/y56159479507byo60h41x.jpg","women","1-20"))
    }


}