package com.example.interviewtask_devnapps.view

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.observe
import com.example.interviewtask_devnapps.R
import com.example.interviewtask_devnapps.databinding.ActivityLoginBinding
import com.example.interviewtask_devnapps.viewModel.RegisterViewModel

class LogInActivity : AppCompatActivity() {
    private var loginRegisterViewModel: RegisterViewModel? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: ActivityLoginBinding =
            DataBindingUtil.setContentView(this, R.layout.activity_login)
        loginRegisterViewModel = ViewModelProvider(this).get(RegisterViewModel::class.java)
        loginRegisterViewModel!!.userLiveData.observe(this, { firebaseUser ->
            Log.d("What", firebaseUser.email.toString())
            if (firebaseUser != null) {
                startActivity(Intent(applicationContext, AddDeviceActivity::class.java))
                finish()
            }
        })
        loginRegisterViewModel!!.toastMessagesLiveData().observe(this, Observer {
            Toast.makeText(this, it, Toast.LENGTH_SHORT).show()
        })
        binding.loginVM = loginRegisterViewModel
    }
}