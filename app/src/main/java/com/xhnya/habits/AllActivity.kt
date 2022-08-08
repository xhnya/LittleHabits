package com.xhnya.habits

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.Navigation
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.NavigationUI
import com.github.florent37.materialviewpager.MaterialViewPager
import com.google.android.material.bottomnavigation.BottomNavigationView


class AllActivity : AppCompatActivity() {
    private var mViewPager: MaterialViewPager? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_all)

        mViewPager =  findViewById(R.id.materialViewPager);



    }
}