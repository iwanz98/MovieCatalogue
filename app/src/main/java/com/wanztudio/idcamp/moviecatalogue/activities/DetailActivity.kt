package com.wanztudio.idcamp.moviecatalogue.activities

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.bumptech.glide.Glide
import com.google.android.material.appbar.AppBarLayout
import com.wanztudio.idcamp.moviecatalogue.R
import com.wanztudio.idcamp.moviecatalogue.models.CreditResponse
import com.wanztudio.idcamp.moviecatalogue.models.Crew
import com.wanztudio.idcamp.moviecatalogue.models.Movie
import com.wanztudio.idcamp.moviecatalogue.networks.APIEndpoints
import com.wanztudio.idcamp.moviecatalogue.utils.Constants
import com.wanztudio.idcamp.moviecatalogue.utils.extension.formatToViewDateDefaults
import com.wanztudio.idcamp.moviecatalogue.utils.extension.gone
import com.wanztudio.idcamp.moviecatalogue.utils.extension.visible
import com.wanztudio.idcamp.moviecatalogue.viewmodels.DetailViewModel
import kotlinx.android.synthetic.main.activity_detail.*
import kotlinx.android.synthetic.main.toolbar.*
import kotlinx.android.synthetic.main.toolbar.toolbar
import java.util.*


class DetailActivity : AppCompatActivity() {

    private lateinit var detailViewModel: DetailViewModel
    private lateinit var languageRequest: String

    private var movie: Movie? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        readBundles()
        initData()
        initViews()
    }

    private fun readBundles() {
        movie = intent?.getParcelableExtra(Constants.EXTRA_MOVIE)
    }

    private fun initData() {
        val language = Locale.getDefault().language.toString()
        languageRequest = (if (language.contentEquals("in")) "id" else "en-US")
    }

    @SuppressLint("StringFormatInvalid")
    private fun initViews() {
        setSupportActionBar(toolbar)
        supportActionBar?.apply {
            setDisplayHomeAsUpEnabled(true)
            setHomeButtonEnabled(true)
            setDisplayShowTitleEnabled(false)
        }

        appbarLayout.addOnOffsetChangedListener(object : AppBarLayout.OnOffsetChangedListener {
            var isShow = false
            var scrollRange = -1

            override fun onOffsetChanged(appBarLayout: AppBarLayout, verticalOffset: Int) {
                if (scrollRange == -1) {
                    scrollRange = appBarLayout.totalScrollRange
                }

                if (scrollRange + verticalOffset == 0) {
                    isShow = true
                    titleToolbar.text = movie?.title
                } else if (isShow) {
                    isShow = false
                    titleToolbar.text = getString(R.string.title_detail_movie)
                }
            }
        })

        movie?.let {
            titleToolbar.text = getString(R.string.title_detail_movie)

            Glide.with(this).load(APIEndpoints.THUMBNAIL_URL + it.posterPath).into(imgThumbnail)

            tvTitleMovie.text = if (!it.title.isNullOrBlank()) it.title else it.originalName
            tvReleaseDate.text = if (it.releaseDate != null) {
                it.releaseDate.formatToViewDateDefaults()
            } else it.firstAirDate?.formatToViewDateDefaults()

            tvUserScore.text = getString(R.string.dummy_user_score, it.voteAverage)
            tvOverview.text = it.overview
        }

        detailViewModel = ViewModelProvider(this).get(DetailViewModel::class.java)
        detailViewModel.requestMovies(movie?.id.toString(), languageRequest)
        detailViewModel.getCreditResponse().observe(this,
            Observer<CreditResponse> {
                for (crew in it.crew) {
                    containerCrew.addView(generateViewCrew(crew))
                }
                progressBar.gone()
            })

        progressBar.visible()
    }

    private fun generateViewCrew(crew: Crew): View {
        val view = View.inflate(this, R.layout.view_info_crew, null)
        val tvCrewName = view.findViewById<TextView>(R.id.tvCrewName)
        val tvCrewRole = view.findViewById<TextView>(R.id.tvCrewRole)

        tvCrewName.text = getString(R.string.caption_crew_name, crew.name)
        tvCrewRole.text = crew.job
        return view
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return super.onSupportNavigateUp()
    }
}