package com.wanztudio.idcamp.moviecatalogue.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.wanztudio.idcamp.moviecatalogue.R
import com.wanztudio.idcamp.moviecatalogue.adapters.ViewPagerAdapter
import kotlinx.android.synthetic.main.fragment_favorite.*

class FavoriteFragment : Fragment() {

    private lateinit var pages: List<Fragment>
    private lateinit var pagerAdapter: ViewPagerAdapter

    private val titles = intArrayOf(
        R.string.title_fav_movie,
        R.string.title_fav_tvshow
    )

    companion object {

        fun newInstance(): FavoriteFragment {
            return FavoriteFragment()
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View = inflater.inflate(R.layout.fragment_favorite, container, false)


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initViews()
    }

    private fun initViews() {
        pages = arrayListOf(FavMovieFragment.newInstance(), FavTvShowFragment.newInstance())
        pagerAdapter = ViewPagerAdapter(requireContext(), childFragmentManager, pages, titles.toList())
        viewPager.adapter = pagerAdapter
        tabLayout.setupWithViewPager(viewPager)
    }

}