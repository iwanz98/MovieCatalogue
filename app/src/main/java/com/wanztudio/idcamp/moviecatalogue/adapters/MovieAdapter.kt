package com.wanztudio.idcamp.catalogue.adapters

import android.content.Context
import android.graphics.drawable.Drawable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat
import com.bumptech.glide.Glide
import com.makeramen.roundedimageview.RoundedImageView
import com.wanztudio.idcamp.moviecatalogue.R
import com.wanztudio.idcamp.moviecatalogue.models.Movie
import com.wanztudio.idcamp.moviecatalogue.utils.extension.formatToViewDateDefaults

class MovieAdapter(private val context: Context, private val listMovie: List<Movie>) : BaseAdapter() {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View? {
        var view = convertView
        var viewHolder : ViewHolder?

        if (view == null){
            view = LayoutInflater.from(context).inflate(R.layout.list_item_movie, parent, false).also {
                viewHolder = ViewHolder(it)
                it.tag = viewHolder
            }
        }else{
            viewHolder = view.tag as ViewHolder
        }

        val movie = listMovie[position]
        viewHolder?.onBind(movie)

        return view
    }

    override fun getItem(position: Int): Any {
        return listMovie[position]
    }

    override fun getItemId(position: Int): Long {
        return listMovie[position].id
    }

    override fun getCount(): Int {
        return listMovie.size
    }

    private inner class ViewHolder constructor(private val view: View) {
        private val imgThumbnail = view.findViewById<RoundedImageView>(R.id.imgThumbnail)
        private val tvTitleMovie = view.findViewById<TextView>(R.id.tvTitleMovie)
        private val tvReleaseDate = view.findViewById<TextView>(R.id.tvReleaseDate)
        private val tvOverview = view.findViewById<TextView>(R.id.tvOverview)

        internal fun onBind(movie: Movie) {
            Glide.with(view).load(movie.thumbnail).into(imgThumbnail)

            tvTitleMovie.text = movie.title
            tvReleaseDate.text = movie.releaseDate.formatToViewDateDefaults()
            tvOverview.text = movie.overview
        }
    }
}