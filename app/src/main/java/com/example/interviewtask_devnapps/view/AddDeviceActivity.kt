package com.example.interviewtask_devnapps.view

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.interviewtask_devnapps.R
import com.example.interviewtask_devnapps.databinding.ActivityForgotPasswordBinding
import com.example.interviewtask_devnapps.viewModel.RegisterViewModel
import kotlinx.android.synthetic.main.activity_add.*

class AddDeviceActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add)
        fabBtn.setOnClickListener(){
            startActivity(Intent(applicationContext, MainActivity::class.java))
            finish()
        }
    }
}