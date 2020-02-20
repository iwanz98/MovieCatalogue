package com.wanztudio.idcamp.moviecatalogue.activities

import android.content.Intent
import android.os.Bundle
import android.provider.Settings
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.fragment.app.Fragment
import androidx.viewpager.widget.ViewPager
import com.google.android.material.appbar.AppBarLayout
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.wanztudio.idcamp.moviecatalogue.R
import com.wanztudio.idcamp.moviecatalogue.adapters.ViewPagerAdapter
import com.wanztudio.idcamp.moviecatalogue.fragments.FavoriteFragment
import com.wanztudio.idcamp.moviecatalogue.fragments.MovieFragment
import com.wanztudio.idcamp.moviecatalogue.fragments.TvShowFragment
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.toolbar

class MainActivity : AppCompatActivity() {

    private lateinit var pages: List<Fragment>
    private lateinit var pagerAdapter: ViewPagerAdapter

    private var prevMenuItem: MenuItem? = null

    private val titles = intArrayOf(
        R.string.title_movie,
        R.string.title_tvshow,
        R.string.title_favorite
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initViews()
    }

    private fun initViews() {
        setSupportActionBar(toolbar as Toolbar)
        supportActionBar?.title = getString(titles[0])
        setUpViewPager()
    }

    private fun setUpViewPager() {
        pages = arrayListOf(MovieFragment.newInstance(), TvShowFragment.newInstance(), FavoriteFragment.newInstance())
        pagerAdapter = ViewPagerAdapter(this, supportFragmentManager, pages)

        viewPager.offscreenPageLimit = 3
        viewPager.adapter = pagerAdapter
        viewPager.addOnPageChangeListener(object : ViewPager.OnPageChangeListener {
            override fun onPageScrollStateChanged(state: Int) {
            }

            override fun onPageScrolled(
                position: Int,
                positionOffset: Float,
                positionOffsetPixels: Int
            ) {
            }

            override fun onPageSelected(position: Int) {
                supportActionBar?.title = getString(titles[position])

                prevMenuItem?.let {
                    it.isChecked = false
                } ?: run {
                    bottomNavigationView.menu.getItem(0).isChecked = false
                }
                bottomNavigationView.menu.getItem(position).isChecked = true
                prevMenuItem = bottomNavigationView.menu.getItem(position)

                when (position) {
                    0, 1 -> expandToolbar(true)
                    else -> expandToolbar(false)
                }
            }
        })

        expandToolbar(true)
        bottomNavigationView.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)
    }

    private fun expandToolbar(expandToolbar: Boolean) {
        val params = toolbar.layoutParams as AppBarLayout.LayoutParams

        if (expandToolbar) {
            appbarLayout.setExpanded(true, true)
            params.scrollFlags = AppBarLayout.LayoutParams.SCROLL_FLAG_ENTER_ALWAYS
        } else {
            appbarLayout.setExpanded(false, true)
            params.scrollFlags =
                AppBarLayout.LayoutParams.SCROLL_FLAG_SCROLL or AppBarLayout.LayoutParams.SCROLL_FLAG_ENTER_ALWAYS
        }

        toolbar.layoutParams = params
    }

    private val mOnNavigationItemSelectedListener =
        BottomNavigationView.OnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.action_movie -> {
                    viewPager.setCurrentItem(0, true)
                    return@OnNavigationItemSelectedListener true
                }
                R.id.action_team -> {
                    viewPager.setCurrentItem(1, true)
                    return@OnNavigationItemSelectedListener true
                }
                R.id.action_favorite -> {
                    viewPager.setCurrentItem(2, true)
                    return@OnNavigationItemSelectedListener true
                }
            }
            false
        }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.action_main_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == R.id.action_setting) {
            val intent = Intent(Settings.ACTION_LOCALE_SETTINGS)
            startActivity(intent)
        }
        return super.onOptionsItemSelected(item)
    }
}