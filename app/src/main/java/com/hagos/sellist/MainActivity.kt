package com.hagos.sellist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.google.firebase.analytics.FirebaseAnalytics
import com.hagos.sellist.databinding.ActivityMainBinding
import java.util.*

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    lateinit var firebaseAnalytics: FirebaseAnalytics
    val dateTime = Date()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        //initialize firebase analytics
        firebaseAnalytics = FirebaseAnalytics.getInstance(this)

        binding.web.setOnClickListener {
            val param = Bundle()
            param.putString("Web", "Web | ${dateTime.time}")
            firebaseAnalytics.logEvent("Product_Detail", param)
            Toast.makeText(this, "Web Clicked", Toast.LENGTH_SHORT).show()
        }


        binding.sponsored.setOnClickListener {
            val param = Bundle()
            param.putString("Sponsored", "Sponsored | ${dateTime.time}")
            firebaseAnalytics.logEvent("Product_Detail", param)
            Toast.makeText(this, "Sponsored Clicked", Toast.LENGTH_SHORT).show()
        }


        binding.featured.setOnClickListener {
            val param = Bundle()
            param.putString("Featured", "Featured | ${dateTime.time}")
            firebaseAnalytics.logEvent("Product_Detail", param)
            Toast.makeText(this, "Featured Clicked", Toast.LENGTH_SHORT).show()
        }
    }
}