package com.example.poketeste

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager
import com.example.poketeste.viewpager.adapter.ViewPagerAdapter
import com.example.poketeste.viewpager.calls.CallsFragment
import com.example.poketeste.viewpager.chat.ChatFragment
import com.example.poketeste.viewpager.status.StatusFragment
import com.google.android.material.tabs.TabLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val chatFragment = ChatFragment()
        val statusFragment = StatusFragment()
        val callsFragment = CallsFragment()

        val viewPager = findViewById<ViewPager>(R.id.viewPager)
        val tabLayout = findViewById<TabLayout>(R.id.tabLayout)

        tabLayout.setupWithViewPager(viewPager)

        val fragments = listOf(chatFragment, statusFragment, callsFragment)
        val titles = listOf("Chats","Status","Calls")

        viewPager.adapter = ViewPagerAdapter(fragments, titles, supportFragmentManager)
    }
}