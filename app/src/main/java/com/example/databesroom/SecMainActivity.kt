package com.example.databesroom

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.databesroom.databinding.ActivityMainBinding
import com.example.databesroom.databinding.ActivitySecMainBinding

class SecMainActivity : AppCompatActivity() {
    lateinit var binding: ActivitySecMainBinding
    lateinit var listTitle: ArrayList<String>

    lateinit var map: HashMap<String, ArrayList<String>>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecMainBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_sec_main)

        map = HashMap()
        listTitle = ArrayList()
        initData()


    }

    private fun initData() {
        val
    }
}