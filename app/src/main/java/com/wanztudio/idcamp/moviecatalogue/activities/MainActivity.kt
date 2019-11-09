package com.wanztudio.idcamp.moviecatalogue.activities

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import androidx.appcompat.app.AppCompatActivity
import com.wanztudio.idcamp.catalogue.adapters.MovieAdapter
import com.wanztudio.idcamp.moviecatalogue.R
import com.wanztudio.idcamp.moviecatalogue.models.Movie
import com.wanztudio.idcamp.moviecatalogue.utils.Constants
import com.wanztudio.idcamp.moviecatalogue.utils.MovieProvider
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.toolbar.*

class MainActivity : AppCompatActivity() {

    private lateinit var listMovie : List<Movie>
    private lateinit var movieAdapter: MovieAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initData()
        initViews()
    }

    private fun initData(){
        listMovie = MovieProvider.generateMovies()
        movieAdapter = MovieAdapter(this, listMovie)
    }

    private fun initViews() {
        titleToolbar.text = getString(R.string.app_name)

        listView.apply {
            adapter = movieAdapter
            setOnItemClickListener { parent, view, position, id ->
                val intent = Intent(this@MainActivity, DetailActivity::class.java)
                intent.putExtra(Constants.EXTRA_MOVIE, listMovie[position])
                startActivity(intent)
            }
        }
    }
}