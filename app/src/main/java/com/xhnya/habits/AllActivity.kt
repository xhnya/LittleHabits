package com.xhnya.habits

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.github.florent37.materialviewpager.MaterialViewPager


class AllActivity : AppCompatActivity() {
    private var mViewPager: MaterialViewPager? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_all)

        mViewPager =  findViewById(R.id.materialViewPager);
    }
}