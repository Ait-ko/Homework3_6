package com.example.homework3_6

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.bumptech.glide.Glide
import com.example.homework3_6.databinding.ItemAnimeBinding

class movieAdapter (var movieList: ArrayList<Movie>): RecyclerView.Adapter<movieAdapter.movieHolder>(){


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): movieHolder {
        return movieHolder(ItemAnimeBinding.inflate(LayoutInflater.from(parent.context),parent, false))
    }

    override fun getItemCount(): Int {
        return movieList.size
    }

    override fun onBindViewHolder(holder: movieHolder, position: Int) {
        holder.bind(movieList[position])
    }

    inner class movieHolder(private var binding: ItemAnimeBinding):ViewHolder(binding.root) {
        fun bind(movie: Movie){
            binding.tvAnimeName.text =movie.movieName
            binding.tvEpisodes.text = movie.episodes
            Glide.with(binding.ivMoviePicture).load(movie.moviePicture).into(binding.ivMoviePicture)
        }

    }
}