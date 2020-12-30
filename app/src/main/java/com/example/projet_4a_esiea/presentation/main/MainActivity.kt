package com.example.projet_4a_esiea.presentation.main

import android.content.Intent
import android.os.Bundle
import android.view.Gravity
import androidx.appcompat.app.ActionBar
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import com.example.projet_4a_esiea.R
import kotlinx.android.synthetic.main.activity_main.*
import org.koin.android.ext.android.inject


class MainActivity : AppCompatActivity() {


    val mainViewModel: MainViewModel by inject()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //actionbar
        val actionbar = supportActionBar
        actionbar!!.title = "Jokapp"

        mainViewModel.loginLiveData.observe(this, Observer {
            when(it){
                is LoginSuccess -> {
                    val intent = Intent(this, ApiCallActivity::class.java)
                    this.startActivity(intent)
                }
                LoginError -> {
                    email_input_layout.error = " "
                    password_input_layout.error = "Email or password is wrong, please try again or create an account"
                    password_edit.text?.clear()
                }
            }
        })
        new_create_account.setOnClickListener{
            mainViewModel.onClickedLogin(login_edit.text.toString().trim(), password_edit.text.toString())
        }

        create_account_button.setOnClickListener {
            val intent = Intent(this, CreateAccountActivity::class.java)
            this.startActivity(intent)
        }
    }
}