package com.kang.coronacheck

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.MenuItem
import com.google.android.material.bottomnavigation.BottomNavigationView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), BottomNavigationView.OnNavigationItemSelectedListener {

    private lateinit var homeFragment: HomeFragment
    private lateinit var newsFragment : NewsFragment
    private lateinit var personFragment : PersonFragment

    companion object{
        const val TAG : String = "로그"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d(TAG, "MainActivity - onCreate() called")

        navigation.setOnNavigationItemSelectedListener(this)
        homeFragment = HomeFragment.newInstance()
        supportFragmentManager.beginTransaction().replace(R.id.frame, homeFragment).commit()

    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.action_main -> {
                Log.d(TAG, "MainActivity - 홈버튼 클릭")
                homeFragment = HomeFragment.newInstance()
                supportFragmentManager.beginTransaction().replace(R.id.frame, homeFragment).commit()
            }
            R.id.action_news ->{
                Log.d(TAG, "MainActivity - 뉴스버튼 클릭")
                newsFragment = NewsFragment.newInstance()
                supportFragmentManager.beginTransaction().replace(R.id.frame, newsFragment).commit()
            }
            R.id.action_person->{
                Log.d(TAG, "MainActivity - 실시간 클릭")
                personFragment = PersonFragment.newInstance()
                supportFragmentManager.beginTransaction().replace(R.id.frame, personFragment).commit()
            }
        }
        return true
    }
}
