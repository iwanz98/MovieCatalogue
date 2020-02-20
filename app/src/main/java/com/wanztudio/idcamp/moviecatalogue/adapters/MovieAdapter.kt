package com.wanztudio.idcamp.moviecatalogue.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.wanztudio.idcamp.moviecatalogue.R
import com.wanztudio.idcamp.moviecatalogue.models.Movie
import com.wanztudio.idcamp.moviecatalogue.network.APIEndpoints
import com.wanztudio.idcamp.moviecatalogue.utils.extension.formatToViewDateDefaults
import kotlinx.android.extensions.LayoutContainer
import kotlinx.android.synthetic.main.list_item_movie.*

class MovieAdapter(private val context: Context, private var items: List<Movie>) :
    RecyclerView.Adapter<MovieAdapter.MovieViewHolder>() {

    fun updateListMovies(newListMovie: List<Movie>){
        items = newListMovie
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieViewHolder =
        MovieViewHolder(
            LayoutInflater.from(context).inflate(
                R.layout.list_item_movie,
                parent,
                false
            )
        )

    override fun onBindViewHolder(holder: MovieViewHolder, position: Int) {
        holder.bindItem(items[position])
    }

    override fun getItemCount(): Int = items.size

    inner class MovieViewHolder(override val containerView: View) :
        RecyclerView.ViewHolder(containerView),
        LayoutContainer {

        fun bindItem(movie: Movie) {
                Glide.with(itemView)
                    .load(APIEndpoints.THUMBNAIL_URL + movie.posterPath)
                    .into(imgThumbnail)

                tvTitleMovie.text = if (!movie.title.isNullOrBlank()) movie.title else movie.originalName
                tvReleaseDate.text = if (movie.releaseDate != null) {
                    movie.releaseDate.formatToViewDateDefaults()
                } else movie.firstAirDate?.formatToViewDateDefaults()

                tvOverview.text = movie.overview
        }
    }
}