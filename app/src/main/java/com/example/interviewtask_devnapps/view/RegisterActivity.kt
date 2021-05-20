package com.example.interviewtask_devnapps.view

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.observe
import com.example.interviewtask_devnapps.R
import com.example.interviewtask_devnapps.databinding.AcitivitySingupBinding
import com.example.interviewtask_devnapps.viewModel.RegisterViewModel

class RegisterActivity : AppCompatActivity() {

    private var loginRegisterViewModel: RegisterViewModel? = null
    private lateinit var binding: AcitivitySingupBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.acitivity_singup)
        loginRegisterViewModel = ViewModelProvider(this).get(RegisterViewModel::class.java)
        loginRegisterViewModel!!.userLiveData.observe(this, { firebaseUser ->
            if (firebaseUser != null) {
                startActivity(Intent(applicationContext, LogInActivity::class.java))
                    finish()
            }
        })
        binding.registerVM = loginRegisterViewModel
    }
}