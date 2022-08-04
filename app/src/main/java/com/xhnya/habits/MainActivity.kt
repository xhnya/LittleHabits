package com.xhnya.habits

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.NavigationUI
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.jaeger.library.StatusBarUtil


class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //设置状态栏为全透明
        StatusBarUtil.setTransparent(this@MainActivity)

        //底部导航栏
        // 获取页面上的底部导航栏控件
        val navView = findViewById<BottomNavigationView>(R.id.nav_view)

        // 配置navigation与底部菜单之间的联系
        // 底部菜单的样式里面的item里面的ID与navigation布局里面指定的ID必须相同，否则会出现绑定失败的情况
        val appBarConfiguration = AppBarConfiguration.Builder(
                R.id.navigation_today, R.id.navigation_all, R.id.navigation_user)
                .build()
        // 建立fragment容器的控制器，这个容器就是页面的上的fragment容器
        val navController = Navigation.findNavController(this, R.id.nav_host_fragment)

        // 启动
        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration)
        NavigationUI.setupWithNavController(navView, navController)


    }
}