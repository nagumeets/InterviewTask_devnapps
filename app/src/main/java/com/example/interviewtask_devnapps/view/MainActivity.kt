package com.example.interviewtask_devnapps.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.interviewtask_devnapps.R
import com.example.interviewtask_devnapps.databinding.ActivityMainBinding
import com.example.interviewtask_devnapps.model.data.Devices
import com.google.android.material.tabs.TabLayoutMediator
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding: ActivityMainBinding =
            DataBindingUtil.setContentView(this@MainActivity, R.layout.activity_main)

        val listDevices = mutableListOf<Devices>()
        listDevices.add(Devices(R.drawable.group4, "HUB", "1A256", "123456"))
        listDevices.add(Devices(R.drawable.hub, "USB", "23A56", "13455"))
        listDevices.add(Devices(R.drawable.hub, "Android", "30", "4873438"))
        listDevices.add(Devices(R.drawable.hub, "ios", "14", "3443"))
        listDevices.add(Devices(R.drawable.hub, "macBook pro", "Auekdl1323", "7568678"))

        val adapter = DeviceAdapter(this@MainActivity, listDevices)
        binding.viewPager.adapter = adapter
        TabLayoutMediator(tabLayout,viewPager){tab, position ->

        }.attach()
    }
}