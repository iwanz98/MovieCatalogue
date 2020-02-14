package com.wanztudio.idcamp.catalogue.adapters

import android.content.Context
import android.graphics.drawable.Drawable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.makeramen.roundedimageview.RoundedImageView
import com.wanztudio.idcamp.moviecatalogue.R
import com.wanztudio.idcamp.moviecatalogue.models.Movie
import com.wanztudio.idcamp.moviecatalogue.utils.extension.formatToViewDateDefaults
import kotlinx.android.extensions.LayoutContainer
import kotlinx.android.synthetic.main.list_item_movie.*

class MovieAdapter(private val context: Context, private val items: List<Movie>) :
    RecyclerView.Adapter<MovieAdapter.MovieViewHolder>() {

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
                Glide.with(itemView).load(movie.thumbnail).into(imgThumbnail)

                tvTitleMovie.text = movie.title
                tvReleaseDate.text = movie.releaseDate.formatToViewDateDefaults()
                tvOverview.text = movie.overview
        }
    }
}