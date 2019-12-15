package com.wanztudio.idcamp.moviecatalogue.activities

import android.annotation.SuppressLint
import android.os.Bundle
import android.os.Handler
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.wanztudio.idcamp.moviecatalogue.R
import com.wanztudio.idcamp.moviecatalogue.models.Crew
import com.wanztudio.idcamp.moviecatalogue.models.Movie
import com.wanztudio.idcamp.moviecatalogue.utils.Constants
import com.wanztudio.idcamp.moviecatalogue.utils.extension.formatToViewDateDefaults
import kotlinx.android.synthetic.main.activity_detail.*
import kotlinx.android.synthetic.main.toolbar.*
import kotlinx.android.synthetic.main.toolbar.toolbar

class DetailActivity : AppCompatActivity() {

    private var movie: Movie? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        readBundles()
        initViews()
    }

    private fun readBundles() {
        movie = intent?.getParcelableExtra(Constants.EXTRA_MOVIE)
    }

    @SuppressLint("StringFormatInvalid")
    private fun initViews() {
        setSupportActionBar(toolbar)
        supportActionBar?.apply {
            setDisplayHomeAsUpEnabled(true)
            setHomeButtonEnabled(true)
            setDisplayShowTitleEnabled(false)
        }

        movie?.let {
            titleToolbar.text = getString(R.string.title_detail_movie)

            Glide.with(this).load(it.thumbnail).into(imgThumbnail)

            tvTitleMovie.text = it.title
            tvReleaseDate.text = it.releaseDate.formatToViewDateDefaults()
            tvUserScore.text = getString(R.string.dummy_user_score, it.score)
            tvOverview.text = it.overview

            for (crew in it.crews) {
                containerCrew.addView(generateViewCrew(crew))
            }
        } ?: run {
            Toast.makeText(this, getString(R.string.alert_failed_load_data), Toast.LENGTH_SHORT).show()
            Handler().postDelayed({ finish() }, 2000)
        }
    }

    private fun generateViewCrew(crew: Crew) : View {
        val view = View.inflate(this, R.layout.view_info_crew, null)
        val tvCrewName = view.findViewById<TextView>(R.id.tvCrewName)
        val tvCrewRole = view.findViewById<TextView>(R.id.tvCrewRole)

        tvCrewName.text = "- ${crew.name}"
        tvCrewRole.text = crew.role
        return view
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return super.onSupportNavigateUp()
    }
}