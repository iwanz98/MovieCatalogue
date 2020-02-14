package com.wanztudio.idcamp.moviecatalogue.activities

import android.content.Intent
import android.os.Bundle
import android.provider.Settings
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.fragment.app.Fragment
import com.wanztudio.idcamp.moviecatalogue.R
import com.wanztudio.idcamp.moviecatalogue.adapters.ViewPagerAdapter
import com.wanztudio.idcamp.moviecatalogue.fragments.MovieFragment
import com.wanztudio.idcamp.moviecatalogue.fragments.TvShowFragment
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.toolbar
import kotlinx.android.synthetic.main.toolbar.*

class MainActivity : AppCompatActivity() {

    private lateinit var pages: List<Fragment>
    private lateinit var pagerAdapter: ViewPagerAdapter

    private val titles = intArrayOf(
        R.string.title_movie,
        R.string.title_tvshow
    )

    private val tabIcons = arrayListOf(
        R.drawable.ic_movie,
        R.drawable.ic_tvshow
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initViews()
    }

    private fun initViews() {
        titleToolbar.text = getString(R.string.app_name)
        setSupportActionBar(toolbar as Toolbar)
        supportActionBar?.title = ""

        setUpViewPager()
        setUpTabs()
    }

    private fun setUpViewPager() {
        pages = arrayListOf(MovieFragment.newInstance(), TvShowFragment.newInstance())
        pagerAdapter = ViewPagerAdapter(this, supportFragmentManager, pages, titles.toList())
        viewPager.adapter = pagerAdapter
    }

    private fun setUpTabs(){
        // set tab icons
        tabLayout.getTabAt(0)?.setIcon(tabIcons[0])
        tabLayout.getTabAt(1)?.setIcon(tabIcons[1])

        tabLayout.setupWithViewPager(viewPager)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main_menu, menu)
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