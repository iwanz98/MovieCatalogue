package com.wanztudio.idcamp.moviecatalogue.fragments

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.DefaultItemAnimator
import androidx.recyclerview.widget.LinearLayoutManager
import com.wanztudio.idcamp.moviecatalogue.R
import com.wanztudio.idcamp.moviecatalogue.activities.DetailActivity
import com.wanztudio.idcamp.moviecatalogue.adapters.MovieAdapter
import com.wanztudio.idcamp.moviecatalogue.database.AppDatabase
import com.wanztudio.idcamp.moviecatalogue.models.Movie
import com.wanztudio.idcamp.moviecatalogue.utils.Constants
import com.wanztudio.idcamp.moviecatalogue.utils.extension.OnItemClickListener
import com.wanztudio.idcamp.moviecatalogue.utils.extension.addOnItemClickListener
import com.wanztudio.idcamp.moviecatalogue.utils.extension.gone
import com.wanztudio.idcamp.moviecatalogue.utils.extension.visible
import com.wanztudio.idcamp.moviecatalogue.viewmodels.MovieViewModel
import kotlinx.android.synthetic.main.fragment_movie.*
import java.util.*

class FavMovieFragment : Fragment() {

    private lateinit var languageRequest: String
    private lateinit var movieAdapter: MovieAdapter
    private lateinit var movieViewModel: MovieViewModel

    private var listMovies = listOf<Movie>()

    companion object {

        fun newInstance(): FavMovieFragment {
            return FavMovieFragment()
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View = inflater.inflate(R.layout.fragment_movie, container, false)


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initData()
        initViews()
    }

    private fun initData() {
        val language = Locale.getDefault().language.toString()
        languageRequest = (if (language.contentEquals("in")) "id" else "en-US")

        movieAdapter = MovieAdapter(requireContext(), arrayListOf())
    }

    private fun initViews() {
        rvMovie.apply {
            layoutManager = LinearLayoutManager(requireContext())
            itemAnimator = DefaultItemAnimator()
            setHasFixedSize(true)
            addOnItemClickListener(object : OnItemClickListener {
                override fun onItemClicked(position: Int, view: View) {
                    val intent = Intent(requireContext(), DetailActivity::class.java)
                    intent.putExtra(Constants.EXTRA_MOVIE, listMovies[position])
                    startActivity(intent)
                }
            })
        }.adapter = movieAdapter

        movieViewModel = ViewModelProvider(this).get(MovieViewModel::class.java)
        movieViewModel.getListMovies().observe(viewLifecycleOwner,
            Observer<List<Movie>> { result ->
                result?.let {
                    listMovies = it
                    movieAdapter.updateListMovies(listMovies)
                    progressBar.gone()
                    if (listMovies.isEmpty()) tvEmptyData.visible() else tvEmptyData.gone()
                }
            })

        progressBar.visible()
    }

    private fun loadFavMovies(): List<Movie> =
        AppDatabase(requireContext()).movieDao().getMoviesByType(Constants.TYPE_MOVIE)

    override fun onResume() {
        super.onResume()
        movieViewModel.setFavMovies(loadFavMovies())
    }
}