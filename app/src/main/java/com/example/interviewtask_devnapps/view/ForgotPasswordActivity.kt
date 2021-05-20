package com.example.interviewtask_devnapps.view

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.interviewtask_devnapps.R
import com.example.interviewtask_devnapps.databinding.ActivityForgotPasswordBinding
import com.example.interviewtask_devnapps.viewModel.RegisterViewModel

class ForgotPasswordActivity : AppCompatActivity() {
    private var loginRegisterViewModel: RegisterViewModel? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: ActivityForgotPasswordBinding =
            DataBindingUtil.setContentView(this, R.layout.activity_forgot_password)
        loginRegisterViewModel = ViewModelProvider(this).get(RegisterViewModel::class.java)
        loginRegisterViewModel!!.toastMessagesLiveData().observe(this, Observer {
            Toast.makeText(this, it, Toast.LENGTH_SHORT).show()
        })
        binding.loginVM = loginRegisterViewModel
    }
}